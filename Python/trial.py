from random_number import ran
from random_number import Student
int = '2'
print(int+" is the number")
Friend_name = open("index.html","w")

Friend_name.write("<p> Hello World <p>")

print(ran.roll_dice(23))

Student1 = Student("Ishaan", 21, "IT", True)
Student2 = Student("Furqan", 21, "IT", False)
Student3 = Student("Lavanya", 20, "CSE", True)
print(Student1.age)

print(Friend_name.readable(),end = "")
Friend_name.close()