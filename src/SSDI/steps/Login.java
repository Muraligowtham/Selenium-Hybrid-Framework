package SSDI.steps;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import SSDI.hwdriver.ExecutionInstance;
import SSDI.hwdriver.Sessions;
import SSDI.log.LogEntry;

public class Login {
	Sessions ses;
	String SessionID ="";
	public Login(String sessionID,int Count1) {
		super();
		
		SessionID = sessionID;
		ses = ExecutionInstance.getSession(sessionID);
		
	}
	
	public void test() throws Exception{
		ses.getDriver().navigate().to("http://localhost:8080/index.html");
		ses.getDriver().findElement(By.xpath("//form[@id='login-form']/div[2]/input")).sendKeys(ses.getTestData("LoginUserID"));
		Thread.sleep(5000);
		ses.getDriver().findElement(By.xpath("//form[@id='login-form']/div[4]/input")).sendKeys(ses.getTestData("Password"));
		ses.perform().JS_Click(ses.getDriver().findElement(By.id("login-submit")));
		try{
			ses.setVariable("PopUpText",ses.getDriver().switchTo().alert().getText());
			System.out.println(ses.getVariable("PopUpText"));
		ses.getDriver().switchTo().alert().accept();
		
		}
		catch(Exception h){}
	}
}
