package com.WebServlet.dao.impl;

import java.util.List;

import com.WebServlet.dao.IUserDAO;
import com.WebServlet.mapper.UserMapper;
import com.WebServlet.model.User;

public class UserDAO extends AbstractDAO<User> implements IUserDAO{

	@Override
	public User FindByUsernamePass(String Username, String Password) {
		StringBuilder sql = new StringBuilder("SELECT * FROM user AS U ");
		sql.append("INNER JOIN role AS R ON U.RoleID = R.role_id ");
		sql.append("WHERE username = ? AND password = ?");

		List<User> users = query(sql.toString(),new UserMapper(),Username,Password);
		return users.isEmpty() ? null : users.get(0);
	}

	@Override
	public Long Insert(User user) {
		String sql = "INSERT INTO user(username,password,email,telephone,role_id) VALUES (?,?,?,?,?)";
		return Insert(sql,user.getUsername(),user.getPassword(),user.getEmail(),user.getTelephone(),1);
	}

	@Override
	public User FindOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void Update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Delete(Long[] ids) {
		// TODO Auto-generated method stub
		
	}

}
