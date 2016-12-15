package SSDI.steps;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import SSDI.hwdriver.ExecutionInstance;
import SSDI.hwdriver.Sessions;
import SSDI.log.LogEntry;

public class signUp {
	Sessions ses;
	String SessionID ="";
	public signUp(String sessionID,int Count1) {
		super();
		
		SessionID = sessionID;
		ses = ExecutionInstance.getSession(sessionID);
		
	}
	
	public void test() throws Exception{
		ses.getDriver().navigate().to("http://localhost:8080/index.html");
		ses.perform().JS_Click(ses.getDriver().findElement(By.xpath("//a[.='Register']")));
		Thread.sleep(5000);
		
		ses.getDriver().findElement(By.xpath("//form[@id='register-form']/div[3]/input")).sendKeys(ses.getTestData("RegEmail"));
	
		ses.getDriver().findElement(By.xpath("//form[@id='register-form']/div[6]/input")).sendKeys(ses.getTestData("RegPassword"));
		ses.getDriver().findElement(By.name("confirm-password")).sendKeys(ses.getTestData("RegConfPassword"));
		ses.perform().JS_Click(ses.getDriver().findElement(By.id("btnSignUp")));
		try{
		ses.getDriver().switchTo().alert().accept();
		
		}
		catch(Exception h){}
	}
}
