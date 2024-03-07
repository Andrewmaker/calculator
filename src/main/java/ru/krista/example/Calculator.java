package ru.krista.example;

import java.util.Scanner;

public class Calculator 
{
   private int num1=0; 
   private int num2=0; 
   private String operation; 
    private int result;
    private int check_number(String name){ //проверка и инициализация переменной, отвечающей за первое число
       
        try{                                    

            return Integer.parseInt( name);
        } catch (NumberFormatException e){
        System.out.println("Не удалось получить число");
        System.exit(-5);
        return(-5);
        }
      
    }

    public  void Input_str() { //
        Scanner entry = new Scanner(System.in);
        String str = entry.nextLine();
        entry.close();
        String[] members;
        members = str.split(" ");
        num1 = check_number(members[0]);
        num2 = check_number(members[2]);
      
       operation = members[1];
    }
    private int sum(int num1,int num2){
        return num1+num2;
    }
    private int sub(int num1, int num2){
        return num1-num2;
    }
    private int mult(int num1, int num2){
        return num1*num2;
    }
    private int div(int num1, int num2){

        
        if (num2 ==0) {
            System.out.println("Деление на ноль запрещено");
            System.exit(-1);
            return(-1);
        }
        else {
            return num1/num2;
        }
    }

    public void Calc(){
    switch(operation){
        case "+": result = sum(num1,num2);
            break;
        case "-": result = sub(num1,num2);
            break;
        case "*": result = mult(num1,num2);
            break;
        case "/": result = div(num1,num2);
            break;
        default: System.out.println("Не удалось найти операцию");
        System.exit(-1);
    }
    }  
     public void Conclus(){
        System.out.printf("Результат выполнения операции: "+result);
    }  
}
