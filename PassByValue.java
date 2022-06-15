public class PassByValue
{
public static void main(String[] args) {
// TODO Auto-generated method stub
int numberMult = 50;
double numberDiv = 22.5;

printResult(numberMult);
printResult(numberDiv);


numMult(numberMult * numberMult);
//numMult(50);
numDiv(numberDiv / 5.0);
//System.out.println("Original Multiplication number is " + numberMult);
//System.out.println("Original Division number is " + numberDiv);
}
// this statement is used to multiply numMult & numberMult
public static void numMult(int printResult) {

      System.out.println("Multiplied value is " + printResult);
      // this next statement returns it to its original value
//return printResult;
}
public static void numDiv(double printResult) 
{
// TODO Auto-generated method stub
System.out.println("Divided value is " + printResult); 
}
public static void printResult(int input) {
System.out.println("Original value is " + input); 
}
public static void printResult(double input) {
System.out.println("Original value is " + input); 
}
}