package com.myself.heaps;


import java.util.ArrayList;
//import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class Heap<T extends Comparable<T>> implements HeapIntf<T> {

    private List<T> internalArray;
    private int size;

    public Heap() {
        this.internalArray = new ArrayList<>();
        this.size = 0;
    }

    public List<T> getInternalArray() {
        return internalArray;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void ofUnsafe(List<T> array) {

        this.internalArray = new ArrayList<>(array.size());
//        Collections.copy(this.internalArray, array);
        this.internalArray = array;
        this.size = array.size();
    }

    @Override
    public boolean hasHeapProperty() {
        if(internalArray == null || internalArray.isEmpty())
            return true;

        int i = first();

        while(i <= last() / 2){

            if(exists(left(i)) && internalArray.get(i).compareTo(internalArray.get(left(i))) < 0)
                return false;
            if(exists(right(i)) && internalArray.get(i).compareTo(internalArray.get(right(i))) < 0)
                return false;
            i++;

        }

        return true;
    }

    @Override
    public void restoreHeapProperty(){
        for(int j = parent(last()); j >= 0; j--)
            heapify(j);
    }

    @Override
    public T getRoot(){
        return internalArray.get(0);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T getParentOf(int i){
        return getElem(i, this::parent);
    }

    @Override
    public T getLeftChildOf(int i) {
        return getElem(i, this::left);
    }

    @Override
    public T getRightChildOf(int i) {
        return getElem(i, this::right);
    }

    @Override
    public void buildHeapFromArray(List<T> array) {
        this.internalArray = array;
        this.size = array.size();
        restoreHeapProperty();
    }

    @Override
    public T pop() {

        if(internalArray.isEmpty())
            return null;

        T elem = internalArray.get(last());
        T removed = internalArray.get(first());
        internalArray.set(last(), removed);
        //internalArray.remove(last());
        this.size--;

        int i = first();

        while(exists(left(i))){

            if(elem.compareTo(internalArray.get(greater(i))) > 0)
                break;

            copyOn(i, greater(i));
            i = greater(i);

        }

        internalArray.set(i, elem);

        return removed;

    }


    @Override
    public T peek(){
        return getRoot();
    }

    @Override
    public void push(T elem) {

        internalArray.add(elem);
        size++;
        int i = last();

        while(i > 0 && internalArray.get(parent(i)).compareTo(elem) < 0){

            copyOn(i, parent(i));
            i = parent(i);

        }
        internalArray.set(i, elem);
    }

    private T getElem(int i, Function<Integer,Integer> function){
        return exists(function.apply(i)) ? internalArray.get(function.apply(i)) : null;
    }

    private int left(int i){
        return (2 * i + 1);
    }

    private int right(int i){
        return (2 * i + 2);
    }

    private int parent(int i){
        return (i - 1) / 2;
    }

    private int sibling(int i){
        return i + 1;
    }

    private int first(){
        return 0;
    }

    private int last(){
        return size() - 1;
    }

    private boolean exists(int i){
        return i < size();
    }

    private int greater(int i){
        return (exists(sibling(left(i))) && internalArray.get(sibling(left(i))).compareTo(internalArray.get(left(i))) > 0) ? sibling(left(i)) : left(i);
    }

    private void copyOn(int i, int j){
        internalArray.set(i, internalArray.get(j));
    }

    private void swap(int i, int j){

        T elem = internalArray.get(i);
        internalArray.set(i, internalArray.get(j));
        internalArray.set(j, elem);

    }

    private int largest(int i){

        int largest = i;

        if(exists(left(i)))
            largest = (internalArray.get(i).compareTo(internalArray.get(left(i))) > 0) ? i : left(i);

        if(exists(right(i)))
            largest = (internalArray.get(largest).compareTo(internalArray.get(right(i))) > 0) ? largest : right(i);

        return largest;

    }
    
    private void heapify(int i){
        int largest = largest(i);
        if(largest != i) {
            swap(i, largest);
            heapify(largest);
        }

    }

    @Override
    public String toString() {
        return "Heap " + internalArray.subList(0, size());
    }
}
