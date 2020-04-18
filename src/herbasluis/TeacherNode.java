package herbasluis;

import java.util.ArrayList;

public class TeacherNode<E> {
    private TeacherNode<E> next;
    private ArrayList<E> subjects;
    private E IDcard;
    private boolean state;

    public TeacherNode(E ID, ArrayList<E> subjectList, boolean status){
        this.IDcard = ID;
        this.subjects = subjectList;
        this.state = status;
        this.next = null;
    }

    public TeacherNode<E> getNext() {
        return next;
    }

    public void setNext(TeacherNode<E> next) {
        this.next = next;
    }

    public ArrayList<E> getSubjects() {
        return subjects;
    }

    public boolean addSubject(String Subject){
        this.subjects.add((E) Subject);
        return false;
    }

    public void setSubjects(ArrayList<E> subjects) {
        this.subjects = subjects;
    }

    public E getIDcard() {
        return IDcard;
    }

    public void setIDcard(E IDcard) {
        this.IDcard = IDcard;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
