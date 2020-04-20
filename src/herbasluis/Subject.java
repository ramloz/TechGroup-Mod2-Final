package herbasluis;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Subject<T> implements List {

    private SubjectNode<T> first;
    private SubjectNode<T> last;
    private int size = 0;
    public String SubjectName;
    public String AssignedTeacher;


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if(size==0){return true;}
        return false;
    }

    @Override
    public boolean contains(Object o) {
        SubjectNode<T> current = first;
        while(current != null){
            if(current.getSubject().equals(o)){
                return true;
            }
            current=current.getNext();
        }

        return false;
    }

    public boolean subjectAssigned(Object o) {
        SubjectNode<T> current = first;
        while(current != null){
            if(current.getSubject().equals(o)){
                if(current.getTeacherID().isEmpty()==false){
                    return true;
                }else{
                    return false;
                }

            }else{
                return false;
            }
        }
        return false;
    }


    public boolean add(String subject, String teachID) {
        SubjectNode<T> newSubject = new SubjectNode<T>(subject, teachID);
        if (isEmpty()==true) {
            this.first = this.last = newSubject;
            size++;
            return true;

        } else {
            if(subjectAssigned(subject)==true){
                System.out.println("The subject: " + subject + " is already created and assigned");
                return false;
            }else{
                this.last.setNext(newSubject);
                this.last=newSubject;
                size++;
                return true;
            }

        }
    }

    public boolean changeTeacher(String subject, String newteachID){
        SubjectNode<T> current = first;
        while(current != null) {
            if (current.getSubject().equals(subject)) {
                current.setTeacherID(newteachID);
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }


    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public Object remove(int index) {
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
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
