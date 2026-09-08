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
    public boolean hasCycle(ListNode head) {
        ListNode fastp=head;
        ListNode slowp=head;
        while(fastp!=null && fastp.next!=null){
            fastp=fastp.next.next;
            slowp=slowp.next;
            if(fastp==slowp) return true;

        }
        return false;
    }
}
