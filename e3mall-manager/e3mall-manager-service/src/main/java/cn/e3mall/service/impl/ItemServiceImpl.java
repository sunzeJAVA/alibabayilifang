package cn.e3mall.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.e3mall.domain.TbItem;
import cn.e3mall.domain.TbItemExample;
import cn.e3mall.domain.TbItemExample.Criteria;
import cn.e3mall.mapper.TbItemMapper;
import cn.e3mall.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

	@Resource
	private TbItemMapper itemMapper;
	
	@Override
	public TbItem findItemById(Long ItemId) {
		TbItem item = null;
		TbItemExample example = new TbItemExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andIdEqualTo(ItemId);
		List<TbItem> list = itemMapper.selectByExample(example);
		if(list != null && list.size()>0){
			item = list.get(0);
		}
		return item;
	}

}
