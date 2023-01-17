package com.abdullah_aladham.kalemati.Model;

import java.util.List;

import jakarta.persistence.*;

//import com.abdullah_aladham.Kalemati21.Enums.CardCatEnum;
//@Entity
public class Card_Packages {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false ,updatable=false)
	protected
static Long Pack_id ;
	@Column(nullable=false)
	protected String Name;
	@ManyToMany(targetEntity=Cards.class,cascade=CascadeType.ALL)
	@JoinColumn(name="Cards")
	@Column(nullable=false)
	protected List<Cards>pack_cards;
//	@Column(nullable=false)
//protected 	static CardCatEnum Categ_type;//type of category is chosen in frontend side and choices are put in the enum
public 	Card_Packages(Long pack_id,String type){
////	super(id, name, imagesrc, Cardcode);
		this.Pack_id=pack_id;
		this.Name=type;
	}
public Card_Packages() {
	
}
public static Long getPack_id() {
	return Pack_id;
}
public static void setPack_id(Long pack_id) {
	Pack_id = pack_id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public List<Cards> getPack_cards() {
	return pack_cards;
}
public void setPack_cards(List<Cards> pack_cards) {
	this.pack_cards = pack_cards;
}

	

//	public Long getId() {
//		return id;
//	}
//	public void setId(Long newId) {
//		this.id=newId;
//	}
//	public CardCatEnum getType() {
//		return Categ_type;
//	}
//	public void setType(CardCatEnum newType) {
//		this.Categ_type=newType;
//	}
}
