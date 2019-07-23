package com.TestNG;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class BasicAnno {
	@Test(priority=-3)
	public void beta() {
		System.out.println("this is a case1");
	}
	@BeforeMethod
	public void open() {
		System.out.println("open");
    }
	@AfterMethod
	public void close() {
		System.out.println("close");
		
	}
	@Test
	public void game() {
		System.out.println("lose");}
	@BeforeTest
	public void open1() {
		System.out.println("open1");}
	@AfterTest
	public void close1() {
	System.out.println("close1");}
	@BeforeClass
	public void b() {
	System.out.println("beforeclass1");}
	@AfterClass
	public void o() {
		System.out.println("afterclass1");}
	
	@BeforeSuite
	public void a() {
		System.out.println("topclass1");}
	
		@AfterSuite
		public void f() {
			System.out.println("bottomclass1");
		}
			
	}
	

		


