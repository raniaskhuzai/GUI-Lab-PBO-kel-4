import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Muhammad Suhail Haritsah
 */
public class Menu {
    
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        
        System.out.println("daftar menu :   ");
       
        System.out.println("1. spaghetti" + "\nHarga : Rp. 10.000 ");
        System.out.println("2. Ocha" + "\nHarga: Rp. 10.000  ");
        System.out.println("3. nasi goreng " + "\nHarga : Rp. 15.000");
        System.out.println("4. roti daging" + "\nHarga : Rp. 5.000");
        System.out.println("5. burger" + "\nHarga : Rp. 20.000");
        System.out.println("6. bakso kuah" + "\nHarga : Rp. 12.000");
        System.out.println("7. nasi uduk" + "\nHarga : Rp. 10.000");
        System.out.println("\n\tMasukkan pilihan anda  : ");
        
        byte menu = input.nextByte();
        
        
        
        switch (menu)
        {
            case 1 :
                System.out.println("\nAnda memilh spaghetti \n" + "\nDengan harga Rp.10.000");
                break;
                
            case 2 :
                System.out.println("\nAnda memilih Ocha \n" + "\nDengan harga Rp.10.000");
                break;
                
            case 3 :
                System.out.println("\nAnda memilih nasi goreng \n" + "\nDengan harga Rp.15.000");
                break;
                
            case 4 :
                System.out.println("\nAnda memilih roti daging \n" + "\nDengan harga Rp.5.000");
                break;
                
            case 5 :
                System.out.println("\nAnda memilih burger \n" + "\nDengan harga Rp.20.000");
                break;
                
            case 6 :
                System.out.println("\nAnda memilih bakso kuah \n" + "\nDengan harga Rp.12.000");
                break;
                
            case 7 :
                System.out.println("\nAnda memilih nasi uduk \n" + "\nDengan harga Rp.10.000");
                break;
                
            default :
                System.out.println("\nMakanan yang anda pilih tidak tersedia \n");
                break;
        }
    }
    
}
