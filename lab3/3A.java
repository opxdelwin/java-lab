import java.util.*;

public class 3A {
    
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter length: ");
        int length = scan.nextInt();
        System.out.print("Enter breadth: ");
        int breadth = scan.nextInt();
        System.out.print("Enter height: ");
        int height = scan.nextInt();
        Box box = new Box(length, breadth, height);
        int volume = box.volume();
        System.out.println("The volume of the box is: "+volume );
        scan.close();
    }
    
}
class Box{
    int length, breadth, height;
    Box(int l, int b, int h){
        this.length=l;
        this.breadth=b;
        this.height=h;
    }
    int volume(){
        return length*breadth*height;
    }
}
