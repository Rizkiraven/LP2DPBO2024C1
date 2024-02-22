# Saya Muhammad Rizki Revandi dengan NIM 2205027 mengerjakan Latihan Praktikum 2
# dalam mata kuliah Desain Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak
# melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

# impor kelas Shirt
from Shirt import Shirt

def displayData(listData):
    idTerpanjang = 10
    namaTerpanjang = 4
    brandTerpanjang = 5
    priceTerpanjang = 5
    sizeTerpanjang = 4
    materialTerpanjang = 8
    genderTerpanjang = 6
    colorTerpanjang = 5
    sleeveTypeTerpanjang = 11
    
    for data in listData:
        if len(data.getIdProduct()) > idTerpanjang:
            idTerpanjang = len(data.getIdProduct())
            
        if len(data.getName()) > namaTerpanjang:
            namaTerpanjang = len(data.getName())
            
        if len(data.getBrand()) > brandTerpanjang:
            brandTerpanjang = len(data.getBrand())
            
        if len(data.getPrice()) > priceTerpanjang:
            priceTerpanjang = len(data.getPrice())
            
        if len(data.getSize()) > sizeTerpanjang:
            sizeTerpanjang = len(data.getSize())
            
        if len(data.getMaterial()) > materialTerpanjang:
            materialTerpanjang = len(data.getMaterial())
            
        if len(data.getGender()) > genderTerpanjang:
            genderTerpanjang = len(data.getGender())
            
        if len(data.getColor()) > colorTerpanjang:
            colorTerpanjang = len(data.getColor())
            
        if len(data.getSleeveType()) > sleeveTypeTerpanjang:
            sleeveTypeTerpanjang = len(data.getSleeveType())

    formatPrint = "| {:<{}s} | {:<{}s} | {:<{}s} | {:<{}s} | {:<{}s} | {:<{}s} | {:<{}s} | {:<{}s} | {:<{}s} |"

    print("+{}+{}+{}+{}+{}+{}+{}+{}+{}+".format('-' * (idTerpanjang + 2), '-' * (namaTerpanjang + 2), '-' * (brandTerpanjang + 2), '-' * (priceTerpanjang + 2), '-' * (sizeTerpanjang + 2), '-' * (materialTerpanjang + 2), '-' * (genderTerpanjang + 2), '-' * (colorTerpanjang + 2), '-' * (sleeveTypeTerpanjang + 2)))
    print(formatPrint.format("ID Product", idTerpanjang, "Name", namaTerpanjang, "Brand", brandTerpanjang, "Price", priceTerpanjang, "Size", sizeTerpanjang, "Material", materialTerpanjang, "Gender", genderTerpanjang, "Color", colorTerpanjang, "Sleeve Type", sleeveTypeTerpanjang))
    print("+{}+{}+{}+{}+{}+{}+{}+{}+{}+".format('-' * (idTerpanjang + 2), '-' * (namaTerpanjang + 2), '-' * (brandTerpanjang + 2), '-' * (priceTerpanjang + 2), '-' * (sizeTerpanjang + 2), '-' * (materialTerpanjang + 2), '-' * (genderTerpanjang + 2), '-' * (colorTerpanjang + 2), '-' * (sleeveTypeTerpanjang + 2)))

    for data in listData:
        print(formatPrint.format(data.getIdProduct(), idTerpanjang, data.getName(), namaTerpanjang, data.getBrand(), brandTerpanjang, data.getPrice(), priceTerpanjang, data.getSize(), sizeTerpanjang, data.getMaterial(), materialTerpanjang, data.getGender(), genderTerpanjang, data.getColor(), colorTerpanjang, data.getSleeveType(), sleeveTypeTerpanjang))

    print("+{}+{}+{}+{}+{}+{}+{}+{}+{}+".format('-' * (idTerpanjang + 2), '-' * (namaTerpanjang + 2), '-' * (brandTerpanjang + 2), '-' * (priceTerpanjang + 2), '-' * (sizeTerpanjang + 2), '-' * (materialTerpanjang + 2), '-' * (genderTerpanjang + 2), '-' * (colorTerpanjang + 2), '-' * (sleeveTypeTerpanjang + 2)))
    print()

# fungsi utama (main)
def main():
    listData = []
    
    m = 0
    
    while m != 3:
        print("+======================================+")
        print("|   Selamat datang ke pendataan Baju   |")
        print("+======================================+")
        print("Fitur - fitur yang tersedia :")
        print("1. Tambah Data Baju")
        print("2. Tampilkan Data Baju")
        print("3. Keluar\n")
        
        m = int(input("Fitur yang dipilih : ")) # tempat user menginput angka
        
        # jika m = 1 (inputan user adalah 1)
        if m == 1:
            idProduct = input("Input ID Produk : ")
            name = input("Input Nama Baju : ")
            brand = input("Input Brand : ")
            price = input("Input Harga : ")
            size = input("Input Ukuran : ")
            material = input("Input Material / Bahan : ")
            gender = input("Input Gender : ")
            color = input("Input Warna : ")
            sleeveType = input("Input Tipe Lengan : ")
            
            # menambahkan data baru ke list
            shirt = Shirt()
            shirt.setIdProduct(idProduct)
            shirt.setName(name)
            shirt.setBrand(brand)
            shirt.setPrice(price)
            shirt.setSize(size)
            shirt.setMaterial(material)
            shirt.setGender(gender)
            shirt.setColor(color)
            shirt.setSleeveType(sleeveType)
            listData.append(shirt)
            print("\nBaik, data sudah ditambahkan!\n")
            
        elif m == 2:
            print("Berikut data baju yang ada:")
            displayData(listData)
        elif m == 3:
            print("Terimakasih!")
            break
        else:
            print("Fitur yang dipilih tidak tersedia.")

if __name__ == "__main__":
    main()