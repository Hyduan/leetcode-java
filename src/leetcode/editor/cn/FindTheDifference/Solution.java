package leetcode.editor.cn.FindTheDifference;

import datastruct.*;

//给定两个字符串 s 和 t，它们只包含小写字母。 
//
// 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。 
//
// 请找出在 t 中被添加的字母。 
//
// 
//
// 示例: 
//
// 输入：
//s = "abcd"
//t = "abcde"
//
//输出：
//e
//
//解释：
//'e' 是那个被添加的字母。
// 
// Related Topics 位运算 哈希表


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public char findTheDifference(String s, String t) {
        char[] sChars = new char[s.length()];
        char[] tChars = new char[t.length()];

        s.getChars(0, s.length(), sChars, 0);
        t.getChars(0, t.length(), tChars, 0);

        int result = 0;
        for (int i = 0; i < sChars.length; i++) {
            result = result ^ sChars[i];
        }

        for (int i = 0; i < tChars.length; i++) {
            result = result ^ tChars[i];
        }

        return (char) result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
