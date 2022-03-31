import numpy
a=[0,1,2,3,4,5,6,7,8,9]
print(a[::2])                # Extended slicing(start:end:step)
print("Welcome")
print(1+1)
a=10
print(type(a))               # Type of variable

a=5
b=3
print(a/b)                   
print(a//b)                  # Operations
print(a**b)

a=19
b=89
print(a is b)                # IS and IS NOT operator
print(a is not b)

b=[1,7,3,4,5]                # LIST (Mutable)

print(b)                     # INDEXING
print(b[2:4])                # SLICING

b[1]=45                      # Adding element to specific index will remove previous element
print(b)

print(3 in b)                # MEMBERSHIP operator
print(90 not in b)

c={1,'hello','ishaan'}       # SET (Immutable, Unordered, Unindexed and Unchangeable BUT ITEMS CAN BE ADDED)
print(c)
c.add("phaye")   
print(c)    

b=(1,'hello',3,'c')          # TUPLE (Immutable, Ordered and Unchangeable)   Also it can be initialised without parenthesis
print(b,type(b))
print(b[2],b[3])

a=(1,2,'hello',4)            # TUPLE slicing
print(a[:-1])                # -1 means Last Element. Similarly, -2 will mean Second Last Element
print(a[:3])

thisdict = {                 # DICTIONARY
  "Brand": "Ford",
  "Model": "Mustang",
  "Year": 1964
}
print(thisdict)
print(thisdict["Brand"])

c="MY NAME IS ISHAAN"        # STRING
print(type(c))               # Type finding

x=1j                         # COMPLEX number
print(type(x))

print(isinstance(x,complex))    # Returns TRUE if type matches

a = "Hello, World!"
print(a[0])

a="10"
a=int(a)                        # EXPLICIT TYPECASTING
b=89.787
b=int(b)
print(a)
print(b)
a=10
b=20
c=a+b
print(a,b,c,sep='*')      # SEPARATION function

print("I love eating {1} and {0}".format("pizza","burger"))         # FORMAT function
print("My name is {name}".format(name="Ishaan"))

a=input("Enter any number ")                            # Taking INPUT
b=input("Enter another number ")
print("String is '",a+b,"'")                            # by default, INPUT is STRING

a=int(input())                               # INPUT typecasted as INT
b=int(input("Enter b= "))
print("Sum is",a+b," and type is ",type(a+b))
print(isinstance(a+b,int))

import random
print(random.randrange(1,100))                          # For printing a RANDOM NUMBER





