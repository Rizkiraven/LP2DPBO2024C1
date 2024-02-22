# Saya Muhammad Rizki Revandi dengan NIM 2205027 mengerjakan Latihan Praktikum 2
# dalam mata kuliah Desain Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak
# melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

# impor kelas Clothing
from Clothing import Clothing

# deklarasi kelas Clothing
class Shirt(Clothing):
    # atribut - atribut privat untuk color dan sleeveType
    __color = ""
    __sleeveType = ""
    
    # konstruktor dengan parameter self, color, dan sleeveType
    def __init__(self, color = "", sleeveType = ""):
        self.__color = color
        self.__sleeveType = sleeveType
        
    # untuk get color
    def getColor(self):
        return self.__color
    
    # untuk set color
    def setColor(self, color):
        self.__color = color
        
    # untuk get sleeveType
    def getSleeveType(self):
        return self.__sleeveType
    
    # untuk set sleeveType
    def setSleeveType(self, sleeveType):
        self.__sleeveType = sleeveType