package bg.softuni.pathfinder.data.repositories;

import bg.softuni.pathfinder.data.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
