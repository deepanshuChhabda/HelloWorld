import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        int t;
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        in.nextLine();
        for(int i=0;i<t;i++){
            String sentence = in.nextLine();
            if(sentence.indexOf("not") != -1) {

                if(sentence.indexOf("not") + 2 == sentence.length() - 1 || sentence.charAt(sentence.indexOf("not") + 3) == ' '){
                    if((sentence.indexOf("not")!=0 && sentence.charAt(sentence.indexOf("not")-1)==' ')||sentence.indexOf("not")==0)
                        System.out.println("Real Fancy");
                }
                else
                    System.out.println("regularly fancy");
            }

        }
    }
}

