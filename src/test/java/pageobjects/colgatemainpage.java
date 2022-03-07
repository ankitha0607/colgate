package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class colgatemainpage {
	WebDriver driver;
	
	By emailtextbox = By.xpath("//*[@id=\"gigya-textbox-email\"]");
	By submitbutton = By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/form/div[1]/div[7]/div[1]/input");
	By closebutton = By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]");
	By colgatelogo = By.xpath("/html/body/div[3]/div/div[1]/div/div/div/div/div/div/div/div/div/div[1]/div/div/div[1]/div/a/img");
	 public colgatemainpage(WebDriver driver) {
			
			this.driver = driver;
		}
	 
	 public boolean promptisdisplayed() {
		 boolean l = driver.findElement(emailtextbox).isDisplayed();
		 return l;
		 	 
	 }
	 
	 public void enteremail(String text) {
		  driver.findElement(emailtextbox).sendKeys(text);
	 }
	 
	 public void clickonsubmit() {
		 driver.findElement(submitbutton).click();
	 }
	 public void clickonclosebutton() {
		 driver.findElement(closebutton).click();
	 }
	public boolean logoisdisplayed() {
		boolean j =driver.findElement(colgatelogo).isDisplayed();
		return j;
	}
	

}
