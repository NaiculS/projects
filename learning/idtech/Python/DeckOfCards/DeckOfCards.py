import random
i=0
suits = ["Hearts", "Diamonds", "Spades", "Clubs"]
numbers = ["Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"]
usedCards = []
timesRepeated = 0
while i < 52:
    randomSuit = random.randint(0, 3)
    randomNumber = random.randint(0, 12)
    cardSuit = suits[randomSuit]
    cardNumber = numbers[randomNumber]
    cardID = cardSuit+cardNumber
    if cardID in usedCards:
        timesRepeated += 1
    else:
        print("Your card is the " + str(cardNumber) + " of " + str(cardSuit) + "!")
        i += 1
        usedCards.append(cardID)
print("The same card was almost drawn " + str(timesRepeated) + " times")
