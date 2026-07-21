number = int(input("Enter number: "))

original = number
temp = number

digits = len(str(number))
total = 0

while temp > 0:
    digit = temp % 10
    total = total + digit ** digits
    temp //= 10

if total == original:
    print(number, " is a Armstrong number")
else:
    print(number, " is not a Armstrong number")