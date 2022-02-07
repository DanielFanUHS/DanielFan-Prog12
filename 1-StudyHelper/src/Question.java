public class Question {
    private String questionPrompt; // field for the question text
    private String answer; //field for the answer text

    public Question(String questionPrompt, String answer) {
        this.questionPrompt = questionPrompt;
        this.answer = answer;
    }

    //getters to get the data when taking the quiz
    public String getQuestionPrompt() {
        return questionPrompt;
    }

    public String getAnswer() {
        return answer;
    }

}

