import java.util.Scanner;
class Staff {
    protected int code;
    protected String Name;

    public Staff(int code, String Name) {
        this.code = code;
        this.Name = Name;
    }
    public int getCode() {
        return code;
    }
    public String getName() {
        return Name;
    }
    public String toString() {
        return  code + " & name is " + Name;
    }
}
class Teacher extends Staff {
    String Subject;

    public Teacher(int code, String Name, String Subject) {
        super(code, Name);
        this.Subject = Subject;
    }
    public String getSubject() {
        return Subject;
    }
    public String toString() {
        return super.toString() + " Subject "+ Subject;
    }
}
class Officer extends Staff {
    String Grade;

    public Officer(int code, String Name, String Grade) {
        super(code,Name);
        this.Grade = Grade;
    }
    public String getGrade() {
        return Grade;
    }
    public String toString() {
        return super.toString() + " Grade  " + Grade;
    }
}
class Typist extends Staff {
        int Speed;
    
    public Typist(int code, String Name, int Speed) {
        super(code, Name);
        this.Speed = Speed;
    }
    public int getSpeed() {
        return Speed;
    }
    public String toString() {
        return super.toString() + " Speed " + Speed + "Per Minute";
    }
}
class Regular extends Typist {
    double salary;

    Regular(int code, String name, int Speed, double salary) {
        super(code, name, Speed);
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    public String toString() {
        return super.toString() + " Salary " + salary;
    }
}
class Casual extends Typist {
    double dailyWages;

    Casual(int code, String name, int Speed, double dailyWages) {
        super(code, name, Speed);
        this.dailyWages = dailyWages;
    }
    public double getWages() {
        return dailyWages;
    }
    public String toString() {
        return super.toString() + " DailyWages " + dailyWages;
    }
}

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Details of Teacher");
        System.out.print("Enter Name: ");
        String Name1 = sc.nextLine();
        System.out.print("Enter code: ");
        int Code1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Subject: ");
        String Subject = sc.nextLine();
        
        Teacher teacher = new Teacher(Code1, Name1, Subject);
        System.out.println("Teacher code " + teacher);

        System.out.println();

        System.out.println("Enter Details of officer");
        System.out.print("Enter Name: ");
        String Name2 = sc.nextLine();
        System.out.print("Enter code: ");
        int Code2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Grade: ");
        String Grade = sc.nextLine();

        Officer officer = new Officer(Code2, Name2, Grade);
        System.out.println("Officer Code " + officer);

        // System.out.println("Enter Details of Typist");
        // System.out.print("Enter Name: ");
        // String Name = sc.nextLine();
        // System.out.print("Enter code: ");
        // int Code = sc.nextInt();
        // sc.nextLine();
        // System.out.print("Enter Speed: ");
        // int Speed = sc.nextInt();

        System.out.println();

        System.out.println("Enter Details of Casual Typist");
        System.out.print("Enter Name: ");
        String Name3 = sc.nextLine();
        System.out.print("Enter code: ");
        int Code3 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Speed: ");
        int Speed = sc.nextInt();
        System.out.print("Enter Salary: ");
        double Salary = sc.nextDouble();

        Regular regular = new Regular(Code3, Name3, Speed, Salary);
        System.out.println("Typist Code "+regular);

        System.out.println();

        System.out.println("Enter Details of DailyWages");
        System.out.print("Enter code: ");
        int Code4 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String Name4 = sc.nextLine();
        System.out.print("Enter Speed: ");
        int Speed1 = sc.nextInt();
        System.out.print("Enter dailyWages: ");
        double DailyWages = sc.nextDouble();

        //Typist typist = new Typist(Code, Name, Speed)
        Casual casual = new Casual(Code4, Name4, Speed1 , DailyWages);
        //System.out.println(typist);
        System.out.println("DailyWages code "+casual);

    
    }
}