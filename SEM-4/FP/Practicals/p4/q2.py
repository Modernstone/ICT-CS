import re

def extract_emails(filename):
    email_pattern = r"[a-zA-Z0-9._%+-]+@gnu\.ac\.in"
    with open(filename, "r", encoding="utf-8") as file:
        lines = file.readlines()
    
    emails = []
    for i, line in enumerate(lines, start=1):
        matches = re.findall(email_pattern, line)
        for email in matches:
            emails.append(f"E-mail {i} :: {email}")

    return emails

filename = "q2.txt"  # Replace with your actual filename
emails = extract_emails(filename)
for email in emails:
    print(email)
