package com.sample.test.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.test.dao.CardManagementDAO;
import com.sample.test.service.CardManagementService;

@Service
public class CardManagementServiceImpl implements CardManagementService
{
	@Autowired
	private CardManagementDAO cardManagementDAO;
	
	@Override
	public List<Map<String, Object>> getCardManagementList(Map<String, Object> param) throws Exception
	{
		return cardManagementDAO.getCardManagementList(param);
	}
}
