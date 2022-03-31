i = int(input("Enter the number of words you want to translate: "))
word = []
for a in range (0,i):
    a = input("Enter word: ")
    word.append(a)

translation = [""]*10

for b in range(0,len(word)):
    for letter in word[b]:
        if letter in "AEIOUaeiou":
            translation[b] = translation[b] + "G"
        else:
            translation[b] = translation[b] + letter
            
for b in range(0,len(word)):
    print(translation[b], end = " ")
