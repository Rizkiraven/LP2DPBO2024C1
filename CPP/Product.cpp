/*
Saya Muhammad Rizki Revandi dengan NIM 2205027 mengerjakan Latihan Praktikum 2
dalam mata kuliah Desain Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak
melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
*/

// library yang digunakan
#include <iostream>
#include <string>

// import standard namespace
using namespace std;

// deklarasi kelas Product
class Product
{
    // atribut - atribut privat untuk idProduct, name, brand, dan price
    private:
        string idProduct;
        string name;
        string brand;
        string price;

    public:
        // constructor
        Product()
        {
            // set id, nama, bidang, dan partai ke default
            this->idProduct = "";
            this->name = "";
            this->brand = "";
            this->price = "";
        }

        Product(string idProduct, string name, string brand, string price)
        {
            this->idProduct = idProduct;
            this->name = name;
            this->brand = brand;
            this->price = price;
        }

        /* getter dan setter setiap atribut */
        string getIdProduct()
        {
            return this->idProduct;
        }

        void setIdProduct(string idProduct)
        {
            this->idProduct = idProduct;
        }

        string getName()
        {
            return this->name;
        }

        void setName(string name)
        {
            this->name = name;
        }

        string getBrand()
        {
            return this->brand;
        }

        void setBrand(string brand)
        {
            this->brand = brand;
        }

        string getPrice()
        {
            return this->price;
        }

        void setPrice(string price)
        {
            this->price = price;
        }

        // destuctor
        ~Product()
        {
            
        }
};