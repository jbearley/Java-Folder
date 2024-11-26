import java.util.Scanner;

class Bank{
    public float interest(float a, float b){
        float num = a*b;
        return num ;}
    public float interest(float a, float b, float c){
        float num = a*b*c;
        return num ;}

}

class IRA extends Bank{
    public float interest(float a, float b){
        float num = a+b;
        return num;
    }
}

public class Day3{
    public static void main( String args[]) {
        
  Scanner scanner = new Scanner(System.in);

    System.out.println("pick a number: ");
    Float x = Float.parseFloat(scanner.nextLine());

    System.out.println("pick a number: ");
    Float y = Float.parseFloat(scanner.nextLine());

    System.out.println("pick a number: ");
    Float z = Float.parseFloat(scanner.nextLine());

  Bank bank_num = new Bank();

  System.out.println(bank_num.interest(x, y, z));

  Bank ira_num = new IRA(); 

  System.out.println(ira_num.interest(x,y));

  scanner.close();

   }
}
