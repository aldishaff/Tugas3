public class HitungDiskon {
    public static void main(String[] args) {
        // Harga awal barang
        double hargaAwal = 100.0;

        // Besaran diskon dalam persentase
        double diskonPersentase = 10.0; // Misalnya, 10% diskon

        // Menghitung harga setelah diskon
        double diskon = (diskonPersentase / 100.0) * hargaAwal;
        double hargaSetelahDiskon = hargaAwal - diskon;

        // Menampilkan hasil perhitungan
        System.out.println("Harga awal: $" + hargaAwal);
        System.out.println("Diskon (" + diskonPersentase + "%): $" + diskon);
        System.out.println("Harga setelah diskon: $" + hargaSetelahDiskon);
    }
}

