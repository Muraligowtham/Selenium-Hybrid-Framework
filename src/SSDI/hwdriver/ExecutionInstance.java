package SSDI.hwdriver;

import java.util.HashMap;
import java.util.logging.Logger;

import SSDI.log.*;


public class ExecutionInstance {
	
	
	
	
	
	static HashMap<String,Sessions> a=new HashMap<String, Sessions>();
	public static void setSession(String Testid)
	{
		Sessions ses=new Sessions(Testid);
		a.put(Testid,ses);
		System.out.println(a.get(Testid));
	}
	
	public static Sessions getSession(String Testid)
	{
		System.out.println(a.get(Testid));
		return a.get(Testid);
	}
	
//	public static void addStepEntry(Sessions ses,String Message,String status) throws Exception
//	{
//		log.addStepEntry1(ses.getVariable("QC_ID"),Message,status);
//	}

	public static void addStepEntry(Sessions ses,String Message,String Status) throws Exception {
		
		 LogEntry.loggers.get(ses.getVariable("QC_ID")).info(Message);
		 
		
	}
	public static void addStepEntry(Sessions ses,String Status) throws Exception {
		
		 LogEntry.loggers.get(ses.getVariable("QC_ID")).info(Status);
		 
		
	}
	
	public static void addOverAllStatus(Sessions ses,String Status,String folderPath) throws Exception {
		
		try
		{
			

//			Logger log1=Logger.getLogger("Over all Log");
//			
//			log1 =	basic.OverAllloggers.get("Overall");
//			
//			System.out.println("log size"+basic.OverAllloggers.size());
//			
//			log1.info(Status);
			
			
			
			
		// basic.OverAllloggers.get("Overall").info(Status);
//		 basic.OverAllloggers.get(ses.getVariable("QC_ID")).info(Status);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
}
