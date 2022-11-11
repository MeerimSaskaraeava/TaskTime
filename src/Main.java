import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Time time=new Time(new int[23],new int[59],new int[59]);


        System.out.println(time.getTime(time.getHour(), time.getMinute(), time.getSecond()));
        System.out.println("Choose method next second -1, method previous second-2");
        int sc= scanner.nextInt();
        if (sc==1){System.out.println(time.nextSecond(time.getHour().clone(), time.getMinute().clone(), time.getSecond().clone()));}
        else if (sc==2){System.out.println(time.previousSecond(time.getHour().clone(), time.getMinute().clone(), time.getSecond().clone()));}


    }
}