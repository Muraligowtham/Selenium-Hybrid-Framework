package SSDI.steps;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.Select;

import SSDI.hwdriver.ExecutionInstance;
import SSDI.hwdriver.Sessions;


public class AdminHome {
       
       String SessionID = "";
       private Sessions ses;

       public AdminHome (String sessionID) {
              
              ses = ExecutionInstance.getSession(sessionID);
       }

        public void ADMScript (int count) throws Exception
        {
        	
        	Xbridcodechanges Xbrid = new Xbridcodechanges();
        	
        	
        	Xbrid.JS_Click(ses,ses.getDriver().findElement(By.id("addAdmins")));
            
         }	
        	
        //FOR SELECTING OPTIONS FROM THE DROPDOWN//
        public void dropDown(WebElement element,String testdata)
        {
               Select sc=new Select(element);
               sc.deselectByVisibleText(testdata);
        }
        
        public void addAccounts(String Accountrelated,String Dropdown)
            {
                   ses.getDriver().findElement(By.xpath("//fieldset[@class='fx-table-search']/input")).sendKeys(Accountrelated);
                   dropDown(ses.getDriver().findElement(By.xpath("//fieldset[@class='fx-table-search']/select")),Dropdown);
            }


            public void firstCheckBoxClick(String Dropdown,String Accountrelated) throws Exception
            {
                   List<WebElement> noOFColumns=ses.getDriver().findElements(By.xpath("//thead/tr[1]/th"));
                   int count=1;
                   for(WebElement e:noOFColumns)
                   {
                          if(e.getText().trim().equalsIgnoreCase(Dropdown.trim()))
                   {
                          break;
                   }
                   count++;
                   }
            
            List<WebElement> noOFRows= ses.getDriver().findElements(By.xpath("//tbody[@id='tableBody']/tr/td["+count+"]"));
            
            for(int j=1;j<=noOFRows.size();j++)
            {
                   String requiredValue=ses.getDriver().findElement(By.xpath("//tbody[@id='tableBody']/tr["+j+"]/td["+count+"]")).getText();
                   
                   if(requiredValue.trim().equalsIgnoreCase(Accountrelated.trim()))
                                {
                          Xbridcodechanges.JS_Click(ses, ses.getDriver().findElement(By.xpath("//tbody[@id='tableBody']/tr["+j+"]/td[1]/input")));
                                }
                   }
            Xbridcodechanges.JS_Click(ses,ses.getDriver().findElement(By.id("addAllAdmins")));
            
            }

            
     	
    }
     	
