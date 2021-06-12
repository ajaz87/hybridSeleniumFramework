package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillRaryLoginPage {
	
	
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gerasBtn;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'] )[2]")
	private WebElement demoapp;
	
	public SkillRaryLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}

    public void gerasButton(){
    	gerasBtn.click();
    	
    	}
    
    public void skillraryDemoapp(){
    	demoapp.click();
    	
    	
    }
    
}

	
	
	


