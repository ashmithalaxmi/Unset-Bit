import java.util.Scanner;

public class UnsetBit {
    static int unset(int a,int b){
        if((a & (1<<(b))) !=0){
            a= a & ~(1<<(b));

        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int A= sc.nextInt();
        int B= sc.nextInt();

        System.out.println(unset(A,B));
    }
}
