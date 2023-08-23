class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        int max=0;
        HashSet<Character> set=new HashSet<>();
        while(j<s.length())
        {
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                max=Math.max(max,set.size());
            }
            else
            {
                set.remove(s.charAt(i++));
            }
        }
        return max;
    }
}
//AAB
// HashSet<Character> a = new HashSet<>();
// int max =0;

//         for(int i=0;i<s.length();i++){
//             if(a.contains(s.charAt(i))){
//                 max = Math.max(max,a.size());
//                 a.clear();
//                 a.add(s.charAt(i));

//             }
//             else{
//                 a.add(s.charAt(i));
//             }

//         }
//         return Math.max(max,a.size());
// HashSet<Character> hs = new HashSet<>();
// int max =0;
//         for(int i=0;i<s.length();i++){
//             hs.clear();
//             for(int j=i;j<s.length();j++){
//                 if(hs.contains(s.charAt(j))){
//                     max = Math.max(max,hs.size());
//                     hs.add(s.charAt(j));
//                     break;
//                 }
//                 else{
//                     hs.add(s.charAt(j));
//                     max = Math.max(max,hs.size());
//                 }



//             }

//         }
//          return Math.max(max,hs.size());