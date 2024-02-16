/*
Saya Muhammad Rizki Revandi dengan NIM 2205027 mengerjakan Latihan Praktikum 2
dalam mata kuliah Desain Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak
melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
*/

// deklarasi kelas Shirt yang merupakan child class dari kelas Clothing
class Shirt extends Clothing
{
    // atribut - atribut privat untuk color dan sleeveType
    private String color;
    private String sleeveType;

    // konstruktor
    public Shirt()
    {
        this.color = "";
        this.sleeveType = "";
    }

    // konstruktor dengan parameter color dan sleeveType
    public Shirt(String color, String sleeveType)
    {
        this.color = color;
        this.sleeveType = sleeveType;
    }

    // get Color
    public String getColor()
    {
        return this.color;
    }

    // set Color
    public void setColor(String color)
    {
        this.color = color;
    }

    // get SleeveType
    public String getSleeveType()
    {
        return this.sleeveType;
    }

    // set SleeveType
    public void setSleeveType(String sleeveType)
    {
        this.sleeveType = sleeveType;
    }
}