import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int num, count;
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o número para contagem regressiva!");
        num = in.nextInt();
        for (count = num; count >= 0; count--) {
            System.out.println(+count + "!");
        }
        System.exit(0);
    }
}