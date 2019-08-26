public class Casting {
    public static void main(String[] agr){
        int num1 = 123456780;
        int num2 = 123456780;

        float num3 = num2;
        num2 = (int) num3;

        int result = num1 - num2;
        System.out.printf("%d-%d(%f)=%d%n", num1, num2, num3, result);
    }
}
