/*
*Question
* Given an integer array nums, in which exactly two elements appear only once
*  and all the other elements appear exactly twice.
* Find the two elements that appear only once.
* You can return the answer in any order.
* You must write an algorithm that runs in linear runtime complexity and uses only constant extra space.
*
* Example 1:
Input: nums = [1,2,1,3,2,5]
Output: [3,5]
Explanation:  [5, 3] is also a valid answer.

* Example 2:
Input: nums = [-1,0]
Output: [-1,0]

* * Example 3:
Input: nums = [0,1]
Output: [1,0]
*/
import java.util.*;
public class SingleNumberThree {
// this one was done via the hashSets
// I believe we can do this using Bit manipulation as well
    public static int [] snt(int [] nums){
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            if(set.contains(num)){
                set.remove(num);
            }else {
                set.add(num);
            }
        }
        int[] res = set.stream().mapToInt(Integer::intValue).toArray();
        return res;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int [] nums = {1,2,1,3,2,5};
        int [] res = snt(nums);
        System.out.println(Arrays.toString(res));
    }
}
