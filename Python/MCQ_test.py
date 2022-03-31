from Question import Question
question_prompts = [
    "What is the Scientific name of gold?\n(a)Aurum\n(b)Hydragyrum\n(c)Gypsum\n",
    "\nHydrochloric acid doesn't contain which of the following elements?\n(a)Hydrogen\n(b)Neon\n(c)Chlorine\n",
    "\nWho wrote \"Alice in Wonderland\"?\n(a)Mark Twain\n(b)Stephen Hawking\n(c)Lewis carrol\n"
]

questions = [
    Question(question_prompts[0],"a"),
    Question(question_prompts[1],"b"),
    Question(question_prompts[2],"c")
]

def run_test(questions):
    marks = 0
    for ques in questions:
        user_answer = input(ques.question)
        if user_answer == ques.answer:
            marks+=1
        else:
            marks-=1
    print("You got "+str(marks)+" marks out of 3.")

run_test(questions)
