import java.util.Scanner;

public class Psykologen {
    public static void main(String[] args) {
        String[] robot = {"ok", "Nice", "I ain't reading all that. I'm happy for u tho. Or sorry that happened.",
        "That's all for today. See you same time next week. ", "hmmm", "I understand", "Tell me more", "That's good",
        "That's not good", "That's Interesting", "Of course"};
        String saveHuman = "";
        Scanner myImput = new Scanner(System.in);
        System.out.println("Good day, how are you?");

        for (int i = 0; i < 10; i++) {
            String human = myImput.nextLine();
            System.out.println("(Therapist): " + robot[(int) (Math.random() * robot.length)]);
            saveHuman = saveHuman + human + ", ";
        }
        System.out.println("(Therapist): That's ACTUALLY all for today. See you same time next week.");
        System.out.println("All your saved data: " + saveHuman);
    }
}
