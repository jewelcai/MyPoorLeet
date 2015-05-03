package com.leet;

public class Problem105 {
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		if (preorder.length == 0 || inorder.length == 0 || preorder == null
				|| inorder == null || preorder.length != inorder.length)
			return null;
		return helper(preorder, inorder, 0, 0, preorder.length-1);
	}

	public TreeNode helper(int[] preorder, int[] inorder, int preorderIndex,
			int start, int end) {
		if (start > end)
			{return null;}
		TreeNode node = new TreeNode(preorder[preorderIndex]);
		int inorderIndex = findInorderIndex(inorder, start, end,
				preorder[preorderIndex]);
		int leftSize = inorderIndex - start;
		int rightSize = end - inorderIndex;
		node.left = helper(preorder, inorder, preorderIndex + 1, start,
				inorderIndex - 1);
		node.right = helper(preorder, inorder, preorderIndex + leftSize + 1,
				inorderIndex + 1, end);
		return node;

	}

	public int findInorderIndex(int[] inorder, int start, int end, int target) {
		for (int i = start; i <= end; i++) {
			if (inorder[i] == target)
				return i;
		}
		return -1;
	}

}
