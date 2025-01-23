package com.caiomatenorio.dslist.controller;

import com.caiomatenorio.dslist.dto.GameListDTO;
import com.caiomatenorio.dslist.dto.GameMinDTO;
import com.caiomatenorio.dslist.service.GameListService;
import com.caiomatenorio.dslist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {
    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public ResponseEntity<List<GameListDTO>> findAll() {
        try {
            List<GameListDTO> gameLists = gameListService.findAll();
            return ResponseEntity.ok(gameLists);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<GameListDTO> findById(@PathVariable Long id) {
        try {
            GameListDTO gameList = gameListService.findById(id);
            return ResponseEntity.ok(gameList);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @GetMapping("/{listId}/games")
    public ResponseEntity<List<GameMinDTO>> findGamesByList(@PathVariable Long listId) {
        try {
            List<GameMinDTO> games = gameService.findByList(listId);
            return ResponseEntity.ok(games);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }
}
