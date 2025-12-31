import java.util.*;

public class QuestionService {
    
    Question[] questions = new Question[5];
    String selection[] = new String[5];

    public QuestionService(){
        questions[0] = new Question(1, "Python", "Java", "C++", "Python", "JS","What is the most popular language?");
        questions[1] = new Question(2, "Java", "Java", "C++", "Python", "JS","What is the most popular language?");
        questions[2] = new Question(3, "JS", "Java", "C++", "Python", "JS","What is the most popular language?");
        questions[3] = new Question(4, "C++", "Java", "C++", "Python", "JS","What is the most popular language?");
        questions[4] = new Question(5, "Sike", "Java", "C++", "Python", "JS","What is the most popular language?");
    }

    public void playQuiz(){
        int i = 0;
        for(Question q: questions){
            System.out.println("Question no: " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());

            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;
        }
        for(String s: selection){
            System.out.println(s);
        }
    }

    public void getScore(){
        int score = 0;

        for(int i=0; i<questions.length; i++){
            Question que = questions[i];
            String actualAnswer = que.getAnswer();
            String userAnswer = selection[i];

            if(actualAnswer.equals(userAnswer)){
                score++;
            }

        }
        System.out.println("Score is: " + score);
    }
}
