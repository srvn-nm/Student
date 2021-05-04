/**
 * @author sarvin nami
 * this class will save student's informatino.
 */
package com.company;
import com.company.StudentLab;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Student std1 = new Student("Ehsan", "Edalat", "9031066");
        Student std2 = new Student("Sarvin", "Nami", "9931103");
        Student std3 = new Student("Ahmad", "Asadi", "9031054");
        std1.setGrade(15);
        std1.print();
        std2.setGrade(11);
        std2.print();
        std3.setGrade(19);
        std3.print();
        std3.setFirstName("HamidReza");
        std3.print();
        new StudentLab(20, "Thursday");
    }
}
