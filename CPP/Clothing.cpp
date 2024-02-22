/*
Saya Muhammad Rizki Revandi dengan NIM 2205027 mengerjakan Latihan Praktikum 2
dalam mata kuliah Desain Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak
melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
*/

// library yang digunakan
#include <iostream>
#include <string>
#include "Product.cpp"

// import standard namespace
using namespace std;

// deklarasi kelas Clothing yang merupakan child class dari kelas Product
class Clothing : public Product
{
    // atribut - atribut privat untuk size, material, dan gender
    private:
        string size;
        string material;
        string gender;
    
    public:
        // constructor
        Clothing()
        {
            // set size, material, dan gender ke default
            this->size = "";
            this->material = "";
            this->gender = "";
        }

        Clothing(string size, string material, string gender)
        {
            this->size = size;
            this->material = material;
            this->gender = gender;
        }

        /* getrer dan setrer setiap atribut */
        string getSize()
        {
            return this->size;
        }

        void setSize(string size)
        {
            this->size = size;
        }

        string getMaterial()
        {
            return this->material;
        }

        void setMaterial(string material)
        {
            this->material = material;
        }

        string getGender()
        {
            return this->gender;
        }

        void setGender(string gender)
        {
            this->gender = gender;
        }

        // destructor
        ~Clothing()
        {
            
        }
};