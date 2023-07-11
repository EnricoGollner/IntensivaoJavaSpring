package dev.enricogollner.dslist.repositories;

import dev.enricogollner.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
