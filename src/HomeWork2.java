
import java.util.Scanner;

public class HomeWork2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 10, M =10, arr1[], arr2[], arr4 [][];
        int arr3 [] = {1,5,3,2,11,4,5,2,4,8,9,1};
        int arr6 [] = {2,2,2,1,2,2,10,1};
        float arr5 [];
        arr1 = new int [N];
        arr2 = new int [8];
        arr4 = new int[M][M];
        arr5 = new float [N];
        for (int i = 0; i<arr1.length; i++){
            arr1[i] = ((int) (Math.random()*10))%2;
        }
        printArray(arr1);
        for (int i =0; i<arr1.length; i++){
            if (arr1[i] % 2 == 1){
                arr1[i] = 0;
            } else {
                arr1[i] = 1;
            }
        }
        printArray(arr1);
        for (int i = 0; i<arr2.length; i++){
            arr2[i] += 3*i;
        }
        printArray(arr2);
        for (int i=0; i<arr3.length; i++){
            if (arr3[i] < 6){
                arr3[i] *=2;
            }
        }
        printArray(arr3);
        for (int i = 0; i<arr4.length; i++){
            for (int j =0; j<arr4[i].length; j++){
                 if (i==j || (i+j == arr4.length -1)){
                     arr4[i][j] = 1;
                 }
                System.out.printf("%3d", arr4[i][j]);
            }
            System.out.println();
        }
        float min = 1000, max = -1000;
        for (int i =0; i< arr5.length; i++){
            arr5[i] = (float) (Math.random()*1000);
            System.out.printf("%.2f%s", arr5[i], " ");
            if (arr5[i]>max){
                max = arr5[i];
            }
            if (arr5[i]<min){
                min = arr5[i];
            }
        }
        System.out.printf("\n%s%.2f%s%.2f\n", "Минимум: ", min, " Максимум: ", max);
        boolean method6 = chekBalance(arr6);
        System.out.println(method6);
         int a[] = {2, 13, 45, 3, 8, 10, 7};
         shiftArr(a, -2);
         printArray(a);
   }

    public static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static boolean chekBalance (int arr[]){
        int sumLeft = 0, sumRight = 0;
        for (int i =arr.length-1; i>0; i--){
            sumRight += arr[i];
            for (int j =0; j<i; j++){
                sumLeft +=arr[j];
            }
            if (sumLeft == sumRight){
                return true;
            }
            sumLeft = 0;
        }
        return false;
    }
    public static void shiftArr(int arr[], int n) {
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int buf = arr[0];
                arr[0] = arr[arr.length - 1];
                for (int j = 1; j < arr.length - 1; j++) {
                    arr[arr.length - j] = arr[arr.length - j - 1];
                }
                arr[1] = buf;
            }
        }
        if (n < 0) {
            for (int i = 0; i > n; i--) {
                int buf = arr[arr.length - 1];
                arr[arr.length - 1] = arr[0];
                for (int j =1; j < arr.length -1; j++){
                    arr[j-1] = arr[j];
                }
                arr[arr.length-2] = buf;
            }
        }
    }

    }
