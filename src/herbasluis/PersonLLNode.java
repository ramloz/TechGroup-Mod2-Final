package herbasluis;

public class PersonLLNode<E> {
    private PersonLLNode<E> next;
    private E name;
    private E lname;
    private E BirthDate;
    private E ID;

    public PersonLLNode(E name, E lname, E BirthDate, E ID) {
        this.name = name;
        this.lname = lname;
        this.BirthDate = BirthDate;
        this.ID = ID;
        this.next = null;
    }

    public PersonLLNode<E> getNext() {
        return next;
    }

    public void setNext(PersonLLNode next) {
        this.next = next;
    }

    public E getName() {
        return name;
    }

    public E getLname() {
        return lname;
    }

    public E getBirthDate() {
        return BirthDate;
    }

    public E getID() {
        return ID;
    }



    public void setName(E name) {
        this.name = name;
    }

    public void setLname(E lname) {
        this.lname = lname;
    }

    public void setBirthDate(E birthDate) {
        BirthDate = birthDate;
    }

    public void setID(E ID) {
        this.ID = ID;
    }
}
