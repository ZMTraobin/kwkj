package com.kwkj.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kwkj.system.mapper.MenuRoleMapper;
import com.kwkj.system.domain.MenuRole;
import com.kwkj.system.service.IMenuRoleService;

/**
 * 菜单角色关联 服务层实现
 * 
 * @author kwkj
 * @date 2019-08-20
 */
@Service
public class MenuRoleServiceImpl implements IMenuRoleService 
{
	@Autowired
	private MenuRoleMapper menuRoleMapper;

	/**
     * 查询菜单角色关联信息
     * 
     * @param menuId 菜单角色关联ID
     * @return 菜单角色关联信息
     */
    @Override
	public MenuRole selectMenuRoleById(Integer menuId)
	{
	    return menuRoleMapper.selectMenuRoleById(menuId);
	}
	
	/**
     * 查询菜单角色关联列表
     * 
     * @param menuRole 菜单角色关联信息
     * @return 菜单角色关联集合
     */
	@Override
	public List<MenuRole> selectMenuRoleList(MenuRole menuRole)
	{
	    return menuRoleMapper.selectMenuRoleList(menuRole);
	}
	
    /**
     * 新增菜单角色关联
     * 
     * @param menuRole 菜单角色关联信息
     * @return 结果
     */
	@Override
	public int insertMenuRole(MenuRole menuRole)
	{
	    return menuRoleMapper.insertMenuRole(menuRole);
	}
	
	/**
     * 修改菜单角色关联
     * 
     * @param menuRole 菜单角色关联信息
     * @return 结果
     */
	@Override
	public int updateMenuRole(MenuRole menuRole)
	{
	    return menuRoleMapper.updateMenuRole(menuRole);
	}

	/**
     * 删除菜单角色关联对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteMenuRoleByIds(String ids)
	{
		String[] ids1 = ids.split( "," );
		return menuRoleMapper.deleteMenuRoleByIds(ids1);
	}
	
}
