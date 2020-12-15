package com.WebServlet.model;

public class User extends Abstract<User> {
	private Long UserID;
	private String Password;
	private String Username;
	private String Email;
	private int Telephone;
	private Long RoleID;
	private Role Role = new Role();
	public Long getUserID() {
		return UserID;
	}
	public void setUserID(Long userID) {
		UserID = userID;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getTelephone() {
		return Telephone;
	}
	public void setTelephone(int telephone) {
		Telephone = telephone;
	}
	public Long getRoleID() {
		return RoleID;
	}
	public void setRoleID(Long roleID) {
		RoleID = roleID;
	}
	public Role getRole() {
		return Role;
	}
	public void setRole(Role role) {
		Role = role;
	}
	
	
	
	
}
