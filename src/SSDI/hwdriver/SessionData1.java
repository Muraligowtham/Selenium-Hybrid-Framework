package SSDI.hwdriver;

import java.util.HashMap;

public class SessionData1 {

	HashMap<String,String> settingVariable=new HashMap<String, String>();
	public SessionData1(HashMap<String,String> settingVariable)
	{
		this.settingVariable=settingVariable;
	}
	
//	public void setVariable(HashMap<String,String> settingVariable)
//	{
//		
//		this.settingVariable=settingVariable;
//		
//	}
//	
	public HashMap<String,String> getVariable()
	{
		return settingVariable;
	}
	
}
