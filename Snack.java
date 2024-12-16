public class Snack extends Resep {
    public Snack(String nama, String[] bahan, String[] langkah) {
        super(nama, bahan, langkah);
    }

    @Override
    public String kategori() {
        return "Makanan Ringan";
    }
}
