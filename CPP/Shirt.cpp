/*
Saya Muhammad Rizki Revandi dengan NIM 2205027 mengerjakan Latihan Praktikum 2
dalam mata kuliah Desain Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak
melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
*/

// library yang digunakan
#include <iostream>
#include <string>
#include "Clothing.cpp"

// import standard namespace
using namespace std;

// deklarasi kelas Clothing yang merupakan child class dari kelas Product
class Shirt : public Clothing
{
    private:
    // atribut - atribut privat untuk color dan sleeveType
    string color;
    string sleeveType;

    public:
    // constructor
        Shirt()
        {
            // set size, material, dan gender ke default
            this->color = "";
            this->sleeveType = "";
        }

        Shirt(string color, string sleeveType)
        {
            this->color = color;
            this->sleeveType = sleeveType;
        }

        /* getrer dan setrer setiap atribut */
        string getColor()
        {
            return this->color;
        }

        void setColor(string color)
        {
            this->color = color;
        }

        string getSleeveType()
        {
            return this->sleeveType;
        }

        void setSleeveType(string sleeveType)
        {
            this->sleeveType = sleeveType;
        }

        // destructor
        ~Shirt()
        {
            
        }
};