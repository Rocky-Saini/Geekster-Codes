import java.util.Scanner;

public class evenoddsum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
             int sumeven=0;
             int sumodd=0;
             while(n!=0){
                 int temp=n%10;
                 if(temp%2==0){
                     sumeven=sumeven+temp;
                 }
                 if(temp%2!=0){
                     sumodd+=temp;
                 }
                 n=n/10;
             }
             System.out.println(sumeven + "  " + sumodd);
        }
    }
}
