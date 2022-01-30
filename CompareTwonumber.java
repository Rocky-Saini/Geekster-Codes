import java.util.Scanner;

public class CompareTwonumber {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try(Scanner sc = new Scanner(System.in)) {
        int a= sc.nextInt();
        int b=sc.nextInt();
        if(a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
    }
}