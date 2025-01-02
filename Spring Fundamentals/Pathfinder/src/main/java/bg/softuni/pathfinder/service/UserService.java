package bg.softuni.pathfinder.service;

import bg.softuni.pathfinder.data.entities.User;
import bg.softuni.pathfinder.web.dto.UserLoginDTO;
import bg.softuni.pathfinder.web.dto.UserRegisterDTO;

public interface UserService {
    void regiserUser(UserRegisterDTO user);
    void loginUser(UserLoginDTO user);
}
