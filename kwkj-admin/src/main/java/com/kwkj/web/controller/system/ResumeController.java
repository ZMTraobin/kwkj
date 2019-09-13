package com.kwkj.web.controller.system;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kwkj.common.base.AjaxResult;
import com.kwkj.common.page.TableDataInfo;
import com.kwkj.framework.web.base.BaseController;
import com.kwkj.system.domain.Resume;
import com.kwkj.system.domain.ResumeProccess;
import com.kwkj.system.service.IResumeProccessService;
import com.kwkj.system.service.IResumeService;

/**
 * 简历 信息操作处理
 * 
 * @author kwkj
 * @date 2019-08-20
 */
@Controller
@RequestMapping("/system/resume")
public class ResumeController extends BaseController
{
	
	@Autowired
	private IResumeService resumeService;
	@Autowired
	private IResumeProccessService resumeProccessService;

	/**
	 * 查询简历列表
	 */
	@RequestMapping("/list")
	@ResponseBody
	public TableDataInfo list(Resume resume)
	{
		startPage();
        List<Resume> list = resumeService.selectResumeList(resume);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出简历列表
	 
	@RequiresPermissions("system:resume:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Resume resume)
    {
    	List<Resume> list = resumeService.selectResumeList(resume);
        ExcelUtil<Resume> util = new ExcelUtil<Resume>(Resume.class);
        return util.exportExcel(list, "resume");
    }*/
	
	/**
	 * 新增保存简历
	 */
	@RequestMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Resume resume)
	{		
		return toAjax(resumeService.insertResume(resume));
	}

	
	/**
	 * 修改保存简历
	 */
	@RequestMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Resume resume)
	{		
		return toAjax(resumeService.updateResume(resume));
	}
	
	/**
	 * 删除简历
	 */
	@RequestMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		
		String[] ids1 = ids.split(",");
		return toAjax(resumeService.deleteResumeByIds(ids1));
	}
	

	
	
	
	/***
	 * 推送简历
	 */
	@RequestMapping( "/Recommend")
	@ResponseBody
    public AjaxResult Recommend(@RequestParam(value="pro_id",required=true) int proId,
			@RequestParam(value="user_name",required=true) String username,
			@RequestParam(value="name",required=true) String name,
			@RequestParam(value="status",required=true) String status,
			@RequestParam(value="res_id",required=true) int resid) {
	    Resume res=new Resume();
	    res.setStatus(status);
	   int list=resumeService.updateResume(res);
	   ResumeProccess rpc=new ResumeProccess();
	   Date date = new Date();
	   rpc.setCreateTime(date);
	   rpc.setProId(proId);
	   rpc.setName(name);
	   rpc.setCreateBy(username);
	   rpc.setStatus(status);
	   rpc.setResId(resid);
	    resumeProccessService.insertResumeProccess(rpc);
	return toAjax(list);
	}
	

	/**
	 * 确认推送
	 * **/
	public AjaxResult insertstatus(@RequestParam(value="pro_id",required=true) int proId,
			@RequestParam(value="user_name",required=true) String username,
			@RequestParam(value="name",required=true) String name,
			@RequestParam(value="status",required=true) String status,
			@RequestParam(value="res_id",required=true) int resid
			) {
		    Resume res=new Resume();
		    res.setStatus(status);
		   ResumeProccess rpc=new ResumeProccess();
		   Date date = new Date();
		   rpc.setCreateTime(date);
		   rpc.setProId(proId);
		   rpc.setName(name);
		   rpc.setCreateBy(username);
		   rpc.setStatus(status);
		   rpc.setResId(resid);
		    resumeProccessService.insertResumeProccess(rpc);
		return toAjax(resumeService.updateResume(res));
	}   
	/**
	 * 确认通过
	 * **/
	@RequestMapping("/adopt")
	@ResponseBody
	public AjaxResult adopt(@RequestParam(value="pro_id",required=true) int proId,
			@RequestParam(value="user_name",required=true) String username,
			@RequestParam(value="name",required=true) String name,
			@RequestParam(value="status",required=true) String status,
			@RequestParam(value="res_id",required=true) int resid)
	{	
	    Resume res=new Resume();
	    res.setStatus(status);
	   ResumeProccess rpc=new ResumeProccess();
	   Date date = new Date();
	   rpc.setCreateTime(date);
	   rpc.setProId(proId);
	   rpc.setName(name);
	   rpc.setCreateBy(username);
	   rpc.setStatus(status);
	   rpc.setResId(resid);
	    resumeProccessService.insertResumeProccess(rpc);
		return toAjax(resumeService.updateResume(res));
	}
	/**
	 * 确认邀请
	 * **/
	@RequestMapping("/invitation")
	@ResponseBody
	public AjaxResult invitation(@RequestParam(value="pro_id",required=true) int proId,
			@RequestParam(value="user_name",required=true) String username,
			@RequestParam(value="name",required=true) String name,
			@RequestParam(value="status",required=true) String status,
			@RequestParam(value="res_id",required=true) int resid)
	{				    Resume res=new Resume();
    res.setStatus(status);
   ResumeProccess rpc=new ResumeProccess();
   Date date = new Date();
   rpc.setProId(proId);
   rpc.setName(name);
   rpc.setCreateBy(username);
   rpc.setStatus(status);
   rpc.setResId(resid);
   rpc.setCreateTime(date);
    resumeProccessService.insertResumeProccess(rpc);

		return toAjax(resumeService.updateResume(res));
	}

	
	/**
	 * 确认面试
	 * **/
	@RequestMapping("/interview")
	@ResponseBody
	public AjaxResult interview(@RequestParam(value="pro_id",required=true) int proId,
			@RequestParam(value="user_name",required=true) String username,
			@RequestParam(value="name",required=true) String name,
			@RequestParam(value="status",required=true) String status,
			@RequestParam(value="res_id",required=true) int resid)
	{				    Resume res=new Resume();
    res.setStatus(status);
   ResumeProccess rpc=new ResumeProccess();	
   Date date = new Date();
   rpc.setCreateTime(date);
   rpc.setProId(proId);
   rpc.setName(name);
   rpc.setCreateBy(username);
   rpc.setStatus(status);
   rpc.setResId(resid);
    resumeProccessService.insertResumeProccess(rpc);
		return toAjax(resumeService.updateResume(res));
	}

	
	/**
	 * 发送offer
	 * **/
	@RequestMapping("/offer")
	@ResponseBody
	public AjaxResult offer(@RequestParam(value="pro_id",required=true) int proId,
			@RequestParam(value="user_name",required=true) String username,
			@RequestParam(value="name",required=true) String name,
			@RequestParam(value="status",required=true) String status,
			@RequestParam(value="res_id",required=true) int resid)
	{				    Resume res=new Resume();
    res.setStatus(status);
   ResumeProccess rpc=new ResumeProccess();
   Date date = new Date();
   rpc.setCreateTime(date);
   rpc.setProId(proId);
   rpc.setName(name);
   rpc.setCreateBy(username);
   rpc.setStatus(status);
   rpc.setResId(resid);
    resumeProccessService.insertResumeProccess(rpc);
		return toAjax(resumeService.updateResume(res));
	}

	/**
	 * 确认入职
	 * **/
	@RequestMapping("/entry")
	@ResponseBody
	public AjaxResult entry(@RequestParam(value="pro_id",required=true) int proId,
			@RequestParam(value="user_name",required=true) String username,
			@RequestParam(value="name",required=true) String name,
			@RequestParam(value="status",required=true) String status,
			@RequestParam(value="res_id",required=true) int resid)
	{				    Resume res=new Resume();
    res.setStatus(status);
   ResumeProccess rpc=new ResumeProccess();
   Date date = new Date();
   rpc.setCreateTime(date);
   rpc.setProId(proId);
   rpc.setName(name);
   rpc.setCreateBy(username);
   rpc.setStatus(status);
   rpc.setResId(resid);
    resumeProccessService.insertResumeProccess(rpc);
		return toAjax(resumeService.updateResume(res));
	}

	
	
	
}
