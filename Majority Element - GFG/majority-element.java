//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        int f =0,m=-1;
        for(int i=0;i<size;i++){
            if(f==0){
                m = a[i];
                f=1;
            }
           else if(a[i] ==m){
               f++;
           }
            else{
                f--;
            }
           
        }
        int c=0;
    for(int k : a){
        if(k==m){
            c++;
        }
    }
    if(c>(size/2)){
        return m;
    }
    else{
        return -1;
    }
    }
}