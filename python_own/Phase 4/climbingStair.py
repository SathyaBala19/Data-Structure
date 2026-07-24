def climbStairs(self, n: int) -> int:
    if n <= 2:
        return n

    prev_two = 1
    prev_one = 2

    for step in range(3, n+1):
        current = prev_one + prev_two

        prev_two = prev_one
        prev_one = current

    return prev_one