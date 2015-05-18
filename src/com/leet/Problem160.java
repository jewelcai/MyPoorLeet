package com.leet;

public class Problem160 {

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null || headB == null)
			return null;

		int lengthA = 0;
		int lengthB = 0;
		ListNode curA = headA;
		ListNode curB = headB;
		while (curA != null) {
			lengthA++;
			curA = curA.next;
		}
		while (curA != null) {
			lengthB++;
			curA = curA.next;
		}

		curA = headA;
		curB = headB;
		int diff = Math.abs(lengthA - lengthB);
		if (lengthA > lengthB) {

			for (int i = 0; i < diff; i++) {
				curA = curA.next;
			}

		} else {
			for (int i = 0; i < diff; i++) {
				curB = curB.next;
			}

		}

		while (curA != null) {
			if (curA.val == curB.val) {
				return curA;
			} else {
				curA = curA.next;
				curB = curB.next;
			}
		}

		return null;

	}

}

class So {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

		if (headA == null || headB == null) {
			return null;
		}
		ListNode curA = headA, curB = headB;
		ListNode lastA = null, lastB = null;

		while (curA != curB) {
			if (curA.next == null) {
				lastA = curA;
				curA = headB;

			} else {

				curA = curA.next;

			}

			if (curB.next == null) {
				lastB = curB;
				curB = headA;

			} else {

				curB = curB.next;

			}

			if (lastA != null && lastB != null && lastA != lastB) {
				return null;
			}

		}
		return curB;

	}
}
