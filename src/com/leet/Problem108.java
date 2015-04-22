package com.leet;

public class Problem108 {
	
	public TreeNode sortedArrayToBST(int[] num) {
		if(num==null||num.length==0)  return null;
      return constructInorder(0, num.length-1,num);
      }
   
	
	public TreeNode constructInorder(int start, int end,int[] num)
	{
		if (start>end) return null;
		int mid = (start+end)/2;
		
		TreeNode left = constructInorder(start, mid-1,num);
		TreeNode newNode = new TreeNode(num[mid]);
		
		newNode.left= left;
		TreeNode right = constructInorder(mid+1, end,num);
		newNode.right= right;
		
		return newNode;
		
	}
}
