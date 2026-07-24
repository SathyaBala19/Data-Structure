n = int(input())

remaining = n
height = 0
row = 1

while remaining >= row:
    remaining -= 1
    height += 1
    row += 1

for i in range(1, height+1):
    print(" " * (height - i), end="")
    print("* " * i)