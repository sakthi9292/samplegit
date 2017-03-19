package gitproject;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leaftaps 

{
	
	public static void main(String[] args) {
	
    /*Set Driver and URL*/	
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/control/main");
	
	/*Login Page*/
	driver.findElementById("username").sendKeys("DemoSalesManager");
	driver.findElementById("password").sendKeys("crmsfa");
	driver.findElementByClassName("decorativeSubmit").click();
	
	/*Create Lead*/
	driver.findElementByLinkText("CRM/SFA").click();
	driver.findElementByLinkText("Create Lead").click();
	driver.findElementById("createLeadForm_companyName").sendKeys("Testleaf");
	driver.findElementById("createLeadForm_firstName").sendKeys("Leaf");
	driver.findElementById("createLeadForm_lastName").sendKeys("Taps");
	driver.findElementByName("submitButton").click();
	
	/*Create Account*/
	driver.findElementByLinkText("My Home").click();
	driver.findElementByLinkText("Create Account").click();
	driver.findElementById("accountName").sendKeys("TestLeafAccount");
	driver.findElementByClassName("smallSubmit").click();
	
	/*Create Contact*/
	driver.findElementByLinkText("My Home").click();
	driver.findElementByLinkText("Create Contact").click();
	driver.findElementById("firstNameField").sendKeys("Test");
	driver.findElementById("lastNameField").sendKeys("Leaf");
	driver.findElementByClassName("smallSubmit").click();
	
}
}