import java.util.Scanner;

class Kelvin{
    public double kelvinToFahrenheit(double temp){
        return (temp - 273) * 1.8 +32;
    }
    public double kelvinToCelsius(double temp){
        return temp -273;
    }
}

class Celsius{
    public double celsiusToKelvin(double temp){
        return temp + 273;
    }
    public double celsiusToFahrenheit(double temp){
        return temp*1.8 + 32;
    }
}

class Fahrenheit{
    public double fahrenheitToCelsius(double temp){
        return (temp-32)/1.8;
    }
    public double fahrenheitToKelvin(double temp){
        return (temp-32)* 5/9 +273;
    }
}
public class Questao02 {
    public static void main(String[] args) {

        Celsius objCelsius= new Celsius();
        Fahrenheit objFahrenheit= new Fahrenheit();
        Kelvin objKelvin= new Kelvin();
        Scanner objScanner= new Scanner(System.in);

        double temp=0, celsius=0, kelvin=0, fahren=0;
        char escala;

        System.out.printf("Temperatura: ");
        temp= objScanner.nextDouble();
        System.out.printf("Escala (C-Celsius; K-Kelvin; F-Fahrenheit): ");
        escala= Character.toUpperCase(objScanner.next().charAt(0));

        switch (escala) {
            case 'C':
                celsius = temp;
                kelvin = objCelsius.celsiusToKelvin(temp);
                fahren = objCelsius.celsiusToFahrenheit(temp);
                break;
            case 'F':
                fahren = temp;
                kelvin = objFahrenheit.fahrenheitToKelvin(temp);
                celsius = objFahrenheit.fahrenheitToCelsius(temp);
                break;
            case 'K':
                kelvin = temp;
                celsius = objKelvin.kelvinToCelsius(temp);
                fahren = objKelvin.kelvinToFahrenheit(temp);
                break;
            default:
                System.out.printf("Escala inválida.");
        }
        System.out.printf("Celsius: %.1f°\nKelvin: %.1f°\nFahrenheit:%.1f°", celsius, kelvin, fahren);

    }


}