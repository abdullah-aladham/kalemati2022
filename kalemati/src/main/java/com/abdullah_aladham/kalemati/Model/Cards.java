package com.abdullah_aladham.kalemati.Model;

import java.util.ArrayList;
import java.util.List;

//import com.abdullah_aladham.kalemati.Enums.CardCatEnum;


import jakarta.persistence.*;
@Entity
public class Cards {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false ,updatable=false)
	protected Long Card_id;
	@Column(nullable=false)
	protected String name;
//	@Column(nullable=false)
//	protected CardCatEnum cardCategory;
	@Column(nullable=false)
	protected String Firstimagesrc;



	@Column(nullable=false)
	protected String Secondimagesrc;
	@Column(nullable=false)
	protected  String Cardcode;
	@Column(nullable=false)

	private boolean isdeleted;
@ManyToOne
	private CardPackages cardPackages;
	//@OneToMany(mappedBy="card",cascade=CascadeType.ALL)
//	@Column(nullable=false)
//	private List<Cards> Package_Cards=new ArrayList<Cards>();
//	@ManyToOne
//	@JoinColumn(name="Category_id")
//	protected CardPackages categories;
	
	//@Column(nullable=false)
	//protected CardCategories card_category;
//	private CardCategories categories;
	//@Column 
	//@OneToOne
	//@ManyToOne
	//@OneToOne(fetch=FetchType.LAZY)
	
//	@JoinColumn(foreignKey = @ForeignKey(name = "Category_Id"))
//	protected Long Category_Id;
/*public cards(Long id ,String name,String src, String src2 ,String CardCode){
	
	this.id=id;
	this.name=name;
	this.imagesrc=src;
	this.imagesrc2=src2;
	this.Cardcode=CardCode;
}*/
	public Cards() {
		
	}
	public Cards(Long id, String name, String imagesrc,String Imagesrc2, String cardcode) {
		this.Card_id = id;
		this.name = name;
		this.Firstimagesrc = imagesrc;
		this.Secondimagesrc=Imagesrc2;
		Cardcode = cardcode;
	}
public Long getId() {
return Card_id;

}

public void setId(Long id) {
this.Card_id=id;
}
public String getName() {
return name;

}
public void Setname(String newname) {
this.name=newname;
}
public String GetFirstImage() {
return Firstimagesrc ;
}
public void SetFirstImage(String newsrc) {
	this.Firstimagesrc=newsrc;
}



public String getCode() {
	 return Cardcode;
}
 public void SetCode(String newCode) {
	 this.Cardcode=newCode;
 }

@Override
public String toString() {
return "cards {}"+"id="+Card_id +", name="+name+" , first image"+Firstimagesrc +","+"Second image"+Secondimagesrc+", CardCode"+Cardcode;
}
	public String getSecondimagesrc() {
		return Secondimagesrc;
	}

	public void setSecondimagesrc(String secondimagesrc) {
		Secondimagesrc = secondimagesrc;
	}
//public List<Cards> getPackage_Cards() {
//	return Package_Cards;
//}
//public void setPackage_Cards(List<Cards> package_Cards) {
//	Package_Cards = package_Cards;
//}

}
