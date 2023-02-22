import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bob is a transient on the street. In conversation, his responses are very short.");
        for (int i = 0; i <= 1; i += 0) {
            System.out.println("Ask Bob a question.");
            String question = sc.nextLine();
            if (question.endsWith("?")) {
                System.out.println("I Dunno.");
            } else if (question.endsWith("!")) {
                System.out.println("Yo!, Relax!");
            } else if (question.isEmpty()) {
                System.out.println("So be it. by the way, get a job!");

            } else {
                System.out.println("Go Find Less.");
            }
        }
    }
}
