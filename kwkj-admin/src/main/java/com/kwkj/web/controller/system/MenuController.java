package com.kwkj.web.controller.system;

import java.util.List;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kwkj.common.base.AjaxResult;
import com.kwkj.common.page.TableDataInfo;
import com.kwkj.framework.web.base.BaseController;
import com.kwkj.system.domain.Menu;
import com.kwkj.system.service.IMenuService;

/**
 * 菜单 信息操作处理
 * 
 * @author kwkj
 * @date 2019-08-20
 */
@Controller
@RequestMapping("/system/menu")
public class MenuController extends BaseController
{
	
	@Autowired
	private IMenuService menuService;
	
	
	/**
	 * 查询菜单列表
	 */
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Menu menu)
	{
		startPage();
        List<Menu> list = menuService.selectMenuList(menu);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出菜单列表
	 
	@RequiresPermissions("system:menu:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Menu menu)
    {
    	List<Menu> list = menuService.selectMenuList(menu);
        ExcelUtil<Menu> util = new ExcelUtil<Menu>(Menu.class);
        return util.exportExcel(list, "menu");
    }*/
	
	
	/**
	 * 新增保存菜单
	 */
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Menu menu)
	{		
		return toAjax(menuService.insertMenu(menu));
	}

	
	/**
	 * 修改保存菜单
	 */
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Menu menu)
	{		
		return toAjax(menuService.updateMenu(menu));
	}
	
	/**
	 * 删除菜单
	 */
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(menuService.deleteMenuByIds(ids));
	}
	
}
