public class MiddleNodeFind {
    public static void main(String[] args){
         ListNode head = new ListNode(1);
         head.next = new ListNode(2);
         head.next.next = new ListNode(3);
         head.next.next.next = new ListNode(4);
         head.next.next.next.next = new ListNode(5);
         head.next.next.next.next.next = new ListNode(6);
         Solution s = new Solution();
         ListNode result = s.middleNode(head);
         System.out.println(result.val);
    }
}
class Solution{
     public ListNode middleNode(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;

            while(fast != null && slow != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
     }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}