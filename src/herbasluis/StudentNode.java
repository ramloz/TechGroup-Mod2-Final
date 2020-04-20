package herbasluis;

import java.util.ArrayList;

public class StudentNode {
    private String CurrentCourse;
    private StudentNode next;
    private String StudenID;
    private ArrayList currentSubjects;

    public StudentNode(String sID, String cCourse, ArrayList cSubjects){
        this.StudenID = sID;
        this.CurrentCourse = cCourse;
        this.currentSubjects = cSubjects;
        this.next = null;
    }

    public String getCurrentCourse() {
        return CurrentCourse;
    }

    public void setCurrentCourse(String currentCourse) {
        CurrentCourse = currentCourse;
    }

    public StudentNode getNext() {
        return next;
    }

    public void setNext(StudentNode next) {
        this.next = next;
    }

    public String getStudenID() {
        return StudenID;
    }

    public void setStudenID(String studenID) {
        StudenID = studenID;
    }

    public ArrayList getCurrentSubjects() {
        return currentSubjects;
    }

    public void setCurrentSubjects(ArrayList currentSubjects) {
        this.currentSubjects = currentSubjects;
    }
}
