package bg.softuni.pathfinder.web;

import bg.softuni.pathfinder.data.entities.enums.CategoryType;
import bg.softuni.pathfinder.data.entities.enums.Level;
import bg.softuni.pathfinder.service.Impl.RouteServiceImpl;
import bg.softuni.pathfinder.service.RouteService;
import bg.softuni.pathfinder.service.dto.RouteShortInfoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RouteController {

    private RouteServiceImpl routeServiceImpl;

    @Autowired
    public RouteController(RouteServiceImpl routeServiceImpl) {
        this.routeServiceImpl = routeServiceImpl;
    }


    @GetMapping("/routes")
    public String routes(Model model) {
        RouteShortInfoDTO route = routeServiceImpl.selectRandomRoute();

        //model.addAttribute("route", route);

        model.addAttribute("imageURl", route.getImageUrl());
        model.addAttribute("routeName", route.getName());
        model.addAttribute("routeDescription", route.getDescription());


        return "routes";
    }

    @GetMapping("/add-route")
    public ModelAndView addRoute() {
        ModelAndView modelAndView = new ModelAndView("add-route");

        modelAndView.addObject("route", new RouteShortInfoDTO());
        modelAndView.addObject("levels", Level.values());
        modelAndView.addObject("categories", CategoryType.values());
        return modelAndView;
    }
}
