/* 
234. Palindrome Linked List

Given the head of a singly linked list, return true if it is a palindrome or false otherwise.

*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        boolean palindrome = true;
        ListNode temp = head;
        Stack <Integer> stack = new Stack<>();
        while(temp != null){
            stack.push(temp.val);
            temp = temp.next;
        }
        temp = head;
        while(temp != null && stack.empty() == false){
            if(stack.pop() == temp.val){
                temp = temp.next;
            } else {
                palindrome = false;
            }
        }
        return palindrome;
    }
}
