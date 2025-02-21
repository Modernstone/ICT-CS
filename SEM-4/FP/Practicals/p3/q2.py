def get_first_days(year, first_day):
    # Days in each month
    months = ["January", "February", "March", "April", "May", "June", 
              "July", "August", "September", "October", "November", "December"]
    days_in_month = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

    if (year % 4 == 0 and year % 100 != 0) or (year % 400 == 0):
        days_in_month[1] = 29

    days_of_week = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"]

    first_days = []
    current_day = first_day

    for i, days in enumerate(days_in_month):
        first_days.append((months[i], days_of_week[current_day]))
        current_day = (current_day + days) % 7

    return first_days

year = int(input("Enter the year: "))
first_day = int(input("Enter the first day of the year (0=Sunday, 1=Monday, ..., 6=Saturday): "))

print("\nFirst days of each month:")
for month, day in get_first_days(year, first_day):
    print(f"{month}: {day}")
