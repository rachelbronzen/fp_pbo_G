public class MainCourse extends Resep {
    public MainCourse(String nama, String[] bahan, String[] langkah) {
        super(nama, bahan, langkah);
    }

    @Override
    public String kategori() {
        return "Makanan Utama";
    }
}
