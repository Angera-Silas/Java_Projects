import java.util.Scanner;

public class Xmass {
    static int n;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE HEIGHT OF THE TREE");
        n = in.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if((i+j)>=n+1){
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
            }
        }
        for(int i=1;i<=n*0.25;i++){

        }
    }
}
