package com.kwkj.system.service;

import com.kwkj.system.domain.Menu;
import java.util.List;

/**
 * 菜单 服务层
 * 
 * @author kwkj
 * @date 2019-08-20
 */
public interface IMenuService 
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
     * 删除菜单信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteMenuByIds(String ids);
	
}
