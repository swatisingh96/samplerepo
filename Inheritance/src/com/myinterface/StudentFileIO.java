package com.myinterface;

import com.pojo.Student;

public interface StudentFileIO {
      Student[] readStudents() ;
      int writeStudents(Student[] students);
}
