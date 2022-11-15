public class TransportManagement {

    public static Transport[] transports;
    public static Road[] roads;


    public static void initSystem(int numOfTransports, int numOfRoads){                   //setting array lengths
        transports = new Transport[numOfTransports];
        roads = new Road[numOfRoads];
    }

    public static void setRoad(Road road, int index){
        if(index>= transports.length || index<0){
            System.out.println("Sorry, index is out of bounds");
            return;
        }
        roads [index] = road;
    }

    public static void setTransports(Transport transport, int index){
        if(index>= transports.length || index<0){
            System.out.println("Sorry, index is out of bounds");
            return;
        }
        transports [index] = transport;
    }

    public static void getTransports(Transport[]transports){
        for (int i =0; i<transports.length; i++){
            System.out.println(transports[i]);
        }
    }

    public static void getRoads(Road[]roads){
        for (int i =0; i<roads.length; i++){
            System.out.println(roads[i]);
        }
    }


    public static void main(String[] args) {

       initSystem(3,3);

        Transport transport1 = new Transport(6.0, 50.0);
        Transport transport2 = new Transport(5.0, 12.0);
        Transport transport3 = new Transport(5.5, 45.0);

        setTransports(transport1,0);
        setTransports(transport2,1);
        setTransports(transport3,2);


        Road road1 = new Road("Riga", "Talinn", 280);
        Road road2 = new Road("Riga", "Vilnius", 262);
        Road road3 = new Road("Riga", "Jurmala", 20);

        setRoad(road1, 0);
        setRoad(road2, 1);
        setRoad(road3, 2);


        getTransports(transports);
        System.out.println("------------------------------------------------------------------------------------------");
        getRoads(roads);

        System.out.println("------------------------------------------------------------------------------------------");


        transport1.move(road3);                                                                     //ENOUGH FUEL
        System.out.println("------------------------------------------------------------------------------------------");
        transport2.move(road1);                                                                    //NOT ENOUGH FUEL


        System.out.println("------------------------------------------------------------------------------------------");

        System.out.print("\nFirst transport arrived:");
        System.out.println(road3.getArrived());
        System.out.print("Second transport arrived:");
        System.out.println(road1.getArrived());

    }

}
