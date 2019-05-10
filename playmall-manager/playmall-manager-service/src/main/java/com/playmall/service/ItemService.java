package com.playmall.service;

import org.springframework.stereotype.Service;

import com.playmall.pojo.TbItem;

@Service
public interface ItemService {

	TbItem queryItemById(Long itemId);
}
