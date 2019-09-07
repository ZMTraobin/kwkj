package com.kwkj.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kwkj.system.mapper.UserRoleMapper;
import com.kwkj.system.domain.UserRole;
import com.kwkj.system.service.IUserRoleService;

/**
 * 用户角色关联 服务层实现
 * 
 * @author kwkj
 * @date 2019-08-20
 */
@Service
public class UserRoleServiceImpl implements IUserRoleService 
{
	@Autowired
	private UserRoleMapper userRoleMapper;

	/**
     * 查询用户角色关联信息
     * 
     * @param userId 用户角色关联ID
     * @return 用户角色关联信息
     */
    @Override
	public UserRole selectUserRoleById(Integer userId)
	{
	    return userRoleMapper.selectUserRoleById(userId);
	}
	
	/**
     * 查询用户角色关联列表
     * 
     * @param userRole 用户角色关联信息
     * @return 用户角色关联集合
     */
	@Override
	public List<UserRole> selectUserRoleList(UserRole userRole)
	{
	    return userRoleMapper.selectUserRoleList(userRole);
	}
	
    /**
     * 新增用户角色关联
     * 
     * @param userRole 用户角色关联信息
     * @return 结果
     */
	@Override
	public int insertUserRole(UserRole userRole)
	{
	    return userRoleMapper.insertUserRole(userRole);
	}
	
	/**
     * 修改用户角色关联
     * 
     * @param userRole 用户角色关联信息
     * @return 结果
     */
	@Override
	public int updateUserRole(UserRole userRole)
	{
	    return userRoleMapper.updateUserRole(userRole);
	}

	/**
     * 删除用户角色关联对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteUserRoleByIds(String ids)
	{
		String[] ids1 = ids.split( "," );
		return userRoleMapper.deleteUserRoleByIds(ids1);
	}
	
}
