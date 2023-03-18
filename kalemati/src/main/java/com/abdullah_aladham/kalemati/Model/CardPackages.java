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
	@OneToMany(targetEntity= Cards.class,cascade=CascadeType.ALL)
	@JoinColumn(name="Cards_Id",referencedColumnName = "id")
	private List<Cards> cards;
	@ManyToOne(targetEntity=Subscriptions.class,cascade=CascadeType.ALL)
	@JoinColumn(name="Subscriptions_id",referencedColumnName="Id")
	private Subscriptions subscriptions;
	@ManyToOne(targetEntity=Requests.class,cascade=CascadeType.ALL)
	@JoinColumn(name="Requests_id",referencedColumnName="Id")
	private Requests Requested_Card_Packages;
	
	
	
	
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
