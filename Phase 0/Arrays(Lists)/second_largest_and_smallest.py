# Given a list of integers, find the second largest and second smallest values without sorting the list (single pass).

nums = [12, 35, 1, 10, 34, 1]

largest = second_largest = float('-inf')
smallest = second_smallest = float('inf')

for num in nums:
    if num > largest:
        second_largest = largest
        largest = num
    elif num > second_largest and num != largest:
        second_largest = num

    if num < smallest:
        second_smallest = smallest
        smallest = num
    elif num < second_smallest and num != smallest:
        second_smallest = num

print(f"Largest: {largest}, Second Largest: {second_largest}")
print(f"Smalllest: {smallest}, Second Smallest: {second_smallest}")