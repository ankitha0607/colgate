package colgate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.colgatemainpage;

public class stepdefinitions {
	WebDriver driver;
	

	@Given("I open the colgate main page")
	public void i_open_the_colgate_main_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.colgate.com/en-us");
	   
	}
	@When("the email prompt is displayed")
	public void the_email_prompt_is_displayed() throws InterruptedException {
	   Thread.sleep(5000);
	   colgatemainpage page1 = new colgatemainpage(driver);
	   if(page1.promptisdisplayed()) {
		   System.out.println("prompt is displayed");
	   }
	   else {
		   System.out.println("prompt is not displayed");
	   }
		   
	}


	@When("I enter the email, click on submit and close the prompt")
	public void i_enter_the_email_click_on_submit_and_close_the_prompt() throws InterruptedException {
		colgatemainpage page1 = new colgatemainpage(driver);
		page1.enteremail("varakalaankitha3@gmail.com");
		page1.clickonsubmit();
		Thread.sleep(1000);
		page1.clickonclosebutton();
	}


	@Then("check display of the main page without the prompt")
	public void check_display_of_the_main_page_without_the_prompt() throws InterruptedException {
		Thread.sleep(5000);
		colgatemainpage page1 = new colgatemainpage(driver);
		if(page1.logoisdisplayed()) {
			System.out.println("back on main page");
		}
		else {
			System.out.println(" Not back on main page");
		}
	  
	}
	

	@Then("close the browser")
	public void close_the_browser() {
	    driver.close();
	}






	

}
