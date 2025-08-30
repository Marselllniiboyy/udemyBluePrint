//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class User {
    int id;
    int age;
    String name;
    String email;
    String password;
   public User(int id ,String name, int age, String email, String password) {
       this.id = id;
       this.name    = name;
       this.age = age;
       this.email = email;
       this.password=password;
   }
   public void  printDetails() {
       System.out.println("Welcome to the udemy course");
   }
}

public class Main {
    public static void main(String[] args) {
        User U1 = new User(1, "Marsel", 20, "jawa@gamil.com", "pulupulu");
        U1.printDetails();
    }
}