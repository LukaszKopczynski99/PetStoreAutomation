package api.utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;


public class DataProviders {

	//DataProvider 1
	
	@DataProvider(name="Data")
	public String [][] getAllData() throws IOException
	{
		String path=".\\testData\\Userdata.xlsx";//taking xl file from testData
		
		ExcelUtility xlutil=new ExcelUtility(path);//creating an object for XLUtility
		
		int totalrows=xlutil.getRowCount("Arkusz1");	
		int totalcols=xlutil.getCellCount("Arkusz1",1);
				
		String apidata[][]=new String[totalrows][totalcols];//created for two dimension array which can store the data user and password
		
		for(int i=1;i<=totalrows;i++)  //1   //read the data from xl storing in two deminsional array
		{		
			for(int j=0;j<totalcols;j++)  //0    i is rows j is col
			{
				apidata[i-1][j]= xlutil.getCellData("Arkusz1",i, j);  //1,0
			}
		}
	return apidata;//returning two dimension array
				
	}
	
	@DataProvider(name="UserNames")
	public String[] getUserNames() throws IOException
	{
		String path=".\\testData\\Userdata.xlsx";//taking xl file from testData
		ExcelUtility xlutil=new ExcelUtility(path);//creating an object for XLUtility
		
		int totalrows=xlutil.getRowCount("Arkusz1");
		
		String apidata[]=new String[totalrows];
		
		for(int i=1;i<=totalrows;i++)
		{
			apidata[i-1]=xlutil.getCellData("Sheet1",i,1);
		}
		
		return apidata;
		
	}
	
	//DataProvider 2
	
	//DataProvider 3
	
	//DataProvider 4
}