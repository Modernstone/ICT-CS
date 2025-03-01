import os

DIARY_FOLDER = "diary_entries"

# Ensure diary folder exists
os.makedirs(DIARY_FOLDER, exist_ok=True)

def create_diary_entry():
    date = input("Enter date (YYYY-MM-DD): ")
    filename = os.path.join(DIARY_FOLDER, f"{date}.txt")
    
    content = input("Write your diary entry:\n")
    
    with open(filename, 'w', encoding='utf-8') as file:
        file.write(content)
    
    print(f"Diary entry saved as {filename}")

def view_diary_entry():
    date = input("Enter date to view (YYYY-MM-DD): ")
    filename = os.path.join(DIARY_FOLDER, f"{date}.txt")
    
    if os.path.exists(filename):
        with open(filename, 'r', encoding='utf-8') as file:
            print("\nDiary Entry:")
            print(file.read())
    else:
        print("No entry found for this date.")

def append_diary_entry():
    date = input("Enter date to append to (YYYY-MM-DD): ")
    filename = os.path.join(DIARY_FOLDER, f"{date}.txt")
    
    if os.path.exists(filename):
        content = input("Enter additional content:\n")
        with open(filename, 'a', encoding='utf-8') as file:
            file.write("\n" + content)
        print("Entry updated.")
    else:
        print("No entry found. Creating a new one.")
        create_diary_entry()

while True:
    choice = input("\nChoose an option: (1) Create Entry, (2) View Entry, (3) Append Entry, (4) Exit: ")
    if choice == "1":
        create_diary_entry()
    elif choice == "2":
        view_diary_entry()
    elif choice == "3":
        append_diary_entry()
    elif choice == "4":
        break
    else:
        print("Invalid choice. Please try again.")
