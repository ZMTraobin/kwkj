package com.kwkj.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kwkj.system.mapper.MattersQuitMapper;
import com.kwkj.system.domain.MattersQuit;
import com.kwkj.system.service.IMattersQuitService;

/**
 * 离职人员交接 服务层实现
 * 
 * @author kwkj
 * @date 2019-08-20
 */
@Service
public class MattersQuitServiceImpl implements IMattersQuitService 
{
	@Autowired
	private MattersQuitMapper mattersQuitMapper;

	/**
     * 查询离职人员交接信息
     * 
     * @param kwkjMattersQuitid 离职人员交接ID
     * @return 离职人员交接信息
     */
    @Override
	public MattersQuit selectMattersQuitById(Integer kwkjMattersQuitid)
	{
	    return mattersQuitMapper.selectMattersQuitById(kwkjMattersQuitid);
	}
	
	/**
     * 查询离职人员交接列表
     * 
     * @param mattersQuit 离职人员交接信息
     * @return 离职人员交接集合
     */
	@Override
	public List<MattersQuit> selectMattersQuitList(MattersQuit mattersQuit)
	{
	    return mattersQuitMapper.selectMattersQuitList(mattersQuit);
	}
	
    /**
     * 新增离职人员交接
     * 
     * @param mattersQuit 离职人员交接信息
     * @return 结果
     */
	@Override
	public int insertMattersQuit(MattersQuit mattersQuit)
	{
	    return mattersQuitMapper.insertMattersQuit(mattersQuit);
	}
	
	/**
     * 修改离职人员交接
     * 
     * @param mattersQuit 离职人员交接信息
     * @return 结果
     */
	@Override
	public int updateMattersQuit(MattersQuit mattersQuit)
	{
	    return mattersQuitMapper.updateMattersQuit(mattersQuit);
	}

	/**
     * 删除离职人员交接对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteMattersQuitByIds(String ids)
	{
		String[] ids1 = ids.split( "," );
		return mattersQuitMapper.deleteMattersQuitByIds(ids1);
	}
	
}
