import java.util.*;
public class SingleNumberThree {
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
