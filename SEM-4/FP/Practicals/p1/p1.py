import datetime
import calendar
import random

# Task 1: Calculate age and print current date/time and calendar
def q1():
    birth_date = datetime.date(1947, 6, 5)
    today = datetime.date.today()
    age = today.year - birth_date.year - ((today.month, today.day) < (birth_date.month, birth_date.day))

    print(f"Shyam's grandfather is {age} years old.")
    print(f"Current Date and Time: {datetime.datetime.now()}")
    print(f"Calendar for {birth_date.year}, {birth_date.month}:\n")
    print(calendar.month(birth_date.year, birth_date.month))

# Task 2: User registration form
def q2():
    user_name = input("Enter your name: ")
    email = input("Enter your email: ")
    submission_time = datetime.datetime.now()

    print("Data submitted successfully!")
    print(f"Name: {user_name}")
    print(f"Email: {email}")
    print(f"Submission Time: {submission_time}")

# Task 3: Random number and sum of its digits
def q3():
    number = random.randint(0, 1000)
    print(f"Generated number: {number}")
    digit_sum = sum(int(digit) for digit in str(number))
    print(f"The sum of the digits is {digit_sum}")

# Run all tasks
q1()
q2()
q3()
