package easy.deleteDuplicates;

/**
 * 存在一个按升序排列的链表，给你这个链表的头节点 head ，请你删除所有重复的元素，使每个元素 只出现一次 。
 */

class Solution {
//    // 常规思路，跳过重复元素
//    public ListNode deleteDuplicates(ListNode head) {
//        if(head==null||head.next==null)
//            return head;
//        ListNode cur  = head;
//        ListNode cur1 = cur.next;
//        while (cur1!=null){
//            while(cur.val==cur1.val){
//                cur1 = cur1.next;
//                if(cur1==null)
//                    break;
//            }
//            cur.next = cur1;
//            cur = cur.next;
//            if (cur1!=null)
//                cur1 = cur.next;
//        }
//        return head;
//    }
    // 思路2：递归
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null)
            return head;
        head.next = deleteDuplicates(head.next);
        if (head.next.val==head.val)
            head = head.next;
        return head;
    }


}
