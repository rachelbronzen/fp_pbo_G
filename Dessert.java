public class Dessert extends Resep {
    public Dessert(String nama, String[] bahan, String[] langkah) {
        super(nama, bahan, langkah);
    }

    @Override
    public String kategori() {
        return "Makanan Penutup";
    }
}
