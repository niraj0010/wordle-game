import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WordleGame game = new WordleGame("HARRY",6);

        try{
            File f = new File("C:\\Users\\neera\\IdeaProjects\\cmps-280---06---harry-potter-wordle-niraj0010\\src\\database.txt");
            Scanner in = new Scanner(f);
            while(in.hasNext()){
                String st = in.nextLine();
            }
            in.close();
        } catch (FileNotFoundException e){
            System.out.println("File not found"+e.getMessage());
        }
        while (!game.isOver()) {
            System.out.print("Guess the wordle (upper case letter only, please): ");
            String guess = sc.nextLine();
            String g = null;
            g = game.guess(guess);
            System.out.println(g);
        }
        sc.close();
    }
}