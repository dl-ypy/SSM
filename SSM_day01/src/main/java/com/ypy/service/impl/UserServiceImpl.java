package com.ypy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ypy.dao.UserModelMapper;
import com.ypy.model.UserModel;
import com.ypy.service.IUserService;
@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	private UserModelMapper mapper;

	@Override
	public int deleteByPrimaryKey(Integer userid) {
		return mapper.deleteByPrimaryKey(userid);
	}

	@Override
	public int insert(UserModel record) {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(UserModel record) {
		return mapper.insertSelective(record);
	}

	@Override
	public UserModel selectByPrimaryKey(Integer userid) {
		return mapper.selectByPrimaryKey(userid);
	}

	@Override
	public int updateByPrimaryKeySelective(UserModel record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(UserModel record) {
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public List<UserModel> querySelective(UserModel user) {
		return mapper.querySelective(user);
	}

}
