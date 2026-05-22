package mini_projects;

public class BatteryChargingSimulation {
    public static void main(String[] args) {

        int battery = 10;

        int minutes = 0;

        while (battery != 100) {

            battery += 10;

            minutes++;
        }

        System.out.println("Time taken to fully charge = " + minutes + " minutes");
    }
}
