<?php

require ('Clothing.php'); // Memasukkan file Clothing.php

// deklarasi kelas Product
class Shirt extends Clothing
{
    // atribut - atribut privat untuk color dan sleeveType
    private $color = "";
    private $sleeveType = "";

    // konstruktor dengan parameter idProduct, name, brand, dan price
    public function __construct($color = "", $sleeveType = "", $size = "", $material = "", $gender = "", $idProduct = "", $name = "", $brand = "", $price = "")
    {
        parent::__construct($size, $material, $gender, $idProduct, $name, $brand, $price);
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