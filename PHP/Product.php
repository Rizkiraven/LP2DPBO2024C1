<?php

/*
Saya Muhammad Rizki Revandi dengan NIM 2205027 mengerjakan Latihan Praktikum 2
dalam mata kuliah Desain Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak
melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
*/

// deklarasi kelas Product
class Product
{
    // atribut - atribut privat untuk idProduct, name, brand, dan price
    private $idProduct = "";
    private $name = "";
    private $brand = "";
    private $price = "";

    // konstruktor dengan parameter idProduct, name, brand, dan price
    public function __construct($idProduct = "", $name = "", $brand = "", $price = "")
    {
        $this->idProduct = $idProduct;
        $this->name = $name;
        $this->brand = $brand;
        $this->price = $price;
    }

    // get id product
    public function getIdProduct()
    {
        return $this->idProduct;
    }

    // set id product
    public function setIdProduct($idProduct)
    {
        $this->idProduct = $idProduct;
    }

    // get id product
    public function getName()
    {
        return $this->name;
    }

    // set id product
    public function setName($name)
    {
        $this->name = $name;
    }

    // get id product
    public function getBrand()
    {
        return $this->brand;
    }

    // set id product
    public function setBrand($brand)
    {
        $this->brand = $brand;
    }

    // get id product
    public function getPrice()
    {
        return $this->price;
    }

    // set id product
    public function setPrice($price)
    {
        $this->price = $price;
    }

    // Destructor
    function __destruct()
    {
        
    }
}
?>