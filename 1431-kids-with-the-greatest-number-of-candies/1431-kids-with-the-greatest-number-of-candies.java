class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> a  = new ArrayList<>();
    int max =0;
        for(int k:candies){
            if(k>max){
                max =k;
            }
        }
        for(int i=0;i<candies.length;i++){
if(candies[i]+extraCandies>=max){
    a.add(true);
}
            else{
                a.add(false);
            }
        }
        return a;
    }
}