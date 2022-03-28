/**
 * Given a valid (IPv4) IP address, return a defanged version of that IP address.
 *
 * A defanged IP address replaces every period "." with "[.]".
 */

public class DefangingAnIP {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        String result = defanging(address);

        System.out.println("The defanged IP address is " + result);
    }

    private static String defanging(String address) {
        return address.replaceAll("[.]", "[.]");
    }
}
