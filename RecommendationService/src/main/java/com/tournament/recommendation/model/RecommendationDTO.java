package com.tournament.recommendation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RecommendationDTO {
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 String id;
	 String employeeId;
	 String Team;
	 String Player;
	 String Tournament;
	 String Matches;
	 
}
