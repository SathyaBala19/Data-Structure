def factorial_iterative(n):
    if n < 0:
        raise ValueError("No neg val")

    result = 1

    for i in range(2, n+1):
        result *= i

    return result

print(factorial_iterative(5))