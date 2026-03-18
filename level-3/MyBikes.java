
class Bike {
    public void ignition() {
        System.out.println("Bike is started");
    }

    public void accelerated() {
        System.out.println("Accelerated");
    }

    public void applyBrake() {
        System.out.println("Bike stops");
    }
}

class SuperBike extends Bike {
    @Override
    public void accelerated() {
        System.out.println("Accelerated in high speed");
    }
}

class Moped extends Bike {
    @Override
    public void accelerated() {
        System.out.println("Accelerated in medium speed");
    }
}

class ElectricBike extends Bike {
    @Override
    public void accelerated() {
        System.out.println("Accelerated in low speed");
    }
}

public class MyBikes {
    public static void main(String[] args) {
        SuperBike sb = new SuperBike();
        sb.ignition();
        sb.accelerated();
        sb.applyBrake();
        Moped mp = new Moped();
        mp.ignition();
        mp.accelerated();
        mp.applyBrake();
        ElectricBike eb = new ElectricBike();
        eb.ignition();
        eb.accelerated();
        eb.applyBrake();


    }
}
