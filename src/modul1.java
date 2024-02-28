import java.util.Scanner;

public class modul1 {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                boolean isRunning = true;

                while (isRunning) {
                        System.out.println("=== Library System ====");
                        System.out.println("1. Login as student");
                        System.out.println("2. Login as Admin");
                        System.out.println("3. exit");

                        System.out.print("Choose option (1-3): ");
                        int choice = scanner.nextInt();

                        if (choice == 1) {
                                loginMahasiswa();
                        } else if (choice == 2) {
                                loginAdmin();
                        } else if (choice == 3) {
                                isRunning = false;
                                System.out.println("Terima kasih, Bye!");
                        } else {
                                System.out.println("ERROR!");
                        }
                }
        }

        private static void loginMahasiswa() {
                Scanner scanner = new Scanner(System.in);
                System.out.println("=== Login Mahasiswa ===");

                System.out.print("Enter Your NIM: ");
                String nim = scanner.nextLine();

                if (nim.length() == 15) {
                        System.out.println("succesful login as student  " + nim);
                } else {
                        System.out.println("user not found");
                }
        }

        private static void loginAdmin() {
                Scanner scanner = new Scanner(System.in);
                System.out.println("=== Login Admin ===");

                System.out.print("Enter your Username: ");
                String username = scanner.nextLine();

                System.out.print("Enter your Password: ");
                String password = scanner.nextLine();

                if (username.equals("admin") && password.equals("admin123")) {
                        System.out.println("Login succesful as admin");
                } else {
                        System.out.println("Admin user not found");
                }
        }
}
