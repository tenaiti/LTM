package com.WebServlet.bo;

import com.WebServlet.model.User;

public interface IUserBO {
	
	User FindByUsernamePassStatus(String Username , String Password , Integer Status);
	Long Insert(User user);
	User FindOne(Long id);
	void Update(User user);
	void Delete(Long[] ids);

}
