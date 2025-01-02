package bg.softuni.pathfinder.service.Impl;

import bg.softuni.pathfinder.data.entities.User;
import bg.softuni.pathfinder.data.entities.enums.Level;
import bg.softuni.pathfinder.data.repositories.UserRepository;
import bg.softuni.pathfinder.service.UserService;
import bg.softuni.pathfinder.service.dto.UserProfileDTO;
import bg.softuni.pathfinder.web.dto.CurrentUser;
import bg.softuni.pathfinder.web.dto.UserLoginDTO;
import bg.softuni.pathfinder.web.dto.UserRegisterDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Random;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final ModelMapper modelMapper;
    private final Random random;
    private final CurrentUser currentUser;


    @Autowired
    public UserServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder, ModelMapper modelMapper, Random random, CurrentUser currentUser) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.modelMapper = modelMapper;
        this.random = random;
        this.currentUser = currentUser;
    }

    @Override
    public void regiserUser(UserRegisterDTO dto) {
        Level level = Level.values()[random.nextInt(Level.values().length)];

        User user = this.modelMapper.map(dto, User.class);
        user.setLevel(level);
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        userRepository.save(user);
    }

    public void loginUser(UserLoginDTO loginData) {
        User user = userRepository.findByUsername(loginData.getUsername()).getFirst();

        if (user == null) {
            // TODO throw error
            return;
        }

        if (passwordEncoder.matches(loginData.getPassword(), user.getPassword()) && !currentUser.isLoggedIn()) {
            currentUser.setUser(user);
        }
    }

    public void logout() {
        currentUser.setUser(null);
    }

 public UserProfileDTO getProfileInfo() {
     UserProfileDTO dto = modelMapper.map(currentUser.getUser(), UserProfileDTO.class);
     return dto;
 }
}
