package easy.mergeTwoLists;

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res1 = new ListNode();
        ListNode res = res1;
        while (l1!=null&&l2!=null){
            if (l1.val<l2.val){
                res.next = l1;
                res = res.next;
                l1 = l1.next;
            }
            else {
                res.next = l2;
                res = res.next;
                l2 = l2.next;
            }

        }
        if (l1!=null){
            res.next = l1;
        }
        if (l2!=null){
            res.next = l2;
        }
        return res1.next;
    }
}
