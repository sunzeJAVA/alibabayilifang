package cn.e3mall.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3mall.domain.TbItem;
import cn.e3mall.service.ItemService;

@Controller
public class ItemContorller {

	@Resource
	private ItemService itemService;
	
	@RequestMapping("/item/{itemId}")
	public @ResponseBody TbItem findById(@PathVariable Long itemId){
		TbItem item = itemService.findItemById(itemId);
		System.out.println(item.getTitle());
		return item;
	}
}
