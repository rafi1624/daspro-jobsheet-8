import java.util.Scanner;

public class rataNilai23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1, j;
        float nilaiMhs, totalNilai = 0,rataNilai;

        while (i<=5) {
            totalNilai = 0;
            System.out.println("Input Nilai Mahasiswa ke " + i);
            for (j=1;j<=5;j++){
                System.out.print("Nilai Ke-" + j + " = ");
                nilaiMhs = sc.nextInt();
                totalNilai += nilaiMhs;
            }
            rataNilai = totalNilai / 5;
        System.out.println("Rata-rata Nilai Mahasiswa ke " + i + " adalah " + rataNilai);
        i++;
        }
        
    }
}