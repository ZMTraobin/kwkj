package com.kwkj.web.controller.system;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kwkj.common.base.AjaxResult;
import com.kwkj.common.page.TableDataInfo;
import com.kwkj.framework.web.base.BaseController;
import com.kwkj.system.domain.MenuRole;
import com.kwkj.system.service.IMenuRoleService;

/**
 * 菜单角色关联 信息操作处理
 * 
 * @author kwkj
 * @date 2019-08-20
 */
@Controller
@RequestMapping("/system/menuRole")
public class MenuRoleController extends BaseController
{
	
	@Autowired
	private IMenuRoleService menuRoleService;
	
	/**
	 * 查询菜单角色关联列表
	 */
	@RequestMapping("/list")
	@ResponseBody
	public TableDataInfo list(MenuRole menuRole)
	{
		startPage();
        List<MenuRole> list = menuRoleService.selectMenuRoleList(menuRole);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出菜单角色关联列表
	 
	@RequiresPermissions("system:menuRole:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(MenuRole menuRole)
    {
    	List<MenuRole> list = menuRoleService.selectMenuRoleList(menuRole);
        ExcelUtil<MenuRole> util = new ExcelUtil<MenuRole>(MenuRole.class);
        return util.exportExcel(list, "menuRole");
    }*/
	
	
	/**
	 * 新增保存菜单角色关联
	 */
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(MenuRole menuRole)
	{		
		return toAjax(menuRoleService.insertMenuRole(menuRole));
	}

	
	/**
	 * 修改保存菜单角色关联
	 */
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(MenuRole menuRole)
	{		
		return toAjax(menuRoleService.updateMenuRole(menuRole));
	}
	
	/**
	 * 删除菜单角色关联
	 */
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(menuRoleService.deleteMenuRoleByIds(ids));
	}
	
}
