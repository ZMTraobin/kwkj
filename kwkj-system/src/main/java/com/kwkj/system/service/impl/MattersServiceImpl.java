package com.kwkj.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kwkj.system.domain.Matters;
import com.kwkj.system.mapper.MattersMapper;
import com.kwkj.system.service.IMattersService;

/**
 * 在职人员 服务层实现
 * 
 * @author kwkj
 * @date 2019-08-20
 */
@Service
public class MattersServiceImpl implements IMattersService 
{
	@Autowired
	private MattersMapper mattersMapper;

	/**
     * 查询在职人员信息
     * 
     * @param id 在职人员ID
     * @return 在职人员信息
     */
    @Override
	public Matters selectMattersById(Integer id)
	{
	    return mattersMapper.selectMattersById(id);
	}
	
	/**
     * 查询在职人员列表
     * 
     * @param matters 在职人员信息
     * @return 在职人员集合
     */
	@Override
	public List<Matters> selectMattersList(Matters matters)
	{
	    return mattersMapper.selectMattersList(matters);
	}
	
    /**
     * 新增在职人员
     * 
     * @param matters 在职人员信息
     * @return 结果
     */
	@Override
	public int insertMatters(Matters matters)
	{
	    return mattersMapper.insertMatters(matters);
	}
	
	/**
     * 修改在职人员
     * 
     * @param matters 在职人员信息
     * @return 结果
     */
	@Override
	public int updateMatters(Matters matters)
	{
	    return mattersMapper.updateMatters(matters);
	}

	/**
     * 删除在职人员对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteMattersByIds(String ids)
	{
		String[] ids1 = ids.split( "," );
		return mattersMapper.deleteMattersByIds(ids1);
	}
	
}
