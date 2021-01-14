package com.amit.softuser.model



private var listStudent = arrayListOf<User>()
 class Storage {

     fun appendStudent(student: User){
         listStudent.add(student)
         println(listStudent.size)
     }
     fun returnStudent():ArrayList<User>{
         return listStudent
     }

     fun deleteStudent(student: User){
         listStudent.remove(student)
     }
}