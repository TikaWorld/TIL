public class Calculate {
    public static void main(String[] agr){
        int x = 1;
        int y = 2;
        System.out.printf("%d+%d=%d%n", x, y, x + y);
        CheckOverflow checker = new CheckOverflow();
        checker.checkOverflow();
    }
}

class CheckOverflow {
    public static void checkOverflow(){
        try {
            int result = safeAdd(2000000000, 2000000000);
            System.out.println(result);
        } catch(ArithmeticException e){
            System.out.println("Detect OverFlow!");
        }
    }

    private static int safeAdd(int left, int right) {
        if(right>0){
            if(left>(Integer.MAX_VALUE - right)){
                throw new ArithmeticException("OverFlow!");
            }
        } else {
            if(left>(Integer.MAX_VALUE - right)) {
                throw new ArithmeticException("Overflow!");
            }
        }
        return left + right;
    }
}