import java.util.Scanner;
public class pag {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n=0;
        int p=0;
        n = reader.nextInt(); reader.nextLine();
        int resto=p%2;
        while (n-- !=0){
            p = reader.nextInt();
            System.out.println(p % 2 == 0 ? p + 1 : p - 1);
        }
    }
}
