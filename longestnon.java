import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class longestnon {
	public static void main(String[] args) {
	String s = "abcdefaxx";
	int maxlength =0;
	int i =0;
	int j = 0;
	
HashSet<Character> h= new HashSet<Character>();			
	for(int x = 0 ; x<s.length(); x++)
	{
	if(!h.contains(s.charAt(x)))
	{
		h.add(s.charAt(x));
		j++;
		maxlength =Math.max(maxlength, j-1);
		
	}
	else
	{
	h.remove(s.charAt(x));
	i++;
	}
	
	
	}
   
	System.out.println(maxlength+" "+s.substring(0,maxlength) );
	
	}
}
