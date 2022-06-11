

import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        System.out.println("Input:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.length() <= 3) {
            System.out.println("throws Exception //т.к. строка не является математической операцией");
            System.exit(1);
        }

        String[] string = input.split(" ",3);

        char str2 = string[1].charAt(0);

        String str8 = string[1];

        String str1 = string[0];
      try {str1 = string[0];
        }
        catch ( ArrayIndexOutOfBoundsException e){
            System.out.println("throws Exception //ввод через пробел");
            System.exit(1);
        }


        String str3 = string[2];

        String str9 = "-";
        String str4 = rima(str1);


        String str5 = rima2(str3);
       try {Integer.parseInt(str5.trim());
        }
        catch (NumberFormatException e){
            System.out.println("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *),операнд 1 до 10 включительно, не более,римские цифры пишутся в верхнем регистре;"
                    );
            System.exit(1);
        }


        String str7 = rima4(str3);
        String str6 = rima3(str1);

        try {Integer.parseInt(str4.trim());
        }
        catch (NumberFormatException e){
            System.out.println("throws Exception //т.к.Ввод числа от 1 до 10 включительно, не более;");
            System.exit(1);}


        int num1 = Integer.parseInt(str4.trim());
           int num2 = Integer.parseInt(str5.trim());

       if (num1<11 && num2<11){}
           else {System.out.println("Ввод числа от 1 до 10 включительно, не более");
           System.exit(1);
           }
        if (str3.equals(str7) || str6.equals("0")) {
        } else {System.out.println("throws Exception //т.к. используются одновременно разные системы счисления");
            System.exit(1);}
        if (str1.equals(str6) || str7.equals("0")) {}
        else {System.out.println("throws Exception //т.к. используются одновременно разные системы счисления");
            System.exit(1);}
                if (num2 == 0) {
            System.out.println("throws Exception //т.к. Делить  на ноль нельзя");
                    System.exit(1);
        }
        int output = calc(num1, num2, str2);

        String output2 = Integer.toString(output);
        String out = toRoman(output);
      if ( str3.equals(str7) & num1<num2 & str8.equalsIgnoreCase(str9)) {
            System.out.println("throws Exception //т.к. в римской системе нет отрицательных чисел");
            System.exit(1);}

        if( str3.equals(str7) & output == 0) {
            System.out.println("throws Exception //результат работы меньше единицы ");
            System.exit(1);}
         if (str1.equals(str6)  ) {System.out.println("Output:");
            System.out.println(out);}
        else {System.out.println("Output:");
            System.out.println(output2);}

    }




    private static String rima4(String str3) {
        String str7;
        switch (str3) {
            case "I": str7= "I";break;
            case "II": str7= "II";break;
            case "III": str7= "III";break;
            case "IV": str7= "IV";break;
            case "V": str7= "V";break;
            case "VI": str7= "VI";break;
            case "VII": str7= "VII";break;
            case "VIII": str7= "VIII";break;
            case "IX": str7= "IX";break;
            case "X": str7= "X";break;
            default:
                str7 = "0";
        }
        return str7;
    }
    private static String rima3(String str1) {
        String str6;
        switch (str1) {
            case "I": str6= "I";break;
            case "II": str6= "II";break;
            case "III": str6= "III";break;
            case "IV": str6= "IV";break;
            case "V": str6= "V";break;
            case "VI": str6= "VI";break;
            case "VII": str6= "VII";break;
            case "VIII": str6= "VIII";break;
            case "IX": str6= "IX";break;
            case "X": str6= "X";break;
            default:
                str6 = "0";
        }
        return str6;
    }
    private static String toRoman(int output) {
        String[] romanNumerals = {"C","XC","L","XL","X","IX","V","IV","I"};
        int[] romanNumeralNums = {100,90,50,40,10, 9, 5,4,1};
        String fi = "";
        for (int i = 0; i < romanNumeralNums.length; i++) {
            int currentNum = output / romanNumeralNums[i];
            if (currentNum == 0) {
                continue;
            }
            for (int j = 0; j < currentNum; j++) {
                fi += romanNumerals[i];
            }
            output = output % romanNumeralNums[i];
        }
        return fi;
    }
    private static String rima(String str1) {
        String str4;
        switch (str1) {
            case "I": str4= "1";break;
            case "II": str4= "2";break;
            case "III": str4= "3";break;
            case "IV": str4= "4";break;
            case "V": str4= "5";break;
            case "VI": str4= "6";break;
            case "VII": str4= "7";break;
            case "VIII": str4= "8";break;
            case "IX": str4= "9";break;
            case "X": str4= "10";break;
            default: str4 = str1;
        }
        return str4;
    }
    private static String rima2(String str3) {
        String str5;
        switch (str3) {
            case "I": str5= "1";break;
            case "II": str5= "2";break;
            case "III": str5= "3";break;
            case "IV": str5= "4";break;
            case "V": str5= "5";break;
            case "VI": str5= "6";break;
            case "VII": str5= "7";break;
            case "VIII": str5= "8";break;
            case "IX": str5= "9";break;
            case "X": str5= "10";break;
            default: str5 = str3;
        }
        return str5;
    }
    private static int calc(int num1, int num2, char str2){
        int output;
        switch (str2) {
            case '+': output = num1 + num2;break;
            case '-': output = num1 - num2;break;
            case '*': output = num1 * num2;break;
            case '/': output = num1 / num2;break;
            default:

                System.out.println("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *);");
                System.exit(1);
                output = calc(num1, num2, str2);//рекурсия

        }
        return output;

    }


}






