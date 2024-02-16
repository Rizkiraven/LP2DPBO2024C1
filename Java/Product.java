/*
Saya Muhammad Rizki Revandi dengan NIM 2205027 mengerjakan Latihan Praktikum 2
dalam mata kuliah Desain Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak
melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
*/

// deklarasi kelas Product
class Product
{
    // atribut - atribut privat untuk idProduct, name, brand, dan price
    private String idProduct;
    private String name;
    private String brand;
    private String price;

    // konstruktor
    public Product()
    {
        this.idProduct = "";
        this.name = "";
        this.brand = "";
        this.price = "";
    }

    // konstruktor dengan parameter idProduct, name, brand, dan price
    public Product(String idProduct, String name, String brand, String price)
    {
        this.idProduct = idProduct;
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    // get IdProduct
    public String getIdProduct()
    {
        return this.idProduct;
    }

    // set IdProduct
    public void setIdProduct(String idProduct)
    {
        this.idProduct = idProduct;
    }

    // get Name
    public String getName()
    {
        return this.name;
    }

    // set Name
    public void setName(String name)
    {
        this.name = name;
    }

    // get Brand
    public String getBrand()
    {
        return this.brand;
    }

    // set Brand
    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    // get Price
    public String getPrice()
    {
        return this.price;
    }

    // set Price
    public void setPrice(String price)
    {
        this.price = price;
    }
}