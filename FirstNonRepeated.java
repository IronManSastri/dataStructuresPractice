package level1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;


public class FirstNonRepeated {
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        
        System.out.println(" Please enter the input string :" );
        Scanner in = new Scanner (System.in);
        String s=in.nextLine();
        char c=firstNonRepeatedCharacter(s);
        System.out.println("The first non repeated character is :  " + c);
    }
    
    public static Character firstNonRepeatedCharacter(String str)
    {
        LinkedHashMap<Character,Integer>  characterhashtable= 
                     new LinkedHashMap<Character ,Integer>();
        int i,length ;
        Character c ;
        length= str.length();  
        for (i=0;i < length;i++)
        {
            c=str.charAt(i);
            if(characterhashtable.containsKey(c))
            {
                // increment count corresponding to c
                characterhashtable.put(  c ,  characterhashtable.get(c) +1 );
            }
            else
            {
                characterhashtable.put( c , 1 ) ;
            }
        }
        // Order
        
        for (i =0 ; i < length ; i++ )
        {
            c= str.charAt(i);
            if( characterhashtable.get(c)  == 1 )
            return c;
        }
        return null ;
    }
} 
