package com.codercocoon.spring.ioc.xml;

public interface UserDao {

	User find(int userId);

	void insert(User user);

	void update(User user);

	void delete(int userId);

	void lockAccount(int userId, boolean locked);

}