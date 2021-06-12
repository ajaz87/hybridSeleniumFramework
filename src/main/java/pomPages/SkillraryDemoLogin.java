package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoLogin {
	
	
	@FindBy(id="course")
	private WebElement coustab;
	

	//public WebElement getCoustab() {
		//return coustab;
	//}


	@FindBy(xpath="//a[text()='Selenium Training']")
	private WebElement seleniumtraining;

	
 public SkillraryDemoLogin(WebDriver driver) {
	 
	PageFactory.initElements(driver ,this);
 }
 
 
 public void second(WebDriver driver) {

		Actions a=new Actions(driver);
		a.moveToElement(coustab).perform();
	 
 }
 
 
 
 public void seleniumTrainingbtn() {
	 seleniumtraining.click();
	 
	 
 }
	
 //public void selenium() {
	// seleniumtraining.click();
	
	
	
	
 }
	
	


