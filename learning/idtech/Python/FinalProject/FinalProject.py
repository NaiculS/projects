password = input("What's the password? ")
if password == "d":
    import time
    import random
    randomGenerator = random.randrange(5)
    playerLevel = 1
    playerHealth = 10.0
    rockDamage = random.randrange(4)
    rockDamage+=1
    hasSword = False
    goodChoice = False
    dragonGold = 0
    dragonGoldInitial = random.randrange(5)
    playerName = input("What is your character's name? ")
    print("Welcome " + playerName + "!")
    print("Before you is a large cave mouth. Darkness is before you. Dare you enter the Cave of Wonders?")
    while not goodChoice:
        print("1. Enter the Cave of Horrors")
        playerChoice = input("2. Run away like a chicken ")
        if playerChoice == "1":
            goodChoice = True
            print("You made it to the entrance of the cave.")
            playerLevel += 1
            print("Your bravery has rewarded you! Congratulations, you are now level " + str(playerLevel) + "!")
            print("You travel forward into the dark cave. You feel something press against your leg...")
            wait = input("PRESS ENTER TO CONTINUE.")
            print("It's a trap! Suddenly, you're being bombarded by rocks from above.")
            playerHealth -= rockDamage
            print("The rock slide hits you for " + str(rockDamage) + " health!")
            print("You have " + str(playerHealth) + " health remaining.")
            # noinspection PyRedeclaration
            wait = input("PRESS ENTER TO CONTINUE.")
            print("You pick yourself up from the cave floor and brush a cloud of dust from your clothes.")
            print(
                "The cave narrows as you press on until you manage to squeeze through an opening into a large natural cavern.")
            print("Before you is a treasure chest.")
            # noinspection PyRedeclaration
            goodChoice = False
            while not goodChoice:
                print("1. Open the chest.")
                playerChoice = input("2. Ignore the chest. Obvious trap is obvious. ")
                if playerChoice == "1":
                    goodChoice = True
                    print("Uneasy after your brush with death, you slowly open the chest to reveal a magical sword!")
                    playerLevel += 1
                    print("Your bravery has rewarded you! Congratulations, you are now level " + str(playerLevel) + "!")
                    hasSword = True
                elif playerChoice == "2":
                    goodChoice = True
                else:
                    goodChoice = False
                    print("That is not a valid answer, please pick 1 or 2.")

            print("You leave the cavern with the chest in it and continue your journey")
            print("Up ahead the air grows warm and wet. You hear snoring.")
            print("Peeking around a corner you see a monstrous shape! A dragon sleeps in the room ahead.")
            print("You swallow hard and decide it is time to leave.")
            print("As you turn, your foot finds a rock. It thuds loudly against the cave wall. The dragon wakes up!")
            goodChoice = False
            while not goodChoice:
                print("1. Fight the Dragon.")
                playerChoice = input("2. Run for your life. ")
                if playerChoice == "1":
                    goodChoice = True
                    print("You feel courage surge through your body as you charge the dragon!")
                    if hasSword:
                        goodChoice = False
                        print("As you charge the dragon, do you...")
                        print("1. Use your sword")
                        playerChoice = input("2. Use your fists ")
                        # TODO: Give a player 5 seconds to make their choice, if they don't choose 1 or 2 or make a choice within that time, they go to line 81
                        if playerChoice == "1":
                            print("You raise the magic sword and plunge it into the dragon, slaying the beast.")
                            playerLevel += 7
                            dragonGold = dragonGoldInitial + 10
                            print("Killing the dragon has rewarded you with " + str(dragonGold) + " gold and a lot of experience. Congratulations, you are now level " + str(playerLevel) + "!")
                            exit(0)
                        elif playerChoice == "2":
                            print("You pummel the dragon with your fists to no avail. The dragon snarls and swallows you whole. Game Over!")
                            exit(0)
                        else:
                            print("You're so preocupied thinking about your choice, that you end up running right into the mouth of the dragon. Game Over!")
                            exit(0)
                    else:
                        print("You pummel the dragon with your fists to no avail. The dragon snarls and swallows you whole. Game Over!")
                        exit(0)
                elif playerChoice == "2":
                    goodChoice = True
                    print(
                        "As you run away to hide in the safety of your warm bed, the dragon yawns and returns to its slumber.")
                else:
                    goodChoice = False
                    print("That is not a valid answer, please pick 1 or 2.")
        elif playerChoice == "2":
            goodChoice = True
            print(playerName + " runs home and goes to sleep.")
            exit(0)
        else:
            goodChoice = False
            print("That is not a valid answer, please pick 1 or 2.")
else:
    print("That's a wrong password!")
3