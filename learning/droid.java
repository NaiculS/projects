public class Droid{
  int batteryLevel;
  /*
  This is basically just a very simplistic droid program that when run will output:
  Activated. How can I help you?
	Battery level is: 95 percent.
	Droid Charging...
	Battery level is: 100 percent.
	Hovering...
	Battery level is: 80 percent.
  */
  Droid(){
    batteryLevel=100;
  }
  
  public void activate(){
    System.out.println("Activated. How can I help you?");
    batteryLevel=batteryLevel-5;
      System.out.println("Battery level is: "+batteryLevel+" percent.");
  }
  
  public void chargeBattery(int hours){
    System.out.println("Droid Charging...");
    batteryLevel=batteryLevel+hours;
      if (batteryLevel>100){
        batteryLevel=100;
        System.out.println("Battery level is: "+batteryLevel+" percent.");
        }
    else {
      	System.out.println("Battery level is: "+batteryLevel+" percent.");
    }
  }
  
  public int checkBatteryLevel(){
    System.out.println("Battery level is: "+batteryLevel+" percent.");
    return batteryLevel;  
  }
  
  public void hover(int feet){
    if (feet>2){
      System.out.println("Error! I cannot hover above 2 feet.");
    }
    else{
      System.out.println("Hovering...");
      batteryLevel=batteryLevel-20;
      System.out.println("Battery level is: "+batteryLevel+" percent.");
    }
  }




public static void main(String[] args){
 	  Droid myDroid = new Droid();
  	myDroid.activate();
  	myDroid.chargeBattery(5);
  	myDroid.hover(1);
	}
}
