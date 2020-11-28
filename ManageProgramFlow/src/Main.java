import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        var now = LocalDateTime.now();
        System.out.println(now);
        var monthnumber = now.getMonthValue();
        String message;
        if (monthnumber<=6) {
            message = "It is in the first Half of the year";
        }
        else{
            message="It is in the second half of the year";
        }
        System.out.println(message);
    }
}
