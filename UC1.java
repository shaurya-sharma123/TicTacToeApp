import java.util.*;

class UC1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][]a = new char[n][n]; 

        for (int i = 0; i < n; i++) {

            for (int j = 0; i < n; i++) {
                a[i][j] = '-';
                System.out.print(a[i][j]);
            }
            System.out.println();
        } 
    }
}
