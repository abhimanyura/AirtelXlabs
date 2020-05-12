package methods;

import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CompareTwoJson {

	static String projectDir = System.getProperty("user.dir");
	
	public static void main(String []args) 
	{
		
		if(compareTwoJsons("jason1.json", "jason2.json"))
		{
			System.out.println("The given jsons are indentical");
		}
		else
		{
			System.out.println("The given jsons are not  indentical");
		}
	
		 
	}
	/**
	 * This method will take the jsonfile names as parameter and compare it
	 * @param jsonFileName1
	 * @param jsonFileName2
	 * @return
	 */
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
