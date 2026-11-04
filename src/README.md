# Character Manager

## TP8 – Character Manager Sprint #3

**Link Google Docs:** [https://docs.google.com/document/d/1v1Arr5k2In-Y3IAuNLR6JiGlRQr3YOS-C1Lm2wjwvYk/edit?usp=sharing]

### Penjelasan MVC

Main.java menyiapkan data karakter menggunakan CharacterManager, kemudian mengirimkan data tersebut ke MainWindow. CharacterManager bertugas mengelola data karakter, sedangkan MainWindow bertugas menampilkan data menggunakan JLabel. Pembagian ini membuat program lebih terstruktur sesuai konsep MVC.

### Karakter Tambahan

- Leonidas – WARRIOR, Level 8.
- Luna – HEALER, Level 6.

### Screenshot Hasil Program

**Screenshot sebelum perubahan data:**
![alt text](image-1.png)

**Screenshot setelah perubahan data:**
![alt text](image-2.png)

## TP10 – Character Manager Sprint #4

### Link Google Docs

[https://docs.google.com/document/d/1jPMCvQjZx-hBTm8RyHQ90wQr8VWN9Z71UBl7IQ2tj4c/edit?usp=sharing]

### Penjelasan AppTheme dan MVC

Pada TP10, aplikasi Character Manager dikembangkan menjadi versi v0.4 dengan menambahkan pengaturan tema menggunakan class AppTheme. Class ini mengatur warna, font, dan border agar tampilan aplikasi lebih konsisten.

Pengaturan warna role diletakkan di AppTheme, bukan di class Character, karena Character bertugas mengelola data karakter, sedangkan AppTheme mengatur tampilan aplikasi. Dengan demikian, pembagian tanggung jawab dalam konsep MVC menjadi lebih jelas.

### Warna Karakter

Setiap karakter memiliki warna berdasarkan role:

- Warrior: Merah.
- Mage: Biru.
- Archer: Hijau.
- Healer: Ungu.

Karakter dengan level minimal 5 ditampilkan menggunakan tulisan berwarna emas dan tebal.

### Properti Komponen Tambahan

1. **setToolTipText()**: Menampilkan informasi tambahan ketika kursor diarahkan ke kartu karakter.
2. **setHorizontalAlignment()**: Mengatur posisi teks pada JLabel agar tampil lebih rapi.

### Screenshot Perbandingan Versi v0.3 dan v0.4

**Screenshot sebelum perubahan (v0.3):**

![alt text](<Screenshot 2026-11-04 103811.png>)

**Screenshot setelah perubahan (v0.4):**

![alt text](<Screenshot 2026-11-04 115312.png>)

### Kesimpulan

Melalui TP10, saya memahami cara mengatur tema aplikasi menggunakan AppTheme, mengatur properti komponen Java Swing, serta menerapkan konsep MVC. Pemisahan Model dan View membuat kode lebih terstruktur, mudah dipahami, dan mudah dikembangkan.
