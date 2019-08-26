public class ReferenceType {
    public static void main(String[] agr){
        String strVar1 = "example";
        String strVar2 = "example";

        if(strVar1 == strVar2) {
            System.out.println("Equal!");
        } else {
            System.out.println("Different");
        }

        if(strVar1.equals(strVar2)){
            System.out.println("Value is Equal!");
        }

        String strVar3 = new String("example");
        String strVar4 = new String("example");

        if(strVar3 == strVar4) {
            System.out.println("Equal!");
        } else {
            System.out.println("Different");
        }

        if(strVar3.equals(strVar4)){
            System.out.println("Value is Equal!");
        }

        String[] strArray = new String[3];
        strArray[0] = "Java";
        strArray[1] = "Java";
        strArray[2] = new String("Java");

        System.out.println(strArray[0] == strArray[1]);
        System.out.println(strArray[0] == strArray[2]);
        System.out.println(strArray[0].equals(strArray[2]));
    }
}
