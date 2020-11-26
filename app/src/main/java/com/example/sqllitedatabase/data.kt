package com.example.sqllitedatabase

import androidx.room.PrimaryKey

data class data(val _studentName: String, val _courseOfStudy: String, val _department: String) {
    @PrimaryKey(autoGenerate = true)
    //val studentID : Int
    var studentName = _studentName
    var courseOfStudy = _courseOfStudy
    var department = _department
}