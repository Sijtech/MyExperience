package getToKnowJunit;

import java.util.Arrays;

public class simpleJunitCase {
	
	public static int findMax(int arr[]){  
        int max=arr[0];  
        for(int i=1;i<arr.length;i++){  
            if(max<arr[i])  
                max=arr[i];
            Arrays.toString(arr);
        }  
        return max;  
    }  
	
}
