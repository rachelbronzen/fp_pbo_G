import java.util.ArrayList;

public class Chatbot {
    private ArrayList<Resep> daftarResep;

    public Chatbot() {
        daftarResep = new ArrayList<>();
    }

    public void tambahResep(Resep resep) {
        daftarResep.add(resep);
    }

    public String ekstrakNamaMakanan(String input) {
        for (Resep resep : daftarResep) {
            if (input.toLowerCase().contains(resep.getNama().toLowerCase())) {
                return resep.getNama();
            }
        }
        return null;
    }

    public Resep cariResep(String nama) {
        for (Resep resep : daftarResep) {
            if (resep.getNama().equalsIgnoreCase(nama)) {
                return resep;
            }
        }
        return null;
    }

    public boolean periksaKataBingung(String input) {
        String[] kataBingung = { "bingung", "tidak tahu", "rekomendasi", "rekomendasikan", "ok" };
        for (String kata : kataBingung) {
            if (input.toLowerCase().contains(kata)) {
                return true;
            }
        }
        return false;
    }

    public boolean periksaKataHello(String input) {
        String[] kataHello = { "halo", "hai", "hi", "hello", "selamat pagi", "selamat siang", "selamat sore",
                "selamat malam", "test" };
        for (String kata : kataHello) {
            if (input.toLowerCase().contains(kata)) {
                return true;
            }
        }
        return false;
    }

    public boolean periksaKataPenutup(String input) {
        String[] kataPenutup = { "terima kasih", "selesai", "keluar", "exit", "thank", "done", "bye", "kasih" };
        for (String kata : kataPenutup) {
            if (input.toLowerCase().contains(kata)) {
                return true;
            }
        }
        return false;
    }

    public String tampilkanResep(Resep resep) {
        if (resep == null) {
            return "Maaf, resep belum tersedia!";
        }

        StringBuilder output = new StringBuilder();
        output.append("Resep: ").append(resep.getNama()).append("<br>");
        output.append("Kategori: ").append(resep.kategori()).append("<br>");
        output.append("Bahan:<br>");
        for (String bahan : resep.getBahan()) {
            output.append("- ").append(bahan).append("<br>");
        }
        output.append("Langkah-langkah:<br>");
        for (String langkah : resep.getLangkah()) {
            output.append("- ").append(langkah).append("<br>");
        }
        return output.toString();
    }

    public String tampilkanKategori() {
        StringBuilder output = new StringBuilder();
        output.append("Berikut daftar makanan yang kami rekomendasikan:<br>");
        output.append("<br>Makanan Utama:<br>");
        output.append("- Nasi Goreng<br>- Soto Ayam<br>- Mie Goreng<br>- Capcay<br>- Sayur Asem<br>");

        output.append("<br>Makanan Penutup:<br>");
        output.append("- Pancake<br>- Donat<br>- Brownies<br>- Es Teler<br>- Martabak Manis<br>");

        output.append("<br>Makanan Ringan:<br>");
        output.append("- Risoles<br>- Pastel<br>- Cireng<br>- Pisang Goreng<br>- Roti Bakar<br>");

        return output.toString();
    }
}
