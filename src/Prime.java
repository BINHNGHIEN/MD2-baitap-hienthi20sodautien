import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = scanner.nextInt();

        int count=1;
        for (int i = 2; count<= number ; i++) {
            boolean check = true;
            for (int j = 2; j < i ; j++) {
                if(i%j==0){
                    check = false;
                    break;
                }
            }
            if(check){
                count++;
                System.out.println(" so nguyen to la :" +i);
            }
        }
    }
}
