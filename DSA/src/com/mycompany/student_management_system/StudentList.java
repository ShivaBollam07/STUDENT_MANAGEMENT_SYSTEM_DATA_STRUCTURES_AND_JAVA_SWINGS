package com.mycompany.student_management_system;

import java.io.Serializable;
import java.util.LinkedList;

public class StudentList implements Serializable {
    Student head, tail = null;

    class Student {

        public String p_Name;
        public String p_Age;
        public String p_Sex;
        public String p_Phone;
        public String p_Adress;
        public String p_Grade;
        public String id;

        Student prev;
        Student next;


        Student(String id ,String Student_name,String p_Age,String p_Sex,String p_Adress,String p_Grade){
            this.p_Name=Student_name;
            this.p_Adress=p_Adress;
            this.p_Sex=p_Sex;
            this.p_Phone=p_Phone;
            this.p_Grade=p_Grade;
            this.p_Age=p_Age;
            this.id =id;
            this.prev=null;
            this.next=null;





        }
        public String getP_Name() {
            return p_Name;
        }
        public void setP_Name(String p_Name) {
            this.p_Name = p_Name;
        }
        public String getP_Age() {
            return p_Age;
        }
        public void setP_Age(String p_Age) {
            this.p_Age = p_Age;
        }
        public String getP_Sex() {
            return p_Sex;
        }
        public void setP_Sex(String p_Sex) {
            this.p_Sex = p_Sex;
        }
        public String getP_Phone() {
            return p_Phone;
        }
        public void setP_Phone(String p_Phone) {
            this.p_Phone = p_Phone;
        }
        public String getP_Adress() {
            return p_Adress;
        }
        public void setP_Adress(String p_Adress) {
            this.p_Adress = p_Adress;
        }
        public String getP_Grade() {
            return p_Grade;
        }
        public void setP_Grade(String p_Grade) {
            this.p_Grade = p_Grade;
        }

        public String getid() {
            return p_Grade;
        }
        public void setid(String id) {
            this.id = id;
        }
    }


    public void AddStudent(String id,String Student_name,String p_Age,String p_Sex,String p_Adress,String p_Grade) {
        Student  new_Student = new Student(id,Student_name, p_Age, p_Sex, p_Adress, p_Grade );
        new_Student.next = head;
        new_Student.prev = null;


        if (head != null)
            head.prev = new_Student;


        head = new_Student;
    }
    public Student Search(String id ) {

        Student current = head;

        if(head == null) {
            System.out.println("List is empty");
            return null;
        }
        while(current != null) {
            if(current.id.equals(id)) {

                break;
            }
            current = current.next;

        }
        return current;
    }
    public LinkedList getStudents(Student Student)
    {
        LinkedList list =new LinkedList();
        Student last = null;
        System.out.println("Traversal in forward Direction");
        while (Student != null) {
            list.add(Student);
            last = Student;
            Student = Student.next;
        }
        return list;
    }
    void deleteStudent(Student del)
    {

        if (head == null || del == null) {
            return;
        }

        if (head == del) {
            head = del.next;
        }

        if (del.next != null) {
            del.next.prev = del.prev;
        }

        if (del.prev != null) {
            del.prev.next = del.next;
        }

        return;
    }
}



