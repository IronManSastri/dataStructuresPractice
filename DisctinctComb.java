package level1;

import java.util.*; 
public class DisctinctComb {
 static int n = 5;
	static ArrayList <String> name = new ArrayList<String>(n); 
	static ArrayList <String> age = new ArrayList<String>(n);
	static ArrayList <String> loc = new ArrayList<String>(n);
	static ArrayList <String> comb = new ArrayList<String>(n);
	
	public static void main (String args[])
	{
		name.add("Rajesh");
		name.add("Suresh");
		name.add("Sam");
		name.add("Rajesh");
		name.add("Manish");		
		age.add("21");
		age.add("28");
		age.add("26");
		age.add("21");
		age.add("29");
		loc.add("London");
		loc.add("California");
		loc.add("Delhi");
		loc.add("Gurgoan");
		loc.add("Bengaluru");
		/*for(int i=0;i<n;i++)
		{
			comb.add(name.get(i)+" "+age.get(i)+" "+loc.get(i));
			
			
		}
		
	Set<String> Comb = new HashSet<String>(comb);
		Iterator value = Comb.iterator(); 
		  
		 while (value.hasNext()) { 
	            System.out.println(value.next()); 
	        } 
		*/
		List<String>[][][] arrayOfList = new List[3][3][3];
		arrayOfList[0][0][0] = name;
		arrayOfList[0][0][1] = age;
		arrayOfList[0][0][2] = loc;
		System.out.println(arrayOfList.length);
		
		
		/*for (int i = 0; i < comb.size()-1;i++)
	       {
			//boolean found = false;
	            
	           for (int j = i+1; j < comb.size(); j++)
	           {
	               if (comb.get(i).equals(comb.get(j)));
	               System.out.println("Removing"+comb.get(j));
	               //found = true;
	               comb.remove(j);
	             
	            
	           }
	           
	       }
		for (int i = 0; i < comb.size()-1;i++)
		{
			System.out.println(comb.get(i));
		}
	*/ 
	}
	
}
