package scripts;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.SeleniumTrainingPage;
import pomPages.SkillRaryLoginPage;
import pomPages.SkillraryDemoLogin;

public class Addthecoursetocart extends BaseClass {

	
	@Test
	
	public void addtocart() throws InterruptedException {
		
		SkillRaryLoginPage s= new SkillRaryLoginPage(driver);
		s.gerasButton();
		s.skillraryDemoapp();
		
		utilities.switchTabs(driver);
		
		
		SkillraryDemoLogin sd= new SkillraryDemoLogin(driver);
		
		//utilities.mousHover(driver,sd.getCoustab());
		Thread.sleep(3000);
		sd.second(driver);
		sd.seleniumTrainingbtn();
		//sd.selenium();
		
		
	    SeleniumTrainingPage st= new SeleniumTrainingPage(driver);
	   // utilities.doubleclickm(driver,st.getAddbtn());
	    st.third(driver);
	    st.Home();
	    //st.addtocartbtn(driver);
	 // utilities.alertpopup(driver);
	    
	}

		
		
		
		
	}
	
	
	

