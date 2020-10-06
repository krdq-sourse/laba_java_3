package k17_1.garkavenko;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Matrix instance = new Matrix(3);
        instance.AutoComplete();
        instance.PrintMatrix();
        System.out.println(instance.FoundCountOfColumnsWithoutZero());
        int[] sumOfPositiveNumbers = instance.GetSumOfPositiveNumbers();
        Debug(sumOfPositiveNumbers);
        System.out.print("\nЗадание 2.1\n");
        Scanner in = new Scanner(System.in);
        System.out.print("Ведите текст: ");
        String text = in.next();
        System.out.print("Ведите символ: ");
        char symbol = in.next().charAt(0);
        in.nextLine();
        System.out.println(ReplaceMiddle(text, symbol));
        System.out.print("\nЗадание 2.2\n");
        System.out.print("Ведите текст: ");
        text = in.nextLine();
        System.out.print("Ведите слово для поиска: ");
        String word = in.next();
        String[] arr = text.split("[.?!]+");
        for (String s : arr) {
            if (IsWordFind(s.toLowerCase(), word))
                System.out.println(s.trim());
        }
    }


    private static void Debug(int[] temp) {
        for (int el : temp) {
            System.out.print(el + ",");
        }
    }

    public static String ReplaceMiddle(String _text, char symbol) {
        String reverse = new StringBuffer(_text).reverse().toString();
        StringBuilder sb = new StringBuilder(reverse);
        if (reverse.length() % 2 == 0)
            sb.insert(reverse.length() / 2, symbol);
        else
            sb.replace(reverse.length() / 2, reverse.length() / 2, String.valueOf(symbol));
        return sb.toString();
    }

    public static boolean IsWordFind(String s, String w) {
        int p = 0;
        while ((p = s.indexOf(w, p)) != -1) {
            if ((p == 0 || !Character.isLetter(s.charAt(p - 1))) &&
                    (p + w.length() >= s.length() || !Character.isLetter(s.charAt(p + w.length()))))
                return true;
            p += w.length();
        }
        return false;
    }

//    public static String ExUra(String _text, char symbol) {
//        StringBuilder sb = new StringBuilder(_text);
//        int index = sb.indexOf(String.valueOf('a'));
//        sb.replace(index,index, String.valueOf(symbol));
//        return sb.toString();
//    }

}
