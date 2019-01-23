public class Magic {
	public static void main(String[] args) {
/* myNumber will be refered to as original number
		It will also be the number you input
*/
		int myNumber=5;
		// Steps 1-6 follow
    	int stepOne=myNumber*myNumber;
    	int stepTwo=stepOne+myNumber;
	int stepThree= stepTwo/myNumber;
   	int stepFour=stepThree+17;
    	int stepFive=stepFour-myNumber;
    	int stepSix=stepFive/6;
    
		// All math is done by this point, only stepSix has to be printed out.
    System.out.println(stepSix);
// System should always print out 3 no matter what myNumber is set to

	}
}
