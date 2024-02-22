/*
Saya Muhammad Rizki Revandi dengan NIM 2205027 mengerjakan Latihan Praktikum 2
dalam mata kuliah Desain Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak
melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
*/

// library yang digunakan
#include <bits/stdc++.h>
#include "Shirt.cpp"

// import standard namespace
using namespace std;

void displayData(vector<Shirt> &listData)
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
        /* cek apakah panjang semua atribut saat ini lebih panjang daripada panjang yang sudah
           ditetapkan di awal, jika iya maka panjang sebelumnya diganti menjadi panjang saat ini */
        if (data.getIdProduct().length() > idTerpanjang)
        {
            idTerpanjang = data.getIdProduct().length();
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

    // menampilkan tabel bagian garis paling atas
    cout << "+-" << string(idTerpanjang, '-') << "-+-" << string(namaTerpanjang, '-') << "-+-" << string(brandTerpanjang, '-') << "-+-" << string(priceTerpanjang, '-') << "-+-" << string(sizeTerpanjang, '-') << "-+-" << string(materialTerpanjang, '-') << "-+-" << string(genderTerpanjang, '-') << "-+-" << string(colorTerpanjang, '-') << "-+-" << string(sleeveTypeTerpanjang, '-') << "-+" << endl;

    // menampilkan header tabel
    cout << "| " << setw(idTerpanjang) << left << "ID Product"
         << " | " << setw(namaTerpanjang) << left << "Name"
         << " | " << setw(brandTerpanjang) << left << "Brand"
         << " | " << setw(priceTerpanjang) << left << "Price"
         << " | " << setw(sizeTerpanjang) << left << "Size"
         << " | " << setw(materialTerpanjang) << left << "Material"
         << " | " << setw(genderTerpanjang) << left << "Gender"
         << " | " << setw(colorTerpanjang) << left << "Color"
         << " | " << setw(sleeveTypeTerpanjang) << left << "Sleeve Type"
         << " |" << endl;

    // menampilkan garis antara header dan data
    cout << "+-" << string(idTerpanjang, '-') << "-+-" << string(namaTerpanjang, '-') << "-+-" << string(brandTerpanjang, '-') << "-+-" << string(priceTerpanjang, '-') << "-+-" << string(sizeTerpanjang, '-') << "-+-" << string(materialTerpanjang, '-') << "-+-" << string(genderTerpanjang, '-') << "-+-" << string(colorTerpanjang, '-') << "-+-" << string(sleeveTypeTerpanjang, '-') << "-+" << endl;

    // menampilkan isi tabel
    for (Shirt data : listData)
    {
        cout << "| " << setw(idTerpanjang) << left << data.getIdProduct() << " | " << setw(namaTerpanjang) << left << data.getName() << " | " << setw(brandTerpanjang) << left << data.getBrand() << " | " << setw(priceTerpanjang) << left << data.getPrice() << " | " << setw(sizeTerpanjang) << left << data.getSize() << " | " << setw(materialTerpanjang) << left << data.getMaterial() << " | " << setw(genderTerpanjang) << left << data.getGender() << " | " << setw(colorTerpanjang) << left << data.getColor() << " | " << setw(sleeveTypeTerpanjang) << left << data.getSleeveType() << " |" << endl;
    }

    // menampilkan garis paling bawah tabel
    cout << "+-" << string(idTerpanjang, '-') << "-+-" << string(namaTerpanjang, '-') << "-+-" << string(brandTerpanjang, '-') << "-+-" << string(priceTerpanjang, '-') << "-+-" << string(sizeTerpanjang, '-') << "-+-" << string(materialTerpanjang, '-') << "-+-" << string(genderTerpanjang, '-') << "-+-" << string(colorTerpanjang, '-') << "-+-" << string(sleeveTypeTerpanjang, '-') << "-+" << endl;

    cout << endl;
}

int main()
{
    string idProduct, name, brand, price, size, material, gender, color, sleeveType;

    vector<Shirt> vecData;
    int m = 0;

    while (m != 3)
    {
        cout << "+======================================+" << endl;
        cout << "|   Selamat datang ke pendataan Baju   |" << endl;
        cout << "+======================================+" << endl;
        cout << "Fitur - fitur yang tersedia :" << endl;
        cout << "1. Tambah Data Baju" << endl;
        cout << "2. Tampilkan Data Baju" << endl;
        cout << "3. Keluar\n"
             << endl;

        cout << "Fitur yang dipilih : ";
        cin >> m;

        if (m == 1)
        {
            cout << "Input ID Produk : ";
            cin >> idProduct;
            cout << "Input Nama Baju : ";
            cin >> name;
            cout << "Input Brand : ";
            cin >> brand;
            cout << "Input Harga : ";
            cin >> price;
            cout << "Input Ukuran : ";
            cin >> size;
            cout << "Input Material / Bahan : ";
            cin >> material;
            cout << "Input Gender : ";
            cin >> gender;
            cout << "Input Warna : ";
            cin >> color;
            cout << "Input Tipe Lengan : ";
            cin >> sleeveType;

            Shirt shirt;
            shirt.setIdProduct(idProduct);
            shirt.setName(name);
            shirt.setBrand(brand);
            shirt.setPrice(price);
            shirt.setSize(size);
            shirt.setMaterial(material);
            shirt.setGender(gender);
            shirt.setColor(color);
            shirt.setSleeveType(sleeveType);
            vecData.push_back(shirt);

            cout << "Baik, data sudah ditambahkan!\n"
                 << endl;
        }
        else if (m == 2)
        {
            cout << "Berikut data baju yang ada" << endl;
            displayData(vecData);
        }
        else if (m == 3)
        {
            cout << "Terimakasih!" << endl;
        }
        else
        {
            cout << "Fitur yang dipilih tidak tersedia." << endl;
        }
    }

    return 0;
}