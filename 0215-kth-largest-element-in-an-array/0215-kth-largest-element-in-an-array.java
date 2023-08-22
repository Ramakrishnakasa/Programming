class Solution {
 
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int num : nums) {
            maxHeap.add(num);
        }

        int result = 0;
        for (int i = 0; i < k; i++) {
            result = maxHeap.poll();
        }

        return result;
    }

}