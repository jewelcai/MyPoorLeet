package com.leet;

import java.util.HashSet;
import java.util.Set;

public class Problem141 {

	public boolean hasCycle(ListNode head) {
		if (head == null || head.next == null)
			return false;
		//
		// ListNode fast=head.next.next;
		// ListNode slow=head.next;
		//
		// while(fast!=null&&slow!=null)
		// {
		// if(fast==slow)
		// {
		// return true;
		//
		// }
		// slow= slow .next;
		// if(fast.next!=null)
		//
		// fast= fast.next.next;
		// else{
		// fast=null;
		// }
		//
		// }
		//
		// return false;
		Set<ListNode> set = new HashSet<ListNode>();
		while (head.next != null) {
			if (set.add(head.next)) {
				head = head.next;

			} else {
				return true;

			}
		}
		return false;
	}

}
