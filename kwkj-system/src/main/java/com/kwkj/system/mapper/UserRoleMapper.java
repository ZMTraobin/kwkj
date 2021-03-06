package com.kwkj.system.mapper;

import com.kwkj.system.domain.UserRole;
import java.util.List;	

/**
 * 用户角色关联 数据层
 * 
 * @author kwkj
 * @date 2019-08-20
 */
public interface UserRoleMapper 
{
	/**
     * 查询用户角色关联信息
     * 
     * @param userId 用户角色关联ID
     * @return 用户角色关联信息
     */
	public UserRole selectUserRoleById(Integer userId);
	
	/**
     * 查询用户角色关联列表
     * 
     * @param userRole 用户角色关联信息
     * @return 用户角色关联集合
     */
	public List<UserRole> selectUserRoleList(UserRole userRole);
	
	/**
     * 新增用户角色关联
     * 
     * @param userRole 用户角色关联信息
     * @return 结果
     */
	public int insertUserRole(UserRole userRole);
	
	/**
     * 修改用户角色关联
     * 
     * @param userRole 用户角色关联信息
     * @return 结果
     */
	public int updateUserRole(UserRole userRole);
	
	/**
     * 删除用户角色关联
     * 
     * @param userId 用户角色关联ID
     * @return 结果
     */
	public int deleteUserRoleById(Integer userId);
	
	/**
     * 批量删除用户角色关联
     * 
     * @param userIds 需要删除的数据ID
     * @return 结果
     */
	public int deleteUserRoleByIds(String[] userIds);
	
}