package com.WebServlet.mapper;

import java.sql.ResultSet;

import com.WebServlet.model.Role;
import com.WebServlet.model.User;


public class UserMapper implements RowMapper<User> {

	@Override
	public User MapRow(ResultSet rs) {
		try {
			User user = new User();
			user.setUserID(rs.getLong("id"));
			user.setUsername(rs.getString("username"));
			user.setPassword(rs.getString("password"));
			/*
			 * user.setCreateDate(rs.getTimestamp("createDate"));
			 * if(rs.getTimestamp("modifyDate") != null) {
			 * user.setModifyDate(rs.getTimestamp("modifyDate")); }
			 * user.setCreateBy(rs.getString("createBy")); if(rs.getString("modifyBy") !=
			 * null) { user.setModifyBy(rs.getString("modifyBy")); }
			 */
			 
			try {
			Role role = new Role();
			role.setRoleName(rs.getString("RoleName"));
			role.setCode(rs.getString("Code"));
			user.setRole(role);
			}catch(Exception e) {
				e.getMessage();
			}
		return user ;
		}catch(Exception e) {
			return null;
		}
	}

}
