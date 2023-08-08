package com.devSuperio.DSList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devSuperio.DSList.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
