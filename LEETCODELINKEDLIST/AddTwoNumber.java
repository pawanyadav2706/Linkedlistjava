package LEETCODELINKEDLIST;

import java.util.*;
public class AddTwoNumber {
    public static void main(String [] args){
         // first list node 
        ListNode l1 =  new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        Solution sol = new Solution();
        ListNode result = sol.addTwoNumbers(l1, l2);

        // print the result 
        while(result != null){
            System.out.print(result.val);
            if(result.next != null){
                System.out.print(" -> ");
            }
            result = result.next;
        }
    }
}
class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode dummy =  new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0){
            int sum = carry;

            if(l1 != null){
                sum = sum + l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum = sum + l2.val;
                l2 = l2.next;
            }
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
        }
        return dummy.next;
    }
}
