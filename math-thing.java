public class Magic {
	public static void main(String[] args) {
// myNumber will be refered to as original number
		int myNumber=5;
    int stepOne=myNumber*myNumber;
    int stepTwo=stepOne+myNumber;
		int stepThree= stepTwo/myNumber;
    int stepFour=stepThree+17;
    int stepFive=stepFour-myNumber;
    int stepSix=stepFive/6;
    
    System.out.println(stepSix);
// System should always print out 3 no matter what myNumber is set to

	}
}
