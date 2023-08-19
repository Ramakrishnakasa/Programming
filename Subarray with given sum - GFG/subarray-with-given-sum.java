//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	static BufferedReader br;
    static PrintWriter ot;
    public static void main(String[] args) throws IOException{
        
        br = new BufferedReader(new InputStreamReader(System.in));
        ot = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            
            String s[] = br.readLine().trim().split(" ");
            
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            int a[] = new int[n];
            s = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                a[i] = Integer.parseInt(s[i]);
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(a, n, k);
            for(int ii = 0;ii<res.size();ii++)
                ot.print(res.get(ii) + " ");
            ot.println();
        }
        ot.close();
    }

}
// } Driver Code Ends


class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(-1);
        // int left=0;
        // int right=0;
        // int sum=0;
        // while()
        
        // Using HashMap
        HashMap<Integer,Integer> hs = new HashMap<>();
        
        int prefixSum=0;
        
        for(int i=0;i<n;i++){
            prefixSum+=arr[i];
            if(prefixSum==s){
                 a.remove(0);
                a.add(1);
                a.add(i+1);
                return a;
            }
            if(hs.containsKey(prefixSum-s)){
                int j = hs.get(prefixSum-s);
                a.remove(0);
                a.add(j+2);
                a.add(i+1);
                return a;
            }
            
            
            hs.put(prefixSum,i);
        }
        return a;
        
    }
}
        // brute Force
        // int sum=0;
        // for(int i=0;i<n;i++){
        //     sum=0;
        //     for(int j=i;j<n;j++){
        //         sum+=arr[j];
        //         if(sum==s){
        //             a.remove(0);
        //             a.add(i+1);
        //             a.add(j+1); 
        //             return a;}
        //     }
        // }
        // return a;
      