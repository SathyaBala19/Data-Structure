number = int(input("Enter two digit number: "))

if 10 <= number <= 99:
    first_digi = number // 10
    last_digi = number % 10

    digi_sum = first_digi + last_digi
    digi_prod = first_digi * last_digi

    result = digi_sum + digi_prod

    if result == number:
        print(number, " is a special number")
    else:
        print(number, " is not a special number")
else:
    print("Please enter a two-digit number")