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
    public int getDecimalValue(ListNode head) {
        ListNode temp=head;
        // StringBuilder s=new StringBuilder();
        int res=0;
        while(temp!=null){
            // s.append(temp.val);
            res=(res*2)+temp.val;
            temp=temp.next;
        }
        // int res=Integer.parseInt(s.toString(),2);
        return res;
    }
}