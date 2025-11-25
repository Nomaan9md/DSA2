package OOPS;

public class polyMorphism2 {
// run time polymorphism
    class paymentProcessor {
        public void process(double amount) {
            System.out.println("Processing Rs : " + amount);
        }
    }

    class UPIProcessor extends paymentProcessor {
        String UPI_id = "user@upi";

        @Override
        public void process(double amount) {
            System.out.println("Processing Rs : " + amount + " to " + UPI_id);
        }
    }

    public static void main(String[] args) {
        polyMorphism2 obj = new polyMorphism2();

        //paymentProcessor is the parent class.
        //UPIProcessor is the child class.
        paymentProcessor p = obj.new UPIProcessor(); // ✅ upcasting
        p.process(500); // ✅ child method runs = runtime polymorphism
    }
}

