package brocodejava;

public class FortyTwo {

    public static void main(String[] args) {
        // polymorphism = The ability of an object to identify as more than one type

        CARO car = new CARO();
        BICYCLEO bicycle = new BICYCLEO();
        BOATO boat = new BOATO();
        
        // Can store all types of vehicles (car, bicycle, boat) in the same array
        VEHICLEO[] racers = {car, bicycle, boat};
        
        car.go();
        bicycle.go();
        boat.go();
        
        for (VEHICLEO x : racers) {
            x.go();
        }
    }
}
class VEHICLEO {
    public void go() {
        // Default behavior for vehicles
    }
}

class BICYCLEO extends VEHICLEO {
    @Override
    public void go() {
        System.out.println("The bicycle begins moving");
    }
}
class CARO extends VEHICLEO {
    @Override
    public void go() {
        System.out.println("The car begins moving");
    }
}
class BOATO extends VEHICLEO {
    @Override
    public void go() {
        System.out.println("The boat begins moving");
    }
}
