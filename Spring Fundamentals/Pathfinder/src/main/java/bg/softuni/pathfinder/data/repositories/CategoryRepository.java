package bg.softuni.pathfinder.data.repositories;

import bg.softuni.pathfinder.data.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
