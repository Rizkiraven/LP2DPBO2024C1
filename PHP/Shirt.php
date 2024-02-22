<?php

/*
Saya Muhammad Rizki Revandi dengan NIM 2205027 mengerjakan Latihan Praktikum 2
dalam mata kuliah Desain Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak
melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
*/

require_once 'Clothing.php'; // Memasukkan file Clothing.php

// deklarasi kelas Product
class Shirt extends Clothing
{
    // atribut - atribut privat untuk color dan sleeveType
    private $color = "";
    private $sleeveType = "";

    // konstruktor dengan parameter idProduct, name, brand, dan price
    public function __construct($idProduct = "", $name = "", $brand = "", $price = "", $size = "", $material = "", $gender = "", $color = "", $sleeveType = "",)
    {
        parent::__construct($idProduct, $name, $brand, $price, $size, $material, $gender);
        $this->color = $color;
        $this->sleeveType = $sleeveType;
    }

    // get id product
    public function getColor()
    {
        return $this->color;
    }

    // set id product
    public function setColor($color)
    {
        $this->color = $color;
    }

    // get id product
    public function getSleeveType()
    {
        return $this->sleeveType;
    }

    // set id product
    public function setSleeveType($sleeveType)
    {
        $this->sleeveType = $sleeveType;
    }

    // Destructor
    function __destruct()
    {
        
    }
}
?>