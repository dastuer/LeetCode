package medium.groupAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    // 给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。

    // 一个字符串数组的排序后组成的字符串作为唯一的key，和一个用于储存字符串的列表作为value组成map
    // 将未排序的字符串根据key值添加到对于value的列表中
    // 最后将各个列表作为结果输出
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for (String str : strs) {
            // 将字符串转为数组用于排序
            char[] chars = str.toCharArray();
            // 排序字符串
            Arrays.sort(chars);
            // 生成key
            String s = new String(chars);
            // 不包含key则生成
            if (!map.containsKey(s)){
                ArrayList<String> strings = new ArrayList<>();
                map.put(s,strings);
            }
            // 得到对应的value列表向其中添加原字符串
            map.get(s).add(str);
        }
        return new ArrayList(map.values());
    }
}
