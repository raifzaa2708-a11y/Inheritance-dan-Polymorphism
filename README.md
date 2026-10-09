# Inheritance-dan-Polymorphism
F1D02510107-TUGAS PBO

# Tujuan 
Tugas ini dibuat untuk memenuhi Pemrograman Berbasis Objek (PBO) materi Inheritance dan Polymorphism, dengan tujuan melatih pemahaman mengenai konsep pemodelan kelas bertingkat, pembungkusan data, pewarisan sifat, serta penimpaan metode pada objek bentuk geometri.

# Deskripsi Tugas
Program ini merupakan aplikasi berbasis Java yang memodelkan hirarki bentuk geometri dengan kelas induk Bentuk serta kelas turunannya seperti BujurSangkar, Lingkaran, dan Silinder untuk menghitung luas, volume, serta menampilkan informasi masing-masing objek secara terstruktur.

# Encapsulation
Konsep Encapsulation diterapkan dengan mendeklarasikan atribut kelas secara privat (private) maupun terproteksi (protected) seperti warna, sisi, radius, dan tinggi, lalu menyediakan akses kontrol secara aman melalui metode getter dan setter.

# Inheritance
Konsep Inheritance diterapkan melalui hubungan pewarisan bertingkat menggunakan kata kunci extends, di mana kelas BujurSangkar dan Lingkaran mewarisi sifat dari kelas induk Bentuk, serta kelas Silinder mewarisi sifat dan atribut dari kelas Lingkaran.

# Polymorphism
Konsep Polymorphism diimplementasikan melalui teknik method overriding menggunakan anotasi @Override pada metode printInfo(), sehingga setiap kelas turunan dapat menampilkan format informasi spesifik sesuai dengan jenis bentuk geometrinya masing-masing.

# Library/Modul Tambahan yang Dipakai
Memanfaatkan pustaka bawaan Java standar (Java Standard Library) yaitu java.lang.Math (melalui metode Math.PI) untuk memperoleh nilai konstanta presisi pi dalam perhitungan matematika luas lingkaran dan volume silinder tanpa memerlukan library eksternal tambahan.

# Hasil Program 
Screenshot 2026-10-10 014118.png
