package com.first.json;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.TimerTask;



public class Scheduler extends TimerTask {
	

	public int conditionalDiskUsage;
	public String conditionalStatus;
	MapperService hash = new MapperService();
	
	
	Properties prop = new Properties(); {
		  try {
				InputStream input = new FileInputStream("src/main/resources/application.properties");
				prop.load(input);
				conditionalDiskUsage = Integer.parseInt(prop.getProperty("max-disk-usage"));
				conditionalStatus = prop.getProperty("operational-status");
				
				}catch(IOException ex) {
					ex.printStackTrace();
				}
	 		}
	
	@Override
	public void run() {
		
		System.out.println("Comparing the values of all 4 json file to the condition.");
		
		for (String file : hash.Filenames) {
			//System.out.println(Tempt);
			int actualDiskUsage = hash.hashMap.get(file).getMaxDiskUsage();
			System.out.println("Actual Disk Usage = "+actualDiskUsage);
			String actualstatus =hash.hashMap.get(file).getOperationalStatus();
			System.out.println("Actual Status = "+actualstatus);
			
			if(actualDiskUsage > conditionalDiskUsage || actualstatus.equals(conditionalStatus)) {
				
				//System.out.println("Actual_maxDiskUsage = "+Actual_maxDiskUsage);
				//System.out.println("Cond_maxDiskUsage =" +Cond_maxDiskUsage);
				System.out.println("this is alert ");
			}
			else {
				System.out.println("You are all set");
			}
		
		}
}
}
	
