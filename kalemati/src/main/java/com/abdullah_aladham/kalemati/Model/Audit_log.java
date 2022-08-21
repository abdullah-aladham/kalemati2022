package com.abdullah_aladham.kalemati.Model;

import java.util.Date;

import jakarta.persistence.*;



//import com.abdullah_aladham.Kalemati21.Security.ApplicationUserRole;

public class Audit_log {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false ,updatable=false)
	private Long action_id;
	@Column
	private ApplicationUserRole Role;
	
	@Column 
	private Date action_date;
	@Column
	private String Action_name;
	@Column
	private String action_desc;
//	private School customer;
	
	
	public Long getId() {
		return action_id;
	}
	public void setId(Long newid)
	{
		this.action_id=newid;
		}
	
	public ApplicationUserRole getRole()
	{
		return Role;
	}
	public void setRole(ApplicationUserRole role)
	{
		this.Role=role;
		}
	public Date getDate()
	{
		return action_date;
	}
	public void setDate(Date newDate)
	{
		this.action_date=newDate;
		}
	
	public String getActionName() 
	{
		return Action_name;
	}
	public void setActionName(String newName)
	{
		this.Action_name=newName;
		}
	
	public String getDesc() 
	{
		return action_desc;
	}
	public void setDesc(String newDesc) 
	{
		this.action_desc=newDesc;
	}
	@Override
	public String toString() {
		return "Action number: "+action_id+"Action name: "+Action_name+"User role:"+Role+"Action date: "+action_date+"Action Description: "+action_desc;
	}
}
