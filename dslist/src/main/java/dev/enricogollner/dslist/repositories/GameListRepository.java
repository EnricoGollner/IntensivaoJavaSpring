package dev.enricogollner.dslist.repositories;

import dev.enricogollner.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
