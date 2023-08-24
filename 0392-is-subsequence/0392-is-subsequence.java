class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = s.length();
        int m = t.length();
        // base condition
        if(n==0){
               return true;
        }
        if(m==0){
            return false;
        }
          // poniters
        
        int i = 0;
        int j =0;
        while(j<m){
            if(s.charAt(i)==t.charAt(j)){
              
                i++;
                j++;
                if(i==n){
                    return true;
                }
            }
            else{
                j++;
            }
        }
      
        return false;
        
    }
}