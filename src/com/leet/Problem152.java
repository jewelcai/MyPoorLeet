package com.leet;

public class Problem152 {

 public int maxProduct(int[] nums) {
  //ÿһ�ζ�Ҫ��result�Ƚ�
// result���ڴ洢��ǰ�����ֵ
  int positive = 0, negative = 0, result = nums[0];
  for (int i = 0; i < nums.length; i++) {
   if (nums[i] > 0) {
    if (positive * nums[i] > nums[i])
// ��Ϊ���ֵλ��result�� ���� ����Ҫ�ٱ���positive��
//֮ǰ��positive�϶�����result�� ����߀������ԇԇ��һ��
     positive = positive * nums[i];
    else
     positive = nums[i];//��Ϊ֮ǰ��ֵ�Ѿ�������result��
    negative = negative * nums[i];
    if (positive > result)
     result = positive;

   } else if (nums[i] < 0) {
    int temp = negative;
    negative = positive * nums[i] > nums[i] ? nums[i] : positive
      * nums[i];//��negative�惦 ����´�����ؓ��  ����negativeȥ��
    positive = temp * nums[i];
    if (positive != 0 && positive > result)
     result = positive;
   } else {
    positive = 0;
    negative = 0;
    if (result < 0)
     result = 0;

   }
  }
  return result;
 }

}
