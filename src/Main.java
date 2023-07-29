import java.util.Scanner;
import java.util.UUID;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // Tạo một UUID ngẫu nhiên
        UUID randomUUID = UUID.randomUUID();
        // Chuyển UUID thành chuỗi để sử dụng làm ID
        String id = randomUUID.toString();
        System.out.println("ID: " + id);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter age: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Enter address: ");
        String address  = sc.nextLine();
        System.out.println("Enter experience: ");
        double experience= Double.parseDouble(sc.nextLine());
        Employee employee = new Employee(id,name,address,age,experience);
        System.out.println(employee);
    }
}