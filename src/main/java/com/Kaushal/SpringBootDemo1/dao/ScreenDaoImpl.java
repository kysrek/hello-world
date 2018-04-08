package com.Kaushal.SpringBootDemo1.dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.Kaushal.SpringBootDemo1.model.Screen;
import com.Kaushal.SpringBootDemo1.model.ScreenNew;

@Repository
public class ScreenDaoImpl implements ScreenDao{
    
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public List<Screen> getAllScreens() {
		String query="Select * from screen";
		
		return jdbcTemplate.query(query, (rs,rowNum)->{
			Screen screen=new Screen();
			screen.setId(Integer.parseInt(rs.getString("id")));
			screen.setScreenTitle(rs.getString("screenTitle"));
			screen.setScreenData(rs.getString("screenData"));
			
			return screen;
		});
	}


	public Screen getScreenById(Integer id) {
		String query="Select * from screen where id="+id;
		return jdbcTemplate.query(query, rs ->{
			Screen screen= new Screen();
			if(rs.next()){
				screen.setId(Integer.parseInt(rs.getString("id")));
				screen.setScreenTitle(rs.getString("screenTitle"));
				screen.setScreenData(rs.getString("screenData"));				
			}
			return screen;
			
		});
		
	}


	public Screen updateScreenById(Screen screen) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void insertData(ScreenNew screen){
		String query="insert into screen values("+
				new Integer(7)+",'"+ screen.getScreenTitle()+"','"
						+ screen.getScreenData()+"')";
		jdbcTemplate.execute(query);
	}

	@Override
	public void inserMultipleData(List<ScreenNew> screens){
		int i = 8;
		for(ScreenNew screen: screens  ){
			String query="insert into screen values("+
					i+",'"+ screen.getScreenTitle()+"','"
					+ screen.getScreenData()+"')";
			i++;
			jdbcTemplate.execute(query);
		}
	}
	

	

}
