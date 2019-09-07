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
import com.kwkj.system.domain.Matters;
import com.kwkj.system.service.IMattersService;

/**
 * 在职人员 信息操作处理
 * 
 * @author kwkj
 * @date 2019-08-20
 */
@Controller
@RequestMapping("/system/matters")
public class MattersController extends BaseController
{
	
	@Autowired
	private IMattersService mattersService;
	
	
	/**
	 * 查询在职人员列表
	 */
	@RequestMapping("/list")
	@ResponseBody
	public TableDataInfo list(Matters matters)
	{
		startPage();
        List<Matters> list = mattersService.selectMattersList(matters);
		return getDataTable(list);
	}
	
	
	
	
	/**
	 * 新增保存在职人员
	 */
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Matters matters)
	{		
		return toAjax(mattersService.insertMatters(matters));
	}
  
	
	/**
	 * 修改保存在职人员
	 */
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Matters matters)
	{		
		return toAjax(mattersService.updateMatters(matters));
	}
	
	/**
	 * 删除在职人员
	 */
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(mattersService.deleteMattersByIds(ids));
	}
	
}
	