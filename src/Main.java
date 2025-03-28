import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {



    public static void main(String[] args) {

       //methodExempel();
        //stringExempel();
        //listExempel();
        addStufftoListWithScanner();




    }

    public static void addStufftoListWithScanner(){

        List<String> myList = new ArrayList<>();

        while(true){
            String input = getInput();
            if(input.equals("quit")){
                break;
            }
            myList.add(input);

        }

        System.out.println("myList = " + myList);
    }

    public static void listExempel(){
        String[] stringArray = {"hej","på","dig"};

        List<String> stringList = Arrays.stream(stringArray).collect(Collectors.toList());
        List<Integer> integerList = new ArrayList<>();

        integerList.add(1);
        integerList.add(2);
        integerList.add(3);



        stringList.add("String");
        stringList.add("text");
        stringList.add("en till sträng");

        //stringList.remove(0);
        stringList.set(1,"ny sträng");


        System.out.println("stringArray = " + stringArray);
        System.out.println("stringList = " + stringList);
        System.out.println("integerList = " + integerList);
    }

    private static void stringExempel(){
        boolean isRunning = true;
        while(true){
            String text = getInput();
            int index = getIntInput();

            if(text.equals("quit")){
                //isRunning = false;
                break;
            }
            //printStringChars(text);
            //System.out.println(getSecondWord(text));
            System.out.println(getWordAtPosition(text,index));
        }
    }

    public static String getWordAtPosition(String text, int position){
        String[] wordsInText = text.split(" ");

        String firstWord = wordsInText[position];
        return firstWord;
    }

    public static String getSecondWord(String text){
        String[] wordsInText = text.split(" ");

        String firstWord = wordsInText[wordsInText.length -1];
        return firstWord;
    }

    private static void printStringChars(String text) {
        for (int i = 0; i < text.length(); i++){
            System.out.println(text.charAt(i));
        }
    }
    private static int getIntInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("skriv ett heltal:");
        int input = scanner.nextInt();
        return input;
    }

    private static String getInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("skriv en mening:");
        String input = scanner.nextLine();
        return input;
    }

    public static void methodExempel(){
        int a = 10;
        int b = 20;

//        int result = addNumbers(a,b);
//        int result2 = addNumbers(a,b);

//        System.out.println(result);
//        System.out.println(result2);


        System.out.println(divideNumbers(a,b));
    }

    public static double divideNumbers(int numerator, int denominator){
        double result = (double)numerator/ (double)denominator;
        return result;

    }

    public static int addNumbers(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;

    }
//overloading
    public static double addNumbers(double firstNumber, double secondNumber){
        return firstNumber + secondNumber;

    }
}