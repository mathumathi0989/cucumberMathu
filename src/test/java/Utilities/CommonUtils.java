package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import Constants.Constants;

public class CommonUtils {

	public void getProp() throws Exception {
		FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
		System.out.println(fs);
		Properties prop = new Properties();
		prop.load(fs);
		Constants.url =  prop.getProperty("url");
		}
	
	
}
