var shuffle = function (nums, n) {
  let i = 0;
  let y;
  let x;
  while (i < n) {
    nums[i] = nums[i] << 10;
    nums[i] = nums[i + n] | nums[i];
    i++;
  }
  let j = n * 2 - 1;
  i = n - 1;
  while (i >= 0) {
    y = nums[i] & (2 ** 10 - 1);
    x = nums[i] >> 10;
    nums[j] = y;
    nums[j - 1] = x;
    j -= 2;
    i--;
  }
  return nums;
};
