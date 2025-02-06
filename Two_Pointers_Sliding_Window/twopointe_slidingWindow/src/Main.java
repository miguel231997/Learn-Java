import java.util.*;

public class Main {
    //Two pointers and Alising Window are two important techniques used for solving array and string problems efficiently. Below is a breakdown of key facts formulas and essential information for mastering these techniques

    /*
     *  TWO POINTER TECHNIQUE
     * KEY FACTS
     * - Definition: Uses pointers to traverse an array/string efficiently
     * - Use Cases:
     * -Finding pairs that satisfy a condtion
     * -merging sorted arrays
     * -Removing duplicates from sorted arrays
     * -Checking palindrome
     * COMMON PATTERNS:
     * -oppostite direction (Start & end) -> used for problems like two-sum (sorted), palindromes.
     * -same direction (Fast & slow) -> used for problems like removing duplicates, detecting cycles
     * */

    //FORMULAS AND KEY CODE PATTERNS
    //1.TWO-SUM(Sorted Array)

    public int[] twoSum(int [] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while( left < right ) {
            int sum = numbers[left] + numbers[right];
            if( sum == target ) return new int[]{left + 1, right + 1};
            if( sum < target ) left ++;
            else right --;
        }

        return new int[]{-1, -1}; //no solution found
    }

    //TWO-SUM not sorted using hashmap
    public int[] twoSum(int[] nums, int target) {
        //declare hashmap to hold complements
        Map<Integer, Integer> newArr = new HashMap<>();

        //loop through array
        for(int i = 0; i < nums.length; i ++){
            //declare the complement we are looking for
            int complement = target - nums[i];
            //check if the complement is in the map
            if(newArr.containsKey(complement)) {
                //return the key value pair as an array
                return new int[]{newArr.get(complement), i}; //return the value (NOT THE KEY) and current i;

            }
            //if not we add the key{element} value{indices} to the hashMap
            newArr.put(nums[i], i);
        }

        //return [-1,-1] if not found

        return new int[]{-1,-1};


    }

    //Removing duplicates from a sorted array (FAST and SLOW POINTERS)

    public int removeDuplicates(int[] nums) {
        int i = 0;
        for ( int j = 1; j < nums.length; j++) {
            if(nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
    }


    //checking too see if a string is a palindrome
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) left++;
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) right--;
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) return false;
            left++;
            right--;
        }
        return true;
    }

    //SLIDING WINDOW TECHNIQUE
    //KEY FACTS
    //-DEFINITION: A TECHNIQUE THAT KEEPS TRACK OF A SUBSET OF ELEMENTS IN AN ARRAY OR STRING WITHIN A MOVING WINDOW

    //-USE CASES
    //FINDING THE MAXIMUM/MINIMUM SUM OF A SUBARRY
    //LONGEST SUBSTRING WITH CERTAIN PROPERTIES
    //FINDING NGRAMS OR PATTERN MATCHING IN A STRING

    //TYPES:
    //FIXED WINDOW - USED WHEN THE WINDOW SIZE IS KNOWN
    //-DYANMIC WINDOW (EXPANDING & CONTRACTING): USED WHEN THE WINDOWN SIZE IS NOT FIZEX

    //FORMULAS AND KEY CODE PATTERNS

    //1. MAXIMUM SUM OF A SUBARRAY OF SIZE K (FIXED SLIDING WINDOW)

    public int maxSumSubArray(int[] nums, int k) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < k; i++) {
            sum+=nums[i]; //initial window sum
        }
        maxSum = sum;

        for(int i = k; i < nums.length; i++) {
            sum+= nums[i] - nums[i - k]; //slide the window
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    //longest substring without repeating characters (dynamic sliding window)

    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLength = 0;

        Map<Character, Integer> charIndexmap = new HashMap<>();

        for(int right = 0; right < toString().length(); right++) {
            if(charIndexmap.containsKey(s.charAt(right))) {
                left = Math.max(left, charIndexmap.get(s.charAt(right)) + 1)
            }
            charIndexmap.put(s.charAt(right), right);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    //SMALLEST SUBARRAY WITH SUM >=  TARGET (DYNAMIC SLIDING WINDOW)

    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, sum = 0, minLength = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while ( sum >= target ) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[ left++ ];
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }


//FIND ALL ANAGRAMS OF A STRING (DYNAMIC SLIDING WINDOW WITH HASHMAP)

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) return result;

        int[] pCount = new int[26], sCount = new int[26];
        for (char c : p.toCharArray()) pCount[c - 'a']++;

        for (int i = 0; i < s.length(); i++) {
            sCount[s.charAt(i) - 'a']++;
            if (i >= p.length()) sCount[s.charAt(i - p.length()) - 'a']--; // Remove leftmost character

            if (Arrays.equals(sCount, pCount)) result.add(i - p.length() + 1);
        }
        return result;
    }

    public static void main(String args[]) {

    }
}
