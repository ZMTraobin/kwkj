package com.kwkj.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kwkj.system.domain.User;
import com.kwkj.system.mapper.UserMapper;
import com.kwkj.system.service.IUserService;

/**
 * 用户 服务层实现
 * 
 * @author kwkj
 * @date 2019-08-20
 */
@Service
public class UserServiceImpl implements IUserService 
{
	@Autowired
	private UserMapper userMapper;

	/**
     * 查询用户信息
     * 
     * @param userId 用户ID
     * @return 用户信息
     */
    @Override
	public User selectUserById(Integer userId)
	{
	    return userMapper.selectUserById(userId);
	}
	
	/**
     * 查询用户列表
     * 
     * @param user 用户信息
     * @return 用户集合
     */
	@Override
	public List<User> selectUserList(User user)
	{
	    return userMapper.selectUserList(user);
	}
	
    /**
     * 新增用户
     * 
     * @param user 用户信息
     * @return 结果
     */
	@Override
	public int insertUser(User user)
	{
	    return userMapper.insertUser(user);
	}
	
	/**
     * 修改用户
     * 
     * @param user 用户信息
     * @return 结果
     */
	@Override
	public int updateUser(User user)
	{
	    return userMapper.updateUser(user);
	}

	/**
     * 删除用户对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteUserByIds(String ids)
	{
		String[] ids1 = ids.split( "," );
		return userMapper.deleteUserByIds(ids1);
	}
	
}
