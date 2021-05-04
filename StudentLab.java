
package com.company;

import com.company.Student;

public class StudentLab {
    private int capacity;
    private Student[] students = new Student[this.capacity];
    private int avg;
    private String day;
    private int currentSize;

    public StudentLab(int cap, String d) {
        this.capacity = cap;
        this.day = d;
    }

    public void enrollStudent(Student std) {
        if (this.currentSize < this.capacity) {
            this.students[this.currentSize-1] = std;
            ++this.currentSize;
        } else {
            System.out.println("Lab is full!!!");
        }

    }

    public void print() {
        for(int i = 0; i < students.length; ++i) {
            System.out.println(this.students[i] + " ,Average: " + this.avg);
        }
    }

    public Student getStudents() {
        return this.students[this.currentSize];
    }

    public void setStudents(Student[] students) {
        for(int i = 0; i < students.length; i++) {
            System.out.println("All Of The Students are :" + students[i]);
        }

    }

    public int getAvg() {
        int average = 0;
        this.avg = average;
        return average;
    }

    public void calculateAvg() {
        float avr = (float)(this.avg / this.currentSize);
        System.out.println(avr);
    }

    public String getDay() {
        return this.day;
    }

    public void setDay(String day) {
        this.day = day;
        System.out.println("Today is :" + day);
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;

        for(int i = 0; i < capacity; ++i) {
            System.out.println("The Capacity Of The Lab Is : " + capacity);
        }

    }
}
