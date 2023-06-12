import java.util.Random;

public class hw1{
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(1000);
        System.out.println(n);
        int[] numbers = new int[n];
        for (int i=0;i<n;i++) 
        numbers[i]=r.nextInt(100000);
        for (int i=0; i<n; i++){
            System.out.print("Делители "+numbers[i]+": ");
            for (int j=1; j<=numbers[i];j++){
                if (numbers[i]%j==0) System.out.print(j+" ");

            }
        System.out.println();
        }
    }
}

// O(N*Ai) Ai - максимальное из Ai