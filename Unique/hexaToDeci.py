hex_num = input("Enter hexadecimal number: ").upper()

power = 0
decimal = 0

for ch in reversed(hex_num):
    if '0' <= ch <= '9':
        value = ord(ch) - ord('0')
    else:
        value = ord(ch) - ord('A') + 10
    decimal += value * (16 ** power)
    power += 1

print("Decimal: ", decimal)