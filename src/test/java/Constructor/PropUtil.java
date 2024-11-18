package Constructor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropUtil {
	private String Filepath;

	private PropUtil(String path) {
		this.Filepath = path;
	}

	public String readpropertyFile(String filePath, String key) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(filePath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String keyy = prop.getProperty(key);
		return key;
	}
	
	public String readFile(String key) {
       String baseDir = System.getProperty("user.dir");
       String filePAth = baseDir+"/src";
       PropUtil po =new PropUtil(filePAth);
       String val = po.readpropertyFile(filePAth, key);
       return val;
	}
}
