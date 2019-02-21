package level1;
import java.util.Arrays;
import java.util.HashSet;



public class arrayfind {
	
	static void printpairs(int arr[],int sum) {
		 HashSet<Integer> s = new HashSet<Integer>();
		 for(int i=0;i<arr.length;i++)
		 {
			 int temp = sum-arr[i]; 
			 if(temp >= 0 && s.contains(temp) )
			 {
				 System.out.println("Yes"+temp+" "+arr[i]);
			 }
			s.add(arr[i]); 
		 }
	 }
	
	static boolean printpairs2(int arr[],int sum) {
		int l,r;
		Arrays.sort(arr);
		l=0;
		r=arr.length-1;
		while(l<r){
			if(arr[l]+arr[r] == sum)
				return true;
			else   if(arr[l] + arr[r] < sum) 
                l++;  
			else	r--;	
		}
		return false;
	}
	 public static void main(String[] args)
	 {
		 int sum = 6;
		 int arr[] = {1,3,4};
		 printpairs(arr,sum);
		 if(printpairs2(arr,sum))
		 {
			 System.out.println("Yes");
		 }
		 else 
		 {
			 System.out.println("No");
		 }
		 
	 }
}
