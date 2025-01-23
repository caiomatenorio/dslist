package com.caiomatenorio.dslist.repository;

import com.caiomatenorio.dslist.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {}
