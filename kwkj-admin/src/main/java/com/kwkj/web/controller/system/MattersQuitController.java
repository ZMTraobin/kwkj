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
import com.kwkj.system.domain.MattersQuit;
import com.kwkj.system.service.IMattersQuitService;

/**
 * 离职人员交接 信息操作处理
 * 
 * @author kwkj
 * @date 2019-08-20
 */
@Controller
@RequestMapping("/system/mattersQuit")
public class MattersQuitController extends BaseController
{
	
	@Autowired
	private IMattersQuitService mattersQuitService;
	
	
	/**
	 * 查询离职人员交接列表
	 */
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(MattersQuit mattersQuit)
	{
		startPage();
        List<MattersQuit> list = mattersQuitService.selectMattersQuitList(mattersQuit);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出离职人员交接列表
	 
	@RequiresPermissions("system:mattersQuit:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(MattersQuit mattersQuit)
    {
    	List<MattersQuit> list = mattersQuitService.selectMattersQuitList(mattersQuit);
        ExcelUtil<MattersQuit> util = new ExcelUtil<MattersQuit>(MattersQuit.class);
        return util.exportExcel(list, "mattersQuit");
    }
	*/
	
	/**
	 * 新增保存离职人员交接
	 */
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(MattersQuit mattersQuit)
	{		
		return toAjax(mattersQuitService.insertMattersQuit(mattersQuit));
	}

	
	/**
	 * 修改保存离职人员交接
	 */
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(MattersQuit mattersQuit)
	{		
		return toAjax(mattersQuitService.updateMattersQuit(mattersQuit));
	}
	
	/**
	 * 删除离职人员交接
	 */
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(mattersQuitService.deleteMattersQuitByIds(ids));
	}
	
}
