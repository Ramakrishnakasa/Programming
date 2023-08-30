//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
        	int array[] = new int[n];
        	for (int i=0; i<n ;i++ ) {
        		array[i] = sc.nextInt();
        	}
            Solution ob = new Solution();
            System.out.println(ob.ValidPair(array,n));
            t--;
        }
    } 
} 

// } Driver Code Ends


//User function Template for Java

class Solution 
{ 
    static long ValidPair(int a[], int n) 
	{ 
	    
	    
	    long count =0;
	    Arrays.sort(a);
	    
	    int i=0;
	    int j = n-1;
	    while(i<j){
	        if(a[i]+ a[j]>0){
	            count +=j-i;;
	            j--;
	        }
	        else{
	            i++;
	        }
	    }
	    
	    // 1 3 4 -3 4 -4 -10
	    // -10 -3 -4 1 3 4 4
	    // 1 2 3 4 5 6 
	    return count;
	}
} 

	   // int count=0;
	   // for(int i=0;i<n;i++){
	   //     for(int j =i+1;j<n;j++){
	   //         if(a[i]!=a[j]){
	   //             if(a[i]+a[j]>0){
	   //                 count++;
	   //             }
	   //         }
	   //     }
	   // }
	    
	   // return count;
	    