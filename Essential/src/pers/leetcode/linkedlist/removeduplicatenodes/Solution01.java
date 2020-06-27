package pers.leetcode.linkedlist.removeduplicatenodes;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName Solution01 面试题 02.01. 移除重复节点
 * @Description 移除未排序链表中的重复节点。保留最开始出现的节点。
 * @Author LiuRan
 * @Date 2020/6/26 22:24
 * @Version 1.0
 */
public class Solution01 {
    public ListNode removeDuplicateNodes(ListNode head) {
        if (head == null)
            return head;
        Set<Integer> occurred = new HashSet<Integer>();
        occurred.add(head.val);
        ListNode pos = head;
        while (pos.next != null) {
            ListNode cur = pos.next;
            if (occurred.add(cur.val)) {
                pos = pos.next;
            } else {
                pos.next = pos.next.next;
            }
        }
        pos.next = null;
        return head;
    }
}
