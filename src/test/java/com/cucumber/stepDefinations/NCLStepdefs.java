package com.cucumber.stepDefinations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.Pages.NCL_ObjectsPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NCLStepdefs {
	public static WebDriver driver;
	NCL_ObjectsPage obj = new NCL_ObjectsPage(driver);

	@Given("^a Guest$")
	public void a_Guest() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "//Users//jamalpashashaik//Documents//drivers//chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.ncl.com/");

	}

	@Given("^I am on Homepage$")
	public void i_am_on_Homepage() throws Throwable {
		driver.findElement(By.xpath(obj.Explore_title)).click();
	}

	@Given("^I navigated to \"([^\"]*)\" page$")
	public void i_navigated_to_page(String arg1) throws Throwable {

		driver.findElement(By.xpath(obj.shore_Excursions)).click();

	}

	@When("^I search for destination \"([^\"]*)\"$")
	public void i_search_for_destination(String arg1) throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		driver.findElement(By.xpath(obj.search_Destination)).click();
		driver.findElement(By.xpath(obj.search_field)).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath(obj.search_field)).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath(obj.search_field)).sendKeys(Keys.ENTER);
		WebElement element = driver.findElement(By.xpath(obj.find_button));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);

	}

	@Then("^Shore Excursions page is present$")
	public void shore_Excursions_page_is_present() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath(obj.ShoreExcursionPage_validation)).isDisplayed());

	}

	@Then("^Results are filtered by \"([^\"]*)\"$")
	public void results_are_filtered_by(String arg1) throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath(obj.destinatio_validation)).isDisplayed());
	}

	@Then("^Filter By Ports are only belong to \"([^\"]*)\"$")
	public void filter_By_Ports_are_only_belong_to(String arg1) throws Throwable {

		driver.findElement(By.xpath(obj.Port_tab)).click();
		String[] expected = {"Icy Strait Point, Alaska", "Juneau, Alaska", "Ketchikan, Alaska", "Seward, Alaska", "Sitka, Alaska", "Skagway, Alaska", "Victoria, British Columbia"};
		List<WebElement> allOptions = driver.findElements(By.xpath(obj.ports_validation));
		if (expected.length != allOptions.size()) {
		    System.out.println("fail, wrong number of elements found");
		}
		for (int i = 0; i < expected.length; i++) {
		    String optionValue = allOptions.get(i).getText();
		    if (optionValue.equals(expected[i])) {
		        System.out.println("passed on: " + optionValue);
		    } else {
		        System.out.println("failed on: " + optionValue);
		    }
		}

		}
	

}
