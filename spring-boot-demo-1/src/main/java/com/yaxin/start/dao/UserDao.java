package com.yaxin.start.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.yaxin.start.pojo.User;
@Mapper
public interface UserDao {
	//查询
	List<User> getList(User user);
}
