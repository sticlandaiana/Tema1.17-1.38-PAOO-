
import java.util.Comparator;
import java.util.List;
import java.util.Arrays;

import java.util.Collections;
import java.util.stream.Collectors;

public class Main {

    static public void main(String[] args){
        List<Integer> nums = Arrays.asList(10,9,4,1,8);
        Collections.sort(nums);
        System.out.println("nums: " +nums);
        Collections.sort(nums, Collections.reverseOrder());
        System.out.println("reversed nums: " +nums);
        Collections.shuffle(nums);
        System.out.println("shuffles nums: "+nums);
        nums.sort(Comparator.naturalOrder());
        System.out.println("sorted nums again: "+nums);


        List<Integer> nums2 = Arrays.asList(11,3,4,7,90);
        //converting the list into a stream -> sorting the elements -> converting back to list
        List<Integer> sortedNumbers = nums2.stream().sorted().collect(Collectors.toList());
        System.out.println("\nsorted nums using streams: " +sortedNumbers);
    }
}
