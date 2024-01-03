import java.util.Scanner;

class Main {
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number: ");
    double number = scan.nextDouble();
    System.out.println("The number you chose is " + number);

    System.out.println("1: Absolute Value");
    System.out.println("2: Sine");
    System.out.println("3: Cosine");
    System.out.println("4: Tangent");
    System.out.println("5: Square Root");
    System.out.println("6: Conversion to Radians");
    System.out.println("7: Area of a Circle");
    System.out.println("8: Perimeter of a Circle");
    System.out.println("9: Square");
    System.out.println("10: Degrees to Radians");
    System.out.println("11: E raised to given power");
    System.out.println("-----------");
    System.out.println("Enter Choice ->");
    int choice = scan.nextInt();
    switch (choice) {
      case 1:
        System.out.println(Math.abs(number));
        break;
        
      case 2:
        double sinrad = Math.toRadians(number);
        double sin = Math.round(Math.sin(sinrad) * Math.pow(10,14))/Math.pow(10,14);
        System.out.println("Sine: " + sin);
        break;

      case 3:
        double cosrad = Math.toRadians(number);
        double cos = Math.round(Math.cos(cosrad) * Math.pow(10,14))/Math.pow(10,14);
        System.out.println("Cosine: " + cos);
        break;

      case 4:
        double tanrad = Math.toRadians(number);
        double tan = Math.round(Math.tan(tanrad) * Math.pow(10,14))/Math.pow(10,14);
        System.out.println("Tangent: " + tan);
        break;

      case 5:
        System.out.println("Square root: " + Math.sqrt(number));
        break;

      case 6:
        System.out.println(Math.toRadians(number));
        break;

      case 7:
        System.out.println("Circle Area: " + Math.PI * Math.pow(number,2));
        break;

      case 8:
        System.out.println("Circumference: " + (2 * Math.PI * number));
        break;

      case 9:
        System.out.println("Square: " + Math.pow(number,2));
        break;

      case 10:
        System.out.println(Math.toDegrees(number));
        break;

      case 11:
        System.out.println(Math.exp(number));
        break;

      default:
        System.out.println("Invalid Option");
    }
  }
}