# Print all prime numbers between 2 and 50 using nested loops (no libraries).

for num in range(2, 50):
    isPrime = True

    for divisor in range(2, int(num ** 0.5) + 1):
        if num % divisor == 0:
            isPrime = False
            break

    if isPrime: 
        print(num, end = " ")