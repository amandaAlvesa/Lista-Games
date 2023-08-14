package com.devSuperio.DSList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devSuperio.DSList.entities.Game;
import com.devSuperio.DSList.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
