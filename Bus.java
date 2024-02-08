public class Bus {
    private int stops;
    private int direction;
    private int currStop;
    private int busNumber;
    private static int numBusses = 0;

    public Bus(int st){
        stops = st;
        direction = 1;
            currStop = 1;
            numBusses++;
            busNumber = numBusses;
        }
        public Bus(){
            this(4);
        }
        public int getCurrentStop(){
            return currStop;
        }
        public void move(){
            currStop += direction;
            if(currStop == stops) direction = -1;
            if(currStop == 1) direction = 1;
        }
        public void move(int n){
            for(int i = 1; i <=n; i++){
                move();
            }
        }
        public boolean atSameStop(Bus other){
            return this.currStop==other.currStop;
        }
        public String toString(){
            return "Bus number " + busNumber + " at stop " + currStop;
        }
        public static int getNumberOfBusses(){
            return numBusses;
        }
        public static void main(String[] args){
            Bus bus1 = new Bus(3);
            Bus bus2 = new Bus(6);
            Bus bus3 = new Bus();
            bus1.move();
            bus1.move();
            bus1.getCurrentStop();
            System.out.println(bus1);
            bus2.move(3);
            bus2.getCurrentStop();
            System.out.println(bus2);
            System.out.println(bus1.atSameStop(bus2));
            bus3.move();
            System.out.println(bus3);
            System.out.println(Bus.getNumberOfBusses());
        }
    
    
    }
