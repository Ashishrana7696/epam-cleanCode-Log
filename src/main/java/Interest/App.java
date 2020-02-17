package Interest;
import java.util.Scanner;
public class App {

        public static void main(String[] args) {
            Scanner io=new Scanner(System.in);
            double principle,rate;
            int time;

            System.out.println("Enter Principle : ");
            principle=io.nextDouble();
            System.out.println("Enter Rate %: ");
            rate=io.nextDouble();
            System.out.println("Enter Time(years) : ");
            time=io.nextInt();

            Interest interest=new Interest(principle,rate,time);
            System.out.println("Simple Interest : "+interest.getSimpleInt());
            System.out.println("Compound Interest : "+interest.getCompoundInt());
        }
}
