package at.mci.manueljunker.exercise3;

import at.mci.manueljunker.exercise2.Student;

public class TestStudent {
    public static void main(String[] args) {
        // exercise 3
        Student studentA = new Student("Manuel", "DiBSE", 1, 1, "m");
        System.out.println(studentA);
        System.out.println("------------");

        Student studentB = new Student();
        System.out.println("StudentB mit default Werte initialisiert: " + studentB);
        studentB.setName("Jon");
        studentB.setGroup("MCIT");
        studentB.setProficiencyInJava(4);
        System.out.println("Default Id von StudentB: " + studentB.getStudentID());
        studentB.setStudentID(2);
        System.out.println("Id von StudentB nach setStudentID: " + studentB.getStudentID());
        studentB.setGender("m");
        System.out.println("StudentB nachdem alle Werte gesetzt wurden: " + studentB);
        System.out.println("------------");

        Student studentC = new Student("Jane", "BWL", 6, 3, "w");
        System.out.println(studentC);
        System.out.println("------------");

        Student studentD = new Student("Alf", "Computer Science", 1, 4, "m");
        System.out.println(studentD);
        studentD.setGender("undifined");
        System.out.println("StudentD nach Änderung des Geschlechts: " + studentD);
        System.out.println("------------");

        Student studentE = new Student("Lisa", "Jus", 3, 5, "w");
        System.out.println(studentE);
        System.out.println("------------");

        // exercise 4
        System.out.println("Haben Manuel und Jane die gleichen Java-Kentnisse? --> " + studentA.hasSameFluencyInJavaAs(studentC));
        System.out.println("Haben Manuel und Alf die gleichen Java-Kentnisse? --> " + studentA.hasSameFluencyInJavaAs(studentD));
        System.out.println("------------");

        // exercise 5
        System.out.println("Vergleich von StudentA mit StudentB: " + studentA.equals(studentB));
        // Referenz auf StudentA
        Student sameStudent = studentA;
        System.out.println("Referenz sameStudent auf studentA erstellt: " + sameStudent);
        System.out.println("Vergleich von sameStudent und studentA: " + sameStudent.equals(studentA));

    }
}
