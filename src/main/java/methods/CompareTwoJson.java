package methods;

import java.io.File;
import java.io.IOException;
import java.util.Comparator;

import org.testng.Assert;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CompareTwoJson {

	static String projectDir = System.getProperty("user.dir");
	public static void main(String []args) 
	{
		Assert.assertEquals(compareTwoJsons("jason1.json", "jason2.json"),true,"Json object doesnot matches");
	
		 
	}
	public static boolean compareTwoJsons(String jsonFileName1,String jsonFileName2)
	{
		try 
		{
		ObjectMapper objectMapper=new ObjectMapper();
		File file=new File(projectDir+"/Resource/"+jsonFileName1);
		File file2=new File(projectDir+"/Resource/"+jsonFileName2);
		return (objectMapper.readTree(file).equals(objectMapper.readTree(file2)));
		}
		catch(IOException ioException)
		{
			return false;
		}
	}
	

}
