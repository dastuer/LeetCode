package medium.removeNthFromEnd;
class Solution {

    public static void main(String[] args) {

    }

//    // 方法1：计算链表长度，移除位置为链表长度-n的节点
//    public ListNode medium.removeNthFromEnd(ListNode head, int n) {
//        ListNode cur = head;
//        int count = 0;
//        while (cur!=null){
//            count++;
//            cur = cur.next;
//        }
//        int size = count;
//        count = 0;
//        cur = head;
//        // 移除位置为倒数第n个即第一个直接将头节点前移
//        if (size==n) {
//            head = head.next;
//            return head;
//        }
//        while (true){
//            if (count == (size-n)-1){
//                ListNode next = cur.next;
//                cur.next = next.next;
//                break;
//            }
//            cur = cur.next;
//            count++;
//        }
//        return head;
//    }
    // 方法2：双指针遍历
    // 快指针先移动n次，然后快慢指针一起移动，直到链表尾部
    // 快指针移动了链表长度-1次，即size-1次
    // 慢指针从快指针移动到n才开始，它只移动了size-n-1次，刚好移动到待移除节点的前一个节点
    public ListNode removeNthFromEnd(ListNode head, int n){
        ListNode fast = head;
        ListNode slow = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        if (fast==null)
            return head.next;
        while (fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
