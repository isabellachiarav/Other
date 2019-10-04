import csv
from random import randint
words = []
if __name__ == '__main__':
    with open('hangman_wordbank.csv','r') as csvfile:
        word_file = csv.reader(csvfile, delimiter=',')
        for row in word_file:
            words.append(row[0])
    keep_playing = True
    while keep_playing:
        incorrect = 0
        guesses = []
        num = randint(0, len(words))
        secret = []
        word = words[num]
        print(secret)
        for i in range(13):
            print()
        for i in word:
            secret.append("__")
        for i in secret:
            print(i, end = " ")
        print()
        while incorrect < 6:
            print()
            guess = input("Enter your guess: ")
            if guess in guesses:
                guess = input("You have already guessed this letter. Guess again: ")
            guesses.append(guess)
            if not(guess in word):
                incorrect += 1
            for i in range(len(word)):
                if guess == word[i]:
                    secret[i] = guess
            print("Guesses: {}".format(guesses))
            print("Incorrect guesses: {}".format(incorrect))
            for i in secret:
                print(i, end = " ")
            if not ("__" in secret) or incorrect >= 6:
                again = "n"
                print()
                again = input("The game is over. Do you want to play again? y/n: ")
                break

