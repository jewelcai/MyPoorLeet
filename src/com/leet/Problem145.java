package com.leet;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Problem145 {

	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<Integer>();
		if (root == null)
			return result;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode cur;
		TreeNode pre = null;
		stack.push(root);
		while (!stack.empty()) {
			cur = stack.peek();
			if ((cur.left == null && cur.right == null) || pre != null
					&& (pre == cur.left || pre == cur.right)) {
				result.add(cur.val);
				stack.pop();
				pre = cur;
			}

			else {
				if (cur.right != null) {
					stack.push(cur.right);
				}
				if (cur.left != null) {
					stack.push(cur.left);
				}

			}

		}

		return result;
	}

	public List<Integer> postorderTraversal1(TreeNode root) {
		List<Integer> result = new ArrayList<Integer>();
		traversalHelper(root, result);
		return result;

	}

	public void traversalHelper(TreeNode root, List<Integer> list) {
		if (root != null) {
			traversalHelper(root.left, list);
			traversalHelper(root.right, list);
			list.add(root.val);

		}

	}

	public List<Integer> postorderTraversal2(TreeNode root) {
		List<Integer> result = new ArrayList<Integer>();
		if (root != null) {
			List<Integer> left = postorderTraversal2(root.left);
			List<Integer> right = postorderTraversal2(root.right);
			result.addAll(left);
			result.addAll(right);
			result.add(root.val);
		}

		return result;
	}

}
