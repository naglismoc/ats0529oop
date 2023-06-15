import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"Petras","Jonas"};
        String[] arr2 = new String[2];

        ArrayList<String> names = new ArrayList<>();
        names.add("Jonas");
        names.add("Petras");
        names.add("Julija");
        System.out.println(names.size());
        System.out.println(names.get(1));
        System.out.println(names);
        names.set(1,"Ignė");
        System.out.println(names);
        names.remove(0);
        System.out.println(names);
        ArrayList<String> surnames = new ArrayList<>();
        surnames.add("Petravičiūtė");
        surnames.add("Barštystė");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i) + " " +surnames.get(i));
        }
        ArrayList<Integer> phoNos = new ArrayList<>();
        ArrayList<String> addresses = new ArrayList<>();
        ArrayList<String> emails = new ArrayList<>();
        ArrayList<Integer> birthDates = new ArrayList<>();

        Student studentas = new Student();
        studentas.surname = "Petraukas";
        studentas.name = "Algis";
        studentas.gender = true;
        studentas.birthDate = 99999999;
        System.out.println(studentas.name + " " + studentas.surname);

        ArrayList<Student> klase = new ArrayList<>();
        klase.add(studentas);

        for (int i = 0; i < klase.size(); i++) {
            System.out.println(klase.get(i).name + " " + klase.get(i).surname);
        }


        // nenaudotina, bet veikia
        Student[] studentai = new Student[1];
        studentai[0] = studentas;
        //=========================

        Student st = new Student("Jokūbas");
        System.out.println(st.name);

        Student st2 = new Student("dsf","sf",6451);
        studentas.getAddress();
        studentas.setEmail("sdf@dsf.ua");
        st.getAddress();

        Student.classInfo();

        System.out.println(studentas);

   }
}