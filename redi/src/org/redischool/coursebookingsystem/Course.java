package org.redischool.coursebookingsystem;

class Course {
    int courseId;
    String courseName;
    int openSpaces;
    Student[] studentList;

    Course(int courseId, String courseName, int openSpaces){
        this.courseId = courseId;
        this.courseName = courseName;
        this.openSpaces = openSpaces;
        this.studentList = new Student[openSpaces];
    }

    public String toString(){
        return ("Course Id: " + courseId
                + " Course name: " + courseName
                + " # open spaces: " + openSpaces);
    }

    boolean book(Student student) {
        // Please complete the body of method book!
        //MY NEW CODE
        return false;
    }

    String createParticipantList(){
        //MY NEW CODE
        // Please complete the body of method createParticipantList!
        return participantList;
    }
}