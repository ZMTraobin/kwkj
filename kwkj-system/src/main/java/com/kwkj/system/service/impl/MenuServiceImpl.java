package com.kwkj.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kwkj.system.mapper.MenuMapper;
import com.kwkj.system.domain.Menu;
import com.kwkj.system.service.IMenuService;

/**
 * 菜单 服务层实现
 * 
 * @author kwkj
 * @date 2019-08-20
 */
@Service
public class MenuServiceImpl implements IMenuService 
{
	@Autowired
	private MenuMapper menuMapper;

	/**
     * 查询菜单信息
     * 
     * @param menuId 菜单ID
     * @return 菜单信息
     */
    @Override
	public Menu selectMenuById(Integer menuId)
	{
	    return menuMapper.selectMenuById(menuId);
	}
	
	/**
     * 查询菜单列表
     * 
     * @param menu 菜单信息
     * @return 菜单集合
     */
	@Override
	public List<Menu> selectMenuList(Menu menu)
	{
	    return menuMapper.selectMenuList(menu);
	}
	
    /**
     * 新增菜单
     * 
     * @param menu 菜单信息
     * @return 结果
     */
	@Override
	public int insertMenu(Menu menu)
	{
	    return menuMapper.insertMenu(menu);
	}
	
	/**
     * 修改菜单
     * 
     * @param menu 菜单信息
     * @return 结果
     */
	@Override
	public int updateMenu(Menu menu)
	{
	    return menuMapper.updateMenu(menu);
	}

	/**
     * 删除菜单对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteMenuByIds(String ids)
	{
		String[] ids1 = ids.split( "," );
		return menuMapper.deleteMenuByIds(ids1);
	}
	
}
