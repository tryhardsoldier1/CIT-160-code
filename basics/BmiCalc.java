// This program calculates a person's BMI

public class BmiCalc {
    public static void main (String[] args){
        final double KILOGRAMS_PER_POUND = 0.454;
        final double METERS_PER_FOOT = 0.3046;

        double weightInPounds = 75.5;
        double heightInFeet = 4.5;

        double metricWeight = weightInPounds * KILOGRAMS_PER_POUND;
        double metricHeight = heightInFeet * METERS_PER_FOOT;
        double bmi = metricWeight / (metricHeight * metricHeight);

        System.out.println("BMI: " + bmi);
    }
}
