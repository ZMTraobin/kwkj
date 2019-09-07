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
import com.kwkj.system.domain.User;
import com.kwkj.system.service.IUserService;

/**
 * 用户 信息操作处理
 * 
 * @author kwkj
 * @date 2019-08-20
 */
@Controller
@RequestMapping("/system/user")
public class UserController extends BaseController
{
	
	@Autowired
	private IUserService userService;
	
	
	/**
	 * 查询用户列表
	 */
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(User user)
	{
		startPage();
        List<User> list = userService.selectUserList(user);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出用户列表
	 
	@RequiresPermissions("system:user:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(User user)
    {
    	List<User> list = userService.selectUserList(user);
        ExcelUtil<User> util = new ExcelUtil<User>(User.class);
        return util.exportExcel(list, "user");
    }*/
	
	
	/**
	 * 新增保存用户
	 */
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(User user)
	{		
		return toAjax(userService.insertUser(user));
	}

	
	/**
	 * 修改保存用户
	 */
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(User user)
	{		
		return toAjax(userService.updateUser(user));
	}
	
	/**
	 * 删除用户
	 */
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(userService.deleteUserByIds(ids));
	}
	
}
