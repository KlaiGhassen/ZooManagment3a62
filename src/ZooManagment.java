import java.util.Scanner;

public class ZooManagment {
    public static void main(String[] args) {
        int nbrCages = 20;
        String zooName = "my zoo";
        System.out.println("Zoo Name: " + zooName + " nbrCages: " + nbrCages);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        Scanner input = new Scanner(System.in);
        System.out.println("enter the name of the zoo");
        zooName = input.nextLine();
        System.out.println("enter nbr cages: ");
        nbrCages = input.nextInt();

        System.out.println("Zoo Name: " + zooName + " nbrCages: " + nbrCages);

        System.out.println("last workshop git ");
    }


}
