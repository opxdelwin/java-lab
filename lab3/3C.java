
import java.util.Scanner;

public class 3C {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length: ");
        int length= scan.nextInt();
        System.out.println("Enter breadth: ");
        int breadth= scan.nextInt();
        Rectangle rectangle = new Rectangle(length, breadth);
        rectangle.display();
    }
}

class Rectangle{
    int length, breadth;
    Rectangle(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    int prerimeter(){
        return (2*(length+breadth));
    }
    int area(){
        return length*breadth;
    }
    void display(){
        int area = area();
        int preimeter =prerimeter();
        System.out.println("The area is: "+ area + "cm^2 and the perimeter is: "+ preimeter + "cm.");
    }
}
