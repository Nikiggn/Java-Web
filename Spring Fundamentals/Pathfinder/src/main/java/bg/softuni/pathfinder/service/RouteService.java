package bg.softuni.pathfinder.service;

import bg.softuni.pathfinder.service.dto.RouteShortInfoDTO;

public interface RouteService {
    RouteShortInfoDTO selectRandomRoute();
}
