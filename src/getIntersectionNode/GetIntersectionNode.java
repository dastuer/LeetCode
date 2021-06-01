package getIntersectionNode;

public class GetIntersectionNode {

    public ListNode solution(ListNode HeadA,ListNode HeadB){
        int lenA=0;
        int lenB=0;
        ListNode pA = HeadA;
        ListNode pB = HeadB;
        if(pA==null||pB==null)
            return null;
        while (pA!=null){
            lenA++;
            pA=pA.next;
        }
        while (pB!=null){
            lenB++;
            pB=pB.next;
        }
        int diff = Math.abs(lenA - lenB);
        pA = HeadA;
        pB = HeadB;
        if(lenA>lenB){
            for (int i = 0; i < diff ; i++)
                pA = pA.next;
        }
        else
            for (int i = 0; i < diff; i++) {
                pB = pB.next;
            }
        while (pA!=pB){
            pA=pA.next;
            pB=pB.next;

        }
        return pA;
    }
}
