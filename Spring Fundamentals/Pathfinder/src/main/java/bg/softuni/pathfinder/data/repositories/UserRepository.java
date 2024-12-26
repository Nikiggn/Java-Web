package bg.softuni.pathfinder.data.repositories;

import bg.softuni.pathfinder.data.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
