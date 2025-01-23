package com.caiomatenorio.dslist.service;

import com.caiomatenorio.dslist.dto.GameListDTO;
import com.caiomatenorio.dslist.entity.GameList;
import com.caiomatenorio.dslist.repository.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        return gameListRepository.findAll().stream().map(GameListDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public GameListDTO findById(Long id) throws NoSuchElementException {
        GameList gameList = gameListRepository.findById(id).orElseThrow();
        return new GameListDTO(gameList);
    }
}
