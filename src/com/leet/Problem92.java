package com.leet;

public class Problem92 {
public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head==null) return null;
        ListNode dummy = new ListNode(0);
        dummy.next= head;
        ListNode pre = dummy;
        for(int i=0; i<m-1;i++)
        	pre =pre .next;
        ListNode start = pre.next;
        ListNode end = start.next;
        
        for (int i = 0; i < n-m; i++) {
			start.next= end.next;
			end.next= pre.next;
			pre.next= end;
			end = start.next;        	        	
		}
        return dummy.next;
	
	
    }
}
