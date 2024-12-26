package bg.softuni.pathfinder.data.repositories;

import bg.softuni.pathfinder.data.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
