package herbasluis;

import java.util.*;

public class Person<T> implements List<T> {
    private PersonLLNode<T> first;
    private PersonLLNode<T> last;
    private Integer size;

    public Person() {
        size = 0;
    }

    public PersonLLNode<T> getFirst() {
        return first;
    }

    public void setFirst(PersonLLNode<T> first) {
        this.first = first;
    }

    public PersonLLNode<T> getLast() {
        return last;
    }

    public void setLast(PersonLLNode<T> last) {
        this.last = last;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }


    public boolean containsID(Object o) {
        PersonLLNode<T> current = first;
        while (current != null) {
            if (current.getID().equals(o)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public boolean containsFN(String Name, String LastName){
        PersonLLNode<T> current = first;
        while (current != null) {
            if (current.getName().toString().equals(Name) && current.getLname().toString().equals(LastName)){
                return true;
            }
            current = current.getNext();
        }
        return false;
    }


    private class MyIterator implements Iterator {
        private int position;
        private PersonLLNode<T> current;

        public MyIterator() {
            this.current = first;
        }

        @Override
        public boolean hasNext() {
            if (position >= size) {
                return false;
            } else {
                return true;
            }
        }

        @Override
        public Object next() {
            PersonLLNode<T> next = current;
            this.current = this.current.getNext();
            position++;
            return next.getID();
        }
    }



    public boolean add(Object n, Object l, Object b, Object i) {
        PersonLLNode<T> newNode = new PersonLLNode(n,l,b,i);
        if (isEmpty()) {
            this.first = this.last = newNode;
        } else {
            if(containsID(i)!=true) {
                this.last.setNext(newNode);
                this.last = newNode;
            }else{
                System.out.println("Duplicate ID Card entry check if the person is not included yet or the ID card must be different adding the country or the region on the ID card");
                return false;
            }
        }
        this.size++;
        return true;
    }

    @Override
    public boolean remove(Object element) {
        PersonLLNode<T> current = this.first;
        PersonLLNode<T> previous = this.first;
        boolean isRemoved = false;
        while (current != null) {
            if (current.getID().equals(element)) {
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
        return isRemoved;
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
    public void clear() {
        first = last = null;
        size = 0;
    }

    @Override
    public T get(int index) {
        if (!isEmpty()) {
            PersonLLNode<T> current = first;
            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }
            return current.getID();
        }
        return null;
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(int index, T element) {

    }


    public Object set(int index, Object n, Object ln, Object Bd, Object Id) {
        if (!isEmpty()) {
            PersonLLNode<T> current = first;
            Object oldElement;
            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }
            oldElement = current.getID();

            current.setID((T)Id);
            current.setName((T)n);
            current.setLname((T)ln);
            current.setBirthDate((T)Bd);
            return oldElement;
        }
        return null;
    }

    public void add(int index, Object name, Object lname, Object birthD, Object IDc) {
        if (index > this.size || isEmpty()) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            addAtStart(name, lname, birthD, IDc);
            return;
        }
        if (index == this.size) {
            addAtTheEnd(name, lname, birthD, IDc);
            return;
        }
        PersonLLNode<T> newNode = new PersonLLNode(name, lname, birthD, IDc);
        PersonLLNode<T> current = first;
        for (int i = 0; i < index - 1; i++) {
            current = current.getNext();
        }
        newNode.setNext(current.getNext());
        current.setNext(newNode);
        size++;
    }

    private void addAtTheEnd(Object name, Object lname, Object birthD, Object IDc) {
        PersonLLNode<T> newNode = new PersonLLNode(name, lname, birthD, IDc);
        this.last.setNext(newNode);
        this.last = newNode;
        size++;
    }

    private void addAtStart(Object name, Object lname, Object birthD, Object IDc) {
        PersonLLNode<T> newNode = new PersonLLNode(name, lname, birthD, IDc);
        newNode.setNext(this.first);
        this.first = newNode;
        size++;
    }

    @Override
    public T remove(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException();
        }
        if (isEmpty()) {
            return null;
        }
        if (index == 0) {
            return removeFirstElement();
        } else if (index == this.size - 1) {
            return removeLastElement();
        } else {
            PersonLLNode<T> current = first;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            T elementRemoved = current.getNext().getID();
            current.setNext(current.getNext().getNext());
            size--;
            return elementRemoved;
        }
    }

    private T removeLastElement() {
        PersonLLNode<T> current = this.first;
        while (current.getNext() != this.last) {
            current = current.getNext();
        }
        T elementRemoved = current.getNext().getID();
        current.setNext(null);
        this.last = current;
        size--;
        return elementRemoved;
    }

    private T removeFirstElement() {
        T elementRemoved = this.first.getID();
        this.first = this.first.getNext();
        if (first == null) {
            this.last = null;
        }
        size--;
        return elementRemoved;
    }

    @Override
    public int indexOf(Object o) {
        PersonLLNode<T> current = first;
        for (int i = 0; i < size; i++) {
            if (current.getID().equals(o)) {
                return i;
            }
            current = current.getNext();
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        PersonLLNode<T> current = last;
        int position = -1;
        for (int i = 0; i < size; i++) {
            if (current.getID().equals(o)) {
                position = i;
            }
            current = current.getNext();
        }
        return position;
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
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }


    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        if (containsAll(c)) {
            Iterator iterator = c.iterator();
            while (iterator.hasNext()) {
                remove(iterator.next());
            }
            return true;
        } else {

            return false;
        }
    }

    @Override
    public boolean containsAll(Collection c) {
        boolean containsCollection = false;
        if (!c.isEmpty()) {
            Iterator iterator = c.iterator();
            while (iterator.hasNext()) {
                containsCollection = contains(iterator.next());
                if (containsCollection == false) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
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
    public boolean contains(Object o) {
        return false;
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

}
