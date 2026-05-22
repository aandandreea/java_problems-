/*Longest Repeating Character Replacement


You are given a string s consisting of only uppercase english characters and an integer k. You can choose up to k characters of the string and replace them with any other uppercase English character.

After performing at most k replacements, return the length of the longest substring which contains only one distinct character.*/

class Solution {
    public int characterReplacement(String s, int k) {
        int maxFreq = 0;
        int maxLength = 0;
        int left = 0;
        int[] count = new int[26];

        for(int right = 0; right < s.length(); right++){
            count[s.charAt(right) - 'A']++;
            maxFreq = Math.max(maxFreq,count[s.charAt(right) - 'A']);

            while((right - left + 1) - maxFreq > k){
                count[s.charAt(left) - 'A']--;
                left++;
            }
            maxLength = Math.max(maxLength,right - left + 1);

        }
        return maxLength;
    }
}
