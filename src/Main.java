import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

                int i,j,n,ñ;
                System.out.print ("Input number of rows for the first diamond: ");
                Scanner in = new Scanner(System.in);
                n = in.nextInt();

                for(i=0;i<=n;i++)
                {
                    for(j=1;j<=n-i;j++)
                        System.out.print(" ");
                    for(j=1;j<=2*i-1;j++)
                        System.out.print("*");
                    System.out.print("\n");
                }

                for(i=n-1;i>=1;i--)
                {
                    for(j=1;j<=n-i;j++)
                        System.out.print(" ");
                    for(j=1;j<=2*i-1;j++)
                        System.out.print("*");
                    System.out.print("\n");
                }

        System.out.print ("Input number of rows for the second diamond: ");
        ñ = in.nextInt();

        for(i=0;i<=n;i++)
        {
            for(j=1;j<=2*i-1;j++)
                System.out.print("*");
            System.out.print("\n");
        }

        for(i=n-1;i>=1;i--)
        {
            for(j=1;j<=n-i;j++)
                System.out.print(" ");
            for(j=1;j<=2*i-1;j++)
                System.out.print("*");
            System.out.print("\n");
        }
        System.out.print("END OF THIS PROGRAM");


    }
}




