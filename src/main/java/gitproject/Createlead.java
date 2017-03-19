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
	
