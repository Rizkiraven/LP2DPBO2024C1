# Saya Muhammad Rizki Revandi dengan NIM 2205027 mengerjakan Latihan Praktikum 2
# dalam mata kuliah Desain Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak
# melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

# impor kelas Product
from Product import Product

# deklarasi kelas Clothing
class Clothing(Product):
    # atribut - atribut privat untuk size, material, dan gender
    __size = ""
    __material = ""
    __gender = ""
    
    # konstruktor dengan parameter self, size, material, dan gender
    def __init__(self, size = "", material = "", gender = ""):
        self.__size = size
        self.__material = material
        self.__gender = gender
        
    # untuk get size
    def getSize(self):
        return self.__size
    
    # untuk set size
    def setSize(self, size):
        self.__size = size
        
    # untuk get material
    def getMaterial(self):
        return self.__material
    
    # untuk set material
    def setMaterial(self, material):
        self.__material = material
        
    # untuk get gender
    def getGender(self):
        return self.__gender
    
    # untuk set gender
    def setGender(self, gender):
        self.__gender = gender