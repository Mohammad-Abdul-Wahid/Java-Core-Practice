
class Plane {
    public void takeoff() {
        System.out.println("Plane is taking off");
    }

    public void fly() {
        System.out.println("Plane is flying");
    }

    public void land() {
        System.out.println("Plane is landing");
    }
}

class CargoPlane extends Plane {
    @Override
    public void fly() {
        System.out.println("CargoPlane fly in lower heights");
    }

    public void carryCargo() {
        System.out.println("Cargo plane carries cargo");
    }
}

class PassengerPlane extends Plane {
    @Override
    public void fly() {
        System.out.println("PassengerPlane fly in medium heights");
    }

    public void carryPassenger() {
        System.out.println("Passenger plane carries passenger");
    }
}

class FighterPlane extends Plane {
    @Override
    public void fly() {
        System.out.println("FighterPlane fly in higher heights");
    }

    public void carryArms() {
        System.out.println("Fighter plane carries Weapons");
    }
}

class Airport {
    public static void permit(Plane p) {
        System.out.println("Airport allowing the planes inside permit()");
        p.takeoff();
        p.fly();
        p.land();
        System.out.println();
    }
}


public class MyJets {
    public static void main(String[] args) {



//        Plane p;
//
//        p = cp;
//        p.fly();
//        ((CargoPlane) p).carryCargo();
//
////        cp.takeoff();
////        cp.fly();
////        cp.land();
////        cp.carryCargo();
//        System.out.println();
//        p = pp;
//        p.fly();
//        ((PassengerPlane) p).carryPassenger();
////        pp.takeoff();
////        pp.fly();
////        pp.land();
////        pp.carryPassenger();
//        System.out.println();
//        p = fp;
//        p.fly();
//        ((FighterPlane) p).carryArms();
////        fp.takeoff();
////        fp.fly();
////        fp.land();
////        fp.carryArms();

    }

}



