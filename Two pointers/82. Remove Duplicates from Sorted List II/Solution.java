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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dump = new ListNode(0);
        dump.next=head;


        ListNode i=dump;
        ListNode j=head;

        while(j != null){
            if(j.next != null && j.val ==j.next.val){
                int dumpy=j.val;
                while(j != null && j.val == dumpy){
                    j=j.next;
                }
                i.next=j;
            }
            else{
                i=j;
                j=j.next;
            }
        }

        return dump.next;
    }
}