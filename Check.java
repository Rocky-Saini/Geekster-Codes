import java.util.Scanner;

public class Check 
{
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            char ch=sc.nextLine().charAt(0);
            int c = ch;
          // Here we also use ascii table number asci table number
            if(c>='A' && c<='Z'){
                System.out.println("1");
            }else if(c>='a' && c<='z'){
                System.out.println("0");
            }else{
                System.out.println("-1");
            }
        }

    }
}