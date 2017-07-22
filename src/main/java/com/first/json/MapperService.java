package com.first.json;


import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;


public class MapperService {

	
	public static ArrayList<String> Filenames = new ArrayList<String>();
	public static HashMap <String, MessagePool> hashMap = new HashMap<String, MessagePool>();
	
	public void hashMessages(File file, MessagePool parsedJsonObject) {
		hashMap.put(file.toString(), parsedJsonObject);
		
		System.out.println("Values are Hased into file");
		Filenames.add(file.toString());
		//System.out.println(hashMap.get("file1.txt").getMaxDiskUsage());
		//System.out.println(hashMap.get("file2.txt").getMaxDiskUsage());
		System.out.println(hashMap.keySet());
	
	}

}
