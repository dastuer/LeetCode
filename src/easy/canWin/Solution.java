package easy.canWin;

public class Solution {
    /**
     * https://leetcode-cn.com/problems/nim-game/
     * @param
     * @return
     */
    // 面对4的整数倍的人永远无法翻身，你拿N根对手就会拿4-N根，保证每回合共减4根，你永远对面4倍数，直到4.
    // 相反，如果最开始不是4倍数，你可以拿掉刚好剩下4倍数根，让他永远对面4倍数。
    // 谁拿的时候是 4的整数倍 必输，因为另外一个人在你拿过后再拿，总能保持剩余数是4的整数倍
    public boolean canWinNim(int n) {
        return !(n%4==0);
    }
}
