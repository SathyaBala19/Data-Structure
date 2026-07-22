# Write a recursive function to compute the nth Fibonacci number, then optimize it using memoization (dictionary caching) to handle large n efficiently.

def fib_naive(n):
    if n <= 1:
        return n
    else:
        return fib_naive(n - 1) + fib_naive(n - 2)
    
def fib_memo(n, cache = {}):
    
    if n <= 1:
        return n
    
    if n in cache:
        return cache[n]

    result =fib_memo(n - 1, cache) + fib_memo(n - 2, cache)
    cache[n] = result
    return result

print(fib_naive(10))
print(fib_memo(50))