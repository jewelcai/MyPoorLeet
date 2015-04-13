package com.leet;

public class Problem147 {
public ListNode insertionSortList(ListNode head) {
	if(head==null) return head;
	ListNode header= new ListNode(0);
	ListNode pre = header;
	ListNode cur = head;
	ListNode next =null;
	while(cur!=null)
	{
		next = cur.next;
		while(pre.next!=null&&pre.next.val<cur.val)
		{
			pre = pre .next;
			
		}
		cur.next= pre.next;
		pre.next= cur;
		pre = header;
		cur = next;
		
	}
	
	return header.next;
    }
}
