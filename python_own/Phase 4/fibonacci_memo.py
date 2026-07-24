def fibonacci(n, memo=None):
    if n < 0:
        raise ValueError("N must be non-neg")

    if memo is None:
        memo = {}

    if n == 0:
        return 0

    if n == 1:
        return 1

    if n in memo:
        return memo[n]

    memo[n] = fibonacci(n - 1, memo) + fibonacci(n - 2, memo)
    return memo[n]


print(fibonacci(5))