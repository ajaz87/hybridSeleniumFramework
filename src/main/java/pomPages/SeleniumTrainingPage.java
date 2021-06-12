package pomPages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumTrainingPage {
	
	@FindBy(id="add")
	private WebElement addbtn;
	
	
	@FindBy(xpath="//a[text()='HOME']")
	private WebElement homebtn;
	
	//public WebElement getAddbtn() {
	//	return addbtn;
//	}

   // @FindBy(xpath="//button[text()='Add to Cart']")
	//private WebElement addtocart;
    
    
    public SeleniumTrainingPage(WebDriver driver){
    	PageFactory.initElements(driver , this);
    }
    
    public void third(WebDriver driver) {

		Actions a=new Actions(driver);
    	a.doubleClick(addbtn).perform();
    }
    
    public void Home() {
    	
    	homebtn.click();
    	
    	
    	
    }
	//public void addtocartbtn(WebDriver driver){
		//addtocart.click();
		
	//	Alert a = driver.switchTo().alert();
		
		
		
	}


	
	
	
	
	
	
	
	


