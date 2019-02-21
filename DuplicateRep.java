package level1;

import java.util.Arrays;

public class DuplicateRep {
	
	public static int[] removeDuplicates(int[] numbersWithDuplicates) {

        // Sorting array to bring duplicates together      
        Arrays.sort(numbersWithDuplicates);     
      
        int[] result = new int[numbersWithDuplicates.length];
        int previous = numbersWithDuplicates[0];
        result[0] = previous;

        for (int i = 1; i < numbersWithDuplicates.length; i++) {
            int ch = numbersWithDuplicates[i];

            if (previous != ch) {
                result[i] = ch;
            }
            previous = ch;
        }
        return result;

    }


public static void main (String [] args)
{
	int x[][] = {{1,1,2,23,45},{8,4,5,68,68,88}};
	for(int []y : x)
	{
		
		System.out.println(Arrays.toString(removeDuplicates(y)));
	}
	
}

}
