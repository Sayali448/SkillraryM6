
package GenericLiabraries;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertyfile1 {
	

public String getPropertyData(String Key) throws IOException
{
	Properties p = new Properties();
	FileInputStream fis =new FileInputStream(IPathConstant.propertyfilepath);
	p.load(fis);
	return p.getProperty(Key);
}

}
