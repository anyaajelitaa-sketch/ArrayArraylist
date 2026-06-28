package bagian2.arraylist;

import java.util.ArrayList;

public class NilaiTerbesar {
    public static void main(String[] args) {

        ArrayList<Integer> angka = new ArrayList<>();

        angka.add(10);
        angka.add(25);
        angka.add(8);
        angka.add(50);
        angka.add(17);

        int terbesar = angka.get(0);

        for (int a : angka) {
            if (a > terbesar) {
                terbesar = a;
            }
        }

        System.out.println("Data angka : " + angka);
        System.out.println("Nilai terbesar : " + terbesar);
    }  
}