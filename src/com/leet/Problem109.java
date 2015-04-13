package com.leet;

public class Problem109 {
	public ListNode node;
	
	public TreeNode sortedListToBST(ListNode head) {
        if(head==null) return null;
		int count=0;
        ListNode pointer = head;
        while(pointer!=null)
        {
        	
        	pointer=pointer.next;
        	count++;
        }
		node = head;
		return constructInorder(0,count-1);
		
    }
	
	//construct a balanced BST 
	//In-order traversal;
	//recursion 
	public TreeNode constructInorder(int left,int right)
	{
		if(left>right) return null;
		int mid = (left+right)/2;
		TreeNode leftNode = constructInorder(left,mid-1);
        TreeNode newNode = new TreeNode(node.val);
        newNode.left= leftNode;
        node= node.next;
        TreeNode rightNode= constructInorder(mid+1,right);
        newNode.right= rightNode;
        return newNode;
	}
	
	
}
