package com.abdullah_aladham.kalemati.Model;

import jakarta.persistence.*;

@Entity
public class Account_manager {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false ,updatable=false)
	protected Long Id;
	@Column(nullable=false)
	protected String name;
}
