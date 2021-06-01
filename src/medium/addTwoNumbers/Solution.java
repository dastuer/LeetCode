package medium.addTwoNumbers;

// 两数相加
public class Solution {
    public static void main(String[] args) {
        ListNode l13 = new ListNode(9);
        ListNode l12 = new ListNode(9,l13);
        ListNode l11 = new ListNode(9,l12);
        ListNode l1 = new ListNode(9,l11);

        ListNode l24 = new ListNode(9);
        ListNode l23 = new ListNode(9,l24);
        ListNode l22 = new ListNode(9,l23);
        ListNode l21 = new ListNode(9,l22);
        ListNode l2 = new ListNode(9,l21);

        ListNode listNode = new Solution().addTwoNumbers(l1, l2);
        while (listNode!=null){
            System.out.println(listNode.val+"\t");
            listNode = listNode.next;
        }

    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // result保存头节点
        ListNode result = new ListNode(0);
        // 节点指针
        ListNode cur = result;
        // 进位标志
        int flag=0;


        while(l1!=null&&l2!=null){
            // 创建下一个节点保存l1和l2以及进位节点的和
            cur.next = new ListNode((l1.val + l2.val+flag)%10);
            flag = (l1.val + l2.val+flag)/10;
            l1 = l1.next;
            l2 = l2.next;
            cur = cur.next;
        }
        while (l1!=null){
            cur.next = new ListNode((l1.val+flag)%10);
            flag = (l1.val+flag)/10;
            l1 = l1.next;
            cur = cur.next;
        }
        while (l2!=null){
            cur.next = new ListNode((l2.val+flag)%10);
            flag = (l2.val+flag)/10;
            l2 = l2.next;
            cur = cur.next;
        }
        // 两数遍历完后，判断是否还有进位，有则将进位放在最后
        if (flag>0){
            cur.next = new ListNode(flag);
        }

        return result.next;

    }
}
