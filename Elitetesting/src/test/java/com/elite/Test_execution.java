package com.elite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_execution {

	
	WebDriver driver;

	@Test(priority = 1)
	public void positiveflow() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sivadass\\Documents\\selenium files\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.kobster.com/elite-auth#/dashboard");

		// Verify login functionality
		Testing_elite1 elite1 = new Testing_elite1(driver);

		elite1.login("testbgrlevelone@yahoo.com", "kobster123");

		elite1.Selectstate();
//------------------ Order placing functionality--------------------------------------------------------
		//Using addtocart option in procure
		
		/*
		 * elite.Orderplace_001_Addtocart(); elite.addresspage();
		 * elite.confrmtionpage();
		 * 
		 * //Using Reorder elite.Orderplace_002_Reorder(); elite.addresspage();
		 * elite.confrmtionpage();
		 * 
		 * //Using Order status widget -Reorder elite.Orderplace_003_Widget();
		 * elite.addresspage(); elite.confrmtionpage();
		 * 
		 * //Using Order By Excel elite.Orderplace_004_orderByExcel();
		 * elite.addresspage(); elite.confrmtionpage();
		 * 
		 * //Using ReOrder List elite.Orderplace_005_reorderlist(); elite.addresspage();
		 * elite.confrmtionpage();
		 * 
		 * Othercases elite1 = new Othercases(driver); //---------------- Procure/Buy -
		 * field wise validation--------------------------------------------------
		 * 
		 * elite1.procure_001_procurebuy_validations(); elite1.procure_002_totalprice();
		 * elite1.procure_003_supplierfilter(); elite1.procure_005_countofproduct();
		 * 
		 * elite.Orderplace_001_Addtocart(); elite1.procure_004_removeclear();
		 * 
		 * elite.Orderplace_001_Addtocart();
		 * 
		 * 
		 * //------------------------Order By Excel
		 * functionality------------------------------------------------
		 * elite1.Orderbyexcel_001_unsupportfile();
		 * elite1.Orderbyexcel_002_hugefilesize();
		 * 
		 * //------------------------Widget add/remove
		 * functionality------------------------------------------------
		 * 
		 * elite1.Widget_001_widgetaddremove(); elite1.Widget_003_widgetrestriction();
		 * 
		 *///------------------------PO   functionality---------------------------------------------------------------		
		//elite1.logout();
		//Selite.login("elumalai.k@kobster.com", "kobster123");
		//elite1.Widget_001_widgetaddremove();
		//elite1.Widget_003_widgetrestriction();
		
		//Purchaseorder elitepo= new Purchaseorder(driver);
		//elitepo.AddNewPO();
		
	
	
	
	}
	
	
	
	
}
