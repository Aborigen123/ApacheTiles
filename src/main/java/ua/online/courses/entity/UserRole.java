package ua.online.courses.entity;

public enum UserRole {

	ROLE_STUDENT("STUDENT"), ROLE_TEACHER("TEACHER"), ROLE_ADMIN("ADMIN");
	
	private String roleName;

	private UserRole(String roleName) {
		this.roleName = roleName;
	}
	
	public String getRoleName() {
		return roleName;
	}
	
}
