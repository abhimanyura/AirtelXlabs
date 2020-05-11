package methods;

import java.util.ArrayList;
import java.util.Collections;
/**
 * This class will store the data of the items
 * @author abraj
 *
 */
public class Items {
		int id; 	
		String price; 	
		String name; 	
		String text; 
		Items(int id,String price,String name,String text)
		{
			this.id=id;
			this.price=price;
			this.name=name;
			this.text=text;
		}
		public int getId() 
		{
			return id; 	
		};
		public void setId(int id) 
		{ 		
			this.id = id; 	
		}  	
		public String getPrice() 
		{
			return price; 	
		}  	
		public void setPrice(String price) 
		{
			this.price = price; 	
		}  	
		public String getName() 
		{ 		
			return name; 	
			
		}  
		public void setName(String name) 
		{
			this.name = name; 	
			
		}  	
		public String getText() 
		{ 		
			return text; 	
			
		}  
		public void setText(String text) 
		{ 		
			this.text = text; 	
			
		}  


public static void main(String []args)
{
	ArrayList<Items> arraylist=new ArrayList<Items>();  
	arraylist.add(new Items(1,"100","tennisball","Vicky brand"));  
	arraylist.add(new Items(3,"200","plasticball","local"));
	arraylist.add(new Items(2,"200","cricketball","Cosco"));  
	
	System.out.println("---Sorting By price and name----");
	Collections.sort(arraylist,new SortingComparator());  
	for(Items sortingAssingment: arraylist)
	{  
	System.out.println(sortingAssingment.price+" "+sortingAssingment.name);  
	}
}
}
