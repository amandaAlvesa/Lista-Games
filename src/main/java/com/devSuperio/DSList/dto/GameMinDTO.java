package com.devSuperio.DSList.dto;

import com.devSuperio.DSList.entities.Game;

public class GameMinDTO {

	private Long id;
	private String title;
	private Double score;
	private Integer year;
	private String imgUrl;
	private String shortDescription;

	public GameMinDTO() {
	}

	public GameMinDTO(Game entity) {
		id = entity.getId();
		title = entity.getTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
		score = entity.getScore();
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	
}
