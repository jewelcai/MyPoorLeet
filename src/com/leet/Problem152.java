package com.leet;

public class Problem152 {

 public int maxProduct(int[] nums) {
  //每一次都要和result比较
// result用于存储当前的最大值
  int positive = 0, negative = 0, result = nums[0];
  for (int i = 0; i < nums.length; i++) {
   if (nums[i] > 0) {
    if (positive * nums[i] > nums[i])
// 因为最大值位于result中 所以 不需要再保存positive，
//之前的positive肯定不比result大 所以還不如再試試下一個
     positive = positive * nums[i];
    else
     positive = nums[i];//因为之前的值已经存在了result中
    negative = negative * nums[i];
    if (positive > result)
     result = positive;

   } else if (nums[i] < 0) {
    int temp = negative;
    negative = positive * nums[i] > nums[i] ? nums[i] : positive
      * nums[i];//將negative存儲 如果下次遇到負數  就用negative去乘
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
