package uppgift4;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("1ik161", "Fundamentals of Programming");
        hashMap.put("2ik162", "OOP");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a course code: ");
        String code = input.nextLine();

        if(hashMap.containsKey(code)) {
            System.out.println(hashMap.get(code));
        }else {
            System.out.println("the course does not exist");
        }



    }
}
