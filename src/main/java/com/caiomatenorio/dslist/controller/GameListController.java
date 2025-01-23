package com.caiomatenorio.dslist.controller;

import com.caiomatenorio.dslist.dto.GameListDTO;
import com.caiomatenorio.dslist.service.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {
    @Autowired
    private GameListService gameListService;

    @GetMapping
    public ResponseEntity<List<GameListDTO>> findAll() {
        try {
            List<GameListDTO> gameLists = gameListService.findAll();
            return ResponseEntity.ok(gameLists);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }
}
