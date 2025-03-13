package uppgift3;
import java.util.*;

public class main {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();//alfabetisk ordning, s.829

        Scanner input = new Scanner(System.in);
        System.out.println("Ange en sträng/Enter a String: ");
        String sentence = input.nextLine();

        String[] words = sentence.split(" ");//split på mellanslag
        for (String w : words) {
            if (Character.isLetter(w.charAt(0))) {
                queue.offer(w.toLowerCase());  //Lägger till ord i queue med offer, FIFO
            }
        }

        while(!queue.isEmpty()){
            System.out.println(queue.poll());//Poll används för att ta ut orden,FIFO
        }
    }
    //Input:
    //Welcome to object oriented programming and Data structure
}
