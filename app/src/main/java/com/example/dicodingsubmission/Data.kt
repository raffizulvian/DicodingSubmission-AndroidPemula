package com.example.dicodingsubmission

object Data {
    private val campusNames = arrayOf(
        "Institut Teknologi Bandung",
        "Universitas Indonesia",
        "Universitas Gadjah Mada",
        "Universitas Airlangga",
        "Institut Teknologi Sepuluh Nopember",
        "Universitas Padjajaran",
        "Universitas Pendidikan Indonesia",
        "Institut Pertanian Bogor",
        "Universitas Brawijaya",
        "Universitas Diponegoro")

    private val campusDetails = arrayOf("Institut Teknologi Bandung adalah sebuah perguruan tinggi negeri yang berkedudukan di Kota Bandung. Nama ITB diresmikan pada tanggal 2 Maret 1959. Sejak tanggal 14 Oktober 2013 ITB menjadi Perguruan Tinggi Negeri Badan Hukum (PTN BH) yang memiliki otonomi pengelolaan dalam akademik dan nonakademik. ITB telah memiliki 27 program studi yang terakreditasi secara internasional (sebelas dari ABET, sebelas dari ASIIN).\n\nKampus utama ITB saat ini merupakan lokasi dari sekolah tinggi teknik pertama di Indonesia sekaligus lembaga pendidikan tinggi pertama di Hindia Belanda. Walaupun masing-masing institusi pendidikan tinggi yang mengawali ITB memiliki karakteristik dan misi masing-masing, semuanya memberikan pengaruh dalam perkembangan yang menuju pada pendirian ITB.\n\nRektor ITB saat ini adalah Prof. Ir. N. R. Reini Djuhraeni Wirahadikusuma, MSCE, PhD, untuk masa jabatan 2020–2025.",
        "Universitas Indonesia disingkat sebagai UI, adalah sebuah perguruan tinggi di Indonesia. Kampus utamanya terletak di bagian Utara dari Depok, Jawa Barat tepat di perbatasan antara Depok dengan wilayah Jakarta Selatan, dan kampus utama lainnya terdapat di daerah Salemba di Jakarta Pusat. Universitas Indonesia adalah kampus modern, komprehensif, terbuka, multibudaya, dan humanis yang mencakup disiplin ilmu yang luas. Telah menghasilkan lebih dari 400.000 alumni. Secara umum dianggap sebagai salah satu dari tiga perguruan tinggi papan atas di Indonesia bersama dengan Universitas Gadjah Mada dan Institut Teknologi Bandung. Cikal-bakal terbentuknya Universitas Indonesia adalah ketika pemerintah kolonial Belanda mendirikan sebuah sekolah yang bertujuan untuk menghasilkan asisten dokter tambahan yang memegang sertifikat untuk melakukan perawatan-perawatan tingkat dasar serta mendapatkan gelar Dokter Jawa (Javanese doctor). Secara resmi Universitas Indonesia memulai kegiatannya pada 2 Februari 1950 dengan presiden (saat ini disebut rektor) pertamanya Ir. R.M. Pandji Soerachman Tjokroadisoerio. Kantor Presiden Universitas Indonesia mula-mula berkedudukan di Jakarta, di gedung Fakultas Kedokteran di Jl Salemba Raya no. 6, kemudian dipindahkan ke Jl. Salemba Raya no. 4, Jakarta. Tanggal 2 Februari 1950 dijadikan hari kelahiran Universitas Indonesia.",
        "Universitas Gadjah Mada merupakan universitas negeri di Indonesia yang didirikan oleh Pemerintah Republik Indonesia pada tanggal 19 Desember 1949 berdasarkan Peraturan Pemerintah Nomor 23 Tahun 1949 tentang Peraturan Tentang Penggabungan Perguruan Tinggi Menjadi Universiteit tanggal 16 Desember 1949. Kampus UGM yang terletak di Yogyakarta merupakan universitas pertama yang didirikan oleh Pemerintah Republik Indonesia setelah Indonesia merdeka. Pada saat didirikan, Universitas Gadjah Mada hanya memiliki enam fakultas, sekarang memiliki 18 Fakultas dan dua Sekolah yaitu Sekolah Vokasi dan Sekolah Pascasarjana (dahulu bernama Program Pascasarjana), dan lebih dari 100 Program Studi untuk S2, S3, dan Spesialis. Universitas Gadjah Mada berlokasi di Kampus Bulaksumur, Yogyakarta. Sebagian besar fakultas dalam lingkungan Universitas Gadjah Mada terdiri atas beberapa jurusan/bagian dan atau program studi. Kegiatan Universitas Gadjah Mada dituangkan dalam bentuk Tri Dharma Perguruan Tinggi yang terdiri atas pendidikan dan pengajaran, penelitian, dan pengabdian kepada masyarakat.",
        "Universitas Airlangga adalah sebuah perguruan tinggi negeri yang terletak di Surabaya, Jawa Timur. Universitas ini didirikan tanggal 10 November 1954 bertepatan dengan hari pahlawan yang ke-9. Berdasarkan data 30 September 2015, terdapat 38.047 mahasiswa yang terdaftar di Unair.",
        "Institut Teknologi Sepuluh Nopember adalah perguruan tinggi negeri yang terletak di Surabaya. ITS awalnya didirikan oleh Yayasan Perguruan Tinggi Teknik (YPTT) yang diketuai oleh dr. Angka Nitisastro pada tanggal 10 November 1957.\n\nDies Natalis ITS pertama adalah 10 November 1960, sementara nama ITS mulai digunakan dalam Peraturan Pemerintah No. 9 tahun 1961 (ditetapkan tanggal 23 Maret 1961). Dalam visi awal, ITS ditujukan untuk mendidik para pemimpin yang unggul di bidang sains dan teknologi, untuk mengangkat Republik Indonesia menjadi negara berperadaban maju dan tinggi.\n\nKampus ITS Sukolilo menempati areal seluas 180 hektare, dengan luas bangunan seluruhnya kurang lebih 150.000 m2. Selain itu terdapat Kampus Manyar yang dipergunakan oleh Program D-3 dan D-4 Teknik Sipil dengan luas bangunan 5.176 m2 dan Kampus ITS Cokroaminoto yang dipergunakan untuk magister manejemen serta beberapa lembaga kerjasama dengan luas bangunan 4.000 m2.",
        "Universitas Padjajaran adalah sebuah perguruan tinggi negeri di Bandung, Jawa Barat, Indonesia.\n\nSejak 20 Oktober 2014, status universitas berubah menjadi Perguruan Tinggi Negeri Badan Hukum (PTN BH) dari sebelumnya berstatus Badan Layanan Umum (BLU). Peresmian itu ditandai dengan peraturan pemerintah (PP) yang ditandatangani Presiden Susilo Bambang Yudhoyono. Penetapan itu didasarkan atas evaluasi kinerja yang dilakukan tim independen yang dibentuk oleh Kementerian Pendidikan dan Kebudayaan (Kemendikbud). Berdasarkan Keputusan Badan Akreditasi Nasional Perguruan Tinggi (BAN PT) tertanggal 16 Januari 2014, Unpad mendapat peringkat A (sangat baik).",
        "Universitas Pendidikan Indonesia adalah sebuah perguruan tinggi negeri yang kampus utamanya berkedudukan di Kota Bandung, Jawa Barat, Indonesia. Sejak tahun 2012, UPI berstatus sebagai perguruan tinggi yang diselenggarakan pemerintah (PTP), berubah dari status sebelumnya sebagai perguruan tinggi Badan Hukum Milik Negara (BHMN).\n\nUPI adalah perguruan tinggi yang menganut sistem multikampus yaitu dengan 6 kampus yang tersebar di dua provinsi yaitu Jawa Barat dan Banten. Kampus utama UPI berlokasi di Jalan Setiabudhi 229, Bandung. Sedangkan kampus lainnya berlokasi di Cibiru, Tasikmalaya, Sumedang, Purwakarta, dan Serang.",
        "Institut Pertanian Bogor adalah sebuah perguruan tinggi pertanian negeri yang berkedudukan di Bogor.\n\nSebelum diresmikan pada tahun 1963, IPB adalah sebuah fakultas pertanian pada Universitas Indonesia. Pada tanggal 1 September 1963. Presiden Pertama Indonesia, Ir. Soekarno, melakukan peletakkan batu pertama pembangunan kampus sekaligus menandai peresmian Institut Pertanian Bogor sebagai sebuah perguruan tinggi mandiri.\n\nSaat ini, Rektor IPB untuk periode 2017-2022 adalah Prof. Dr. Arif Satria, S.P, M.Si.\n\nBerdasarkan hasil keputusan rapat pleno Badan Akreditasi Nasional Perguruan Tinggi (BAN-PT) tanggal 7 November 2017, BAN-PT memutuskan bahwa Institut Pertanian Bogor (IPB) memperoleh status terakreditasi dengan peringkat A (sangat baik).",
        "Universitas Brawijaya (UB) adalah perguruan tinggi di Indonesia yang berdiri pada tahun 1963 di Kota Malang, Jawa Timur melalui Ketetapan Menteri Pendidikan dan Ilmu Pengetahuan no.1 tanggal 5 Januari 1963. Tanggal tersebut kemudian ditetapkan sebagai Dies Natalis UB. Nama Brawijaya diberikan khusus oleh Presiden Soekarno dengan harapan mampu gemilang seperti Raden Wijaya (Brawijaya I) selaku pendiri Kerajaan Majapahit sekaligus menjadi kampus kebanggan bangsa Indonesia.\n\nUniversitas Brawijaya merupakan kampus elit di Indonesia dan secara konsisten menduduki peringkat 5 terbaik bersama dengan Universitas Indonesia, Institut Pertanian Bogor, Universitas Gadjah Mada, dan Institut Teknologi Bandung berdasarkan penilaian resmi Kemenristekdikti. Sedangkan di tingkat Internasional, UB menduduki peringkat 51 di Asia dan 400 dunia. UB adalah salah satu dari sebagian kecil kampus Indonesia yang terindeks secara Internasional oleh QS.\n\nUB memiliki empat kampus. Kampus utama terletak di sebelah barat Kota Malang (Jl. Veteran), dan kampus kedua berada di Puncak Dieng atau dikenal sebagai UB Dieng yang digunakan untuk fasilitas olahraga outdoor, dan beberapa fasilitas riset maupun perkuliahan. Sedangkan kampus ketiga dan keempat berada di Kediri dan Jakarta. Secara keseluruhan, UB memiliki aset seluas 981 hektar dan dana abadi yang mencapai 5,12 Triliun Rupiah atau setara dengan US$ 768,1 Juta. Hal tersebut menjadikan Universitas Brawijaya sebagai kampus terbesar dan terkaya kedua di tanah air setelah Universitas Indonesia.",
        "Universitas Diponegoro adalah sebuah Perguruan Tinggi Negeri di Indonesia yang berlokasi di Semarang, Jawa Tengah, Indonesia. Undip didirikan pada tahun 1956 sebagai Perguruan Tinggi Swasta dan baru mendapat status sebagai Perguruan Tinggi Negeri pada tahun 1961. Kata Diponegoro diambil dari nama pahlawan nasional, yaitu Pangeran Diponegoro yang merupakan seorang pangeran pengobar semangat kemerdekaan dari tindakan kolonialisme Belanda di awal abad ke-18. Semangat ini turut menginspirasi pendirian Undip. Universitas Diponegoro memperoleh akreditasi A (Sangat Baik) dengan skor 361 dari Badan Akreditasi Nasional Perguruan Tinggi yang berlaku sejak 2013-2018. Berdasarkan Peraturan Pemerintah Nomor 52 Tahun 2015, Undip ditetapkan statusnya menjadi Perguruan Tinggi Negeri Badan Hukum.")

    private val campusLogos = intArrayOf(
        R.drawable.itb,
        R.drawable.ui,
        R.drawable.ugm,
        R.drawable.unair,
        R.drawable.its,
        R.drawable.unpad,
        R.drawable.upi,
        R.drawable.ipb,
        R.drawable.ub,
        R.drawable.undip)

    private val campusAddress = arrayOf(
        "Jl. Ganesha No. 10, Kota Bandung",
        "Jl. Margonda Raya, Kota Depok",
        "Bulaksumur, Caturtunggal, Kabupaten Sleman",
        "Jl. Airlangga No.4 - 6, Airlangga, Kota Surabaya",
        "Jl. Teknik Kimia, Keputih, Kota Surabaya",
        "Jl. Raya Bandung Sumedang KM.21, Kabupaten Sumedang",
        "Jl. Dr. Setiabudi No.229, Kota Bandung",
        "Jl. Raya Dramaga, Kota Bogor",
        "Jl. Veteran, Ketawanggede, Kota Malang",
        "Jl. Prof. Sudarto No.13, Kota Semarang"
    )

    val listData: ArrayList<Campus>
        get() {
            val list = arrayListOf<Campus>()
            for (position in campusNames.indices) {
                val campus = Campus()
                campus.name = campusNames[position]
                campus.detail = campusDetails[position]
                campus.logo = campusLogos[position]
                campus.address = campusAddress[position]
                list.add(campus)
            }
            return list
        }
}