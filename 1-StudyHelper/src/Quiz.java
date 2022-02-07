import java.util.ArrayList;

public class Quiz {
    public static ArrayList<Question> allQuestions = new ArrayList<>(); // arraylist to store all created questions
    public static int totalQuestions;

    public static ArrayList<Question> quizQuestions = new ArrayList<>(); // arraylist to store questions in the generated quiz
    public static int numQuizQuestions;

    public static void generateQuiz(int numQQuestions){ // quiz generator, using randomly selected questions
        for (int i = 0; i < numQQuestions; i++) { // loop to make user inputted number of questions
            int randomIndex = (int) (Math.random() * numQQuestions); // generate a random number, corresponding to the index of the question candidate in the allQuestions ArrayList
            while(Quiz.quizQuestions.contains(allQuestions.get(randomIndex))){ // while the random question generated already exists in quizQuestions
                randomIndex = (int) (Math.random() * numQQuestions);// generate a new random index
            }
            Quiz.quizQuestions.add(allQuestions.get(randomIndex));// add the verified, unduplicated question to quizQuestions
        }
        Quiz.numQuizQuestions = numQQuestions;
    }
}
