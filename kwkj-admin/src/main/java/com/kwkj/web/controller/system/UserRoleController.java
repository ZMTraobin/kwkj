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
import com.kwkj.system.domain.UserRole;
import com.kwkj.system.service.IUserRoleService;

/**
 * 用户角色关联 信息操作处理
 * 
 * @author kwkj
 * @date 2019-08-20
 */
@Controller
@RequestMapping("/system/userRole")
public class UserRoleController extends BaseController
{
	
	@Autowired
	private IUserRoleService userRoleService;
	
	/**
	 * 查询用户角色关联列表
	 */
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(UserRole userRole)
	{
		startPage();
        List<UserRole> list = userRoleService.selectUserRoleList(userRole);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出用户角色关联列表
	 
	@RequiresPermissions("system:userRole:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(UserRole userRole)
    {
    	List<UserRole> list = userRoleService.selectUserRoleList(userRole);
        ExcelUtil<UserRole> util = new ExcelUtil<UserRole>(UserRole.class);
        return util.exportExcel(list, "userRole");
    }*/
	
	/**
	 * 新增保存用户角色关联
	 */
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(UserRole userRole)
	{		
		return toAjax(userRoleService.insertUserRole(userRole));
	}

	
	/**
	 * 修改保存用户角色关联
	 */
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(UserRole userRole)
	{		
		return toAjax(userRoleService.updateUserRole(userRole));
	}
	
	/**
	 * 删除用户角色关联
	 */
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(userRoleService.deleteUserRoleByIds(ids));
	}
	
}
