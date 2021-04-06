package collections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//src//collections//config.properties");
		
		
		Properties p=new Properties();
		p.load(fis);
		
		String url=p.getProperty("url");
		String username=p.getProperty("username");
		
		System.out.println(url);
		System.out.println(username);
		System.out.println(p.getProperty("password"));
	}

}
