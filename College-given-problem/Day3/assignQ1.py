n = int(input("Enter the number of Elements: "))

arr = [0] * n

for i in range(n):
    arr[i] = int(input(f"Enter number {i}: "))

def ans(n, arr):
    count = 0
    z = 0

    while z < n - 1:
        z += arr[z]
        count += 1

    return count

print(ans(n, arr))