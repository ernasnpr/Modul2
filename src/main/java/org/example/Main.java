package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Buku a = new Buku();
        Buku b = new Buku();
//        Buku a = new Buku();
//        a.setNilai("Jurassic Park", "Micahel", 21);
//        a.cetakKelayar();
        a = new Buku("Siaga Merah", "Alistair Maclan");
        b = new Buku();
        a.cetakKeLayar();
        b.cetakKeLayar();

        }
}
