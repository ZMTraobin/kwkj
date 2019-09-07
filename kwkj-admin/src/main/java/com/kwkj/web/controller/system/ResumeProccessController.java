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
import com.kwkj.system.domain.ResumeProccess;
import com.kwkj.system.service.IResumeProccessService;

/**
 * 简历面试流程 信息操作处理
 * 
 * @author kwkj
 * @date 2019-08-20
 */
@Controller
@RequestMapping("/system/resumeProccess")
public class ResumeProccessController extends BaseController
{
	
	@Autowired
	private IResumeProccessService resumeProccessService;
	
	
	/**
	 * 查询简历面试流程列表
	 */
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(ResumeProccess resumeProccess)
	{
		startPage();
        List<ResumeProccess> list = resumeProccessService.selectResumeProccessList(resumeProccess);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出简历面试流程列表
	 
	@RequiresPermissions("system:resumeProccess:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(ResumeProccess resumeProccess)
    {
    	List<ResumeProccess> list = resumeProccessService.selectResumeProccessList(resumeProccess);
        ExcelUtil<ResumeProccess> util = new ExcelUtil<ResumeProccess>(ResumeProccess.class);
        return util.exportExcel(list, "resumeProccess");
    }
	
	/**
	 * 新增简历面试流程
	 
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	*/
	/**
	 * 新增保存简历面试流程
	 */
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(ResumeProccess resumeProccess)
	{		
		return toAjax(resumeProccessService.insertResumeProccess(resumeProccess));
	}

	
	/**
	 * 修改保存简历面试流程
	 */
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(ResumeProccess resumeProccess)
	{		
		return toAjax(resumeProccessService.updateResumeProccess(resumeProccess));
	}
	
	/**
	 * 删除简历面试流程
	 */
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(resumeProccessService.deleteResumeProccessByIds(ids));
	}
	
}
