package genericLibrary;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebdriverUtilities {
	
	public void dropdown(WebElement ele,String text){
		Select s=new Select(ele);
		s.selectByVisibleText(text);
		
	}
	
	public void mousHover(WebDriver driver, WebElement target) {
		
		Actions a =new Actions(driver);
		a.moveToElement(target);
	}
	
	public void frame(WebDriver driver){
		driver.switchTo().frame(0);
	
	}
	public void switchBackframe(WebDriver driver){
	  driver.switchTo().defaultContent();
	
	}
	public void alertpopup(WebDriver driver){
     driver.switchTo().alert().accept();	
	
	} 
     
     public void switchTabs(WebDriver driver) {
		Set<String> child= driver.getWindowHandles();
		
		for(String b:child){
			driver.switchTo().window(b);
			
			
		}
     }	
		
     public void doubleclickm(WebDriver driver,WebElement target){
			
			Actions a = new Actions(driver);
			a.doubleClick(target).perform();
			
		}
	
		public void scrollBar(WebDriver driver,int x,int y){
			
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("windows.scrollby("+x+","+y+")");
			
		}
		
		
	}
		

		
     
	
	
	
	
	
	
	




	
	
	
	
	

