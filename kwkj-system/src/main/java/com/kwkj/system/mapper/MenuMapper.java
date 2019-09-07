package com.kwkj.system.mapper;

import com.kwkj.system.domain.Menu;
import java.util.List;	

/**
 * 菜单 数据层
 * 
 * @author kwkj
 * @date 2019-08-20
 */
public interface MenuMapper 
{
	/**
     * 查询菜单信息
     * 
     * @param menuId 菜单ID
     * @return 菜单信息
     */
	public Menu selectMenuById(Integer menuId);
	
	/**
     * 查询菜单列表
     * 
     * @param menu 菜单信息
     * @return 菜单集合
     */
	public List<Menu> selectMenuList(Menu menu);
	
	/**
     * 新增菜单
     * 
     * @param menu 菜单信息
     * @return 结果
     */
	public int insertMenu(Menu menu);
	
	/**
     * 修改菜单
     * 
     * @param menu 菜单信息
     * @return 结果
     */
	public int updateMenu(Menu menu);
	
	/**
     * 删除菜单
     * 
     * @param menuId 菜单ID
     * @return 结果
     */
	public int deleteMenuById(Integer menuId);
	
	/**
     * 批量删除菜单
     * 
     * @param menuIds 需要删除的数据ID
     * @return 结果
     */
	public int deleteMenuByIds(String[] menuIds);
	
}