package herbasluis;

public class SubjectNode<E> {

    private SubjectNode<E> next;
    private String subject;
    private String TeacherID;

    public SubjectNode(String subject, String ID){
        this.subject = subject;
        this.TeacherID = ID;
        this.next = null;
    }

    public SubjectNode<E> getNext() {
        return next;
    }

    public void setNext(SubjectNode<E> next) {
        this.next = next;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTeacherID() {
        return TeacherID;
    }

    public void setTeacherID(String teacherID) {
        TeacherID = teacherID;
    }
}
