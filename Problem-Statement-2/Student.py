
class Student:
    def __init__(self, name, grade, age):
        self.name = name
        self.grade = grade
        self.age = age
        
    def display(self):
        print(" Name:",self.name,"\n Grade:",self.grade,"\n Age:",self.age)
        

class School(Student):
    def SchoolStudentDisplay(self):
        print(" Name:",self.name,"\n Grade:",self.grade,"\n Age:",self.age)
        
stud = School("Shweta","A",22)
stud.SchoolStudentDisplay();