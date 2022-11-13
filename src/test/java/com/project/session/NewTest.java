package com.project.session;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewTest {
	@DataProvider(name="mobile")
	public Object [][] getmobileData(){
		return new Object[][] {{"Samsung Mobiles"}};
	}
	@DataProvider( name = "newdata" )
	public Object[][] getCredentials() {
		return new Object[][] {{"123","hus"}};
	}
	
	@BeforeClass(groups = "default")
	public void beforeClass() {
		System.out.println("beforeclass2222");
	}
	@AfterClass(groups = "default")
	public void afterClass() {
		System.out.println("afterclass2222");
	}
	@BeforeMethod(groups = "default")
	public void beforeMethod() {
		System.out.println("beforeMethod2222");
	}
	@AfterMethod(groups = "default")
	public void afterMedthod() {
		System.out.println("aftermethod2222");
	}
	
	@Test(priority = 1,groups = "smoke")
	public void Login() {
		System.out.println("login");
	}
	@Test(priority = 2,dataProvider = "mobile")
	public void search(String data) {
		System.out.println("search2222");
		System.out.println(data);
	}
	@Test(priority = 3,dataProvider = "newdata")
	public void mobilechoose(String good, String old) {
		System.out.println("Login"+good);
		
	}
	@Test(priority = 4,invocationCount = 1,groups = "smoke")
	public void window() {
		System.out.println("window");
	}
	@Test(priority = 5, enabled = true,groups = "smoke")
	public void validation() {
		System.out.println("validate");
	}
	

}
