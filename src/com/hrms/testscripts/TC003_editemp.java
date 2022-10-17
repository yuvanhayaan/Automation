package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC003_editemp {
@Test
	//public static void main(String[] args)  throws Exception{
	public void TC003() throws Exception{
	DOMConfigurator.configure("log4j.xml");
		General obj =new General();
		obj.openApplication();
		obj.login();
		obj.enterframe();
		obj.addnewemp();
		Thread.sleep(5000);
		obj.editemployee();
		obj.exitframe();
	    obj.closeApplication();
		
		

	}

}
