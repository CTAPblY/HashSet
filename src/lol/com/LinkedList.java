package lol.com;


import java.util.HashSet;
import java.util.Iterator;

public class LinkedList {

   public int [] containsDuplicate(int [] nums, int [] nums1){


        HashSet<Integer> answer = new HashSet<Integer>();

        for (Integer key : nums){
            for(Integer keys : nums1){
                if (key == keys){
                    answer.add(keys);
                }
            }
        }
        int [] result = new int[answer.size()];
        int i = 0;
        for (Integer val : answer)
            result[i++] = val;
        return result;
    }

    public static void main(String[] args) {

            int [] nums = {4,9,5};
            int [] nums1 = {9,4,9,8,4};
            LinkedList list = new LinkedList();
            list.containsDuplicate(nums, nums1);
    }
}
