package herbasluis;

import java.util.*;


public class Teacher<T> implements List<T> {

    private TeacherNode<T> first;
    private TeacherNode<T> last;

    private Integer size;

    private ArrayList<String> Subjects = new ArrayList<>();
    private String Idcard;
    private boolean active;

    public Teacher(){size = 0; }

    public boolean add(String NewName, String NewLName, String NewBD, String NewID, String Firstsubject, Person Person) {

        if(Person.add(NewName, NewLName, NewBD, NewID)==true) {
            this.Subjects.add(Firstsubject);
            this.active = true;
            TeacherNode teacher = new TeacherNode(NewID, Subjects, active);
            if (isEmpty() == true) {

                this.first = this.last = teacher;

            } else {
                this.last.setNext(teacher);
                this.last = teacher;
            }
            size++;
            return true;
        }else{
            return false;
        }
    }

    public boolean remove(String ID,  Person Person){

        TeacherNode<T> current = this.first;
        TeacherNode<T> previous = this.first;
        boolean isRemoved = false;
        while (current != null) {
            if (current.getIDcard().equals(ID)) {
                if(this.size == 1){
                    first = last = null;
                }
                if(current == this.last){
                    this.last = previous;
                }
                if(current == this.first){
                    this.first = current.getNext();
                    current = previous = this.first;
                }
                previous.setNext(current.getNext());
                current = previous;
                size--;
                isRemoved = true;
            }
            previous = current;
            current = current.getNext();
        }
        Person.remove(ID);
        return isRemoved;
    }

    public boolean addSubject(String ID, String Subject){
        TeacherNode<T> current = first;
        while (current != null) {
            if (current.getIDcard().equals(ID)){
                current.addSubject(Subject);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean contains(Object o) {
        TeacherNode<T> current = first;
        while (current != null) {
            if (current.getIDcard().equals(o)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public ArrayList getSubjects(Object o){
        TeacherNode<T> current = first;
        while (current != null) {
            if (current.getIDcard().equals(o)){
                ArrayList printedSubject = current.getSubjects();
                return printedSubject;
            }
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (size > 0) {
            return false;
        }
        return true;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(T t) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }


}


