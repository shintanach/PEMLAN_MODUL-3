package MODUL3.CODELAB;

public class Main {
    public static void main(String[] args){
        Hewan hewan1 = new Hewan("Kucing","Mamalia","Nyann~~");
        hewan1.tampilkaninfo();
        System.out.println();
        Hewan hewan2 = new Hewan("Anjing", "Mamalia","Woof-Woof!!");
        hewan2.tampilkaninfo();
        Hewan hewan = new Hewan("Kambing", "Mamalia", "Mbek-mbek");
        hewan.tampilkaninfo();
    }

}
