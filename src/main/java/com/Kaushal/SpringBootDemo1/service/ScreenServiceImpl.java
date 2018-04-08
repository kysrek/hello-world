package com.Kaushal.SpringBootDemo1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Kaushal.SpringBootDemo1.dao.ScreenDao;
import com.Kaushal.SpringBootDemo1.model.Screen;
import com.Kaushal.SpringBootDemo1.model.ScreenNew;


@Service
public class ScreenServiceImpl implements ScreenService {

	@Autowired
	private ScreenDao screenDao;
	
	@Override
	public List<Screen> getAllScreens() {
		// TODO Auto-generated method stub
		return screenDao.getAllScreens();
	}

	@Override
	public Screen getScreenById(Integer id) {
		// TODO Auto-generated method stub
		return screenDao.getScreenById(id);
	}

	@Override
	public Screen updateScreenById(Screen screen) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void inserData(ScreenNew screen) {
		screenDao.insertData(screen);
		
	}
	@Override
	public void inserMultipleData(List<ScreenNew> screen) {
		screenDao.inserMultipleData(screen);
		
	}	
	

}
