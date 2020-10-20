import java.util.Scanner;

public class HomeWork3 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int endGame=1;
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        do {
            guess();
            System.out.println("Повторить игру еще раз?\n 1 - да\n 0 - нет");
            endGame = scanner.nextInt();
        }
        while (endGame!=0);
        guessWord(words);
    }

    public static void guess() {
       int i, rightAnswer;
       rightAnswer = (int) (Math.random() * 9);
        for (i=0; i<3; i++){
            System.out.println("Угадайте число от 0 до 9");
            int userAnswer = scanner.nextInt();
            if (userAnswer==rightAnswer){
                System.out.println("Вы угадали!");
                break;
            } else if (userAnswer>rightAnswer){
                System.out.println("Вы ввели слишком большое число(");
            } else{
                System.out.println("Вы ввели слишком маленькое число(");
            }
        }
        if (i==3) {
            System.out.println("Попытки закончились(\n правильный ответ: " + rightAnswer);

        }
    }
    public static void guessWord (String [] arr){
        printStringArr(arr);
        int rightIndex = (int) (Math.random()*(arr.length-1));
        while (true){
            System.out.println("\nУгадайте слово из представленных");
            String userAnswer = scanner.next();
            if (userAnswer.equals(arr[rightIndex])){
                System.out.println("Вы угадали!");
                break;
            } else {
                for (int i = 0; i<arr[rightIndex].length()-1;i++){
                    if (arr[rightIndex].charAt(i) == userAnswer.charAt(i)){
                        System.out.print(arr[rightIndex].charAt(i));
                    } else
                        System.out.print("*");
                }
                System.out.println("********");

            }
        }
    }
    public static void printStringArr (String [] arr){
        for (String i: arr){
            System.out.printf("%s, ", i);
        }
    }
}
