package com.abdullah_aladham.kalemati.Security;

public enum ApplicationUserPermission {
SHOW_CUSTOMER("customer:show"),
ADD_CUSTOMER("customer:add"),
EDIT_CUSTOMER("customer:edit"),
ADD_CHILD("child:add"),
SHOW_CHILD("child:read"),
ADD_CARD("card:add"),
SHOW_CARD("card:show"),
EDIT_CARD("card:edit"),
ADD_ADMIN("admin:add");
	
private final String permission;
ApplicationUserPermission(String permission){
	this.permission=permission;
}
public String getPermission() {
	return permission;
}
}
