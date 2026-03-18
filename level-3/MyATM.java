
class ATM {
    public void deposit() {
        System.out.println("Deposit in Bank");
    }

    public void withdraw() {
        System.out.println("Withdraw n Bank");
    }

    public void checkBalance() {
        System.out.println("Checkbalance in Bank");
    }
}

class SBIATM extends ATM {
    @Override
    public void deposit() {
        System.out.println("Deposit in SBI Bank");

    }

    @Override
    public void withdraw() {
        System.out.println("withdraw in SBI Bank");
    }

    @Override
    public void checkBalance() {
        System.out.println("CheckBalance in SBI Bank");
    }
}

class CanaraATM extends ATM {
    @Override
    public void deposit() {
        System.out.println("Deposit in Canara Bank");

    }

    @Override
    public void withdraw() {
        System.out.println("withdraw in Canara Bank");
    }

    @Override
    public void checkBalance() {
        System.out.println("CheckBalance in Canara Bank");
    }
}

class AxisATM extends ATM {

    @Override
    public void deposit() {
        System.out.println("Deposit in Axis Bank");

    }

    @Override
    public void withdraw() {
        System.out.println("withdraw in Axis Bank");
    }

    @Override
    public void checkBalance() {
        System.out.println("CheckBalance in Axis Bank");
    }
}

class Allow {
    public static void allowCheck(ATM a) {
        a.deposit();
        a.withdraw();
        a.checkBalance();
        System.out.println();
    }
}

public class MyATM {
    public static void main(String[] args) {
        SBIATM s = new SBIATM();
        CanaraATM c = new CanaraATM();
        AxisATM a = new AxisATM();
        Allow.allowCheck(s);
        Allow.allowCheck(c);
        Allow.allowCheck(a);


    }
}
