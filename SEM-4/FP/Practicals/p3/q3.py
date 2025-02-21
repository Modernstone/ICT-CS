import time


quiz = [
    {"question": "What is the capital of France?", "answer": "Paris"},
    {"question": "What is 5 + 7?", "answer": "12"},
    {"question": "What is the color of the sky?", "answer": "Blue"}
]

def start_quiz():
    correct_answers = 0
    total_questions = len(quiz)

    print("\nStarting the quiz...")


    start_time = time.time()


    for q in quiz:
        print("\n" + q["question"])
        user_answer = input("Your Answer: ").strip()
        if user_answer.lower() == q["answer"].lower():
            correct_answers += 1

    end_time = time.time()
    time_taken = end_time - start_time

    print("\nQuiz Completed!")
    print(f"Correct Answers: {correct_answers} out of {total_questions}")
    print(f"Time Taken: {time_taken:.2f} seconds")

start_quiz()
