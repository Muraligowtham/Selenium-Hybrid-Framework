package SSDI.hwdriver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import InbuitMethods.Perform;
import InbuitMethods.WaitForAdvanced;

public class Sessions {
	//HashMap<String,String> a=new HashMap<String, String>();
	private WebDriver driver;
	String testid;
	private HashMap<String,String> settingVariable=new HashMap<String, String>();
	 SessionData1 data1=new SessionData1(settingVariable);
	 public WaitForAdvanced wait;
	 
	public Sessions(String testid)
	{
		this.testid=testid;
	}
	
	
	public void setDriver()
	{
try{
//		System.setProperty(
//				"webdriver.ie.driver",
//				"D:\\Node\\IEDriverServer.exe");
//
//		DesiredCapabilities capab = DesiredCapabilities.internetExplorer();
//		capab.setCapability(
//				InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
//				true);
//		capab.setCapability("requireWindowFocus", true);
//		driver=new InternetExplorerDriver();
//	
	
	
//	//chrome
//	
//	System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
//	 driver = new ChromeDriver();
		
		driver = new FirefoxDriver();
		//Firefox
		
}
catch(Exception j){
	
	j.printStackTrace();
	
}
		
	}
	
	public String getScenario_ID(){
		return testid;
	}
	public WebDriver getDriver()
	{
		return driver;
	}
	public String getTestData(String Key)
	{
		return  getVariable(Key);
	}
	public  void setVariable(String key,String Value)
	{
		data1.getVariable().put(key, Value);
	}
	
	public String getVariable(String key)
	{
		return data1.getVariable().get(key);
	}
	
    public WaitForAdvanced waitFor(int milli)
    {
    	return new WaitForAdvanced(driver,milli);
    }
    public WaitForAdvanced waitFor()
    {
    	return new WaitForAdvanced(driver);
    }
	
    public Perform perform()
    {
    	return new Perform(driver);
    }
	
	
	

	
}
