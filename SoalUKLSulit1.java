import java.util.Scanner;

public class SoalUKLSulit1 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        System.out.println("Masukkan jumlah siswa: ");
        int jumlah = input.nextInt();

        double[] nilai = new double[jumlah];
        double total = 0;
        
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan nilai siswa ke-" + (i + 1) + "; ");
            nilai[i] = input.nextDouble();
            total += nilai[i];
        }

        double rataRata = total / jumlah;
        System.out.println("Rata-rata nilai seluruh siswa: " + rataRata);
    }
}
