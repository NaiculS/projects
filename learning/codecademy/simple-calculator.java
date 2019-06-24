public class Calculator{
  Calculator(){
    
  }
  
  public int add(int a, int b){
    return a + b; 
  }
 
  public int subtract(int a, int b){
    return a - b;
  }
  
  public int multiply(int a, int b){
    return a * b;
  }
  
  public int divide(int a, int b){
    if (b==0){
      System.out.println("You can't divide by 0 dummy!");
    return 0;
      }
      else {
        return a/b;
      }
  }
 
  public int modulo(int a, int b){
    if (b==0){
      System.out.println("You can't divide by 0 dummy!");
    return 0;
      }
    else {
      return a % b;
    }
  }
  
  public static void main(String[] args){
    Calculator myCalculator = new Calculator ();
    	System.out.println(myCalculator.add(10, 2));
      System.out.println(myCalculator.subtract(10,2));
      System.out.println(myCalculator.multiply(10, 2));
      System.out.println(myCalculator.divide(10, 2));
      System.out.println(myCalculator.modulo(10, 2));
    
  }
  
  
  
}
