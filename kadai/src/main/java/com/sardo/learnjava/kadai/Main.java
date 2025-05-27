package com.sardo.learnjava.kadai;

import java.util.Objects;
import java.util.Scanner;

import com.sardo.learnjava.Person;

public class Main {
    public static void main(String[] args) {
        // kadai1();
        // kadai2();
        // kadai3();
        // kadai4();
        // kadai5();
        // kadai6();
        // kadai7();
        // kadai8();
        // kadai9();
        // kadai10();
        // kadai11();
        kadai12();
    }

    // 文字列入力
    public static void kadai1() {
        System.out.println("Kadai 1: Hello World!");
    }

    // 変数
    public static void kadai2() {
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

    // 変数(四則)
    public static void kadai3() {
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
    public static void kadai4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("文字列入力:");
        String inputString = sc.nextLine();
        System.out.println(inputString);

        System.out.println("数字入力:");
        Integer inputInt = sc.nextInt();
        System.out.println(inputInt);
    }

    // メソッド
    public static void kadai5() {
        System.out.println(add(1, 4));
        System.out.println(sub(15, 4));
        System.out.println(plus(15, 4));
        System.out.println(division(15, 3));
        System.out.println(contact("Hello", " World"));
    }

    private static Integer add(Integer int1, Integer int2) {
        Integer answer = int1 + int2;
        return answer;
    }

    private static Integer sub(Integer int1, Integer int2) {
        Integer answer = int1 - int2;
        return answer;
    }

    private static Integer plus(Integer int1, Integer int2) {
        Integer answer = int1 * int2;
        return answer;
    }

    private static Integer division(Integer int1, Integer int2) {
        Integer answer = int1 / int2;
        return answer;
    }

    private static String contact(String str1, String str2) {
        String answer = str1 + str2;
        return answer;
    }

    // 共有プロパティ更新
    public static void kadai6() {
        PersonStatic.setName("Hello2");
        System.out.println(PersonStatic.name);
    }

    // インスタンス変数- クラスフィールド更新
    public static void kadai7() {
        Person person = new Person();
        person.name = "Sardo";
        Person person2 = new Person();
        person2.name = "Hello";

        System.out.println(person.name);
        System.out.println(person2.name);
    }

    // IF
    public static void kadai8() {
        // 条件ごとに変数初期化値を変更する構文作成

        /*
         * 数値の大小を比較するif文を作成
         * ・1つ目の変数が2つ目の変数より小さい場合
         * →「小さい」と出力する
         */
        int bigger = 10;
        int smaller = 5;
        if (smaller < bigger) {
            System.out.println("小さい");
        }

        /*
         * 文字列が一致するかどうかを判定するif else文の作成
         * ・文字列が一致する場合
         * →「文字列は一致しています」と出力する
         * ・それ以外の場合
         * →「文字列は一致していません」と出力する
         */

        String same1 = "Same";
        String same2 = "Same";

        String different1 = "different";
        String different2 = "different2";

        if (same1.equals(same2)) {
            System.out.println("文字列は一致しています");
        } else {
            System.out.println("文字列は一致していません");
        }

        if (different1.equals(different2)) {
            System.out.println("文字列は一致しています");
        } else {
            System.out.println("文字列は一致していません");
        }

        /*
         * 文字列の桁数が5ケタ以上かどうかを判定するif文の作成
         * ・5ケタ以上の場合
         * →「文字列は4ケタ以内で初期化してください」と出力する
         */

        String tooLong = "abcde";

        if (tooLong.length() >= 5) {
            System.out.println("文字列は4ケタ以内で初期化してください");
        }

        /*
         * 文字列がnull、空文字かどうかを判定するif else文の作成
         * ・変数txtがnullの場合
         * →「nullです」と出力する
         * ・変数txtが空文字の場合
         * →「空文字です」と出力する
         * ・それ以外の場合
         * →「null、空文字ではありません」と出力する
         */

        String inputString = "";

        if (inputString.isEmpty()) {
            System.out.println("空文字です");
        } else if (Objects.isNull(inputString)) {
            System.out.println("nullです");
        } else {
            System.out.println("null、空文字ではありません");
        }
    }

    public static void kadai9() {
        int score = 30;
        String result = score > 70 ? "OK" : "NG";
        System.out.println(result); // OK
    }

    public static void kadai10() {
        String gender = "female";
        String result = "";
        switch (gender) {
            case "female":
                result = "女です";
                System.out.println(result);
                break;

            default:
                result = "男です";
                System.out.println(result);
        }
    }

    public static void kadai11() {
        String result = checkSwitch(true);
        System.out.println(result);
    }

    public static void kadai12() {
        int[] arrayNum = {1, 2, 3};
        int [] newArraryNum = new int[3];
        newArraryNum[0] = 75;
        newArraryNum[1] = 88;
        newArraryNum[2] = 82;

        System.out.println(arrayNum[1]);
        System.out.println(newArraryNum[1]);
    }

    private static String checkSwitch(Boolean switchStatus) {
        if (switchStatus) {
            return "On";
        } else {
            return "Off";
        }
    }
}