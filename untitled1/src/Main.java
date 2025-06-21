import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        boolean isContinue = true;
        int x = 0;
        int y = 0;
        while (isContinue) {
            System.out.println("Выберите куда двинутся:\n1 - вверх\n2 - вниз\n3 - вправо\n4 - влево");
            int input = new Scanner(System.in).nextInt();
            if(input == 1) {
                y++;
            }else if (input == 2) {
                y--;
            }else if (input == 3) {
                x++;
            }else if (input == 4) {
                x--;
            }else  {
                System.out.println("Error");
                isContinue = false;
            }
        }
        System.out.println("Координаты робота: по вертикали " + y + ", по горизонтали " + x);

    }
}