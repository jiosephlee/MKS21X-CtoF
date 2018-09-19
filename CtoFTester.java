public class CtoFTester{

    public static void main(String[] args){
      System.out.println(celsiusToFahrenheit(5) );
      System.out.println(fahrenheitToCelsius(5));
    }
    public static double celsiusToFahrenheit(int temp){
      return temp * 1.8 + 32;
    }

    public static double fahrenheitToCelsius(int temp){
        return (temp - 32) / 1.8;
    }
}
