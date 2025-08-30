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

class student extends User{
    int id;
    String name;
    String email;
    String password;
}

class  instructor extends User{
    int id;
    String name;
    String email;
    String password;
}

class  Couser {
    int coursID;
    String coursename;
    String description;
    String price;
    String instructor;
    String studens;

}

class Lecture{

}

class  Payment {

}

class Review{
}

class  Catagory {

}

class  Certificate {

}


public class Main {
    public static void main(String[] args) {
        User U1 = new User(1, "Marsel", 20, "jawa@gamil.com", "pulupulu");
        U1.printDetails();
    }
}