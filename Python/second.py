x=int(input("Enter a number: "))                                    # IF-ELSE Example
if x<50:
    print("It's smaller than 50")
elif x>50:
    print("Bigger than 50")
else:
    print("Error")

x=[3,5]
a=int(input("Enter a number: "))                                    # NESTED IF-ELSE Example
if a%x[0]==0:
    if a%x[1]==0:
        print("Number divisible by both 3 and 5")
    else:
        print("Only divisible by 3")
elif a%x[1]==0:
    print("Only divisible by 5")
else:
    print("Not divisible by 3 or 5")

i=int(input("Enter the number whose table you wanna see: "))        # Table printing using RANGE function
for x in range(1,11):                                               # FOR Loop
    print(i,"*",x,"=",i*x)

i=1
while i!= 2:    
    i=int(input("Enter the number: "))                # WHILE Loop
    print("%d"%i)
    if i==2:
        
        print("The program has ended")

i = 1
while i < 6:                                          # BREAK Operation
  print(i)
  i += 1
  if i == 3:
      break
  

for val in "string":
    if val == "i":
        break
    print(val)
print("The end") 
                                 
                                  # FUNCTIONS #

def greet(name, msg="Good morning!"):
        print("Hello", name + ', ' + msg)


greet("kate")
greet("bruce", "how do you do?")

def greet(names):
    for name in names:
        print("Hello", name)

greet("Monica")

x = int(2)
def foo():
    b=x*2
    print(b)
foo()

def foo():
    y = "local"
    print(y)

foo()
#print(y)        # ERROR as local variable cant be used outside

a='3'
print(a*3)       # Function to repeat a string (* operator)

c = 1 # Global variable

def add():
    global c
    c = c + 2 # Increment by 2
    print("Inside add():", c)

add()
print("In main:", c)
