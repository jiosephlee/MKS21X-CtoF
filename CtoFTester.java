public class CtoFTester{


  public static void main(double arg){
    System.out.println(celciusToFahrenheit(arg));
    System.out.println(fahrenheitToCelsius(arg));
  }

    public static int celciusToFahrenheit(int temp){
      return temp × 1.8 + 32;
    }

    public static int fahrenheitToCelsius(int temp){
        return (temp - 32) / 1.8;
    }
    
}
