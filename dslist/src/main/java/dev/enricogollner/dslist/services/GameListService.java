package dev.enricogollner.dslist.services;

import dev.enricogollner.dslist.dto.GameListDTO;
import dev.enricogollner.dslist.dto.GameMinDTO;
import dev.enricogollner.dslist.entities.Game;
import dev.enricogollner.dslist.entities.GameList;
import dev.enricogollner.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }

}
