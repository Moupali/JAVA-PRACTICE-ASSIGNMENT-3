/*Create a class called StudentMarks, which prompts user for the number of students, reads it
        from the keyboard, and saves it in an int variable called numOfStudents. It then prompts user for the
        grades of each of the students and saves them in an int array called stuGrades. Your program shall
        check that the grade is between 0 and 100 else has to trow an error message.
        ---------------------------------------------------------------------------------------------------------------------*/


package com.stackroute.junittest3;

public class StudentMarks {
    public int studentsGrades(int numOfStudents,int stuGrades[])
    {
        int i;
        System.out.println("Enter Grades of each Students");
        for(i=0;i<numOfStudents;i++)
        {
            if(stuGrades[i]<0 || stuGrades[i]>100)
            {
                System.out.println("Error!! Wrong Input");
                return 0;
            }
        }
        if(i==numOfStudents)
        {
            return 1;
        }
        return 0;
    }
}
