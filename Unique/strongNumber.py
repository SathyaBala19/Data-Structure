number = int(input("Enter a number: "))

temp = number
total = 0

while temp > 0:
    digit = temp % 10

    fact = 1
    for i in range(1, digit + 1):
        fact *= i

    total += fact
    temp //= 10

if total == number:
    print(number, " is a Strong number")
else:
    print(number, " is not a Strong number")