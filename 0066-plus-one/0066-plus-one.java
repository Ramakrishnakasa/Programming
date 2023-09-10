class Solution {
    public int[] plusOne(int[] digits) {
        int j = digits.length;
        for(int i=j-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;

        }
    
       int new_array[] = new int[j+1];
       new_array[0] =1;
       return new_array;
       
    }


}   














    //    int sum =0;
    //     int j=0;
    //     for(int i=digits.length-1;i>=0;i--){
    //         int a = (int)(digits[j++]*Math.pow(10,i));
    //         sum+=a;

    //     }
    //     sum++;
    //     int sums =sum;
    //     int l=0;
    //     while(sum>0){
    //         sum=sum/10;
    //         l++;
    //     }
    //     int k[] = new int[l];
    //     int o=l-1;
    //  while(sums>0){
    //      k[o] = sums%10;
    //      sums/=10;
         
    //      o--;
    //      if(o<0){
    //          break;
    //      }
         
         
    //  }
     
    //     int c=0;
    //     ArrayList<Integer> al = new ArrayList<>();
    //     boolean flag = true;
    //     while(i>=0 || c==1){
    //         int sum=0;
    //         if(i>=0){
    //             sum+=digits[i];
    //             i--;

    //         }
    //         if(flag){
    //             sum+=1;
    //             flag = false;
    //         }
    //         sum+=c;
    //         c = sum/10;
    //         al.add(sum%10);

    //     }
    //  Collections.reverse(al);
    // int u[] = new int[al.size()];
    // for(int j=0;j<al.size();j++){
    //     u[j] = al.get(j);
    //     return k;