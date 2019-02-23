package level1;

import java.util.Arrays;

public class reversea {
	public static int[] rev(int array[]){
	for(int i=0; i<array.length/2; i++)
	{ 
		int temp = array[i];
		array[i] = array[array.length -i -1]; 
		array[array.length -i -1] = temp;
	  
		}
	return array;
	}
	public static void main (String [] args)
	{
		int []array = {3,4,7,6};
		int []x =rev(array);
		for (int element: x) {
            System.out.println(element);
        }
		System.out.println(Arrays.toString(x));
		
	}
}
