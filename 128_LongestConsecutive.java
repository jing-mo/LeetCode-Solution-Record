//128. 最长连续序列
class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int num : nums) {
            set.add(num);
        }

        int maxLen = 0;

        for (int num : set) {
            // 只有当当前元素是序列的起点时，才开始计算序列长度
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentLen = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentLen += 1;
                }

                maxLen = Math.max(maxLen, currentLen);
            }
        }

        return maxLen;
    }
}
