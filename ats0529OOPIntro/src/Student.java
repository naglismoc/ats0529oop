public class Student {
/*
properties
 */
    public String name;
    public String surname;
    private String email;
    private String address;
    public String phoNo;
    public int birthDate;
    public boolean gender;

    /*
    constructors
     */
    public Student (){
    }
    public Student (String name){
        this.name = name;
    }
    public Student (String name ,String surname, int birthDate){
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }
    public Student (int birthDate,String name ,String surname){
        this.name = name;
    }

    /*
    getters and setters
     */
    public String getAddress(){
        return this.address;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public static void classInfo(){
        System.out.println("klase kurti studentams");
    }

    @Override
    public String toString(){
        return "studento vardas " + this.name + ", pavarde " + this.surname;
    }
}
