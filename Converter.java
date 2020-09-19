public class Converter {

        // This is the development branch

        //Your names go here:
        /*
         * @Author: Kenneth Loughery
         * Alan Joseph
         * Aaron Joseph
         *
         */
        private double celsiusToFahrenheit(double C){
// TODO: The third student will implement this method
            return (C*(9/5))+32;
        }
        private double fahrenheitToCelsius(double F){
            // TODO: The second student will implement this method
            return ((F-32)*5)/9;
        }

        private double kilometersToMiles(double K){
                return (K * 0.6213711923);
        }
        public static void main(String[] args) {
//TODO: The first student will implement this method.

// Call CelsiusToFahrenheit to convert 180 Celsius to Fahrenheit value.
        Converter myConverter = new Converter();
        double temperature = myConverter.celsiusToFahrenheit(180);
        System.out.println("180 degrees Celsius is " + temperature + " degrees Fahrenheit.");

// Call FahrenheitToCelsius to convert 250 Fahrenheit to Celsius value.
        temperature = myConverter.fahrenheitToCelsius(250);
        System.out.println("250 degrees Fahrenheit is " + temperature + " degrees Celsius.");


        }
}
