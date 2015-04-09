package com.example1.slallen.myapplication;

public interface Config {

	// used to share GCM regId with application server - using php app server
	//static final String APP_SERVER_URL = "http://128.237.217.192/gcm/gcm.php?shareRegId=1";

	// GCM server using java
	static final String APP_SERVER_URL = "http://128.237.217.192:8080/GCM-Server-Device-To-Device/GCMNotification?";

	// Google Project Number
	static final String GOOGLE_PROJECT_ID = "753660164397";
	
	static final String REGISTER_NAME = "name";
	
	static final String MESSAGE_KEY = "message";
	static final String TO_NAME = "toName";	

}
