package k17_1.garkavenko;

public class Main {
    // Дана целочисленная прямоугольная матрица. Определить:
    //1)количество столбцов, не содержащих ни одного нулевого элемента.
    //2)сформировать одномерный массив из сумм элементов тех строк, которые содержат хотя бы один положительный элемент
    public static void main(String[] args) {

        Matrix instance = new Matrix(3);
        instance.AutoComplete();
        instance.PrintMatrix();
        System.out.println(instance.FoundCountOfColumnsWithoutZero());
        int[] sumOfPositiveNumbers =  instance.GetSumOfPositiveNumbers();
        Debug(sumOfPositiveNumbers);
        System.out.print("\nЗадание 2.1\n");
        System.out.println( ReplaceMiddle("abajavaj",' '));
    }
    private static void Debug(int[] temp){
        for (int el: temp) {
            System.out.print(el+",");
        }
    }
    public static String ReplaceMiddle(String _text, char symbol)
    {
        String reverse = new StringBuffer(_text).reverse().toString();
        StringBuilder sb = new StringBuilder(reverse);
        if(reverse.length()%2==0)
            sb.insert(reverse.length()/2, symbol);
        else
            sb.replace(reverse.length()/2,reverse.length()/2, String.valueOf(symbol));
        return sb.toString();
    }
}
