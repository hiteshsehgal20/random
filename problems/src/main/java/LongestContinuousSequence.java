import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LongestContinuousSequence {
    List<List<Integer>> output = new ArrayList<>();
    public int findLengthOfLCIS(int[] nums) {
        int len = nums.length;
        List<Integer> seqList = new ArrayList<>();
        if (len == 1) {
            return 1;
        }
        seqList.add(nums[0]);
        for (int i = 1; i< len; i++){
            if (nums[i]- nums[i-1] >=1) {
                if (!seqList.contains(nums[i-1])){
                    seqList.add(nums[i-1]);
                }
                seqList.add(nums[i]);
                if (i==len-1) {
                    output.add(seqList);
                }
            }
            else {
                output.add(seqList);
                seqList = new ArrayList<>();
            }
        }
        return output.stream().mapToInt(List::size).max().getAsInt();
    }

    public static void main(String[] args) {
        int[] nums = {2,2,2,2,2,2,3,5,6,7,8};
        LongestContinuousSequence lcs = new LongestContinuousSequence();
        System.out.println(lcs.findLengthOfLCIS(nums));
    }
}
