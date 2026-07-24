def array_sum(nums, index = 0, total = 0):
    if index == len(nums):
        return total

    return array_sum(nums, index + 1, total + nums[index])

numbers = [10, 20, 30, 40]
print(array_sum(numbers))