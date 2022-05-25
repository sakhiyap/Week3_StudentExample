/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentarray;

/**
 *
 * @author pratik sakhiya
 i have Done the changes on 25-05-2022
 */
public class StudentArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //create student object
        Student[] studentlist = new Student[3];  // Array of Object
        
        Student s1 = new Student();
        s1.setName("John");
        s1.setAge(19);
        
        Student s2 = new Student();
        s2.setName("Utsav");
        s2.setAge(20);
        
        Student s3 = new Student();
        s3.setName("Jaysheel");
        s3.setAge(25);
       
        studentlist[0]=s1;
        studentlist[1]=s2;
        studentlist[2]=s3;
        
        for(int i=0;i<studentlist.length;i++)
        {
            System.out.println(studentlist[i]);
        }    
        
        
        
    }
    
}
