package Utils;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class MyKabinConfigReader {
	
	private Properties prop;

	
	/**
	 * This method is used to load the properties from Confg.properties file
	 * @return
	 */
	public Properties init_prop() {
		prop = new Properties();

		try {
			//utils file properties ichhi aa file ni ikkada call chestunnamu
			FileInputStream ip = new FileInputStream("./src/test/java/Utils/Config.properties");
		prop.load(ip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
	}
}
