import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] questions = {
            "What is the capital of India?",
            "Who is known as the 'Father of the Nation' in India?",
            "Which river is considered the holiest river in India?",
            "Which Indian city is known as the 'Silicon Valley of India'?",
            "Who was the first Prime Minister of independent India?",
            "Which monument is known as the symbol of love in India?",
            "In which year did India gain independence from British rule?",
            "What is the national animal of India?",
            "Which sport is considered the most popular in India?",
            "What is the national currency of India?"
        };
        
        String[][] options = {
            {"1) Mumbai", "2) Kolkata", "3) New Delhi", "4) Chennai"},
            {"1) Jawaharlal Nehru", "2) Bhagat Singh", "3) Mahatma Gandhi", "4) Sardar Patel"},
            {"1) Ganga", "2) Yamuna", "3) Godavari", "4) Krishna"},
            {"1) Hyderabad", "2) Bengaluru", "3) Pune", "4) Gurugram"},
            {"1) Dr. Rajendra Prasad", "2) Subhas Chandra Bose", "3) Indira Gandhi", "4) Jawaharlal Nehru"},
            {"1) Red Fort", "2) Qutub Minar", "3) Taj Mahal", "4) India Gate"},
            {"1) 1945", "2) 1947", "3) 1950", "4) 1965"},
            {"1) Lion", "2) Elephant", "3) Bengal Tiger", "4) Peacock"},
            {"1) Football", "2) Cricket", "3) Hockey", "4) Badminton"},
            {"1) Dollar", "2) Rupee", "3) Pound", "4) Yen"}
        };
        
        int[] answers = {3, 3, 1, 2, 4, 3, 2, 3, 2, 2}; 
        
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("Your answer: ");
            int userAnswer = sc.nextInt();
            if (userAnswer == answers[i]) {
                score++;
            }
        }

        double percentage = (score / 10.0) * 100;
        System.out.println("\nYou got " + score + " out of 10 correct.");
        System.out.println("Your score: " + percentage + "%");

        if (percentage >= 35) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }
}
