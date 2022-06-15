public class ArithmeticTest {

public static void main(String[] args) {
int i = 10;
int j = 20; 

double x = 10.5;
double y = 20.5;

x = x + 5 - y / 2 - j % 2 * i + 8 / 11;
y = j * 1 / i + x - 10 * y + 10;
i = (int) (x + 5 - y / 2 - j % 2 * i + 8 / 11);
j = (int) (j * 1 / i + x - 10 * y + 10);

// TODO Auto-generated method stub

System.out.println("HelloWorld");
System.out.println("x = " + x);
System.out.println("y = " + y);
System.out.println("i = " + i);
System.out.println("j = " + j);

}

}