public class ResepMakananRumahan extends Resep {
    public ResepMakananRumahan(String nama, String[] bahan, String[] langkah) {
        super(nama, bahan, langkah);
    }

    @Override
    public String kategori() {
        return "Makanan Rumahan";
    }
}
