package com.first.json;

import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonParser{
	
	 //MapperService map = new MapperService();
	 //private File file;
	MapperService hash = new MapperService();
	
	
	public void JsonPars(File file) {
	
	try {
		
		ObjectMapper mapper = new ObjectMapper();
		MessagePool parsedJsonObject = mapper.readValue(file , MessagePool.class);
		hash.hashMessages(file, parsedJsonObject);
		System.out.println(parsedJsonObject);
		//System.out.println(hash.hashMap.get("file1.txt").getMaxDiskUsage());
		//System.out.println(hash.hashMap.get("file2.txt").getMaxDiskUsage());
		
	} catch (JsonParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (JsonMappingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();  
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	}
	//System.out.println(hash.hashMap.get("file4.txt").getMaxDiskUsage());
	
	
	
}
