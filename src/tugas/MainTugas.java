package tugas;

public class MainTugas {

    public static void main(String[] args) {

        String[] mataKuliah = {
            "Pemrograman Berbasis Objek",
            "Data Mining",
            "Basis Data"
        };

        System.out.println("== Daftar Mata Kuliah ==");

        for (String mk : mataKuliah) {
            System.out.println("- " + mk);
        }

        System.out.println();

        KelasKuliah kelas = new KelasKuliah();

        kelas.tambahMahasiswa(new Mahasiswa("Kanya", "2410010637", 85));
        kelas.tambahMahasiswa(new Mahasiswa("Norhayati", "2410010025", 75));
        kelas.tambahMahasiswa(new Mahasiswa("Zahra", "2410010637", 58));
        kelas.tambahMahasiswa(new Mahasiswa("Citra", "2410010503", 90));
        kelas.tambahMahasiswa(new Mahasiswa("Doni", "2410010504", 55));

        kelas.tampilkanSemua();

        System.out.println();
        System.out.println("Rata-rata nilai : " + kelas.hitungRataRata());
        System.out.println("Jumlah lulus    : " + kelas.jumlahLulus());

        System.out.println();

        kelas.tambahMahasiswa(new Mahasiswa("Nadia", "2410010505", 88));

        System.out.println("Setelah menambah mahasiswa baru:");
        kelas.tampilkanSemua();
        System.out.println("Jumlah data terbaru: " + kelas.jumlahData());
    }
}