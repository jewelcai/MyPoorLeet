package com.leet;

public class Problem24 {

	public ListNode swapPairs(ListNode head) {
		if(head==null)
			return null;
		ListNode dummy = new ListNode(-1);
		dummy.next = head;
		ListNode pre = dummy;
		ListNode cur = head;
		ListNode next;
		while (cur!=null&&cur.next != null) {
          next= cur.next;
          pre.next= next;
          cur.next= next.next;
          next.next= cur;
          pre= cur;
          cur= cur.next;
		}
      return dummy.next;
	}

}
