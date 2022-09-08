public class Ingrediens {
    private String type;
    private double amount;
    private String unit;
    private double weight;
    private double energy;

    private int antalPersoner;

    //Konstant
    private final int NUMBER_OF_ORIGINAL_PERSONS = 4;

//Konstruktør
public Ingrediens(String type, double amount, String unit, double weight, double energy) {
    this.type = type;
    this.amount = amount;
    this.unit = unit;
    this.weight = weight;
    this.energy = energy;

}

//Get metode
public String getType (){
    return type;
}
    public double getAmount (){
        return amount;
    }

    public String getUnit (){
        return unit;
    }
    public  double getWeight(){
    return weight;
    }
    public double getEnergy (){
    return energy;
    }

    //Beregningen
    public double amountForPersons() {
    return getAmount()/NUMBER_OF_ORIGINAL_PERSONS * antalPersoner;
}

    public void amountForPersons1(int numberOfPersons) {
        this.amount = amount * numberOfPersons;
        this.weight = weight * numberOfPersons;
        this.energy = energy * numberOfPersons;
        this.antalPersoner = numberOfPersons;
    }

    public double weightForPersons() {
       return getWeight()/NUMBER_OF_ORIGINAL_PERSONS * antalPersoner;
    }

    public double energyForPersons() {
    return getEnergy()/NUMBER_OF_ORIGINAL_PERSONS * antalPersoner;
    }

    //Set metode
    public void setAntalPersoner (int antalPersoner){
    this.antalPersoner = antalPersoner;
    }

    @Override
    public String toString() {
        return "Opskrift{" +
                "type='" + type + '\'' +
                ", amount=" + amount +
                ", unit='" + unit + '\'' +
                ", weight=" + weight +
                ", energy=" + energy +
                ", antalPersoner=" + antalPersoner;
    }
}


