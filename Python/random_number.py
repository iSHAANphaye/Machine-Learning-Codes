import random
class ran:
    def roll_dice(num):
        return random.randint(1,num)

class Student:
    def __init__(self, name, age, branch, is_hindu):
        self.name = name
        self.age = age
        self.branch = branch
        self.is_hindu = is_hindu
