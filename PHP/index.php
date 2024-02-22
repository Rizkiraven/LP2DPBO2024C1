<?php

require ('Shirt.php'); // Memasukkan file Shirt.php

$data_pakaian = [];

function tambahData($idProduct, $name, $brand, $price, $size, $material, $gender, $color, $sleeveType)
{
    global $data_pakaian;
    // buat objek data pakaian baru
    $data_baru = new Shirt($idProduct, $name, $brand, $price, $size, $material, $gender, $color, $sleeveType);
    // tambahkan objek ke array anggota DPR
    $data_pakaian[] = $data_baru;
}

function tampilkanData()
{
    global $data_pakaian;
    // Tampilkan header tabel
    echo "<table border='1'>";
    echo "<tr>
            <th>ID Product</th>
            <th>Name</th>
            <th>Brand</th>
            <th>Price</th>
            <th>Size</th>
            <th>Material</th>
            <th>Gender</th>
            <th>Color</th>
            <th>SleeveType</th>
        </tr>";

    // Loop melalui setiap anggota DPR dan tampilkan informasinya
    foreach ($data_pakaian as $data)
    {
        echo '<tr>';
        echo '<td>' . $data->getIdProduct() . '</td>';
        echo '<td>' . $data->getName() . '</td>';
        echo '<td>' . $data->getBrand() . '</td>';
        echo '<td>' . $data->getPrice() . '</td>';
        echo '<td>' . $data->getSize() . '</td>';
        echo '<td>' . $data->getMaterial() . '</td>';
        echo '<td>' . $data->getGender() . '</td>';
        echo '<td>' . $data->getColor() . '</td>';
        echo '<td>' . $data->getSleeveType() . '</td>';
        echo '</tr>';
    }
    echo "</table>";
}

// Menambahkan beberapa anggota DPR secara hardcoded untuk demonstrasi
tambahData("01", "Baju Sugoi", "Uniqlo", "259999", "L", "Cotton", "Male", "White", "Regular");
tambahData("02", "Kimono", "Mitsugoshi", "500000", "XL", "Silk Cloth", "Female", "Red", "Kimono");
tambahData("03", "T-Shirt", "Zeta", "120000", "M", "Cotton Combed", "Female", "Black", "Regular");

echo "<h3>Data Pakaian</h3>";
tampilkanData();

// Menambahkan anggota DPR baru
tambahData("04", "Baju Keren", "H&M", "200000", "L", "Cotton", "Male", "Purple", "Short");
echo "<p>Baik, data baru sudah ditambahkan!</p>";
tampilkanData();
?>