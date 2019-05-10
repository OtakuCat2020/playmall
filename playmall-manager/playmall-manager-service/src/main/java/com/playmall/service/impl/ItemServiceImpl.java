package com.playmall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.playmall.mapper.TbItemMapper;
import com.playmall.pojo.TbItem;
import com.playmall.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private TbItemMapper itemMapper;

	@Override
	public TbItem queryItemById(Long itemId) {
		TbItem item = itemMapper.selectByPrimaryKey(itemId);
		// 使用查询条件的做法
//		TbItemExample example = new TbItemExample();
//		Criteria criteria = example.createCriteria();
//		criteria.andIdEqualTo(itemId);
//		List<TbItem> list = itemMapper.selectByExample(example);
//		TbItem item = null;
//		if (list != null && list.size() > 0) {
//			item = list.get(0);
//		}
		return item;
	}

}
