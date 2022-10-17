package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;

import com.hrms.lib.General;

public class TC004_Delemp {

	//public static void main(String[] args) {
	public void TC003() throws Exception{
		DOMConfigurator.configure("log4j.xml");
      General obj = new General();
         obj.openApplication();
         obj.login();
         obj.enterframe();
         obj.selectmethod();
         obj.delemp();
         obj.exitframe();
         obj.logout();
         obj.closeApplication();
	}

}
