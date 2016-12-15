package SSDI.log;

import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

import SSDI.hwdriver.*;
import SSDI.steps.SSDI_POC;

//import Syntel.Steps.WADM_POC;

public class OverAllFormatter extends Formatter{

/*	Sessions ses;
	String testid;
	String id;
	public OverAllFormatter(String Testid,String id)
	{
		this.ses=ExecutionInstance.getSession(id);
		
		this.testid=id;
		this.id=id;
	}*/

	
	@Override
	public String format(LogRecord arg0) {
		
		//String[] CurrentSenario=ses.getVariable("Senario").split(";");
		//Sessions ses1=sesion(id);
		StringBuffer sb=new StringBuffer();
		sb.append("<tr>");
		sb.append("<td>");
		//System.out.println(testid);
		//System.out.println(ses1.getVariable("QC_ID"));
		sb.append(SSDI_POC.testName);
		sb.append("</td>");
		sb.append("<td>");
		sb.append(arg0.getMessage());
		sb.append("</td>");
		sb.append("</tr>");
		
		return sb.toString();
		
	}
	
	public Sessions sesion(String Testid ){
		
		
		return ExecutionInstance.getSession(Testid);
	}
	
	
	
	 public String getHead(Handler h) {
		    return ("<html>\n  <body>\n" + "<Table border>\n<tr><th>TestCase ID</th><th>Status</th></tr>\n");
		  }

		  public String getTail(Handler h) {
		    return ("</table>\n</body>\n</html>");
		  }

}


