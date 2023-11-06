import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */
public class Programme_10TubeStation {
    public static void main(String[] args) {
        Programme_10TubeStation obj = new Programme_10TubeStation();
        obj.tubestation();
    }
    public void tubestation() {
        ArrayList<String> station = new ArrayList<>();
        station.add("LondonBridge");
        station.add("Bank");
        station.add("BakerStreet");
        station.add("BondStreet");
        station.add("OxfordCircus");
        station.add("Paddington");
        station.add("Westminister");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Zone 1 station names are : " + station);
        System.out.println("_______________________________________________________________________");

        System.out.println("Enter any Station name: ");
        String station1 = scanner.next();

        switch (station1) {
            case "londonbridge":
                System.out.println("Lines pass through LondonBridge : Northern line and Jubilee");
                break;
            case "bank":
                System.out.println("Lines pass through BakerStreet : Metropolitan, Central line, Hammersmith and City");
                break;
            case "bakerstreet":
                System.out.println("Lines pass through Baker Street : Metropolitan, Central line, Hammersmith and City");
                break;
            case "bondstreet":
                System.out.println("Lines pass through Bond Street : Metropolitan, Central line, Hammersmith and City");
                break;
            case "oxfordcircus":
                System.out.println("Lines pass through Oxford Circus : Central line, Northern Line, Elizabeth line ");
                break;
            case "paddington":
                System.out.println("Lines pass through Paddington : Circle line,District line,Elizabeth line,Hemmersmith and city,Bakerloo line ");
                break;
            case "westminister":
                System.out.println("Lines pass through Westminister : Jubilee line, Northern Line, Bakerloo line");
                break;
            default:
                System.out.println("Invalid Station name ");
        }
    }

}
