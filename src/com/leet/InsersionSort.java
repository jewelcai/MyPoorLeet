package com.leet;

public class InsersionSort {
public static void insertSort(int [] a)
{  int j;int temp;
  for (int i = 1; i < a.length; i++) {
	j=i;
	temp = a[i];// inserting value
	while(j>0&&a[j-1]>temp)
	{
	  a[j]= a[j-1];	
	  j--;
		
	}
	a[j]=temp;
	
}	

}

public static void main(String[] args) {
	int[] a= {3,5,7,1,6,9};
	insertSort(a);
	for (int j = 0; j < a.length; j++) {
		System.out.print(a[j]);
	}
	
}

}
