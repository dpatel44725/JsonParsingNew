package com.first.json;

import java.io.File;

public class FileReadService implements Runnable {

	
	
	JsonParser parsed = new JsonParser();
	//HashMap <String, MessagePool> hashMap = new HashMap<String, MessagePool>();
	//private MessagePool parsedJsonObject;
	
		
	
	@Override
	public void run() {
		
			parsed.JsonPars(new File("file1.txt"));
			parsed.JsonPars(new File("file2.txt"));
			parsed.JsonPars(new File("file3.txt"));
			parsed.JsonPars(new File("file4.txt"));
			
			
		}
	
	





}