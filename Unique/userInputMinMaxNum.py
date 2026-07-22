number = int(input("Enter a number: "))

largest = number
shortest = number

while True:
    choice = input("Wish to continue[y/n]: ").lower()

    if choice == 'n':
        break

    number = int(input("Enter a number: "))

    if number > largest:
        largest = number

    if number < shortest:
        shortest = number

print("Largest: ", largest)
print("Smallest: ", shortest)