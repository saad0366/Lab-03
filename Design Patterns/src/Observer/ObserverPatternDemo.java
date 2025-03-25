

public class ObserverPatternDemo {
   public static void main(String[] args) {
      Subject subject = new Subject();

      new HexaObserver(subject);
      Observer octalObserver = new OctalObserver(subject);
      Observer binaryObserver = new BinaryObserver(subject);

      System.out.println("First state change: 15");
      subject.setState(15);
      
      // Detach octal observer
      subject.detach(octalObserver);
      System.out.println("\nSecond state change (after detaching octal observer): 10");
      subject.setState(10);
   }
} 