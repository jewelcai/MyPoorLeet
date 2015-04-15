package com.leet;
import java.util.*;
public class Problem102 {
public List<List<Integer>> levelOrder(TreeNode root) {
	List<List<Integer>> result = new ArrayList<List<Integer>>();
	putIntoList(root, result, 0);
	return result;
			
    }
public void putIntoList(TreeNode node,List<List<Integer>> list, int level)
{
	if(node==null) return ;
	while(list.size()<=level)
	{
		list.add(new ArrayList<Integer>());
		
	}
	list.get(level).add(node.val);
	putIntoList(node.left,list,level+1);
	
	putIntoList(node.right,list,level+1);
	
}


}
