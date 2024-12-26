package bg.softuni.pathfinder.data.repositories;

import bg.softuni.pathfinder.data.entities.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {
}
