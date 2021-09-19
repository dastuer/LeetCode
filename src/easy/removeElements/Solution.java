package easy.removeElements;

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode res = new ListNode();
        ListNode cur = res;
        cur.next = head;
        if (head==null)
            return null;
        while (cur!=null){
            ListNode cur1 =cur;
            while (cur1.next.val==val)
                cur1 = cur1.next;
            cur.next = cur1.next;
            cur = cur.next;
        }
        return res.next;
    }
}
