;

/** 
* @author lenovo
* @date 2019年3月4日下午7:18:35 
* @Description: 82. 删除排序链表中的重复元素 II
* 采用双指针方法
*/
public class DeleteDuplicates {
	class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	public ListNode deleteDuplicates(ListNode head) {
    if(head == null || head.next == null){
        return head;
    }
    ListNode h = new ListNode(-1);
    h.next = head;
    ListNode pre = h;
    ListNode cur = head;
    while(cur != null){
        boolean flag = true;
        while(cur.next != null && cur.val == cur.next.val){
            cur = cur.next;
            flag = false;
        }
        if(flag){ 
            pre = cur;
        } else{
            pre.next = cur.next;
        }
        cur = cur.next;
    }
    return h.next;
}

}
 