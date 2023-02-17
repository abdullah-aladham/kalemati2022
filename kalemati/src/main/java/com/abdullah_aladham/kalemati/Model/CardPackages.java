package com.abdullah_aladham.kalemati.Model;

import java.util.*;


import jakarta.persistence.*;

@Entity
@Table(name="CardPackages")
public class CardPackages {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false ,updatable=false)
	private Long Id;
	@Column(nullable=false)
	private String Name;
//	@OneToMany(cascade=CascadeType.ALL)
//	private List<Cards> cards;
	
	
	
	
	
	public Long getId() {
		return Id;
	}
	
	public CardPackages(Long id, String name) {
		super();
		Id = id;
		Name = name;
	}

	public void setId(Long id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}

//	public List<Cards> getCards() {
//		return cards;
//	}
//
//	public void setCards(List<Cards> cards) {
//		this.cards = cards;
//	}

	
	
}
