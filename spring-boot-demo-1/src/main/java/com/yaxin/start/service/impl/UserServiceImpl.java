package com.yaxin.start.service.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.yaxin.start.dao.UserDao;
import com.yaxin.start.pojo.User;
import com.yaxin.start.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	/*@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<User> getList(){
		
		String sql = "select * from user";
		
		List<User> uList = jdbcTemplate.query(sql, new RowMapper<User>() {

			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User u = new User();
				u.setId(rs.getInt("id"));
				u.setName(rs.getString("name"));
				return u;
			}
		});
		
		return uList;
	}*/
	@Autowired
	private UserDao userDao;
	public List<User> getList(User user){
		System.out.println("====");
		return userDao.getList(user);
	}
	
}
