package com.cucumber.Pages;

import org.openqa.selenium.WebDriver;

public class NCL_ObjectsPage {

	

	public NCL_ObjectsPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public final static String Explore_title = "//a[@title='Explore']";
	
	public final static String shore_Excursions ="//a[contains(text(),'Shore Excursions')]";
	
	public final static String search_Destination = "//*[@id=\"search_destinations_chosen\"]/a/span";
	
	public final static String search_field = "(//input[@class='chosen-search-input'])[1]";
	
	public final static String find_button= "//button[contains(text(),'FIND EXCURSIONS')]";
	
	public final static String destinatio_validation ="//span[contains(text(),'Alaska Cruises')]";
	
	public final static String ShoreExcursionPage_validation="(//h2[contains(text(),'Shore Excursions')])[2]";
	
	public final static String Port_tab = "//span[contains(text(),'Port')]";
	
	public final static String ports_validation ="//ul[@id='ports']/li/label";
	
}
