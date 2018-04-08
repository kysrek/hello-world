package com.Kaushal.SpringBootDemo1.service;

import java.util.List;

import com.Kaushal.SpringBootDemo1.model.Screen;
import com.Kaushal.SpringBootDemo1.model.ScreenNew;

public interface ScreenService {

	List<Screen> getAllScreens();
	Screen getScreenById(Integer id);
	Screen updateScreenById(Screen screen);
	void inserData(ScreenNew screen);
	void inserMultipleData(List<ScreenNew> screen);
	
	
}
