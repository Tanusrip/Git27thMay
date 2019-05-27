package DriverScript;

import org.apache.log4j.Logger;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import testcases.TC001;
import testcases.TC002;
import testcases.TC003;
import testcases.TC004;
import utility.CommonMethods;
import utility.Constantvalues;
import utility.ExcelReadwrite;
import utility.Log;

public class Mainmethod {
	

	public static boolean tvalue=true;
	
	@BeforeClass
	public static void prerequisite()throws Exception {
	System.out.println(Constantvalues.excelPath);
	ExcelReadwrite.setExcel(Constantvalues.excelPath);
	DOMConfigurator.configure("log4j.xml");
	
	}
	
	//--------------------------------TC001-----------------------------------------------------------------
	@Test(priority=1)
	public static void tc001() throws Exception {

		if (ExcelReadwrite.readValue(Constantvalues.testscenariosheet, 1, Constantvalues.run_mode).equalsIgnoreCase("Y")) {
			tvalue =true;
			Log.StartTestcase("TC001");
			
			TC001.tc01();
			Log.EndTestcase();
			if (tvalue==false) {
				ExcelReadwrite.writevalue(Constantvalues.testscenariosheet, 1, Constantvalues.status, "FAIL");
				
			} else if (tvalue==true) {
				ExcelReadwrite.writevalue(Constantvalues.testscenariosheet, 1, Constantvalues.status, "PASS");
			}
				
		} else {
			ExcelReadwrite.writevalue(Constantvalues.testscenariosheet, 1, Constantvalues.status, "SKIP");

		}
	}

		
		//--------------------------------TC002-----------------------------------------------------------------
	@Test(priority = 2)	
	public static void tc002() throws Exception {
		if (ExcelReadwrite.readValue(Constantvalues.testscenariosheet, 2, Constantvalues.run_mode).equalsIgnoreCase("Y")) {
			tvalue =true;
			Log.StartTestcase("TC002");
			
			TC002.tc02();
			Log.EndTestcase();
			if (tvalue==false) {
				ExcelReadwrite.writevalue(Constantvalues.testscenariosheet, 2, Constantvalues.status, "FAIL");
				
			} else if (tvalue==true) {
				ExcelReadwrite.writevalue(Constantvalues.testscenariosheet, 2, Constantvalues.status, "PASS");
			}
				
		} else {
			ExcelReadwrite.writevalue(Constantvalues.testscenariosheet, 2, Constantvalues.status, "SKIP");

		}
}
		
		//--------------------------------TC003-----------------------------------------------------------------
	@Test(priority = 3)	
	public static void tc003() throws Exception {
		if (ExcelReadwrite.readValue(Constantvalues.testscenariosheet, 3, Constantvalues.run_mode).equalsIgnoreCase("Y")) {
			tvalue =true;
			Log.StartTestcase("TC003");
			TC003.tc03();
			Log.EndTestcase();
			if (tvalue==false) {
				ExcelReadwrite.writevalue(Constantvalues.testscenariosheet, 3, Constantvalues.status, "FAIL");
				
			} else if (tvalue==true) {
				ExcelReadwrite.writevalue(Constantvalues.testscenariosheet, 3, Constantvalues.status, "PASS");
			}
				
		} else {
			ExcelReadwrite.writevalue(Constantvalues.testscenariosheet, 3, Constantvalues.status, "SKIP");

		}
	
	}
		
		//--------------------------------TC004-----------------------------------------------------------------
	@Test(priority = 4)	
	public static void tc004() throws Exception {
		if (ExcelReadwrite.readValue(Constantvalues.testscenariosheet, 4, Constantvalues.run_mode).equalsIgnoreCase("Y")) {
			tvalue =true;
			Log.StartTestcase("TC004");
			TC004.tc04();
			Log.EndTestcase();
			if (tvalue==false) {
				ExcelReadwrite.writevalue(Constantvalues.testscenariosheet, 4, Constantvalues.status, "FAIL");
				
			} else if (tvalue==true) {
				ExcelReadwrite.writevalue(Constantvalues.testscenariosheet, 4, Constantvalues.status, "PASS");
			}
				
		} else {
			ExcelReadwrite.writevalue(Constantvalues.testscenariosheet, 4, Constantvalues.status, "SKIP");

		}	
	
}	
	

	
}	
		
		
		
//		
		
	
	
		
		
		
		
		

	

	

