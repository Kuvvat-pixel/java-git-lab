import java.util.Scanner;
public class EvenChecker {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = sc.nextInt();

        if(number % 2 ==0){
            System.out.println("Число четное");
        }else{
            System.out.println("Число нечетное");
        }
        sc.close();
    }
}
