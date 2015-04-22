package com.leet;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Problem144 {
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<Integer>();
		if (root == null)
			return result;
		TreeNode pointer = root;

		Stack<TreeNode> stack = new Stack<TreeNode>();
		while (pointer != null || !stack.isEmpty()) {
			while (pointer != null) {
				stack.push(pointer);
				result.add(pointer.val);
				pointer = pointer.left;

			}
			if (!stack.isEmpty()) {

				pointer = stack.pop();
				pointer = pointer.right;
			}

		}
		return result;
	}

	
	
	public void traverseHelper(TreeNode root, ArrayList<Integer> list)
	{
		if(root!=null)
		{
			list.add(root.val);
			traverseHelper(root.left,list);
			traverseHelper(root.right,list);
			
		}
		
		
	}
	
}

 class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<Integer>();
		if (root != null) {
			result.add(root.val);
			List<Integer> left = preorderTraversal(root.left);
			List<Integer> right = preorderTraversal(root.right);
			
			
			result.addAll(left);
			result.addAll(right);
			
		}
		return result;
	}
}
