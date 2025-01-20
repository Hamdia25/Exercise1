import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // Hamdi Aden CSCI 1660 1/16/2025
        String city = "Columbus";
        int zipCode = 43215;
        int[] highTemp = {32, 25, 27, 40, 45};
        int sum = 0;
        int i;
        for (i = 0; i < highTemp.length; i++) {
            sum += highTemp[i];
        }
        double avg = (double) sum / highTemp.length;
        System.out.println("City: " + city + " " + " " + "Zip Code: " + zipCode + " " + "Average High Temperature: " + avg);

        }
    }
