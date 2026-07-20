# Problem: Without using if-else, determine whether a number is even or odd, and whether it's positive, negative, or zero — using only operators, and print a single combined message.

num = -8

parity = "even" if num % 2 == 0 else "odd"

sign = ["negative", "zero", "positive"][(num > 0) - (num < 0) + 1]

print(f"{num} is {parity} and {sign}")