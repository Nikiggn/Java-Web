package bg.softuni.pathfinder.data.repositories;

import bg.softuni.pathfinder.data.entities.Picture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PictureRepository extends JpaRepository<Picture, Long> {
}
