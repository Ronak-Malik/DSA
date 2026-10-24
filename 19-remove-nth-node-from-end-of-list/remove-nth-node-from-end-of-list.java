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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode temp = head;
        while(temp != null){
            length ++;
            temp = temp.next;
        }

        int pos = length - n;


        if(head == null )return null;

        if(pos == 0){
            return head.next;
        }

        temp = head;
        for(int i = 0; i<pos -1 ; i++){
            if(temp == null || temp.next == null )return head;
            temp = temp.next;
        }

        if(temp.next!=null){
            temp.next = temp.next.next;
        }

        return head ;
        
    }
}