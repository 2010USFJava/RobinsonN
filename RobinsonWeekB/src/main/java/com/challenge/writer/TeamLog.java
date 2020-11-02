package com.challenge.writer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TeamLog {
	//normally I like to change up names and such to remind myself that I know what I'm doing 
	// unfortunately the way we named this one is perfect so  it would really be a hassle to rename them
	//so I hope you don't mind that it's basically c/p with the promise that I mostly typed all of it.
	
	static Logger logger =LogManager.getLogger();
	
	public static void logTeam(String level, String message){
	
		switch(level){
		 case "debug":
			 logger.debug(message);
			 break;
		 case"warn":
			 logger.warn(message);
			 break;
		 case"error":
			 logger.error(message);
			 break;
		 case"fatal":
			 logger.fatal(message);
			 break;
		 case"info":
			 logger.info(message);
			 break;
		 case"trace":
			 logger.trace(message);
			 break;
		 default:
			 System.err.println("logger dumb");
			 break;
	}
			 
	}
}