#include <math.h>
#include <stdlib.h>
int* shuffle(int* nums, int numsSize, int n, int* returnSize)
{
    int i = 0;
    int j = 0;
    int x = 0;
    int y = 0;
    while (i < n)
    {
        nums[i] = (nums[i] << 10);
        nums[i] = (nums[i] | nums[i + n]);
        i++;
    }
    j = ((n * 2) - 1);
    i = (n - 1);
    while (i >= 0)
    {
        y = (nums[i] & (int)(pow(2, 10) - 1));
        x = (nums[i] >> 10);
        nums[j] = y;
        nums[j - 1] = x;
        j -= 2;
        i--;
    }
    *returnSize = (2 * n);
    return nums;
}