package com.caiomatenorio.dslist.repository;

import com.caiomatenorio.dslist.entity.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
