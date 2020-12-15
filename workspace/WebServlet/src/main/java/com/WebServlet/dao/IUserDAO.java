package com.WebServlet.dao;

import com.WebServlet.model.User;

public interface IUserDAO {
	User FindByUsernamePass(String Username , String Password);
	Long Insert(User user);
	User FindOne(Long id);
	void Update(User user);
	void Delete(Long[] ids);
}
