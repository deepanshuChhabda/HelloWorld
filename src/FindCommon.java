
import java.util.Scanner;

class FindCommon {
    public static void main(String[] args) {
        int t = 0;
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        in.nextLine();
        try {
        while (t-- > 0) {
            String sen = in.nextLine();
            int len = sen.length();
            boolean k = false;
                if (sen.charAt(0) == 'n' && sen.charAt(1) == 'o' && sen.charAt(2) == 't' && sen.charAt(3) == ' ')
                    System.out.println("Real Fancy");
                else {
                    for (int i = 1; i < len - 3; ) {
                        try {
                            if (sen.charAt(i++) == ' ' && sen.charAt(i++) == 'n' && sen.charAt(i++) == 'o' && sen.charAt(i++) == 't' && sen.charAt(i) == ' ') {
                                System.out.println("Real Fancy");
                                k = true;
                                break;
                            }
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("Real Fancy");
                            k = true;
                            break;
                        }

                    }
                    if (!k) System.out.println("regularly fancy");
                }
            }
        }catch (Exception e) {
            return;
        }

    }
}
