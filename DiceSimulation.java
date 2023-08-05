import java.util.Random;

public class DiceSimulation {
    public static void main(String[] args) {
        int[] frequencies = new int[11]; // array to store the frequencies of sums 2 to 12
        Random random = new Random();

        // roll the dice 1296 times
        for (int i = 0; i < 1296; i++) {
            int dice1 = random.nextInt(6) + 1; // roll the first die
            int dice2 = random.nextInt(6) + 1; // roll the second die
            int sum = dice1 + dice2; // calculate the sum of the two dice
            frequencies[sum-2]++; // increment the frequency of the corresponding sum
        }

        // print the results in a tabular format
        System.out.println("Sum\tFrequency");
        for (int i = 2; i <= 12; i++) {
            System.out.println(i + "\t" + frequencies[i-2]);
        }
        
        // calculate the Chi-square value
        double chiSquare = 0.0;
        double[] expectedFrequencies = {36, 72, 108, 144, 180, 216, 180, 144, 108, 72, 36};
        for (int i = 0; i < 11; i++) {
            double observed = frequencies[i];
            double expected = expectedFrequencies[i];
            chiSquare += (observed - expected) * (observed - expected) / expected;
        }
        
        // print the Chi-square value and the conclusion
        System.out.println("Chi-square value = " + chiSquare);
        if (chiSquare > 18.307) {
            System.out.println("The dice are biased.");
        } else {
            System.out.println("The dice are unbiased.");
        }
    }
}