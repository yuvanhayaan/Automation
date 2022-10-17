package com.hrms.lib;
import org.openqa.selenium.WebDriver;

public class Global 
{
	public WebDriver driver;
	
//to provide test data & object of whole application
	
		//...........testdata
		public String url = "http://183.82.103.245/nareshit/login.php";
		 String un= "nareshit";
		 String pw = "nareshit";
		 
	//................object
		  String txt_LoginName ="txtUserName";
		  String txt_password ="txtPassword";
		  String btn_login ="Submit";
		  String addnewemp="//input[@type='button'][@value='Add']";
		  String first_name="txtEmpFirstName";
		  String last_name="txtEmpLastName";
		  
		  String save_btn ="btnEdit";
		  
		  String edit_btn ="EditMain";
		  
		  String save_btn2 ="//input[@type='button'][@value='Save']";
		  String save_btn3="//*[@id='btnEditPers']";
		  
		  String frame_entry ="rightMenu";
		  String link_logout ="Logout";
		  String fn="Ram";
		  String ln="shyam";
		  String Edit_fn= "aa";
		  String Edit_ln ="bb";
		  String search_btn ="//input[@type='button'][@value='Search']";
		  
		  String searchBy="loc_code";
		  String searchfor="//*[@id='loc_name']";
		  String search_btn1="//input[@type='button'][value='Search']";
		  String checkBox="/html/body/div/div[2]/form/table/tbody/tr[1]/td[1]/input";
		  String delet_btn="//input[@type='button'][@value='Delete']";
		 String select_checkbox ="chkLocID[]";
		  
	}


