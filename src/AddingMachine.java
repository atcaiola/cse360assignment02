public class AddingMachine {
  private int total;
  private StringBuffer memory;
  
  public static void main(String[] args) {
    AddingMachine myCalculator = new AddingMachine();
      
    myCalculator.add(4); 
    myCalculator.subtract(2); 
    myCalculator.add(5);
    
    System.out.print(myCalculator.toString());
  }

  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    memory = new StringBuffer("0");
  }
  
  public int getTotal () {
    return total;
  }
  
  public void add (int value) {
    total += value;
    memory.append(" + " + value);
  }

  public void subtract (int value) {
    total -= value;
    memory.append(" - " + value);
  }

  public String toString () {
    return memory.toString();
  }

  public void clear() {
    memory = new StringBuffer("0");  
  }
}