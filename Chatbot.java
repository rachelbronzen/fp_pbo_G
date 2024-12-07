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
        String[] kataBingung = { "bingung", "tidak tahu", "rekomendasi", "rekomendasikan" };
        for (String kata : kataBingung) {
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
        output.append("Resep: ").append(resep.getNama()).append("\n");
        output.append("Bahan:\n");
        for (String bahan : resep.getBahan()) {
            output.append("- ").append(bahan).append("\n");
        }
        output.append("Langkah-langkah:\n");
        for (String langkah : resep.getLangkah()) {
            output.append("- ").append(langkah).append("\n");
        }
        return output.toString();
    }

    public String tampilkanKategori() {
        StringBuilder output = new StringBuilder();
        output.append("Berikut daftar makanan yang kami rekomendasikan:\n");
        output.append("\nMakanan Rumahan:\n");
        output.append("- Nasi Goreng\n- Soto Ayam\n- Mie Goreng\n- Capcay\n- Sayur Asem\n");

        output.append("\nAneka Kue:\n");
        output.append("- Pancake\n- Donat\n- Brownies\n- Kue Cubit\n- Martabak Manis\n");

        output.append("\nMakanan Tradisional:\n");
        output.append("- Rendang\n- Gado-Gado\n- Pempek\n- Gudeg\n- Klepon\n");

        return output.toString();
    }
}
