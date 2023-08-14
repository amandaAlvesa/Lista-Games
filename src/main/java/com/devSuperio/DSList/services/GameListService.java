package com.devSuperio.DSList.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devSuperio.DSList.dto.GameDTO;
import com.devSuperio.DSList.dto.GameListDTO;
import com.devSuperio.DSList.dto.GameMinDTO;
import com.devSuperio.DSList.entities.Game;
import com.devSuperio.DSList.entities.GameList;
import com.devSuperio.DSList.repositories.GameListRepository;
import com.devSuperio.DSList.repositories.GameRepository;

@Service
public class GameListService {

	@Autowired
	private GameListRepository gameListRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();
	}
}
