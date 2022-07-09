/* Brute force solution [O(n^2)] */

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         for (int i = 0; i < nums.length; ++i) {
//             for (int j = i+1; j < nums.length; ++j) {
//                 if (nums[i] + nums[j] == target) {
//                     return new int[] {i, j};
//                 }
//             }
//         }
//         return new int[0];
//     }
// }


/* Hash table (HashMap) solution [O(n)] */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        
        int difference = 0;
        for (int i = 0; i < nums.length; ++i) {
            difference = target - nums[i];
            
            if (numMap.containsKey(difference)) {
                return new int[] {numMap.get(difference), i};
            }
            
            int key = nums[i];
            numMap.put(key, i);
        }
        
        return new int[0];
    }
}
