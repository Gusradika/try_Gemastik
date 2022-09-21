<h3>Sumber : https://gist.github.com/willnode/1eb1b5da4e19735bea598d4c2bc27f59</h3>

<h2># 1. Urutan Aneh</h2>

<p>
### Deskripsi

Buatlah program yang melakukan pengurutan N (2≤N≤1000) buah bilangan seperti pada contoh kasus di bawah ini.

### Format Masukan

- Baris pertama berisi satu buah bilangan N.

- Baris kedua berisi N buah bilangan bulat Xi.

- Setiap bilangan dipastikan hanya antara 0-100.

### Format Keluaran

N buah baris berisi urutan bilangan sesuai dengan contoh

### Contoh Masukan

```

10

1 11 12 2 13 23 31 62 71 81

```

### Contoh Keluaran

```

1

11

31

71

81

2

12

62

13

23

```

# 2. Pohon

### Deskripsi

Untuk menghilangkan penat Pak Blangkon sering sekali jalan-jalan ke pekarangan di belakang rumahnya. Saat berada di posisi tertentu Pak Blangkon menyadari bahwa di sekelilingnya ada N buah pohon. Namun, karena terbatasnya pandangan hanya beberapa pohon saja yang bisa terlihat oleh Pak Blankon, karena pohon tertentu berada tepat di belakang pohon lainnya saat pandangan tertuju pada arah tertentu. Jika dilihat dari atas dalam koordinat dua dimensi, Pak Blangkon ada di posisi (x,y) sedangkan pohon-pohonnya ada di posisi (pi,qi). Seperti contoh pada gambar di bawah ini:

![Pohon](https://image.ibb.co/d297Uz/pohon.png)

Seperti terlihat pada gambar di atas dari 8 pohon, hanya 5 yang bisa dilihat secara langsung oleh Pak Blangkon, sedangkan tiga pohon lainnya terhalang oleh pohon di depannya. Jika diketahui lokasi Pak Blangkon beserta N buah pohon, buatlah program untuk menghitung banyaknya pohon yang bisa terlihat secara langsung oleh Pak Blangkon.

### Format Masukan

Baris pertama adalah N, X dan Y yang menyatakan banyaknya pohon dan posisi Pak Blangkon di mana 2 ≤ N ≤ 100. N baris berikutnya berisi pi dan qi yang menyatakan posisi pohon ke-i, di mana 0 ≤ X,Y,pi,qi ≤ 1000.

### Format Keluaran

Banyaknya pohon yang dapat dilihat Pak Blangkon.

### Contoh Masukan

```

8 4 2

1 5

2 1

2 4

3 3

6 3

6 6

7 7

10 5

```

### Contoh Keluaran

```

5

```

# 3. Pertandingan

### Deskripsi

Dalam sebuah pertandingan olahraga, Budi diberikan kesempatan untuk memilih urutan pemain yang harus dilawannya. Asumsikan ada N orang lawan yang masing-masing memiliki tingkat kemahiran Ai. Setelah Budi berhasil mengalahkan pemain ke-i, tingkat kemahirannya akan bertambah sebanyak Bi yang akan digunakan untuk melawan pemain selanjutnya. Perlu diingat bahwa Budi hanya bisa mengalahkan pemain dengan tingkat kemahiran yang lebih rendah atau sama dengan dirinya sendiri. Jika Budi memiliki tingkat kemahiran awal M, tentukan pemain manakah yang harus dilawan Budi secara berurutan sampai dia tidak bisa lagi mengalahkan lawannya sehingga Budi mendapatkan tingkat kemahiran yang maksimal.

### Format Masukan

- Baris pertama dua buah bilangan N dan M (1≤N, M≤100)

- Baris kedua N buah bilangan Ai (1≤Ai≤1000)

- Baris ketiga N buah bilangan Bi (1≤Bi≤1000)

### Format Keluaran

- Tingkat kemahiran maksimal yang akan didapatkan Budi.

### Contoh Masukan 1

```

4 2

8 9 3 2

5 4 1 3

```

Contoh Keluaran 1

```

6

```

Contoh Masukan 2

```

5 3

8 4 5 6 7

9 8 7 5 6

```

Contoh Keluaran 2

```

3

```

Contoh Masukan 3

```

5 9

2 3 6 7 8

3 4 2 2 3

```

Contoh Keluaran 3

```

23

```

# Tarung

### Deskripsi

Terdapat N petarung. Petarung ke-i memiliki kekuatan Pi. Jika dua petarung i dan j bertarung, maka petarung dengan kekuatan lebih tinggi akan menang, dan kekuatan dari petarung pemenang tersebut menjadi abs(Pi - Pj). Jika kekuatan mereka sama, maka petarung dengan indeks lebih kecil akan menang namun kekuatannya akan menjadi 0.

Mula-mula, petarung pertama akan melawan petarung kedua. Pemenangnya akan melawan petarung ketiga, dan seterusnya hingga petarung ke-N. Juara akhirnya adalah pemenang dari pertarungan terakhir.

Anda adalah petarung dengan indeks 1 dan ingin memenangkan pertandingan. Anda dapat mengubah urutan petarung-petarung lainnya (petarung indeks 2 sampai dengan N). Bisakah Anda memenangkan pertandingan?

### Format Masukan

Masukan diberikan dalam format berikut:

```
N
P1 P2 … PN
```

### Format Keluaran

Jika terdapat permutasi yang sehingga Anda dapat memenangkan pertandingan, keluarkan:

```
menang
Q1 Q2 … QN
```

dengan Q merupakan permutasi dari P.

Jika ada banyak kemungkinan, keluarkan yang mana saja.

Jika tidak ada permutasi yang memungkinkan Anda menang, keluarkan:

```
kalah
```

### Contoh Masukan 1

```
5
3 4 2 -4 1
```

### Contoh Keluaran 1

```
menang
3 1 2 -4 4
```

### Contoh Masukan 2

```
2
3 4
```

### Contoh Keluaran 2

```
kalah
```

### Batasan (1)

- 1 ≤ N ≤ 10
- -109 ≤ Pi ≤ 109

### Batasan (2)

- 1 ≤ N ≤ 100.000
- -109 ≤ Pi ≤ 109

# 3 Angka Zig-Zag

### Deskripsi

Petruk menuliskan N buah bilangan bulat berbeda, A1, A2, ..., AN, pada sebuah kertas. Kemudian, kertas tersebut diberikan ke Bagong. Bagong kemudian bertanya, "apa ini?". Petruk menjawab, "ini adalah kertas yang bertuliskan N buah bilangan bulat berbeda.". Tiba-tiba Gareng menghampiri mereka berdua, dan seketika melihat tulisan yang ada di kertas tersebut.

Dengan isengnya, Gareng menyeletuk, "ada berapa subbarisan zig-zag 3 bilangan yang bisa dibentuk dari N buah bilangan ini?". Gareng menjelaskan bahwa tiga buah bilangan a, b, c dikatakan subbarisan zig-zag 3 bilangan jika dan hanya jika memenuhi syarat: "a > b dan b < c" atau "a < b dan b > c". Petruk dan Bagong lalu terdiam kebingungan.

Sebagai peserta Gemastik 2018, bantulah Petruk dan Bagong menjawab pertanyaan yang diajukan oleh Gareng.

### Format Masukan

Baris pertama berisi sebuah bilangan T, yang menyatakan banyaknya kasus uji.

Setiap kasus uji diberikan dalam format berikut:

```
N
A1 A2 … AN
```

### Format Keluaran

T buah baris, masing-masing berisi jawaban dari pertanyaan yang diajukan oleh Gareng.

### Contoh Masukan

```
2
5
2 8 1 5 7
4
2 8 1 5
```

### Contoh Keluaran

```
8
4
```

### Penjelasan

Untuk contoh kasus uji pertama di atas, subbarisan zig-zag 3 bilangan yang bisa dibentuk adalah :

- 2, 8, 1
- 2, 8, 5
- 2, 8, 7
- 2, 1, 5
- 2, 1, 7
- 8, 1, 5
- 8, 1, 7
- 8, 5, 7

### Batasan (1)

- 1 ≤ T ≤ 100
- 3 ≤ N ≤ 100
- 1 ≤ Ai ≤ 10.000

Dijamin seluruh Ai berbeda-beda

### Batasan (2)

- 1 ≤ T ≤ 100
- 3 ≤ N ≤ 1.000
- 1 ≤ Ai ≤ 10.000

Dijamin seluruh Ai berbeda-beda

# Kuliner-an

### Deskripsi

Karena sedang marak start-up, Pak Blangkon tertarik untuk mencoba membuat sebuah start-up juga. Beliau menamakannya sebagai "Kuliner-an". Kuliner-an ini bertujuan untuk memudahkan pelanggan memesan sejumlah makanan, tentunya bisa lebih dari satu porsi makanan. Pembeli juga tidak perlu memikirkan akan memesan di restoran mana, karena hal ini sudah diatur oleh aplikasi Kuliner-an.

Akhirnya aplikasi yang dibuat pun telah jadi, dan tibalah saatnya untuk melakukan pengujian. Karena suatu alasan tertentu, aplikasi Kuliner-an hanya terhubung dengan N orang pembeli dan N buah restoran. Menu yang tersedia di aplikasi Kuliner-an juga hanya 1 macam, yaitu gudeg. Lebih anehnya lagi, setiap pembeli harus memesan tepat 2 porsi dan setiap restoran juga harus menerima pesanan tepat 2 porsi. Dua porsi yang dipesan oleh seorang pembeli bisa dipesankan ke 1 restoran saja, atau bisa dipesankan ke 2 restoran berbeda (masing-masing restoran menerima 1 pesanan).

Agar bisa melakukan optimasi, Pak Blangkon penasaran ada berapa banyak kemungkinan pengaturan seluruh pesanan tersebut. Pak Blangkon meminta Anda sebagai peserta Gemastik 2018 untuk membantunya.

### Format Masukan

Baris pertama berisi sebuah bilangan T, yang menyatakan banyaknya kasus uji.

Setiap kasus uji diberikan dalam format berikut:

```
N
```

### Format Keluaran

Untuk setiap kasus uji, keluarkan sebuah baris berisi banyak kemungkinan pengaturan seluruh pesanan tersebut. Karena bisa jadi jawabannya sangat besar, keluarkan jawabannya dalam modulo 1.000.000.007 (109+7).

### Contoh Masukan

```
2
2
1
```

### Contoh Keluaran

```
3
1
```

### Penjelasan

Misalkan kedua pembeli tersebut adalah Semar dan Gareng, dan dua restoran yang tersedia adalah Gudeg Pak Petruk dan Gudeg Pak Bagong. Seluruh kemungkinan pengaturan pesanan adalah sebagai berikut:

- Semar mendapatkan 2 porsi dari Gudeg Pak Petruk dan Gareng mendapatkan 2 porsi dari Gudeg Pak Bagong.
- Semar mendapatkan 2 porsi dari Gudeg Pak Bagong dan Gareng mendapatkan 2 porsi dari Gudeg Pak Petruk.
- Semar mendapatkan 1 porsi dari masing-masing restoran (sehingga total mendapatkan 2 porsi) dan Gareng juga mendapatkan 1 porsi dari masing-masing restoran (sehingga total mendapatkan 2 porsi).

### Batasan (1)

- 1 ≤ T ≤ 5
- 1 ≤ N ≤ 5

### Batasan (2)

- 1 ≤ T ≤ 100
- 1 ≤ N ≤ 100.000

# Maxmin

### Deskripsi

Diberikan sebuah persegi berukuran NxN yang berisi angka-angka berbeda dari 1 hingga N2. Anda diminta untuk menemukan angka maksimal pada setiap baris, kemudian keluarkan angka minimal dari angka-angka tersebut.

Kawan Anda juga sedang mengerjakan soal yang sama, namun ternyata ia melakukan kesalahan! Algoritma yang ia buat adalah sebagai berikut: temukan angka minimal pada setiap kolom, kemudian keluarkan angka maksimal dari angka-angka tersebut.

Anda ingin membuktikan bahwa kawan Anda melakukan kesalahan dengan cara memberikan K buah kasus uji berbeda yang mana solusi yang dihasilkan kawan Anda adalah salah.

Jika ada banyak keluaran, keluarkan yang mana saja.

### Format Masukan

Sebuah baris berisi N dan K.

### Format Keluaran

K buah persegi berukuran NxN (sehingga terdapat KxN buah baris).

### Contoh Masukan

```
10 2
```

### Contoh Keluaran

```
89 6 91 50 7 58 83 61 3 49
78 55 90 62 4 77 27 10 85 80
25 76 23 22 45 52 88 67 11 40
16 98 17 59 66 34 18 2 97 43
71 35 100 38 1 69 86 31 33 51
64 87 84 14 48 99 60 53 92 75
46 70 94 72 29 82 36 74 21 5
73 9 26 47 20 41 65 54 24 93
95 96 37 32 56 57 63 12 30 19
28 44 79 39 42 13 81 15 8 68
84 4 68 96 79 48 18 3 43 83
82 77 42 22 95 69 92 58 55 81
66 62 93 41 30 38 28 70 37 17
29 34 51 91 87 1 60 8 26 100
19 11 35 21 64 94 65 14 72 74
86 78 40 54 47 31 27 88 90 20
61 57 99 89 52 10 97 24 45 44
13 12 23 15 33 2 80 85 25 16
5 56 49 75 73 7 59 36 67 50
39 71 76 46 63 32 9 53 6 98
```

### Penjelasan

- Pada persegi pertama, keluaran yang benar adalah 81 namun kawan Anda mengeluarkan 18.
- Pada persegi kedua, keluaran yang benar adalah 75 namun kawan Anda mengeluarkan 30.

### Batasan (1)

- 5 ≤ N ≤ 10
- K = 1

### Batasan (2)

- 5 ≤ N ≤ 10
- 1 ≤ K ≤ 10.000

# Surabaya Town Square

### Deskripsi

Kota Surabaya adalah kota pahlawan yang terkenal dengan tata kota yang indah serta taman-tamannya yang bersih, rapi, dan nyaman. Salah satu yang menyebabkan keindahan tersebut adalah penataan warna keramik yang digunakan.

Suatu hari, Ibu Walikota Surabaya sedang ingin menghias area terbuka berukuran N x M petak dengan cara mengkeramik lantai-lantainya. Beliau juga mengusulkan untuk membuat hiasan ornamen menarik pada lantainya menggunakan keramik-keramik spesial. Berikut adalah aturan pemasangan keramik yang Ibu Walikota usulkan:

Lantai area akan dikeramik dengan dua jenis keramik, yakni keramik dasar dan keramik spesial untuk ornamen. Masing-masing keramik berukuran 1x1 petak.

Ornamen adalah sebuah pola berukuran T x T petak yang disusun secara selang-seling antara keramik spesial dan dengan keramik dasar, sehingga tidak ada dua keramik spesial yang bersinggungan. Contoh di bawah tampak dua bentuk ornamen berukuran 3 x 3 petak yang memenuhi syarat di atas (keramik berwarna oranye dan keramik dasar berwarna putih):

![](https://image.ibb.co/nyhGDe/image1.png)

Area tersebut akan diberi beberapa ornamen yang memiliki ukuran dan bentuk yang sama. Ornamen-ornamen tersebut dipasang secara berulang agar memenuhi area yang memungkinkan, meskipun ada bagian ornamen yang terpotong oleh tepi area. Proses pengulangan dilakukan secara sejajar dengan tepi area.

Dua ornamen yang berdekatan terpisah tepat D petak secara horizontal dan vertikal. Area kosong diantaranya yang tidak diisi dengan ornamen akan diisi menggunakan keramik dasar.

Berikut contoh pengulangan ornamen dengan T=3 dan D=1 pada area 10 x 15 petak:

![](https://image.ibb.co/i5S56z/image2.png)

Perlu diperhatikan, pada area yang akan dikeramik terdapat beberapa petak yang tidak dapat dikeramik karena keberadaan bangunan atau pohon. Keindahan suatu area ditentukan dari banyaknya keramik khusus yang tampak setelah pemasangan. Tugas Anda sebagai programmer di Surabaya adalah membantu menghitung berapa maksimal keramik khusus yang tampak setelah pemasangan.

Berikut adalah contoh area berukuran 8 x 16 petak yang akan diberi keramik. Petak berwarna abu-abu adalah petak yang tidak dapat dipasang keramik.

![](https://image.ibb.co/mONBye/satu.png)

Dan di bawah ini adalah pemilihan dan peletakan keramik yang optimal dengan T=3 dan D=2 sehingga diperoleh tampilan keramik spesial paling banyak.

![](https://image.ibb.co/cdiJde/dua.png)

### Format Masukan

Masukan diberikan dalam format berikut:

```
N M T D
L
X11 Y21 X21 Y21
X12 Y22 X22 Y22
...
X1L Y2L X2L Y2L
```

X1i Y2i X2i Y2i adalah koordinat pojok kiri atas (X1, Y1) dan pojok kanan bawah (X2, Y2) area ke-i yang tidak dapat dipasang keramik. Area-area tersebut diinputkan dengan membagi menjadi L buah segiempat yang saling lepas. Petak paling kiri atas berkoordinat (0, 0) dan petak paling kanan bawah berkoordinat (N-1, M-1).

### Format Keluaran

Keluarkan sebuah bilangan bulat yang merupakan banyak maksimum keramik spesial yang dapat terlihat setelah dipasang.

### Contoh Masukan (1)

```
10 10 3 2
0
```

### Contoh Keluaran (1)

```
20
```

### Batasan (1)

- 1 ≤ N, M ≤ 50.000
- 1 ≤ T, D ≤ 500
- T ≤ N, M
- L = 0
- 0 ≤ X1i, X2i < N
- 0 ≤ Y1i, Y2i < M

Semua area yang tidak dapat dikeramik pada masukan, dijamin saling lepas

### Contoh Masukan (1)

```
8 16 3 2
13
0 2 0 3
0 6 0 7
0 12 0 13
6 1 7 2
6 5 7 6
6 9 7 10
6 13 7 14
1 2 1 3
2 0 3 7
4 2 4 3
1 12 1 13
2 10 3 15
4 12 4 13
```

### Contoh Keluaran (2)

```
22
```

### Batasan (2)

- 1 ≤ N, M ≤ 50.000
- 1 ≤ T, D ≤ 500
- T ≤ N, M
- 0 ≤ L ≤ 100
- 0 ≤ X1i, X2i < N
- 0 ≤ Y1i, Y2i < M

Semua area yang tidak dapat dikeramik pada masukan, dijamin saling lepas

</p>
