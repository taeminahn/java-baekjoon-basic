package array;

import java.util.Scanner;

public class Level6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int basket = sc.nextInt();
        int count = sc.nextInt();
        int[] basketArr = new int[basket];

        for(int i = 0; i < basketArr.length; i++) {
            basketArr[i] = i + 1;
        }

        for(int i = 0; i < count; i++){
            int firstBasket = sc.nextInt() - 1;
            int secondBasket = sc.nextInt() - 1;
            int temp = basketArr[firstBasket];
            basketArr[firstBasket] = basketArr[secondBasket];
            basketArr[secondBasket] = temp;
        }

        for(int i = 0; i < basketArr.length; i++) {
            System.out.print(basketArr[i] + " ");
        }
    }
}
