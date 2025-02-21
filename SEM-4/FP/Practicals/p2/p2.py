import random


def classify_money(amount):
    dollars = int(amount)  # Whole dollars
    remaining_cents = round((amount - dollars) * 100)  # Convert to cents
    quarters = remaining_cents // 25
    remaining_cents %= 25
    dimes = remaining_cents // 10
    remaining_cents %= 10
    nickels = remaining_cents // 5
    pennies = remaining_cents % 5
    
    print(f"Your amount {amount} consists of:")
    print(f"{dollars} dollars")
    print(f"{quarters} quarters")
    print(f"{dimes} dimes")
    print(f"{nickels} nickels")
    print(f"{pennies} pennies")


def lottery_game():
    lottery = random.randint(10, 99)  # Two-digit lottery number
    guess = int(input("Enter your lottery pick (two digits): "))
    
    lottery_digit1 = lottery // 10
    lottery_digit2 = lottery % 10
    guess_digit1 = guess // 10
    guess_digit2 = guess % 10
    
    print(f"The lottery number is: {lottery}")
    if guess == lottery:
        print("Exact match: you win $10,000")
    elif {guess_digit1, guess_digit2} == {lottery_digit1, lottery_digit2}:
        print("All digits match: you win $5,000")
    elif (guess_digit1 in {lottery_digit1, lottery_digit2} or
          guess_digit2 in {lottery_digit1, lottery_digit2}):
        print("One digit matches: you win $2,000")
    else:
        print("Sorry, no match")


def guessing_game():
    magic_number = random.randint(0, 100)
    guess = -1
    print("Guess a magic number between 0 and 100")
    while guess != magic_number:
        guess = int(input("Enter your guess: "))
        if guess > magic_number:
            print("Your guess is too high")
        elif guess < magic_number:
            print("Your guess is too low")
        else:
            print(f"Yes, the number is {magic_number}")

# Main menu
if __name__ == "__main__":
    while True:
        print("\nChoose a program to run:")
        print("1. Classify Money into Coins")
        print("2. Lottery Game")
        print("3. Guessing Numbers Game")
        print("4. Exit")
        choice = input("Enter your choice (1-4): ")
        if choice == "1":
            amount = float(input("Enter an amount in double (e.g., 11.56): "))
            classify_money(amount)
        elif choice == "2":
            lottery_game()
        elif choice == "3":
            guessing_game()
        elif choice == "4":
            print("Exiting...")
            break
        else:
            print("Invalid choice. Please try again.")
