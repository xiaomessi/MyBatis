package com.fehead.service;

import java.util.ArrayList;
import java.util.List;

import com.fehead.bean.Command;
import com.fehead.bean.CommandContent;
import com.fehead.dao.CommandDaoByMyBatis;
import com.fehead.dao.MessageDaoByMyBatis;

/**
 * 维护相关的业务功能
 *
 */
public class MaintainService {
	
	/**
	 * 多条记录删除
	 */
	public void deleteBatch(String[] ids){
		
		MessageDaoByMyBatis messageDaoByMyBatis = new MessageDaoByMyBatis();
		List<Integer> idList = new ArrayList<Integer>();
		for (String id : ids) {
			idList.add(Integer.valueOf(id));
		}
		messageDaoByMyBatis.deleteBatch(idList);
	}
	
	/**
	 * 单条记录删除
	 */
	public void deleteOne(String id){
		if(id!=null&&!"".equals(id.trim())){
			MessageDaoByMyBatis messageDaoByMyBatis = new MessageDaoByMyBatis();
			messageDaoByMyBatis.deleteOne(Integer.valueOf(id));
		}
		
	}

	/**
	 * 记录更新
	 */
	public void updateOne(String command,String description){
		if(description!=null&&!"".equals(description.trim())){
			MessageDaoByMyBatis messageDaoByMyBatis = new MessageDaoByMyBatis();
			messageDaoByMyBatis.updateOne(command, description);
		}
	}

	/**
	 * 记录插入
	 */
	public void insertOne(String name, String description, List<CommandContent> commandContentList){
		if(name!=null&&!"".equals(name.trim())&&description!=null&&!"".equals(description.trim())){
			CommandDaoByMyBatis commandDaoByMyBatis = new CommandDaoByMyBatis();
			commandDaoByMyBatis.insertOne(name,description,commandContentList);
		}
	}
}
