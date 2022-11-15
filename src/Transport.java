public class Transport {

    private int id;                               //should be generated (Random)
    private double consumption;                  // per 100 km; per 1km = divided by 100
    private double fuelTank;                     //fuel in fueltank

    static int counter = 0;                     //for id generation


    public Transport(double consumption, double fuelTank) {
        this.id = counter++;
        this.consumption = consumption;
        this.fuelTank = fuelTank;
    }

    public Transport() {
        this.id = 0;
        this.consumption = 0;
        this.fuelTank = 0;
    }

    @Override
    public String toString(){                             //inherited from Object class
        return "Transport { " + "\n"+
                " id: " + id + "\n"+
                " consumption: " + consumption + "\n"+
                " fuelTank: " + fuelTank + "\n"+
                " }";

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getConsuption() {
        return consumption;
    }

    public void setConsuption(float consumption) {
        this.consumption = consumption;
    }

    public double getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank(double fuelTank) {
        this.fuelTank = fuelTank;
    }

    public void move (Road road){

        if (road.getDistance() == 0){
            System.out.println("Sorry, distance is equal to 0 km, so you don't need to drive!");
            return;
        }

        if (road.getArrived()){
            System.out.println("This journey has been made");
            return;
        }

        double consumptionPerOneKm = consumption/100;
        double consumptionForOurDistance = road.getDistance() * consumptionPerOneKm;


        if(fuelTank>=consumptionForOurDistance){

            fuelTank-=consumptionForOurDistance;
            road.setArrived(true);

            System.out.println("\nYou have enough fuel to go from " + road.getFrom() + " to "
                    + road.getTo() + ", please see calculation below:\n");
            System.out.println("Fuel consumption per 100 km: " + consumption);
            System.out.println("Calculated consumption per 1 km: " + consumptionPerOneKm);
            System.out.println("Calculated consumption for " + road.getDistance() + " km distance: " + consumptionForOurDistance +
                    " liters");
            System.out.println("Fuel in your fueltank is equal to " + fuelTank + " liters that is enough to finish the distance.");

        }else{
            System.out.println("\nYou have NOT ENOUGH FUEL to go from " + road.getFrom() + " to "
                    + road.getTo() + ", please see calculation below:\n");
            System.out.println("Fuel consumption per 100 km: " + consumption);
            System.out.println("Calculated consumption per 1 km: " + consumptionPerOneKm);
            System.out.println("Calculated consumption for " + road.getDistance() + " km distance: " + consumptionForOurDistance +
                    " liters");
            System.out.println("Fuel in your fueltank is equal to " + fuelTank + " liters that is NOT ENOUGH to finish the distance.");
        }
    }
}
