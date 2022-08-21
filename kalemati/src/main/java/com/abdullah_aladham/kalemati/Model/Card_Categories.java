package com.abdullah_aladham.kalemati.Model;

import jakarta.persistence.*;

//import com.abdullah_aladham.Kalemati21.Enums.CardCatEnum;
@Entity
public class Card_Categories {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false ,updatable=false)
	protected
static Long Cat_id ;//category id
	@Column(nullable=false)
	protected String Name;
//	@Column(nullable=false)
//protected 	static CardCatEnum Categ_type;//type of category is chosen in frontend side and choices are put in the enum
public 	Card_Categories(Long Cat_id,String type){
////	super(id, name, imagesrc, Cardcode);
		this.Cat_id=Cat_id;
		this.Name=type;
	}
public Card_Categories() {
	
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
