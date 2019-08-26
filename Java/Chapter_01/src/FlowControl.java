public class FlowControl {
    public static void main(String[] arg) {
        int num = (int)(Math.random()*6) + 1;

        switch(num){
            case 1:
                System.out.println(1 + num);
                break;
            case 2:
                System.out.println(2 + num);
                break;
            case 3:
                System.out.println(3 + num);
                break;
            case 4:
                System.out.println(4 + num);
                break;
            case 5:
                System.out.println(5 + num);
                break;
            case 6:
                System.out.println(6 + num);
                break;
            default:
                System.out.println("WTF!" + num);
        }

        Outter:for(char upper='A'; upper<='Z'; upper++){
            for(char lower='a'; lower<='z'; lower++){
                System.out.println(upper + "-" + lower);
                if(lower=='g'){
                    continue Outter;
                    //break Outter;
                }
            }
        }

        int[] array = { 0, 1, 2, 3, 4};
        int sum = 0;
        for (int data : array) {
            sum = sum + data;
        }
        System.out.println(sum);
    }
}
