package methods;

import java.util.Comparator;

public class SortingComparator implements Comparator<Items>  
{  	
	@Override
	public int compare(Items s1, Items s2) 
	{ 		
	int flag = s1.getId() - s2.getId(); 
	if (flag == 0) 
	{ 
		flag = s1.getName().compareTo(s2.getName()); 		
	} 
	return flag; 	
	}

}

