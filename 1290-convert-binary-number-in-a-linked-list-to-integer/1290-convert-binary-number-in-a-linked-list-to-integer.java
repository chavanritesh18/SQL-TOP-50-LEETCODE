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
        

       ListNode temp  =  head;
         
      StringBuilder binary  = new StringBuilder();

      
       while(temp != null)
       {
           binary.append(temp.val);
           temp =  temp.next;
       }

        // binary.toString();
       
       int ans  = Integer.parseInt(binary.toString() , 2);

       return ans;

    }
}