import java.util.Scanner;

public class QuestionService {

    private final Question[] questions = new Question[5];

    public QuestionService() {
        questions[0] = new Question(1, "What is the default value of a boolean variable in Java?",
                "a) true", "b) false", "c) null", "d) 0", "b");
        questions[1] = new Question(2, "Which of the following is not a valid access modifier in Java?",
                "a) public", "b) private", "c) protected", "d) friendly", "d");
        questions[2] = new Question(3, "Which keyword is used to create a subclass in Java?",
                "a) extends", "b) inherit", "c) implements", "d) derives", "a");
        questions[3] = new Question(4, "Which collection class maintains the order of elements?",
                "a) HashSet", "b) TreeSet", "c) ArrayList", "d)HashMap", "c");
        questions[4] = new Question(5, "What is the purpose of the final keyword in Java?",
                "a) To make a class immutable", "b) To prevent method overriding", "c) To declare constants",
                "d) All of the above", "d");
    }

    public void playQuiz() {
        int score = 0;
        Scanner sc = new Scanner(System.in);
        for (Question question : questions) {
            System.out.println("Question no. " + question.getId());
            System.out.println(question.getQuestion());
            question.printOptions();
            if (question.getAnswer().equals(sc.nextLine())) {
                score++;
            }
        }

        switch (score){
            case 0:
                System.out.println("Your result is 0. It's okay! Everyone starts somewhere! " +
                       "Use this as a learning opportunity. Dive back into the resources and try again! ");
                break;
            case 1:
                System.out.println("Your result is 1. Don't be discouraged! Every expert was once a beginner! " +
                        "Take some time to review the material, and you'll get the hang of it!");
                break;
            case 2:
                System.out.println("Your result is 2. Keep going! There’s room for improvement! " +
                        "You know some basics, but there’s more to learn. Don’t give up—keep studying!");
                break;
            case 3:
                System.out.println("Your result is 3. Good effort! You're on the right track! " +
                        "You have a decent grasp of Java concepts. Review a few areas, and you'll improve even more!");
                break;
            case 4:
                System.out.println("Your result is 4. Great job! Just a little more to go!" +
                        "You have a solid understanding of Java. A bit more practice, and you'll be at the top!");
                break;
            case 5:
                System.out.println("Your result is 5. Awesome job! You nailed it!" +
                        "You're a Java expert! Keep up the great work!");
                break;
            default:
                System.out.println("Unexpected result! Please try again later!");
                break;
        }
    }
}
