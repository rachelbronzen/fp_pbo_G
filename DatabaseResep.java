import java.util.ArrayList;

public class DatabaseResep {
    public static ArrayList<Resep> getDaftarResep() {
        ArrayList<Resep> daftarResep = new ArrayList<>();

        daftarResep.add(new Resep(
            "Nasi Goreng",
            new String[]{"Nasi", "Telur", "Kecap", "Bawang Merah", "Bawang Putih"},
            new String[]{"Panaskan minyak", "Tumis bawang", "Masukkan nasi", "Tambahkan kecap", "Aduk rata"}
        ));

        daftarResep.add(new Resep(
            "Soto Ayam",
            new String[]{"Ayam", "Bawang Putih", "Jahe", "Kunyit", "Daun Salam"},
            new String[]{"Rebus ayam", "Tumis bumbu", "Masukkan ayam", "Tambahkan air", "Masak hingga matang"}
        ));

        daftarResep.add(new Resep(
            "Pancake",
            new String[]{"Tepung Terigu", "Telur", "Susu", "Gula", "Mentega"},
            new String[]{"Campur bahan", "Panaskan wajan", "Tuang adonan", "Masak hingga matang"}
        ));
    
        daftarResep.add(new Resep(
            "Rendang",
            new String[]{"Daging Sapi", "Santan", "Cabai", "Bawang Merah", "Bawang Putih"},
            new String[]{"Haluskan bumbu", "Tumis bumbu", "Masukkan daging", "Tambahkan santan", "Masak hingga kering"}
        ));
        
        daftarResep.add(new Resep(
            "Mie Goreng",
            new String[]{"Mie", "Telur", "Kecap", "Sayur-sayuran", "Bawang Putih"},
            new String[]{"Rebus mie", "Tumis bawang", "Masukkan mie", "Tambahkan kecap", "Aduk rata"}
        ));
        
        daftarResep.add(new Resep(
            "Ayam Bakar",
            new String[]{"Ayam", "Kecap", "Bawang Putih", "Jahe", "Kunyit"},
            new String[]{"Marinasi ayam", "Bakar ayam", "Olesi kecap", "Masak hingga matang"}
        ));
        
        daftarResep.add(new Resep(
            "Gado-Gado",
            new String[]{"Sayur-sayuran", "Tahu", "Tempe", "Bumbu Kacang", "Telur Rebus"},
            new String[]{"Rebus sayuran", "Goreng tahu dan tempe", "Siapkan bumbu kacang", "Campur semuanya"}
        ));
        
        daftarResep.add(new Resep(
            "Bakso",
            new String[]{"Daging Sapi", "Tepung Tapioka", "Bawang Putih", "Merica", "Garam"},
            new String[]{"Campur bahan", "Bentuk bola-bola", "Rebus bola-bola", "Siapkan kuah", "Masukkan bakso ke kuah"}
        ));
        
        daftarResep.add(new Resep(
            "Nasi Uduk",
            new String[]{"Beras", "Santan", "Daun Salam", "Serai", "Garam"},
            new String[]{"Cuci beras", "Masak beras dengan santan", "Tambahkan daun salam dan serai", "Masak hingga matang"}
        ));
        
        daftarResep.add(new Resep(
            "Pempek",
            new String[]{"Ikan Tenggiri", "Tepung Sagu", "Telur", "Bawang Putih", "Garam"},
            new String[]{"Campur bahan", "Bentuk adonan", "Rebus pempek", "Goreng jika diinginkan", "Siapkan cuko"}
        ));
        
        daftarResep.add(new Resep(
            "Gudeg",
            new String[]{"Nangka Muda", "Santan", "Gula Merah", "Daun Salam", "Lengkuas"},
            new String[]{"Rebus nangka", "Masukkan santan", "Tambahkan bumbu", "Masak hingga matang"}
        ));
        
        daftarResep.add(new Resep(
            "Pancake",
            new String[]{"Tepung Terigu", "Telur", "Susu", "Gula", "Mentega"},
            new String[]{"Campur bahan", "Panaskan wajan", "Tuang adonan", "Masak hingga matang"}
        ));
        
        daftarResep.add(new Resep(
            "Martabak Manis",
            new String[]{"Tepung Terigu", "Telur", "Gula", "Susu", "Coklat Meises"},
            new String[]{"Campur bahan", "Tuang ke wajan", "Tambahkan topping", "Masak hingga matang"}
        ));
        
        daftarResep.add(new Resep(
            "Risoles",
            new String[]{"Kulit Lumpia", "Wortel", "Kentang", "Daging Ayam", "Tepung Panir"},
            new String[]{"Siapkan isian", "Bungkus dengan kulit lumpia", "Celup ke telur", "Gulingkan di tepung panir", "Goreng hingga matang"}
        ));
        
        daftarResep.add(new Resep(
            "Klepon",
            new String[]{"Tepung Ketan", "Gula Merah", "Kelapa Parut", "Pandan", "Garam"},
            new String[]{"Campur bahan", "Isi dengan gula merah", "Rebus hingga matang", "Gulingkan di kelapa parut"}
        ));
        
        daftarResep.add(new Resep(
            "Donat",
            new String[]{"Tepung Terigu", "Telur", "Gula", "Ragi", "Mentega"},
            new String[]{"Campur bahan", "Diamkan adonan", "Bentuk bulat", "Goreng hingga matang"}
        ));
        
        daftarResep.add(new Resep(
            "Pastel",
            new String[]{"Tepung Terigu", "Wortel", "Kentang", "Telur", "Daging Ayam"},
            new String[]{"Buat kulit pastel", "Siapkan isian", "Bungkus dengan kulit", "Goreng hingga matang"}
        ));
        
        daftarResep.add(new Resep(
            "Onde-Onde",
            new String[]{"Tepung Ketan", "Gula", "Kacang Hijau", "Kelapa", "Wijen"},
            new String[]{"Campur bahan kulit", "Isi dengan kacang hijau", "Bentuk bulat", "Gulingkan di wijen", "Goreng hingga matang"}
        ));
        
        daftarResep.add(new Resep(
            "Serabi",
            new String[]{"Tepung Beras", "Santan", "Gula", "Ragi", "Daun Pandan"},
            new String[]{"Campur bahan", "Diamkan adonan", "Tuang ke cetakan", "Masak hingga matang"}
        ));
        
        daftarResep.add(new Resep(
            "Brownies",
            new String[]{"Tepung Terigu", "Cokelat", "Telur", "Gula", "Mentega"},
            new String[]{"Lelehkan cokelat", "Campur bahan", "Tuang ke loyang", "Panggang hingga matang"}
        ));
        
        daftarResep.add(new Resep(
            "Pisang Goreng",
            new String[]{"Pisang", "Tepung Terigu", "Gula", "Air", "Minyak Goreng"},
            new String[]{"Campur tepung dan air", "Celupkan pisang", "Goreng hingga matang"}
        ));
        
        return daftarResep;
    }
}
