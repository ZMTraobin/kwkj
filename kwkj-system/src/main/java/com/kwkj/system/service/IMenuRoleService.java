package com.kwkj.system.service;

import com.kwkj.system.domain.MenuRole;
import java.util.List;

/**
 * 菜单角色关联 服务层
 * 
 * @author kwkj
 * @date 2019-08-20
 */
public interface IMenuRoleService 
{
	/**
     * 查询菜单角色关联信息
     * 
     * @param menuId 菜单角色关联ID
     * @return 菜单角色关联信息
     */
	public MenuRole selectMenuRoleById(Integer menuId);
	
	/**
     * 查询菜单角色关联列表
     * 
     * @param menuRole 菜单角色关联信息
     * @return 菜单角色关联集合
     */
	public List<MenuRole> selectMenuRoleList(MenuRole menuRole);
	
	/**
     * 新增菜单角色关联
     * 
     * @param menuRole 菜单角色关联信息
     * @return 结果
     */
	public int insertMenuRole(MenuRole menuRole);
	
	/**
     * 修改菜单角色关联
     * 
     * @param menuRole 菜单角色关联信息
     * @return 结果
     */
	public int updateMenuRole(MenuRole menuRole);
		
	/**
     * 删除菜单角色关联信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteMenuRoleByIds(String ids);
	
}
