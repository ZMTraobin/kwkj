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
import com.kwkj.system.domain.Role;
import com.kwkj.system.service.IRoleService;

/**
 * 角色 信息操作处理
 * 
 * @author kwkj
 * @date 2019-08-20
 */
@Controller
@RequestMapping("/system/role")
public class RoleController extends BaseController
{
	
	@Autowired
	private IRoleService roleService;
	
	
	/**
	 * 查询角色列表
	 */
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Role role)
	{
		startPage();
        List<Role> list = roleService.selectRoleList(role);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出角色列表
	 
	@RequiresPermissions("system:role:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Role role)
    {
    	List<Role> list = roleService.selectRoleList(role);
        ExcelUtil<Role> util = new ExcelUtil<Role>(Role.class);
        return util.exportExcel(list, "role");
    }
	*/
	
	/**
	 * 新增保存角色
	 */
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Role role)
	{		
		return toAjax(roleService.insertRole(role));
	}

	
	/**
	 * 修改保存角色
	 */
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Role role)
	{		
		return toAjax(roleService.updateRole(role));
	}
	
	/**
	 * 删除角色
	 */
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(roleService.deleteRoleByIds(ids));
	}
	
}
