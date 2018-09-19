public class CtoFTester{


    public static double celciusToFahrenheit(int temp){
      return temp * 1.8 + 32;
    }

    public static double fahrenheitToCelsius(int temp){
        return (temp - 32) / 1.8;
    }
    public static void main(){
      System.out.println(celciusToFahrenheit(5));
      System.out.println(fahrenheitToCelsius(5));
    }
}
