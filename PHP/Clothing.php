<?php

/*
Saya Muhammad Rizki Revandi dengan NIM 2205027 mengerjakan Latihan Praktikum 2
dalam mata kuliah Desain Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak
melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
*/

require_once 'product.php'; // Memasukkan file Product.php

// deklarasi kelas Product
class Clothing extends Product
{
    // atribut - atribut privat untuk size, material, dan gender
    private $size = "";
    private $material = "";
    private $gender = "";

    // konstruktor dengan parameter idProduct, name, brand, dan price
    public function __construct($idProduct = "", $name = "", $brand = "", $price = "", $size = "", $material = "", $gender = "")
    {
        parent::__construct($idProduct, $name, $brand, $price);
        $this->size = $size;
        $this->material = $material;
        $this->gender = $gender;
    }

    // get id product
    public function getSize()
    {
        return $this->size;
    }

    // set id product
    public function setSize($size)
    {
        $this->size = $size;
    }

    // get id product
    public function getMaterial()
    {
        return $this->material;
    }

    // set id product
    public function setMaterial($material)
    {
        $this->material = $material;
    }

    // get id product
    public function getGender()
    {
        return $this->gender;
    }

    // set id product
    public function setGender($gender)
    {
        $this->gender = $gender;
    }

    // Destructor
    function __destruct()
    {
        
    }
}
?>