def shuffle(nums, n):
    i = 0
    while i < n:
        nums[i] = nums[i] << 10
        nums[i] = nums[i + n] | nums[i]
        i += 1
    j = 2 * n - 1
    i = n - 1
    while i >= 0:
        y = nums[i] & (2 ** 10 - 1)
        x = nums[i] >> 10
        nums[j] = y
        nums[j - 1] = x
        j -= 2
        i -= 1
    return nums

nums = [2,5,1,3,4,7]
n = 3
shuffle(nums, n)
print(nums)