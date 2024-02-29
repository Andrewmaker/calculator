 package ru.krista.example;
import java.util.Scanner;


public final class App {
    private App() {
    }


    public static void main(String[] args) {
        System.out.println("Калькулятор\n");
        int num1=0; //объявление переменной, хранящей первое число
        int num2=0; //объявление переменной, хранящей второе число
        
        System.out.println("Введите два числа и операцию между ними через пробел: ");
        Scanner entry = new Scanner(System.in);
        String str = entry.nextLine();
        entry.close();
        String[] members;
        members = str.split(" ");
        try{                                    //Ввод первого числа
            num1 = Integer.parseInt( members[0]);
        } catch (NumberFormatException e){
        System.out.println("Не удалось получить число из "+str);
        }
            
        try{
            num2 = Integer.parseInt(members[2]);
        } catch (NumberFormatException e){
        System.out.println("Не удалось получить число из "+str);
        }
        int result=0; //объявление переменной, хранящей результат операции
        switch(members[1]){
            case "+": result = num1 + num2;
                break;
            case "-": result = num1 - num2;
                break;
            case "*": result = num1 * num2;
                break;
            case "/": 
            try {
                result = num1 / num2;

            } catch (ArithmeticException e) {
                System.out.println("Деление на ноль запрещено");
                return;
              }
                break;
            default: System.out.printf("Ошибка. Вы ввели некорректную операцию");
        }
        System.out.printf("Результат выполнения операции: ");
        System.out.printf(num1 + " " + members[1] + " " + num2 + " = " + result + "\n");

    }
}
