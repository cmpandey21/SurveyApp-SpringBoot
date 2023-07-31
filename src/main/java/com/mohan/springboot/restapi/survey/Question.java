package com.mohan.springboot.restapi.survey;

import java.util.List;

public class Question {
	public Question(String id, String description, List<String> options, String correctAnswer) {
		super();
		this.id = id;
		this.description = description;
		this.options = options;
		this.correctAnswer = correctAnswer;
	}
	private String id;
	private String description;
	private List<String> options;
	private String correctAnswer;
	public String getId() {
		return id;
	}
	public String getDescription() {
		return description;
	}
	public List<String> getOptions() {
		return options;
	}
	public String getCorrectAnswer() {
		return correctAnswer;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Question [id=" + id + ", description=" + description + ", options=" + options + ", correctAnswer="
				+ correctAnswer + "]";
	}	
}


