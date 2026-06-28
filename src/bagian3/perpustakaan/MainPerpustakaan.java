package bagian3.perpustakaan;

public class MainPerpustakaan {

    public static void main(String[] args) {

        // Membuat objek perpustakaan
        Perpustakaan perpustakaan = new Perpustakaan();

        // Menambahkan buku ke perpustakaan
        perpustakaan.tambahBuku(new Buku("Laskar Pelangi", "Andrea Hirata", 2005));
        perpustakaan.tambahBuku(new Buku("Bumi", "Tere Liye", 2014));
        perpustakaan.tambahBuku(new Buku("Negeri 5 Menara", "Ahmad Fuadi", 2009));
        perpustakaan.tambahBuku(new Buku("Pulang", "Tere Liye", 2015));

        // Menampilkan koleksi
        perpustakaan.tampilkanKoleksi();

        // Meminjam buku
        System.out.println("\n=== Meminjam Buku ===");
        perpustakaan.pinjamBuku("Bumi");
        perpustakaan.pinjamBuku("Bumi"); // Dicoba pinjam lagi

        // Menampilkan koleksi setelah dipinjam
        System.out.println("\n=== Koleksi Setelah Dipinjam ===");
        perpustakaan.tampilkanKoleksi();

        // Mengembalikan buku
        System.out.println("\n=== Mengembalikan Buku ===");
        perpustakaan.kembalikanBuku("Bumi");

        // Menampilkan koleksi setelah dikembalikan
        System.out.println("\n=== Koleksi Setelah Dikembalikan ===");
        perpustakaan.tampilkanKoleksi();

        // Menampilkan jumlah buku yang tersedia
        System.out.println("\nJumlah buku tersedia: "
                + perpustakaan.jumlahTersedia());

        // Mencari buku berdasarkan penulis
        System.out.println();
        perpustakaan.cariPenulis("Tere Liye");
    }
}