import java.util.Scanner;

public class UserInterface {

    public static Integer tryParseInt(String inputString){ // utility function to catch errors from parsing ints from user inputs
        try {
            return Integer.parseInt(inputString);
        } catch (NumberFormatException err){
            return null;
        }

    }
    public static void questionMaker(){
        Scanner userIn = new Scanner(System.in);
        System.out.println("--Beginning Question Creation--");
        System.out.println("How many questions to be created?");
        String userNumQuestionsString = userIn.nextLine();
        int userNumQuestions = -1;

        while(userNumQuestions <= 0 || UserInterface.tryParseInt(userNumQuestionsString) == null){ // if it is not an int, or int <= 0, repeat until it is
            if(UserInterface.tryParseInt(userNumQuestionsString) != null){ // if loop was entered due to first condition, and int is readable, continue read the int and check it
                if(UserInterface.tryParseInt(userNumQuestionsString) > 0){ // if readable, check it
                    break; // break out of while loop, since the value is valid
                }
            }
            System.out.println("Invalid: Must be greater or equal to 1: ");
            System.out.println("How many questions to be created?");
            userNumQuestionsString = userIn.nextLine();
        }
        userNumQuestions = UserInterface.tryParseInt(userNumQuestionsString); // set var to final, verified value
        System.out.println(String.format("Creating %s Question(s):", userNumQuestions));


        for (int i = 0; i < userNumQuestions; i++) { // question creation process, repeat for i questions
            System.out.println("What is the question prompt for question #" + (i + 1));
            String questionPrompt = userIn.nextLine();
            System.out.println("What is the correct answer for question #" + (i + 1));
            String questionAnswer = userIn.nextLine();
            Quiz.allQuestions.add(new Question(questionPrompt, questionAnswer));
        }
        Quiz.totalQuestions = userNumQuestions;
        System.out.println(String.format("--Question Creation Finished with %s Total Questions--", userNumQuestions));
    }

    public static void quizMaker(){
        Scanner userIn = new Scanner(System.in);
        System.out.println("--Beginning Quiz Setup--");
        System.out.println("How many questions do you want in the quiz?");
        String userQuizQuestionsString = userIn.nextLine();
        int userQuizQuestions = -1;
        while(userQuizQuestions > Quiz.totalQuestions || userQuizQuestions <= 0 || UserInterface.tryParseInt(userQuizQuestionsString) == null){
            if(UserInterface.tryParseInt(userQuizQuestionsString) != null){ // if loop was entered due to first/second condition, and int is readable, continue read the int and check it
                if(userQuizQuestions > Quiz.totalQuestions || userQuizQuestions <= 0){ // if readable, check it
                    break; // break out of while loop, since the value is valid
                }
            }
            System.out.println("Invalid: Cannot be greater than number of questions available: " + Quiz.totalQuestions);
            System.out.println("How many questions do you want in the quiz?");
            userQuizQuestionsString = userIn.nextLine();
        }
        userQuizQuestions = UserInterface.tryParseInt(userQuizQuestionsString);// now we know the value is parsable and valid, write to var
        Quiz.generateQuiz(userQuizQuestions); // Generate the quiz
        System.out.println(String.format("--Generated Quiz with %s Random Questions--", userQuizQuestions));
    }

    public static void takeQuiz(){
        Scanner userIn = new Scanner(System.in);
        System.out.println(String.format("--Beginning Quiz with %s Questions--", Quiz.numQuizQuestions));
        for (int i = 0; i < Quiz.numQuizQuestions; i++) {
            System.out.println(Quiz.quizQuestions.get(i).getQuestionPrompt());
            String answer = userIn.nextLine();
            if(answer.equalsIgnoreCase(Quiz.quizQuestions.get(i).getAnswer())){ // ignoring case, check if user submitted answer is the same is the correct answer
                System.out.println("Correct!");
            }
            else{
                System.out.println("The correct answer is : " + Quiz.quizQuestions.get(i).getAnswer());
            }
        }
        System.out.println(String.format("---Quiz Completed, %s Questions Asked---", Quiz.numQuizQuestions));
    }
}

