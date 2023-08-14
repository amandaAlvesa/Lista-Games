package com.devSuperio.DSList.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devSuperio.DSList.dto.GameDTO;
import com.devSuperio.DSList.dto.GameListDTO;
import com.devSuperio.DSList.dto.GameMinDTO;
import com.devSuperio.DSList.entities.Game;
import com.devSuperio.DSList.services.GameListService;
import com.devSuperio.DSList.services.GameService;

@RestController
@RequestMapping(value = "/lists" )
public class GameListController {

	@Autowired
	private GameListService gameListService;
	
	@GetMapping
	private List<GameListDTO> findAll(){
		List<GameListDTO> result = gameListService.findAll();
		return result;
	}
	
}
