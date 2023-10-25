package hacktoberfest;
import java.util.*;

public class LongestSubstring {

	public static int longestSubstring(String s) {

		int len = s.length();
		
		// Base case
        if(len == 0) {
             return 0;
        }
        
        // To keep track of maximum length of the substring
        int max = Integer.MIN_VALUE;
        HashSet<Character> set = new HashSet<>();
        
        int left = 0;
        
        // Outer loop for traversing the string
        for (int right = 0; right < len; right++) { 
        	
        	// If any duplicate element is found
            if (set.contains(s.charAt(right))) { 
                while (left < right && set.contains(s.charAt(right))) {
                    set.remove(s.charAt(left));
                    left++;
                }
            }
            
            set.add(s.charAt(right));
            max = Math.max(max, right - left + 1);
        }
        
        return max;
    }
	
	// Driver code
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		// Input string
        System.out.print("Enter a string = ");
        String str = sc.next();
        
        // Call the method
        int ans = longestSubstring(str);
        System.out.println("Length of the longest substring without repeating characters is = " + ans);
        
        // Close the scanner
        sc.close();
    }

}



