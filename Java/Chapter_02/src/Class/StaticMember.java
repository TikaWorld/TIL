package Class;

public class StaticMember {
    public static void main(String[] arg) {
        StaticMemberTest test1 = new StaticMemberTest();
        StaticMemberTest test2 = new StaticMemberTest();

        System.out.println(test1.str1 + " " + test2.str1);
        test1.str1 = "Is Change!";
        System.out.println(test1.str1 + " " + test2.str1);

        if(test1.str1 == test2.str1) {
            System.out.println("Static Same Memory location");
        } else {
            System.out.println("It's Different Static Object!");
        }
        if(test1.str2 == test2.str2) {
            System.out.println("Instance Same Memory location");
        } else {
            System.out.println("It's Different Instance Object!");
        }
    }
}

class StaticMemberTest {
    static String str1 = new String("Test");
    String str2 = new String("Test!");

    static {
        System.out.println("Static Initialize: " + str1);
    }
}