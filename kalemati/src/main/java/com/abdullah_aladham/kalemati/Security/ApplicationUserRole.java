package com.abdullah_aladham.kalemati.Security;

import java.util.Set;

import com.google.common.collect.Sets;
import com.abdullah_aladham.kalemati.Security.ApplicationUserPermission.*;
public enum ApplicationUserRole {
//	Account_Manager(permissions),
	USER(null),
	School(Sets.newHashSet(ApplicationUserPermission.ADD_CHILD,
			ApplicationUserPermission.SHOW_CHILD)
			),
	
	TEACHER(	Sets.newHashSet(ApplicationUserPermission.ADD_CHILD,
			ApplicationUserPermission.SHOW_CHILD)
			),
	ADMIN(Sets.newHashSet(
			ApplicationUserPermission.SHOW_CUSTOMER,
			ApplicationUserPermission.ADD_CUSTOMER,
			ApplicationUserPermission.EDIT_CUSTOMER,
		
			ApplicationUserPermission.ADD_CARD,
			ApplicationUserPermission.SHOW_CARD,
			ApplicationUserPermission.EDIT_CARD
			));
	//CHILD();
	
private final Set<ApplicationUserPermission>permissions;

ApplicationUserRole(Set<ApplicationUserPermission>permissions){
	this.permissions=permissions;
}
public Set<ApplicationUserPermission> getPermissions(){
	return permissions;
}
}
