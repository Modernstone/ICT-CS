import random

ranks = ['Ace', '2', '3', '4', '5', '6', '7', '8', '9', '10', 'Jack', 'Queen', 'King']
suits = ['Clubs', 'Diamonds', 'Hearts', 'Spades']

def pick_card():
    rank = random.choice(ranks)
    suit = random.choice(suits)
    return rank, suit

print("A card has been picked from the deck.")
rank, suit = pick_card()

opponent_rank = input("Opponent, guess the rank of the card: ")
opponent_suit = input("Opponent, guess the suit of the card: ")

print(f"\nActual Card: {rank} of {suit}")
if opponent_rank == rank and opponent_suit == suit:
    print("Correct Judgment! The guess is accurate.")
else:
    print("Incorrect Judgment. Better luck next time!")
