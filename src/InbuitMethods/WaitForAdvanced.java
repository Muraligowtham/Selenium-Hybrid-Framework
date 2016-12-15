package InbuitMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForAdvanced {
private WebDriver driver;
	private int milli;
	
	public WaitForAdvanced(WebDriver driver,int milli)
	{
		
		this.milli=milli;
		this.driver=driver;
		
	}
	public WaitForAdvanced(WebDriver driver)
	{
		
		this.milli=milli;
		this.driver=driver;
		
	}
	
	
	public Boolean elementPresent(By locator)
	{
		try{
			WebElement element = null;
			WebDriverWait wait = new WebDriverWait(driver, milli);
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			System.out.println(element.getSize());
			if(element.isDisplayed()){
				return true;
			}else{
				return false;
			}}
		catch(Exception h){

			//			captureScreenLable(driver);
			//			driver.close();
			//			driver.quit();
			return false;
		}
		
	}
	public Boolean elementPresent(By locator,String SomeInfo)
	{
		try{
			WebElement element = null;
			WebDriverWait wait = new WebDriverWait(driver, milli);
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			System.out.println(element.getSize());
			if(element.isDisplayed()){
				return true;
			}else{
				return false;
			}}
		catch(Exception h){

			//			captureScreenLable(driver);
			//			driver.close();
			//			driver.quit();
			return false;
		}
		
	}
	
	public Boolean elementClickable(By locator,String a)
	{
		try{
			WebElement element = null;
			WebDriverWait wait = new WebDriverWait(driver, milli);
			element = wait.until(ExpectedConditions.elementToBeClickable(locator));
			System.out.println(element.getSize());
			if(element.isDisplayed()){
				return true;
			}else{
				return false;
			}}
		catch(Exception h){

			//			captureScreenLable(driver);
			//			driver.close();
			//			driver.quit();
			return false;
		}
		
	}
	public Boolean elementClickable(By locator)
	{
		try{
			WebElement element = null;
			WebDriverWait wait = new WebDriverWait(driver, milli);
			element = wait.until(ExpectedConditions.elementToBeClickable(locator));
			System.out.println(element.getSize());
			if(element.isDisplayed()){
				return true;
			}else{
				return false;
			}}
		catch(Exception h){

			//			captureScreenLable(driver);
			//			driver.close();
			//			driver.quit();
			return false;
		}
		
	}

}
