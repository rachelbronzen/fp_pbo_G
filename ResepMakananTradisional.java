public class ResepMakananTradisional extends Resep {
    public ResepMakananTradisional(String nama, String[] bahan, String[] langkah) {
        super(nama, bahan, langkah);
    }

    @Override
    public String kategori() {
        return "Makanan Tradisional";
    }
}
