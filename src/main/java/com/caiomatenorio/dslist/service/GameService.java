package com.caiomatenorio.dslist.service;

import com.caiomatenorio.dslist.dto.GameDTO;
import com.caiomatenorio.dslist.dto.GameMinDTO;
import com.caiomatenorio.dslist.entity.Game;
import com.caiomatenorio.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        return gameRepository.findAll().stream().map(GameMinDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) throws NoSuchElementException {
        Game game = gameRepository.findById(id).orElseThrow();
        return new GameDTO(game);
    }
}
