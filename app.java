import java.util.*;

public class app {

    public Scanner scn = new Scanner(System.in);

    public app() {
        int[][] arr = new int[3][3];
        System.out.println("Hello");

        for (int[] arr1 : arr) {
            for (int j = 0; j < arr.length; j++) {
                if (scn.hasNextInt()) {
                    int num = scn.nextInt();
                    arr1[j] = num;
                    System.out.printf("%1d", arr1[j]);
                }
            }
            System.out.println();
        }

        
        int winner = 0;
        for(int[] arr1 : arr) {
            if(arr1[0] == arr1[1] && arr1[1] == arr1[2] && arr1[0] != 0) {
                winner = arr1[0];
            }
        }
        for(int j = 0; j < 3; j++){
            if(arr[0][j] == arr[1][j] && arr[1][j] == arr[2][j] && arr[0][j] != 0) {
                winner = arr[0][j];
            }
        }
        if (arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2] && arr[0][0] != 0) {
            winner = arr[0][0];
        }
        if (arr[0][2] == arr[1][1] && arr[1][1] == arr[2][0] && arr[0][2] != 0) {
            winner = arr[0][2];
        }


        switch(winner) {
            case 0 -> System.out.println("引き分けまたは勝負中");
            case 1 -> System.out.println("マルの勝ち");
            case 2 -> System.out.println("バツの勝ち");
            default -> System.out.println("無効な試合");
        }
    }

    public static void main(String[] args) {
        new app();
    }

}