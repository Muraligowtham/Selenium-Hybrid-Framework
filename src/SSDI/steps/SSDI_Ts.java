package SSDI.steps;


import java.util.List;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import SSDI.hwdriver.*;
import SSDI.log.LogEntry;



public class SSDI_Ts {

	String SessionID = "";
	private Sessions ses;
	//	
	public SSDI_Ts(String sessionID) {


		//		super();
		SessionID = sessionID;
		//		ses = ExecutionInstance.getSession(SessionID);

		ses=ExecutionInstance.getSession(sessionID);
	}

	public void WADMCode(int Count) throws Exception {
		String ID=ses.getVariable("QC_ID").replace(".0", "");
		Xbridcodechanges Xbrid=new Xbridcodechanges();
		try{

			if(ses.getTestData("currentstep").equals("Signup"))
			{
				signUp DemoObject=new signUp(SessionID, Count);
				DemoObject.test();
			}
			else if(ses.getTestData("currentstep").equals("GUIVerification")){
				Class_GUI_Verification guiObject=new Class_GUI_Verification(SessionID, Count);
				guiObject.validations(Count);
			}
			else if(ses.getTestData("currentstep").equals("Login")){
				Login LoginObject=new Login(SessionID, Count);
				LoginObject.test();
			}
		}	

		catch(Exception j){
			j.printStackTrace();

			ses.setVariable("InitiateNew", "Yes");
			ses.setVariable("Status", "Fail");

			ExecutionInstance.addStepEntry( ses,j.getMessage(),ses.getVariable("Status"));

			//	ExecutionInstance.addOverAllStatus(ses,"Fail",ses.getVariable("resultsFolder"));
			try{
				//basic.createOverallLog("ABS", ses.getVariable("resultsFolder"), ses.getVariable("QC_ID")).info("FAIL");}
				//log2.info("Fail");
			}

			catch(Exception jl){
				jl.printStackTrace();
			}

			Excel a=new Excel(ses.getVariable("QC_ID"));

			a.excelsheet(ses.getDriver(), j.getMessage(), ses.getVariable("QC_ID"));

			try{
				ses.getDriver().close();
				ses.getDriver().quit();}
			catch(Exception h){}
			//initiating next test case


		}

	}


}