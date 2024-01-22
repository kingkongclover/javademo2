package main;

import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        Hedgehog hedgehog = new Hedgehog();

        boolean exit = false;
        while (!exit) {
            System.out.println( "1) Pistä siili puhumaan, 2) Luo uusi siili, 3) Juoksuta siiliä, 0) Lopeta ohjelma" );
            
            if(scan.hasNext()) {
                int i = 0;
                String stringInput = scan.nextLine();
                i = Integer.parseInt(stringInput);

                switch(i) {
                    case 1:
                        System.out.println("Mitä siili sanoo:");
                        String puhe = scan.nextLine();
                        hedgehog.speak(puhe);
                        break;

                    case 2:
                        System.out.println("Anna siilin nimi:");
                        String name = scan.nextLine();
                        System.out.println("Anna siilin ikä:");
                        String age = scan.nextLine();
                        int ageParametri = Integer.parseInt(age);

                        hedgehog = new Hedgehog(name, ageParametri);
                        break;

                    case 3:
                        int j = 0;
                        System.out.println("Kuinka monta kierrosta?");
                        int kierros = Integer.parseInt(scan.nextLine());
                        while (j != kierros) {
                            hedgehog.juokse();
                            j++; 
                        }
                        break;

                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;
                        break;
                    
                    default:
                        System.out.println("Syöte oli väärä");
                        break;
                }
            }
            
        }



    }
        
}
