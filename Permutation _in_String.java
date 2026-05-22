/*Permutation in String

You are given two strings s1 and s2.

Return true if s2 contains a permutation of s1, or false otherwise. That means if a permutation of s1 exists as a substring of s2, then return true.

Both strings only contain lowercase letters.*/

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        if(s1.length() > s2.length()){
            return false;
        }
        for(int i = 0; i < s1.length(); i++){
            freq1[s1.charAt(i) - 'a']++;
            freq2[s2.charAt(i) - 'a']++;
        }
        if(Arrays.equals(freq1,freq2)){
            return true;
        }
        for(int right = s1.length(); right < s2.length(); right++){
            freq2[s2.charAt(right) - 'a']++;
            int left = right - s1.length();
            freq2[s2.charAt(left) - 'a']--;

            if(Arrays.equals(freq1,freq2)){
                return true;
            }
        }
        return false;
    }
}
