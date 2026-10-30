# Kopi dan Nyemil

Aplikasi mobile **Kopi dan Nyemil** adalah aplikasi pemesanan kopi dan camilan berbasis Android yang dibangun menggunakan bahasa pemrograman **Kotlin**. Aplikasi ini dibuat untuk memenuhi tugas mata kuliah Pemrograman Mobile. Aplikasi ini mengimplementasikan alur antarmuka (UI/UX) berdasarkan wireframe yang telah disediakan, dengan menggunakan data statis (dummy data) tanpa integrasi database.

## 📱 Fitur Aplikasi

Berdasarkan wireframe, aplikasi ini memiliki alur dan fitur sebagai berikut:
1. **Splash / Welcome Screen**: Halaman awal untuk menyambut pengguna sebelum masuk ke aplikasi.
2. **Sign Up & Register**: Halaman pendaftaran akun baru dengan input nama lengkap, username, dan password.
3. **Login**: Halaman untuk masuk ke aplikasi menggunakan username dan password.
4. **Home**: Halaman utama yang menampilkan daftar menu kopi dan camilan (menampilkan minimal 5 item) beserta harga dan deskripsi singkat.
5. **Profile**: Halaman untuk melihat dan mengubah data profil pengguna.
6. **Alamat Pengiriman**: Halaman form untuk mengisi nama lengkap, alamat, dan patokan/detail lokasi pengiriman.
7. **Konfirmasi Pesanan**: Halaman sukses setelah pengguna melakukan pemesanan, menampilkan pesan terima kasih.
8. **Navigasi**: Menggunakan *Bottom Navigation* (Home, Order, Profile) untuk mempermudah perpindahan antar halaman.

## 🛠️ Teknologi yang Digunakan

*   **Bahasa Pemrograman**: [Kotlin](https://kotlinlang.org/)
*   **IDE**: [Android Studio](https://developer.android.com/studio)
*   **UI Toolkit**: XML Layouts & Material Design Components
*   **Komponen Android**: Activity, Intent (untuk perpindahan halaman dan passing data), RecyclerView (untuk daftar menu).
*   **Data**: Dummy Data (Data statis yang di-hardcode di dalam aplikasi).
