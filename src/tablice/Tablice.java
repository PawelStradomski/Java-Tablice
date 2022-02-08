
package tablice;
/**
 * 
 * @author pawelstradomski
 */

public class Tablice 
{

    
    public static void main(String[] args) 
    {
        /*
        TABLICE JEDNOWYMIAROWE (jeden wiersz, poziomo)
        
        --------------------------------------
        tab[0], tab[1], tab[2], tab[3], tab[4]
        --------------------------------------
        
        Tablice numerowane sa od zera
        
        int [] Tablica; - polecenie zadeklarowania tablicy i nazwy Tablica
        
        Tablica = new int [5]; - polecenie deklaracji w pamieci msc dla 5 tablic
                  tzn tak jakby 5 x 32 bity pamieci
        
        Tablica[0] = 1;
        Tablica[1] = 7;
        Tablica[2] = 55;
        Tablica[3] = 44;
        Tablica[4] = 87;
        
                    LUB WYGODNIEJ w jednym wierszu !!!
        
                    int [] Tablica = new int [5]
        
        */
        {
        int [] Tablica = new int [5];
        Tablica[0] = 1;
        Tablica[1] = 7;
        Tablica[2] = 55;
        Tablica[3] = 44;
        Tablica[4] = 87;
        System.out.println(Tablica[2]);}
        
        
        {
        int [] Tab2 = new int [1];
        Tab2[0] = 666;
            System.out.println(Tab2[0]);
        }
        
        {
        int [] Tab3 = {4, 14, 18, 19, 19, 44};
        
            System.out.println(Tab3[0]);
            System.out.println(Tab3.length);
            System.out.println(Tab3[Tab3.length-1]);
        }
        
        /*
        TABLICE WIELOWYMIAROWE
        --------------------------
        [0][0] | [0][1] | [0][2] |
        --------------------------
        [1][0] | [1][1] | [1][2] |
        --------------------------
        [2][0] | [2][1] | [2][2] |
        --------------------------
        [3][0] | [3][1] | [3][2] |
        --------------------------
        Rezerwujemy w pamiecia [4][3] bo 4 wiersze, 3 kolumny.
        Tablice zawsze numerujemy od 0.
        */
        
        // 1 sposob
        {
        int [][] Tab4 = new int [4][3];
        Tab4[3][2] = 8888;
        System.out.println(Tab4[3][2]);}
        
        // 2 sposob
        {
        int [][] Tab5 = 
        {
            {45, 46, 47},
            {48, 49, 50},
            {51, 52, 53},
            {54, 55, 56},
        };
        Tab5 [3][1] = 777; // tymczasowo zmienia wartosc np z 55 na 777
        System.out.println(Tab5[3][1]);
        
        //Tablice String
        
        String[] kursJava = new String[40];
        kursJava[0] = "java1";
        kursJava[1] = "java2";
            System.out.println(kursJava[0]);
            
        String[] kursProgramowania = {"java3", "java4", "java5"};
            System.out.println(kursProgramowania[1]);
            
        String[] kursPawla = {"java6", "java7", "java8"};
            System.out.println(kursPawla[0]);
            
        String[] daysOfWeek = 
        {"poniedzialek","wtorek","sroda","czwartek","piatek","sobota","niedziela"};
            System.out.println(daysOfWeek[0]);
            System.out.println(daysOfWeek[1]);
    }
        
        
        
    }
    
}
