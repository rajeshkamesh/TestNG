package com.project.session;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class MobilePurchase {
	@DataProvider(name="mobile")
	public Object [][] getmobileData(){
		return new Object[][] {{"Realme Mobiles"}};
	}
	
	@DataProvider( name = "newdata" )
	public Object[][] getCredentials() {
		return new Object[][] {{"NEWDATA"}};
	}
	
	@BeforeClass(groups = "default")
	public void beforeClass() {
		System.out.println("beforeclass");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("afterclass");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod");
	}
	@AfterMethod
	public void afterMedthod() {
		System.out.println("aftermethod");
	}
	
	@Test(priority = 1,groups = "smoke")
	public void Login(@Optional("sampleuser")String user) {
		System.out.println(user);
	}
	@Test(priority = 2,dataProvider = "mobile")
	public void search(String data) {
		System.out.println("search");
		System.out.println(data);
	}
	@Test(priority = 3)
	public void mobilechoose() {
		System.out.println("Login");
		
		
	}
	@Test(priority = 4,invocationCount = 2)
	public void window() {
		System.out.println("window");
	}
	@Test(priority = 5, enabled = true)
	public void validation() {
		System.out.println("validate");
	}
	
}
