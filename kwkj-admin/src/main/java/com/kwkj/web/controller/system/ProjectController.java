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
import com.kwkj.system.domain.Project;
import com.kwkj.system.service.IProjectService;

/**
 * 项目 信息操作处理
 * 
 * @author kwkj
 * @date 2019-08-20
 */
@Controller
@RequestMapping("/system/project")
public class ProjectController extends BaseController
{
	
	@Autowired
	private IProjectService projectService;
	
	/**
	 * 查询项目列表
	 */
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Project project)
	{
		startPage();
        List<Project> list = projectService.selectProjectList(project);
		return getDataTable(list);
	}
	

	
	
	
	/**
	 * 导出项目列表
	 
	@RequiresPermissions("system:project:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Project project)
    {
    	List<Project> list = projectService.selectProjectList(project);
        ExcelUtil<Project> util = new ExcelUtil<Project>(Project.class);
        return util.exportExcel(list, "project");
    }
	*/
	
	/**
	 * 新增保存项目
	 */
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Project project)
	{		
		List<Project> list = projectService.selectProjectList(project);
		if(list!=null) {
			return toAjax(projectService.insertProject(project));
		}
		
		return null;
	}

	
	/**
	 * 修改保存项目
	 */
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Project project)
	{		
		return toAjax(projectService.updateProject(project));
	}
	
	/**
	 * 删除项目
	 */
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		String[] ids1 = ids.split(",");
		return toAjax(projectService.deleteProjectByIds(ids1));
	}
	
}
