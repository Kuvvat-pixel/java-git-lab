import  java.util.Scanner;

public class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        System.out.print("Введите n: ");
        int n = sc.nextInt();

        if(n < 1){
            System.out.println("n должен быть положительным числом");
            return;
        }
        long sum = 0;
        for(int i =0; i <= n; i++){
            sum += i;
        }
<<<<<<< HEAD
        for (int i = 0; i <= n; i++) {
            sum += i;
        }

        System.out.println("Сумма чисел от 1 до " + n + " равна " + sum);

        sc.close();
    }
}
>>>>>>> conflict-task-b
        sc.close();
    }
}