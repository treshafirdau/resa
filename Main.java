import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Cek angka genap atau ganjil
        System.out.println("=== 1. GENAP ATAU GANJIL ===");
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Angka Genap");
        } else {
            System.out.println("Angka Ganjil");
        }

        // 2. Cek positif, negatif, atau nol
        System.out.println("\n=== 2. POSITIF, NEGATIF, ATAU NOL ===");
        System.out.print("Masukkan angka: ");
        int bilangan = input.nextInt();

        if (bilangan > 0) {
            System.out.println("Positif");
        } else if (bilangan < 0) {
            System.out.println("Negatif");
        } else {
            System.out.println("Nol");
        }

        // 3. Menentukan grade dan status kelulusan
        System.out.println("\n=== 3. GRADE DAN KELULUSAN ===");
        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        String grade;

        if (nilai >= 85) {
            grade = "A";
        } else if (nilai >= 75) {
            grade = "B";
        } else if (nilai >= 65) {
            grade = "C";
        } else {
            grade = "D";
        }

        String status = (nilai >= 55) ? "Lulus" : "Tidak Lulus";

        System.out.println("Grade: " + grade);
        System.out.println("Status: " + status);

        // 4. Mengubah angka menjadi nama hari
        System.out.println("\n=== 4. NAMA HARI ===");
        System.out.print("Masukkan angka 1-7: ");
        int hari = input.nextInt();

        switch (hari) {
            case 1:
                System.out.println("Senin");
                break;
            case 2:
                System.out.println("Selasa");
                break;
            case 3:
                System.out.println("Rabu");
                break;
            case 4:
                System.out.println("Kamis");
                break;
            case 5:
                System.out.println("Jumat");
                break;
            case 6:
                System.out.println("Sabtu");
                break;
            case 7:
                System.out.println("Minggu");
                break;
            default:
                System.out.println("Angka tidak valid");
        }

        // 5. Kalkulator sederhana
        System.out.println("\n=== 5. KALKULATOR ===");
        System.out.print("Masukkan angka pertama: ");
        double a = input.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /, %): ");
        char operator = input.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        double b = input.nextDouble();

        switch (operator) {
            case '+':
                System.out.println("Hasil: " + (a + b));
                break;
            case '-':
                System.out.println("Hasil: " + (a - b));
                break;
            case '*':
                System.out.println("Hasil: " + (a * b));
                break;
            case '/':
                if (b != 0) {
                    System.out.println("Hasil: " + (a / b));
                } else {
                    System.out.println("Tidak bisa dibagi nol!");
                }
                break;
            case '%':
                if (b != 0) {
                    System.out.println("Hasil: " + (a % b));
                } else {
                    System.out.println("Tidak bisa dibagi nol!");
                }
                break;
            default:
                System.out.println("Operator tidak valid!");
        }

        // 6. Menentukan jenis segitiga
        System.out.println("\n=== 6. JENIS SEGITIGA ===");
        System.out.print("Masukkan sisi pertama: ");
        int sisi1 = input.nextInt();

        System.out.print("Masukkan sisi kedua: ");
        int sisi2 = input.nextInt();

        System.out.print("Masukkan sisi ketiga: ");
        int sisi3 = input.nextInt();

        if (sisi1 <= 0 || sisi2 <= 0 || sisi3 <= 0 ||
            (long) sisi1 + sisi2 <= sisi3 ||
            (long) sisi1 + sisi3 <= sisi2 ||
            (long) sisi2 + sisi3 <= sisi1) {

            System.out.println("Bukan Segitiga");

        } else if (sisi1 == sisi2 && sisi2 == sisi3) {
            System.out.println("Segitiga Sama Sisi");

        } else if (sisi1 == sisi2 || sisi1 == sisi3 ||
                   sisi2 == sisi3) {
            System.out.println("Segitiga Sama Kaki");

        } else {
            System.out.println("Segitiga Sembarang");
        }

        input.close();
    }
}