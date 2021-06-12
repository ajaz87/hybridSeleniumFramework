package genericLibrary;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Photo implements AutoConstant {

	
public String getPhoto(WebDriver driver, String name) throws IOException{
		
		Date D=new Date();
		String date = D.toString().replaceAll("-",":");
		
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src= ts.getScreenshotAs(OutputType.FILE);
		File dest= new File(photoPath+date+name+".png");
		FileUtils.copyFile(src,dest);
		return date;
		
		
		
	}
	
	

}

	
	
	
	

