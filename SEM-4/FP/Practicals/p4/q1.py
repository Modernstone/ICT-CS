import string
from collections import Counter

STOP_WORDS = {"the", "is", "in", "and", "to", "of", "a", "for", "on", "with", "as", "by", "an", "it", "this", "that"}

def word_frequency_analysis(filename):
    with open(filename, 'r', encoding='utf-8') as file:
        text = file.read().lower()
    
    text = text.translate(str.maketrans('', '', string.punctuation))
    
    words = text.split()

    words = [word for word in words if word not in STOP_WORDS]

    word_counts = Counter(words)

    for word, count in word_counts.most_common(10):
        print(f"{word}: {count}")

word_frequency_analysis("sample.txt")
