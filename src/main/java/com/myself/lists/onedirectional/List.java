package com.myself.lists.onedirectional;


public class List<T extends Number> {
    private List<T> next;
    private T value;

    public List(){}
    public List(T value) {
        this.value = value;
    }
    public List(List next, T value) {
        this.next = next;
        this.value = value;
    }

    public List getNext() {
        return next;
    }

    public List setNext(List next) {
        this.next = next;
        return this;
    }

    public T getValue() {
        return value;
    }

    public List setValue(T value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        List<?> iter = this;
        StringBuilder acc = new StringBuilder();
        while (iter != null){
            acc.append(iter.getValue())
                    .append((iter.getNext() != null) ? ", " : "");
            iter = iter.getNext();
        }
        return acc.toString();
    }
}
