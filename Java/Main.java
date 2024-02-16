/*
Saya Muhammad Rizki Revandi dengan NIM 2205027 mengerjakan Latihan Praktikum 2
dalam mata kuliah Desain Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak
melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
*/

// import library yang digunakan
import java.util.ArrayList;
import java.util.Scanner;

// deklarasi kelas Main
public class Main
{
    // metode untuk menampilkan data produk baju dalam bentuk tabel dinamis (sesuai panjang huruf inputan user)
    private static void displayData(ArrayList<Shirt> listData)
    {
        // atribut untuk menetapkan panjang awal setiap kolom
        int idTerpanjang = 10;
        int namaTerpanjang = 4;
        int brandTerpanjang = 5;
        int priceTerpanjang = 5;
        int sizeTerpanjang = 4;
        int materialTerpanjang = 8;
        int genderTerpanjang = 6;
        int colorTerpanjang = 5;
        int sleeveTypeTerpanjang = 11;

        // menghitung panjang maksimum di setiap kolom yang ada
        for (Shirt data : listData)
        {
            // cek apakah panjang ID Produk saat ini lebih panjang daripada panjang yang sudah ditetapkan di awal
            if (data.getIdProduct().length() > idTerpanjang)
            {
                idTerpanjang = data.getIdProduct().length(); // jika ID Produk lebih panjang, maka panjang awal diupdate
            }
            if (data.getName().length() > namaTerpanjang)
            {
                namaTerpanjang = data.getName().length();
            }
            if (data.getBrand().length() > brandTerpanjang)
            {
                brandTerpanjang = data.getBrand().length();
            }
            if (data.getPrice().length() > priceTerpanjang)
            {
                priceTerpanjang = data.getPrice().length();
            }
            if (data.getSize().length() > sizeTerpanjang)
            {
                sizeTerpanjang = data.getSize().length();
            }
            if (data.getMaterial().length() > materialTerpanjang)
            {
                materialTerpanjang = data.getMaterial().length();
            }
            if (data.getGender().length() > genderTerpanjang)
            {
                genderTerpanjang = data.getGender().length();
            }
            if (data.getColor().length() > colorTerpanjang)
            {
                colorTerpanjang = data.getColor().length();
            }
            if (data.getSleeveType().length() > sleeveTypeTerpanjang)
            {
                sleeveTypeTerpanjang = data.getSleeveType().length();
            }
        }

        // format string untuk menampilkan tabel
        String formatPrint = "| %-" + idTerpanjang + "s | %-" + namaTerpanjang + "s | %-" + 
                             brandTerpanjang + "s | %-" + priceTerpanjang + "s | %-" +
                             sizeTerpanjang + "s | %-" + materialTerpanjang + "s | %-" + 
                             genderTerpanjang + "s | %-" + colorTerpanjang + "s | %-" +
                             sleeveTypeTerpanjang + "s |%n";

        // menampilkan tabel bagian garis paling atas memakai format
        System.out.format("+-%1$s-+-%2$s-+-%3$s-+-%4$s-+-%5$s-+-%6$s-+-%7$s-+-%8$s-+-%9$s-+%n",
        "-".repeat(idTerpanjang),
        "-".repeat(namaTerpanjang),
        "-".repeat(brandTerpanjang),
        "-".repeat(priceTerpanjang),
        "-".repeat(sizeTerpanjang),
        "-".repeat(materialTerpanjang),
        "-".repeat(genderTerpanjang),
        "-".repeat(colorTerpanjang),
        "-".repeat(sleeveTypeTerpanjang)
        );
        /* jadi untuk system out atau print ini pakai format, tanda %1$s itu semacam
         variabel atau atribut yang akan diganti dengan argumen yang ditetapkan
         setelah format string. Pada kasus ini argumen nya ada "-" dan di repeat
         atau diulang sebanyak panjang IDProduct, name, brand, dan seterusnya */

        // menampilkan tabel bagian header (yang menampilkan ID Produkm nama, dst)
        System.out.format(formatPrint, "ID Product", "Name", "Brand", "Price", "Size", "Material", "Gender", "Color", "Sleeve Type");

        System.out.format("+-%1$s-+-%2$s-+-%3$s-+-%4$s-+-%5$s-+-%6$s-+-%7$s-+-%8$s-+-%9$s-+%n",
        "-".repeat(idTerpanjang),
        "-".repeat(namaTerpanjang),
        "-".repeat(brandTerpanjang),
        "-".repeat(priceTerpanjang),
        "-".repeat(sizeTerpanjang),
        "-".repeat(materialTerpanjang),
        "-".repeat(genderTerpanjang),
        "-".repeat(colorTerpanjang),
        "-".repeat(sleeveTypeTerpanjang)
        );

        // menampilkan tabel bagian isi atau list data shirt
        for (Shirt data : listData)
        {
            System.out.format(formatPrint,
            data.getIdProduct(),
            data.getName(),
            data.getBrand(),
            data.getPrice(),
            data.getSize(),
            data.getMaterial(),
            data.getGender(),
            data.getColor(),
            data.getSleeveType()
            );

        // menampilkan tabel bagian garis paling bawah memakai format
        System.out.format("+-%1$s-+-%2$s-+-%3$s-+-%4$s-+-%5$s-+-%6$s-+-%7$s-+-%8$s-+-%9$s-+%n",
        "-".repeat(idTerpanjang),
        "-".repeat(namaTerpanjang),
        "-".repeat(brandTerpanjang),
        "-".repeat(priceTerpanjang),
        "-".repeat(sizeTerpanjang),
        "-".repeat(materialTerpanjang),
        "-".repeat(genderTerpanjang),
        "-".repeat(colorTerpanjang),
        "-".repeat(sleeveTypeTerpanjang)
        );
        }

        System.out.println(); // print new line
    }

    public static void main(String[] args)
    {
        // scanner untuk menerima inputan dari user
        Scanner sc = new Scanner(System.in);

        // membuat array list untuk data baju
        ArrayList<Shirt> listData = new ArrayList<>();

        System.out.println("+======================================+");
        System.out.println("|   Selamat datang ke pendataan Baju   |");
        System.out.println("+======================================+");

        System.out.println("\nJumlah baju yang akan di masukkan ke data hanya 3 pcs.");

        for (int i = 0; i < 3; i++)
        {
            System.out.println("\nMasukkan data untuk baju " + (i + 1) + ":");
            System.out.print("ID Product : ");
            String idProduct = sc.nextLine();

            System.out.print("Name : ");
            String name = sc.nextLine();

            System.out.print("Brand : ");
            String brand = sc.nextLine();

            System.out.print("Price : ");
            String price = sc.nextLine();

            System.out.print("Size : ");
            String size = sc.nextLine();

            System.out.print("Material : ");
            String material = sc.nextLine();

            System.out.print("Gender : ");
            String gender = sc.nextLine();

            System.out.print("Color : ");
            String color = sc.nextLine();

            System.out.print("Sleeve Type : ");
            String sleeveType = sc.nextLine();

            // listData.add(new Shirt(idProduct, name, brand, price, size, material, gender, color, sleeveType));

            Shirt shirt = new Shirt();
            shirt.setIdProduct(idProduct);
            shirt.setName(name);
            shirt.setBrand(brand);
            shirt.setPrice(price);
            shirt.setSize(size);
            shirt.setMaterial(material);
            shirt.setGender(gender);
            shirt.setColor(color);
            shirt.setSleeveType(sleeveType);
            listData.add(shirt);
        }

        System.out.println("\nBerikut data baju yang ada :");
        displayData(listData);
    }

    /* contoh input :
       01, Baju Sugoi, Uniqlo, 259999, L, Cotton, Male, White, Regular 
       02, Kimono, Mitsugoshi, 500000, XL, Silk Cloth, Female, Red, Kimono
       03, T-Shirt, Zeta, 120000, M, Cotton Combed, Female, Black, Regular */
}