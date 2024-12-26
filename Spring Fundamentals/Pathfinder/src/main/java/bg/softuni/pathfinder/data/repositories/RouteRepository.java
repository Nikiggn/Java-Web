package bg.softuni.pathfinder.data.repositories;

import bg.softuni.pathfinder.data.entities.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RouteRepository extends JpaRepository<Route, Long> {

}
