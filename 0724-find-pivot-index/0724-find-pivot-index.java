class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        int prefixSum=0;
      
        for(int i : nums){
            sum+=i;
        }
        
        for(int i=0;i<nums.length;i++){
            
   if(prefixSum == sum-nums[i]-prefixSum){
                return i;
            }
             prefixSum+=nums[i];
            
        }
        
      
return -1;
        
        
        
    }
}

// 	   int f = nums.length;
//       int e=0;
//         int sum =0;
//         int x=0;
//          int sumb=0;
//             int sumc=0;
//         for(int i=0;i<f;i++){
//             sum = sum + nums[i];
//         }
        
//         f:
//         for(int a=0;a<f;a++){
//            sumb=0;
//             sumc=0;
//             for(int b=0;b<a;b++){
//             sumb = sumb +nums[b];
//            }
//             for(int c=a+1;c<f;c++){
//             sumc = sumc +nums[c];
//            }
         
//             if(sumc==sumb){
//                x =a;
//                 e = 1;
//                 break f;
                
//             }
           
//         }
//         if(e>0){
       
//             return x;
//         }
//             else{
//                 return -1;
//             }