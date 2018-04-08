package com.Kaushal.SpringBootDemo1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Kaushal.SpringBootDemo1.model.Screen;
import com.Kaushal.SpringBootDemo1.model.ScreenNew;
import com.Kaushal.SpringBootDemo1.service.ScreenService;

@RestController
public class Demo1Controller {

	@Autowired
	public ScreenService screenService;
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
    public @ResponseBody List<Screen> allScreens(){
        return screenService.getAllScreens();
    }
	
	@RequestMapping(value="/id/{id}", method = RequestMethod.GET)
	public @ResponseBody Screen getScreen(@PathVariable("id")Integer id) throws Exception{
		Integer abc;
		NullPointerException abcd;
		if (id!=null){
		return screenService.getScreenById(id);
		}else {throw new Exception ("Null id ");}
	}
	
	
	
	@RequestMapping(value="/screen12", method = RequestMethod.POST)
	public String inserData(@RequestBody ScreenNew screen){
		screenService.inserData(screen);
		return "Success";
	}
	
	@RequestMapping(value="/screen", method = RequestMethod.POST)
	public String inserData(@RequestBody List<ScreenNew> screens){
		screenService.inserMultipleData(screens);
		return "Success";
	}
}
