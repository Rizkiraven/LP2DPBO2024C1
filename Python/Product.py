# Saya Muhammad Rizki Revandi dengan NIM 2205027 mengerjakan Latihan Praktikum 2
# dalam mata kuliah Desain Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak
# melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

# deklarasi kelas Product
class Product:
    # atribut - atribut privat untuk idProduct, name, brand, dan price
    __idProduct = ""
    __name = ""
    __brand = ""
    __price = ""
    
    # konstruktor dengan parameter self, idProduct, name, brand, dan price
    def __init__(self, idProduct = "", name = "", brand = "", price = ""):
        self.__idProduct = idProduct
        self.__name = name
        self.__brand = brand
        self.__price = price
        
    # untuk get id produk
    def getIdProduct(self):
        return self.__idProduct
    
    # untuk set id produk
    def setIdProduct(self, idProduct):
        self.__idProduct = idProduct
        
    # untuk get id produk
    def getName(self):
        return self.__name
    
    # untuk set id produk
    def setName(self, name):
        self.__name = name
        
    # untuk get id produk
    def getBrand(self):
        return self.__brand
    
    # untuk set id produk
    def setBrand(self, brand):
        self.__brand = brand
        
    # untuk get id produk
    def getPrice(self):
        return self.__price
    
    # untuk set id produk
    def setPrice(self, price):
        self.__price = price