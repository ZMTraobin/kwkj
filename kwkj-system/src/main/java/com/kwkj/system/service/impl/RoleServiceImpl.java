package com.kwkj.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kwkj.system.domain.Role;
import com.kwkj.system.mapper.RoleMapper;
import com.kwkj.system.service.IRoleService;

/**
 * 角色 服务层实现
 * 
 * @author kwkj
 * @date 2019-08-20
 */
@Service
public class RoleServiceImpl implements IRoleService 
{
	@Autowired
	private RoleMapper roleMapper;

	/**
     * 查询角色信息
     * 
     * @param roleId 角色ID
     * @return 角色信息
     */
    @Override
	public Role selectRoleById(Integer roleId)
	{
	    return roleMapper.selectRoleById(roleId);
	}
	
	/**
     * 查询角色列表
     * 
     * @param role 角色信息
     * @return 角色集合
     */
	@Override
	public List<Role> selectRoleList(Role role)
	{
	    return roleMapper.selectRoleList(role);
	}
	
    /**
     * 新增角色
     * 
     * @param role 角色信息
     * @return 结果
     */
	@Override
	public int insertRole(Role role)
	{
	    return roleMapper.insertRole(role);
	}
	
	/**
     * 修改角色
     * 
     * @param role 角色信息
     * @return 结果
     */
	@Override
	public int updateRole(Role role)
	{
	    return roleMapper.updateRole(role);
	}

	/**
     * 删除角色对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteRoleByIds(String ids)
	{
		String[] ids1 = ids.split( "," );
		return roleMapper.deleteRoleByIds(ids1);
	}
	
}
