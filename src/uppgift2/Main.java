package uppgift2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner input = new Scanner(System.in);

            System.out.println("Enter ten numbers: ");

            int[] numbers = new int[10];
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = input.nextInt();
            }

            stack.push(numbers[0]); //måste ha ett rätt första nummer
            for (int i = 1; i < numbers.length; i++) {
                if(numbers[i] != numbers[i-1])// kontrollerar så att det inte är en dublett innan
                    stack.push(numbers[i]);
            }

            while(!stack.isEmpty()) {
                System.out.print(stack.pop() + " ");
            }
    }
}
