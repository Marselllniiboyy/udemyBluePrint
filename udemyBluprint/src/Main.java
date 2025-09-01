//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class User {
    int id;
    int age;
    String name;
    String email;
    String password;
    boolean isLoggedIn = false; // status login

    // Constructor
   public User(int id ,String name, int age, String email, String password) {
       this.id = id;
       this.name = name;
       this.age = age;
       this.email = email;
       this.password=password;
   }
    // Method printDetails
    public void printDetails() {
        System.out.println("Welcome to the Udemy course");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }

    // Method Loggin
    public void login(String inputEmail, String inputPassword) {
        if (this.email.equals(inputEmail) && this.password.equals(inputPassword)) {
            isLoggedIn = true;
            System.out.println(name + " berhasil login!");
        } else {
            System.out.println("Login gagal, email atau password salah.");
        }
    }

    // Method logout
    public void logout() {
        if (isLoggedIn) {
            isLoggedIn = false;
            System.out.println(name + " sudah logout.");
        } else {
            System.out.println("User belum login.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        User U1 = new User(1, "Marsel", 20, "jawa@gamil.com", "pulupulu");
        U1.printDetails();

        U1.login("jawa@gamil.com", "pulupulu");

    }
}