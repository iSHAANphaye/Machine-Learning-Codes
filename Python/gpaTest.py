class gpa:
    def __init__(self,name,gpa):
        self.name = name
        self.gpa = gpa

    def testGpa(self):
        if self.gpa>=3.5:
            return "Good Gpa"
        else:
            return "Can do better"