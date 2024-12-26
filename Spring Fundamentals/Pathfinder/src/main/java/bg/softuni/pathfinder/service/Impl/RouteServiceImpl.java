package bg.softuni.pathfinder.service.Impl;

import bg.softuni.pathfinder.data.entities.Picture;
import bg.softuni.pathfinder.data.entities.Route;
import bg.softuni.pathfinder.data.repositories.RouteRepository;
import bg.softuni.pathfinder.service.RouteService;
import bg.softuni.pathfinder.service.dto.RouteShortInfoDTO;
import jakarta.persistence.Transient;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class RouteServiceImpl implements RouteService {

    private final RouteRepository routeRepository;
    private final ModelMapper modelMapper;


    @Autowired
    public RouteServiceImpl(RouteRepository routeRepository, ModelMapper modelMapper) {
        this.routeRepository = routeRepository;
        this.modelMapper = modelMapper;
    }

    @Transactional
    @Override
    public RouteShortInfoDTO selectRandomRoute() {
        List<Route> routes = this.routeRepository.findAll();
        int randomId = new Random().nextInt(routes.size());

        Route route = routes.isEmpty() ? null : routes.get(randomId);
        Optional<Picture> firstPic = route.getPictures().stream().findFirst();

        RouteShortInfoDTO dto = modelMapper.map(route,RouteShortInfoDTO.class);
        dto.setImageUrl(firstPic.orElse(null).getUrl());


        return dto;
    }
}
