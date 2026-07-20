# Build a grading system that takes marks (0-100) and assigns a grade, but also validates input range and handles boundary cases (e.g., 89.5 should round appropriately).

marks = 89.5

if marks < 0 or marks > 100:
    print("Invalid Marks")
else:
    marks = round(marks)
    if marks >= 90:
        grade = "A"
    elif marks >= 80:
       grade = "B"
    elif marks >= 70:
        grade = "C"
    elif marks >= 60:
        grade = "D"
    else:
        grade = "F"

    print(f"Marks: {marks} -> Grade: {grade}")