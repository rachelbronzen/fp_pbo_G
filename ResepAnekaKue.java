public class ResepAnekaKue extends Resep {
    public ResepAnekaKue(String nama, String[] bahan, String[] langkah) {
        super(nama, bahan, langkah);
    }

    @Override
    public String kategori() {
        return "Aneka Kue";
    }
}
