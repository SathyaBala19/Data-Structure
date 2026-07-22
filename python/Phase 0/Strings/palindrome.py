text = "A man, a plan, a canal: Panama"

cleaned = ""

for char in text:
    if char.isalnum():
        cleaned += char.lower()

isPalindrome = text == cleaned[::-1]

print(isPalindrome)