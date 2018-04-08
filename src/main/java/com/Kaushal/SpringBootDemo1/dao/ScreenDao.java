 	package com.Kaushal.SpringBootDemo1.dao;

import java.util.List;

import com.Kaushal.SpringBootDemo1.model.Screen;
import com.Kaushal.SpringBootDemo1.model.ScreenNew;

public interface ScreenDao {
	List<Screen> getAllScreens();
    Screen getScreenById(Integer id);
    Screen updateScreenById(Screen screen);
    void insertData(ScreenNew sccreen);
    void inserMultipleData(List<ScreenNew> screen);
}
