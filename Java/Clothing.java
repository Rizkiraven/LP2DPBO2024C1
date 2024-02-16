/*
Saya Muhammad Rizki Revandi dengan NIM 2205027 mengerjakan Latihan Praktikum 2
dalam mata kuliah Desain Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak
melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
*/

// deklarasi kelas Clothing yang merupakan child class dari kelas Product
class Clothing extends Product
{
    // atribut - atribut privat untuk size, material, dan gender
    private String size;
    private String material;
    private String gender;

    // konstruktor
    public Clothing()
    {
        this.size = "";
        this.material = "";
        this.gender = "";
    }

    // konstruktor dengan parameter size, material, dan gender
    public Clothing(String size, String material, String gender)
    {
        this.size = size;
        this.material = material;
        this.gender = gender;
    }

    // get Size
    public String getSize()
    {
        return this.size;
    }

    // set Size
    public void setSize(String size)
    {
        this.size = size;
    }

    // get Material
    public String getMaterial()
    {
        return this.material;
    }

    // set Material
    public void setMaterial(String material)
    {
        this.material = material;
    }

    // get Gender
    public String getGender()
    {
        return this.gender;
    }

    // set Gender
    public void setGender(String gender)
    {
        this.gender = gender;
    }
}