package com.abdullah_aladham.kalemati.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Cards {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false ,updatable=false)
	protected Long id;
	@Column(nullable=false)
	protected String name;
	@Column(nullable=false)
	protected String imagesrc;
	@Column(nullable=false)
	protected  String Cardcode;
	@Column
	protected String name1;
	@Column(nullable=false)
	private boolean isdeleted;
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
	public Cards(Long id, String name, String imagesrc, String cardcode) {
		this.id = id;
		this.name = name;
		this.imagesrc = imagesrc;
		Cardcode = cardcode;
	}
public Long getId() {
return id;

}

public void setId(Long id) {
this.id=id;
}
public String getName() {
return name;

}
public void Setname(String newname) {
this.name=newname;
}
public String getsrc() {
return imagesrc ;
}
public void setsrc(String newsrc) {
	this.imagesrc=newsrc;
}



public String getCode() {
	 return Cardcode;
}
 public void SetCode(String newCode) {
	 this.Cardcode=newCode;
 }

@Override
public String toString() {
return "cards {}"+"id="+id +", name="+name+" , first image"+imagesrc +","+", CardCode"+Cardcode;
}
}
