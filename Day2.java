import java.util.Scanner;

public class Day2 {
public static void main(String[] args){


Scanner scanner = new Scanner(System.in);

System.out.println("Write name : ");
String name = scanner.nextLine();
System.out.println("my name is " + name);
}
}

class Day2b {
    static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("pick a verb: "); 
        String verb1 = scanner.nextLine(); 
    }
}

class Day2c{
    public static void main(String[] args){
        int num = 7;
        String word = "blur";
        double dec = 3.14;
        boolean guess = true;

        System.out.println("text variable: " + num);
        System.out.println("word varaible: " + word);
        System.out.println("floating point varirable :" + dec);
        System.out.println("boolean variable: " + guess);
    }
}

class Day2d{
    public static void main(String[] args){
        int num = 7;
        num = 8;
        System.out.println(num);
    }
}

class Day2e{
    public static void main(String[] args){
        int num = -1;
        if (num > 0){
            System.out.println("Greater");
        }else{
            System.out.println("Less");
        }
    }
}

class Day2f{
    public static void main(String[]args){
        int num = 0;
        while (num<1){
            System.out.println(num);
            num = num +1;
        }
        System.out.println("finish");
    }
}

class Day2g{
    public static void main(String[] args){
        int start = 1;
        int end = 5;
        for(int i=start;i<=end;i++){
            System.out.println("Count: " + i);
        }
    }
}

class Day2h{
    public static void main(String[]args){
        System.out.println("this is the question: ");
        questioner();
    }
    public static void questioner(){
        Scanner scanner = new Scanner(System.in);
        String attribute = scanner.nextLine();
        System.out.println("what animal" + " is the " + attribute);
    }
}