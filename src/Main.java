import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //User input
        System.out.println("Velkommen til Snobrøds opskriften");
        Opskrift snobroed = new Opskrift();
        int antalPersoner;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hvor mange personer skal opskriften være til?");
        antalPersoner = sc.nextInt();
        snobroed.setAntalPersoner(antalPersoner);

        System.out.println("----------------------------------------------------------------------------------------------");

        // Array
        Ingrediens[] ingredienser = snobroed.getIngredienser();

        //For-each loop
        for (Ingrediens ingrediens : ingredienser) {
            ingrediens.amountForPersons1(antalPersoner);
            System.out.println(ingrediens);

            System.out.println("-------------------------------------------------------------------------------------------");

        }
        System.out.println("Opskriftens totale vægt er: " + snobroed.GetTotalWeight() + " Gram"); //Kalder metoden i Opskrift klassen
        System.out.println("Opskriftens gennemsnitlige vægt er: " + snobroed.GetAverageWeight()); //Kalder metoden i Opskrift klassen
        System.out.println("Opskriftens indeholder: " + snobroed.GetEnergy() + " Kj"); // Kalder metode i Opskrift klassen
        System.out.println("Opskriftens gennemsnitlige er: " + snobroed.GetAverageEnergy() + " Kj"); //kalder metode i opskrift klassen
    }
}
