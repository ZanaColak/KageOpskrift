public class Opskrift {
    private int antalPersoner;
    private String navn;
    private Ingrediens[] ingredienser;

    //Constructor
    public Opskrift() {
        this.navn = "Snobrød";

        //Initializing
        Ingrediens vand = new Ingrediens("Vand",3, "Dl",500, 0);
        Ingrediens gær = new Ingrediens("Gær", 25,"Gram",20,400);
        Ingrediens salt = new Ingrediens("Salt", 1,"Tsk",20,0);
        Ingrediens mel = new Ingrediens("Mel", 500,"Gram",10,7000);

        this.ingredienser = new Ingrediens[]{vand, gær, salt, mel};

    }

    //Getmetode
    public String getNavn() {
        return navn;
    }

    public int getAntalPersoner() {
        return antalPersoner;
    }

    public Ingrediens[] getIngredienser() {
        return ingredienser;
    }

    public void setAntalPersoner(int antalPersoner) {
        //gem antallet af personer i opskriftens attribut
        this.antalPersoner = antalPersoner;

        for (Ingrediens ingrediens : ingredienser) {
            ingrediens.setAntalPersoner(antalPersoner);
        }
    }

    //Beregningsmetode af Vægten
    public double GetTotalWeight() {
        double weight = 0;
        for (Ingrediens ingrediens : ingredienser) {
            weight += ingrediens.weightForPersons();
        }
        return weight;
    }

    //Beregningsmetode af gennemsnittet
    public double GetAverageWeight() {
        double weight = GetTotalWeight();
        return weight / antalPersoner;
    }

    //Beregningsmetoden af energy i total
    public double GetEnergy() {
        double energy = 0;
        for (Ingrediens ingrediens : ingredienser) {
            energy += ingrediens.energyForPersons();
        }
        return energy;
    }

    //Beregningsmetode af gennemsnittet af energy
    public double GetAverageEnergy (){   //Beregning af det gennemsnitlige energi i opskriften
        double energy = GetEnergy();
        return energy / antalPersoner;   //Energy divideret med antalpersoner

    }
    }

