celsius_str = "36.6"

celsius = float(celsius_str)

fahrenheit = (celsius * 9/5) + 32
kelvin = celsius + 273.15

print(f"Celsius: {round(celsius, 2)}")
print(f"Fahrenheit: {round(fahrenheit, 2)}")
print(f"Kelvin: {round(kelvin, 2)}")

print(type(celsius), type(fahrenheit), type(kelvin))