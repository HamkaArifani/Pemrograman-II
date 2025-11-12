package TugasCLIMenu;
import java.util.Scanner;

public class YoyomoMenu {
    Scanner scan=new Scanner(System.in);

    public void start() {
        int choice;
        do {
            System.out.println("\n=== YOYOMO ICE CREAM ===");
            System.out.println("Pilih tipe es krim mu: ");
            System.out.println("1. Es Krim Cup");
            System.out.println("2. Es Krim Cone");
            System.out.println("0. Keluar");
            System.out.print("Pilihan Kamu: ");
            choice = scan.nextInt();

            switch (choice) {
                case 1 -> cupMenu();
                case 2 -> coneMenu();
                case 0 -> System.out.println("Terima kasih sudah berkunjung ke YOYOMO!");
                default -> showInvalid();
            }
        } while (choice != 0);
    }

    private void cupMenu() {
        String flavour = getFlavourChoice();
        Size size = getSizeChoice();
        IceCreamCup cup = new IceCreamCup(flavour, size);

        System.out.println("\n=== PESANAN ANDA ===");
        System.out.println("Tipe     : " + cup.getType());
        System.out.println("Rasa     : " + cup.getFlavour());
        System.out.println("Ukuran   : " + cup.getSize().getNameSize());
        System.out.println("Harga    : Rp" + cup.getPrice());

        System.out.println("\nTekan ENTER untuk kembali ke menu...");
        scan.nextLine();
    }

    private void coneMenu() {
        String flavour = getFlavourChoice();
        IceCreamCone cone = new IceCreamCone(flavour);

        System.out.println("\n=== PESANAN ANDA ===");
        System.out.println("Tipe     : " + cone.getType());
        System.out.println("Rasa     : " + cone.getFlavour());
        System.out.println("Harga    : Rp" + cone.getPrice());

        System.out.println("\nTekan ENTER untuk kembali ke menu...");
        scan.nextLine();
    }

    private String getFlavourChoice() {
        int choice;
        do {
            System.out.println("\nPilih rasa favoritmu:");
            System.out.println("1. Vanilla");
            System.out.println("2. Cokelat");
            System.out.println("3. Stroberi");
            System.out.print("Pilihan Kamu: ");
            choice = scan.nextInt();
            scan.nextLine(); // flush newline

            switch (choice) {
                case 1 -> { return "Vanilla"; }
                case 2 -> { return "Cokelat"; }
                case 3 -> { return "Stroberi"; }
                default -> {showInvalid();}
            }
        } while (true);
    }

    private Size getSizeChoice() {
        System.out.println("\nPilih ukuran:");
        System.out.println("1. Small");
        System.out.println("2. Medium (+Rp5000)");
        System.out.println("3. Large (+Rp10000)");
        System.out.print("Pilihan: ");
        int choice = scan.nextInt();
        scan.nextLine();

        return switch (choice) {
            case 1 -> new Size("Small", 0);
            case 2 -> new Size("Medium", 5000);
            case 3 -> new Size("Large", 10000);
            default -> new Size("Small", 0);
        };
    }

    private void showInvalid() {
        System.out.println("\nUps! Pilihan kamu tidak dikenali oleh sistem.");
        System.out.println("Tekan ENTER untuk kembali...");
        scan.nextLine();
    }
}
