import java.util.ArrayList;

public class DatabaseResep {
    public static ArrayList<Resep> getDaftarResep() {
        ArrayList<Resep> daftarResep = new ArrayList<>();

        daftarResep.add(new MainCourse(
                "Nasi Goreng",
                new String[] { "Nasi", "Telur", "Kecap", "Bawang Merah", "Bawang Putih" },
                new String[] { "Panaskan minyak", "Tumis bawang", "Masukkan nasi", "Tambahkan kecap", "Aduk rata" }));

        daftarResep.add(new MainCourse(
                "Soto Ayam",
                new String[] { "Ayam", "Bawang Putih", "Jahe", "Kunyit", "Daun Salam" },
                new String[] { "Rebus ayam", "Tumis bumbu", "Masukkan ayam", "Tambahkan air", "Masak hingga matang" }));

        daftarResep.add(new Dessert(
                "Pancake",
                new String[] { "Tepung Terigu", "Telur", "Susu", "Gula", "Mentega" },
                new String[] { "Campur bahan", "Panaskan wajan", "Tuang adonan", "Masak hingga matang" }));

        daftarResep.add(new MainCourse(
                "Rendang",
                new String[] { "Daging Sapi", "Santan", "Cabai", "Bawang Merah", "Bawang Putih" },
                new String[] { "Haluskan bumbu", "Tumis bumbu", "Masukkan daging", "Tambahkan santan",
                        "Masak hingga kering" }));

        daftarResep.add(new MainCourse(
                "Mie Goreng",
                new String[] { "Mie", "Telur", "Kecap", "Sayur-sayuran", "Bawang Putih" },
                new String[] { "Rebus mie", "Tumis bawang", "Masukkan mie", "Tambahkan kecap", "Aduk rata" }));

        daftarResep.add(new MainCourse(
                "Ayam Bakar",
                new String[] { "Ayam", "Kecap", "Bawang Putih", "Jahe", "Kunyit" },
                new String[] { "Marinasi ayam", "Bakar ayam", "Olesi kecap", "Masak hingga matang" }));

        daftarResep.add(new MainCourse(
                "Gado-Gado",
                new String[] { "Sayur-sayuran", "Tahu", "Tempe", "Bumbu Kacang", "Telur Rebus" },
                new String[] { "Rebus sayuran", "Goreng tahu dan tempe", "Siapkan bumbu kacang", "Campur semuanya" }));

        daftarResep.add(new MainCourse(
                "Bakso",
                new String[] { "Daging Sapi", "Tepung Tapioka", "Bawang Putih", "Merica", "Garam" },
                new String[] { "Campur bahan", "Bentuk bola-bola", "Rebus bola-bola", "Siapkan kuah",
                        "Masukkan bakso ke kuah" }));

        daftarResep.add(new MainCourse(
                "Nasi Uduk",
                new String[] { "Beras", "Santan", "Daun Salam", "Serai", "Garam" },
                new String[] { "Cuci beras", "Masak beras dengan santan", "Tambahkan daun salam dan serai",
                        "Masak hingga matang" }));

        daftarResep.add(new MainCourse(
                "Pempek",
                new String[] { "Ikan Tenggiri", "Tepung Sagu", "Telur", "Bawang Putih", "Garam" },
                new String[] { "Campur bahan", "Bentuk adonan", "Rebus pempek", "Goreng jika diinginkan",
                        "Siapkan cuko" }));

        daftarResep.add(new MainCourse(
                "Gudeg",
                new String[] { "Nangka Muda", "Santan", "Gula Merah", "Daun Salam", "Lengkuas" },
                new String[] { "Rebus nangka", "Masukkan santan", "Tambahkan bumbu", "Masak hingga matang" }));

        daftarResep.add(new Dessert(
                "Martabak Manis",
                new String[] { "Tepung Terigu", "Telur", "Gula", "Susu", "Coklat Meises" },
                new String[] { "Campur bahan", "Tuang ke wajan", "Tambahkan topping", "Masak hingga matang" }));

        daftarResep.add(new Snack(
                "Risoles",
                new String[] { "Kulit Lumpia", "Wortel", "Kentang", "Daging Ayam", "Tepung Panir" },
                new String[] { "Siapkan isian", "Bungkus dengan kulit lumpia", "Celup ke telur",
                        "Gulingkan di tepung panir", "Goreng hingga matang" }));

        daftarResep.add(new Dessert(
                "Klepon",
                new String[] { "Tepung Ketan", "Gula Merah", "Kelapa Parut", "Pandan", "Garam" },
                new String[] { "Campur bahan", "Isi dengan gula merah", "Rebus hingga matang",
                        "Gulingkan di kelapa parut" }));

        daftarResep.add(new Dessert(
                "Donat",
                new String[] { "Tepung Terigu", "Telur", "Gula", "Ragi", "Mentega" },
                new String[] { "Campur bahan", "Diamkan adonan", "Bentuk bulat", "Goreng hingga matang" }));

        daftarResep.add(new Snack(
                "Pastel",
                new String[] { "Tepung Terigu", "Wortel", "Kentang", "Telur", "Daging Ayam" },
                new String[] { "Buat kulit pastel", "Siapkan isian", "Bungkus dengan kulit", "Goreng hingga matang" }));

        daftarResep.add(new Snack(
                "Onde-Onde",
                new String[] { "Tepung Ketan", "Gula", "Kacang Hijau", "Kelapa", "Wijen" },
                new String[] { "Campur bahan kulit", "Isi dengan kacang hijau", "Bentuk bulat", "Gulingkan di wijen",
                        "Goreng hingga matang" }));

        daftarResep.add(new Dessert(
                "Serabi",
                new String[] { "Tepung Beras", "Santan", "Gula", "Ragi", "Daun Pandan" },
                new String[] { "Campur bahan", "Diamkan adonan", "Tuang ke cetakan", "Masak hingga matang" }));

        daftarResep.add(new Dessert(
                "Brownies",
                new String[] { "Tepung Terigu", "Cokelat", "Telur", "Gula", "Mentega" },
                new String[] { "Lelehkan cokelat", "Campur bahan", "Tuang ke loyang", "Panggang hingga matang" }));

        daftarResep.add(new Snack(
                "Pisang Goreng",
                new String[] { "Pisang", "Tepung Terigu", "Gula", "Air", "Minyak Goreng" },
                new String[] { "Campur tepung dan air", "Celupkan pisang", "Goreng hingga matang" }));

        daftarResep.add(new MainCourse(
                "Sate Ayam",
                new String[] { "Ayam", "Kecap", "Bawang Merah", "Cabai", "Kacang Tanah" },
                new String[] { "Potong ayam menjadi dadu", "Tusukkan potongan ayam ke tusuk sate",
                        "Bakar sate hingga matang", "Haluskan kacang tanah dan campur dengan kecap",
                        "Oleskan bumbu kacang pada sate sebelum disajikan" }));

        daftarResep.add(new MainCourse(
                "Capcay",
                new String[] { "Sayuran", "Bawang Putih", "Ayam", "Bakso", "Kecap" },
                new String[] { "Iris sayuran dan bakso", "Tumis bawang putih hingga harum",
                        "Tambahkan potongan ayam dan tumis hingga matang", "Masukkan sayuran dan bakso, aduk rata",
                        "Tambahkan kecap, masak hingga sayuran matang sempurna" }));

        daftarResep.add(new MainCourse(
                "Sop Buntut",
                new String[] { "Buntut Sapi", "Kentang", "Wortel", "Bawang Merah", "Daun Bawang" },
                new String[] { "Rebus buntut sapi hingga empuk", "Tumis bawang merah hingga harum",
                        "Masukkan kentang dan wortel ke dalam rebusan buntut",
                        "Tambahkan bawang tumis, masak hingga kentang empuk", "Sajikan dengan daun bawang cincang" }));

        daftarResep.add(new MainCourse(
                "Opor Ayam",
                new String[] { "Ayam", "Santan", "Bawang Merah", "Bawang Putih", "Kunyit" },
                new String[] { "Tumis bawang merah dan putih hingga harum", "Masukkan kunyit dan aduk rata",
                        "Masukkan potongan ayam, tumis hingga ayam berubah warna",
                        "Tambahkan santan, aduk rata dan masak hingga ayam matang",
                        "Sajikan opor dengan nasi hangat" }));

        daftarResep.add(new MainCourse(
                "Ikan Bakar",
                new String[] { "Ikan", "Kecap", "Bawang Putih", "Jahe", "Cabai" },
                new String[] { "Bersihkan ikan dan lumuri dengan bumbu halus",
                        "Diamkan ikan selama 30 menit agar bumbu meresap", "Bakar ikan di atas bara api hingga matang",
                        "Olesi kecap dan bumbu saat membakar", "Sajikan dengan sambal dan nasi" }));

        daftarResep.add(new MainCourse(
                "Ayam Goreng",
                new String[] { "Ayam", "Bawang Putih", "Kunyit", "Garam", "Minyak Goreng" },
                new String[] { "Lumuri ayam dengan bawang putih, kunyit, dan garam", "Diamkan selama 15 menit",
                        "Panaskan minyak goreng", "Goreng ayam hingga matang dan kecokelatan",
                        "Tiriskan dan sajikan dengan sambal" }));

        daftarResep.add(new MainCourse(
                "Tahu Goreng",
                new String[] { "Tahu", "Bawang Putih", "Garam", "Minyak Goreng", "Kecap" },
                new String[] { "Potong tahu sesuai selera", "Lumuri dengan bawang putih dan garam",
                        "Panaskan minyak goreng", "Goreng tahu hingga kecokelatan", "Sajikan dengan kecap manis" }));

        daftarResep.add(new MainCourse(
                "Sayur Asem",
                new String[] { "Kacang Panjang", "Jagung", "Asam Jawa", "Bawang Merah", "Daun Salam" },
                new String[] { "Didihkan air dalam panci", "Masukkan kacang panjang dan jagung",
                        "Tambahkan asam jawa dan daun salam", "Masak hingga sayuran matang",
                        "Sajikan sayur asem dengan nasi" }));

        daftarResep.add(new MainCourse(
                "Gulai Kambing",
                new String[] { "Daging Kambing", "Santan", "Bawang Merah", "Bawang Putih", "Kunyit" },
                new String[] { "Tumis bumbu hingga harum", "Masukkan potongan daging kambing",
                        "Aduk hingga daging berubah warna", "Tambahkan santan dan masak hingga daging empuk",
                        "Sajikan dengan nasi hangat" }));

        daftarResep.add(new Snack(
                "Kue Cubit",
                new String[] { "Tepung Terigu", "Telur", "Susu", "Gula", "Cokelat Meises" },
                new String[] { "Kocok telur dan gula hingga mengembang", "Tambahkan tepung terigu dan susu, aduk rata",
                        "Panaskan cetakan kue cubit", "Tuang adonan ke cetakan, taburi cokelat meises",
                        "Masak hingga matang dan sajikan" }));

        daftarResep.add(new MainCourse(
                "Lontong Sayur",
                new String[] { "Lontong", "Sayuran", "Santan", "Bawang Merah", "Cabai" },
                new String[] { "Tumis bawang merah dan cabai hingga harum", "Tambahkan santan, aduk rata",
                        "Masukkan sayuran, masak hingga matang", "Sajikan lontong dengan sayur santan" }));

        daftarResep.add(new MainCourse(
                "Ayam Betutu",
                new String[] { "Ayam", "Bumbu Betutu", "Daun Salam", "Santan", "Bawang Putih" },
                new String[] { "Balur ayam dengan bumbu betutu", "Bungkus ayam dengan daun salam",
                        "Panggang ayam dalam oven hingga matang", "Sajikan dengan nasi dan sambal" }));

        daftarResep.add(new MainCourse(
                "Perkedel Kentang",
                new String[] { "Kentang", "Telur", "Bawang Putih", "Garam", "Minyak Goreng" },
                new String[] { "Rebus kentang hingga empuk, lalu haluskan",
                        "Campurkan kentang dengan telur dan bawang putih",
                        "Bentuk adonan perkedel, goreng hingga kecokelatan", "Tiriskan dan sajikan" }));

        daftarResep.add(new Dessert(
                "Es Teler",
                new String[] { "Kelapa Muda", "Alpukat", "Nangka", "Susu Kental Manis", "Es Batu" },
                new String[] { "Potong alpukat dan nangka", "Siapkan kelapa muda di mangkuk",
                        "Tambahkan alpukat dan nangka", "Tuang susu kental manis di atasnya",
                        "Tambahkan es batu dan sajikan" }));

        daftarResep.add(new Dessert(
                "Bubur Kacang Hijau",
                new String[] { "Kacang Hijau", "Gula Merah", "Santan", "Daun Pandan", "Garam" },
                new String[] { "Rebus kacang hijau hingga empuk", "Tambahkan gula merah dan daun pandan",
                        "Tuangkan santan, masak hingga mendidih", "Sajikan dengan tambahan santan kental" }));

        daftarResep.add(new Dessert(
                "Cendol",
                new String[] { "Tepung Beras", "Santan", "Gula Merah", "Es Batu", "Daun Pandan" },
                new String[] { "Buat cendol dari tepung beras", "Siapkan santan dan gula merah cair",
                        "Campur cendol dengan es batu dan santan", "Sajikan dengan siraman gula merah cair" }));

        daftarResep.add(new MainCourse(
                "Ketoprak",
                new String[] { "Lontong", "Tahu", "Bihun", "Bumbu Kacang", "Kerupuk" },
                new String[] { "Goreng tahu hingga kecokelatan", "Rebus bihun hingga empuk", "Siapkan bumbu kacang",
                        "Campur lontong, tahu, dan bihun dengan bumbu kacang", "Sajikan dengan kerupuk di atasnya" }));

        daftarResep.add(new Dessert(
                "Es Dawet",
                new String[] { "Cendol", "Santan", "Gula Merah", "Es Batu", "Daun Pandan" },
                new String[] { "Siapkan santan dan gula merah cair", "Campur cendol dengan es batu dan santan",
                        "Tambahkan siraman gula merah", "Sajikan dingin" }));

        daftarResep.add(new MainCourse(
                "Sayur Lodeh",
                new String[] { "Sayuran", "Santan", "Bawang Merah", "Cabai", "Daun Salam" },
                new String[] { "Tumis bawang merah dan cabai hingga harum", "Masukkan sayuran, aduk rata",
                        "Tambahkan santan dan daun salam", "Masak hingga sayuran matang, sajikan" }));

        daftarResep.add(new MainCourse(
                "Bakwan Jagung",
                new String[] { "Jagung", "Tepung Terigu", "Bawang Merah", "Telur", "Garam" },
                new String[] { "Campur tepung terigu dengan telur dan bumbu", "Tambahkan jagung pipil, aduk rata",
                        "Panaskan minyak, goreng adonan bakwan hingga kecokelatan", "Tiriskan dan sajikan" }));

        daftarResep.add(new Snack(
                "Keripik Singkong",
                new String[] { "Singkong", "Minyak Goreng", "Garam" },
                new String[] { "Kupas singkong", "Iris tipis", "Goreng hingga renyah", "Taburi dengan garam" }));

        daftarResep.add(new Snack(
                "Peyek Kacang",
                new String[] { "Tepung Beras", "Kacang Tanah", "Santai", "Bawang Putih", "Garam" },
                new String[] { "Campur tepung beras dengan santan dan bumbu", "Tambahkan kacang tanah", "Goreng hingga renyah" }));

        daftarResep.add(new Snack(
                "Roti Bakar",
                new String[] { "Roti Tawar", "Mentega", "Selai", "Cokelat Meises", "Keju Parut" },
                new String[] { "Panaskan mentega di wajan", "Bakar roti hingga kecokelatan", "Tambahkan selai atau topping sesuai selera" }));

        daftarResep.add(new Snack(
                "Kue Lumpur",
                new String[] { "Tepung Terigu", "Susu", "Telur", "Kentang", "Gula" },
                new String[] { "Campur bahan hingga halus", "Panaskan cetakan", "Tuang adonan ke cetakan", "Masak hingga matang" }));

        daftarResep.add(new Snack(
                "Cireng",
                new String[] { "Tepung Tapioka", "Bawang Putih", "Garam", "Air Hangat", "Minyak Goreng" },
                new String[] { "Campur tepung dengan bawang putih dan air", "Bentuk adonan", "Goreng hingga matang" }));

        return daftarResep;
    }
}
