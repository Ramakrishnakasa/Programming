//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    long[] res = new Solution().nextLargerElement(arr, n);
		    for (int i = 0; i < n; i++) 
		        System.out.print(res[i] + " ");
		    System.out.println();
		}
	}
}




// } Driver Code Ends


class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        long k[] = new long[n];
        int index = n-1;
        Stack<Long> s = new Stack<>();
  boolean flag = true;
        for(int i = n-1;i>=0;i--){
            flag = true;
            while(!s.isEmpty()){
                if(s.peek()>arr[i]){
                    k[index--] = s.peek();
                    s.push(arr[i]);
                    flag = false;
                    break;
                 
                }
                else{
                    s.pop();
                }
                
            }
            if(flag ){
                k[index--] = -1;
                s.push(arr[i]);
            }
            
        }
        
        return k;
    } 
}
    //     int index =0;
    //     boolean flag = true;
    //   for(int i=0;i<n;i++){
    //       flag = true;
    //       for(int j= i+1;j<n;j++){
    //           if(arr[j]>arr[i]){
    //               k[index++] = arr[j];
    //               flag = false;
    //               break;
    //           }
    //       }
    //       if(flag){
    //           k[index++] = -1;
    //       }
    //   }
    //   return k;