package easy.reversePrint;



class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Solution {
    // https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/
    // 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
    // 方法1：直接翻转
    public int[] reversePrint(ListNode head) {
        int size = 0;
        ListNode cur = head;
        while (cur.next!=null){
            size++;
            cur = cur.next;
        }
        cur = head;
        int[] ints = new int[size];
        for (int i = size-1; i >= 0; i--) {
            ints[i] = cur.val;
            cur = cur.next;
        }
        return ints;
    }
    // 方法2：内部递归
    int size = 0;
    int[] ints;
    public int[] reversePrint1(ListNode head) {
        if (head==null){return new int[0];}
        setStack(head);
        return ints;
    }
    private void setStack(ListNode cur){
        int curNo;
        if (cur!=null){
            curNo = ++size;
            setStack(cur.next);
        }else {
            return;
        }
        if (ints==null){
            ints = new int[size];
        }
        if (size>0){
            ints[size-curNo]=cur.val;
        }
    }

}
