package com.sardo.learnjava.kadai;
import java.util.Scanner;
import com.sardo.learnjava.*;

public class Main {
    public static void main(String[] args) {
        //kadai1();
        //kadai2();
        //kadai3();
        //kadai4();
        //kadai5();
        //kadai6();
        kadai7();
    }
    //文字列入力
    public static void kadai1(){
        System.out.println("Kadai 1: Hello World!");
    }
    // 変数
    public static void kadai2(){
        String var1 = "I am Var1";
        System.out.println(var1);

        Integer var2 = 114514;
        System.out.println(var2);

        Boolean var3 = false;
        System.out.println(var3);

        Double var4 = 1.4;
        System.out.println(var4);

        float var5 = 12.3F;
        System.out.println(var5);
    }
    //  変数(四則)
    public static void kadai3(){
        Integer var1 = 1;
        Integer var2 = 3;

        Integer add = var1 + var2;
        Integer sub = var1 - var2;
        Integer plus = var1 * var2;
        Integer division = var1 / var2;

        System.out.println(add);
        System.out.println(sub);
        System.out.println(plus);
        System.out.println(division);

        var1 = add;
        System.out.println(var1);
    }

    // 入力
    public static void kadai4(){
        Scanner sc = new Scanner(System.in); 
        System.out.println("文字列入力:"); 
        String inputString = sc.nextLine();
        System.out.println(inputString); 
        
        System.out.println("数字入力:"); 
        Integer inputInt = sc.nextInt(); 
        System.out.println(inputInt); 
    }
    
    //  メソッド
    public static void kadai5(){
        System.out.println(add(1, 4));
        System.out.println(sub(15, 4));
        System.out.println(plus(15, 4));
        System.out.println(division(15, 3));
        System.out.println(contact("Hello", " World"));
    }

    private static Integer add(Integer int1, Integer int2){
        Integer answer = int1 + int2;
        return answer;
    }
    private static Integer sub(Integer int1, Integer int2){
        Integer answer = int1 - int2;
        return answer;
    }
    private static Integer plus(Integer int1, Integer int2){
        Integer answer = int1 * int2;
        return answer;
    }
    private static Integer division(Integer int1, Integer int2){
        Integer answer = int1 / int2;
        return answer;
    }    
    private static String contact(String str1, String str2){
        String answer = str1 + str2;
        return answer;
    }

    //  共有プロパティ更新
    public static void kadai6(){
        PersonStatic.setName("Hello2");
        System.out.println(PersonStatic.name);
    }

    // インスタンス変数
    public static void kadai7(){
        Person person = new Person();
        person.name = "Sardo";
        Person person2 = new Person();
        person2.name = "Hello";

        System.out.println(person.name);
        System.out.println(person2.name);
    }
}