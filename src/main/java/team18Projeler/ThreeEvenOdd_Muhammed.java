package team18Projeler;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeEvenOdd_Muhammed {
    public static void main(String[] args) {
        /*
          Scanner input =new Scanner(System.in);


    int arr[]=new int[4];
    int idx=0;
    int elemanS=0;
        while (elemanS<4) {
        System.out.println(idx  +1+ ". Elemanı giriniz");
        arr[idx] = input.nextInt();
        idx++;
        elemanS++;
    }
        System.out.println(Arrays.toString(arr));
    int counter=0;

        for (int w:arr){
        if (w%2==0){
            counter++;
        }

    }
        if (counter>2 || counter<2){
        System.out.println(true);
    }else System.out.println(false);


}

}
         */
        Scanner input =new Scanner(System.in);


        int arr[]=new int[4];
        int idx=0;
        int elemanS=0;
        while (elemanS<4) {
            System.out.println(idx  +1+ ". Elemanı giriniz");
            arr[idx] = input.nextInt();
            idx++;
            elemanS++;
        }
        System.out.println(Arrays.toString(arr));
        int counter=0;

        for (int w:arr){
            if (w%2==0){
                counter++;
            }

        }
        if (counter>2 || counter<2){
            System.out.println(true);
        }else {
            System.out.println(false);
        }}


    }



