public class CtoFTester{

    public static void main(String[] arg){
      System.out.println(celciusToFahrenheit(5));
      System.out.println(fahrenheitToCelsius(5));
    }
    public static double celciusToFahrenheit(int temp){
      return temp * 1.8 + 32;
    }

    public static double fahrenheitToCelsius(int temp){
        return (temp - 32) / 1.8;
    }
}
