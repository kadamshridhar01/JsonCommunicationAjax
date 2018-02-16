package com.json.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.json.example.model.Application;

@Controller
public class DataController {

	
	@RequestMapping(value = { "getApplication" }, method = RequestMethod.GET)
	public @ResponseBody Application getApplication() {
		Application app = new Application();

		return app;
	}
	
	
	@RequestMapping(value = { "sendApplication" }, method = RequestMethod.POST)
	public @ResponseBody Application uploadApplication(@RequestBody Application app ) {
	

		return app;
	}

	@RequestMapping(value = { "getApplicationList" }, method = RequestMethod.GET)
	public @ResponseBody List<Application> getApplicationList() {
		List<Application> ApplicationList = new ArrayList<Application>();
		Application app1 = new Application();
		app1.setParentId(33);
		app1.setDependentAppID(52);
		app1.setApplicationID(1);
		Application app2 = new Application();
		app2.setParentId(37);      
		app2.setDependentAppID(57);
		app2.setApplicationID(2);
		Application app3 = new Application();
		app3.setParentId(84);
		app3.setDependentAppID(74);
		app3.setApplicationID(5);
		ApplicationList.add(app1);
		ApplicationList.add(app2);
		ApplicationList.add(app3);

		return ApplicationList;
	}

}
