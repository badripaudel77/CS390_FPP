package edu.miu.lab6.prob1;

import java.util.Arrays;

public class MyStringList {
    private final int INITIAL_LENGTH = 4;
    private String[] strArray;
    private int size;

    public MyStringList() {
        strArray = new String[INITIAL_LENGTH];
        size = 0;
    }

    // Add an element in last
    public void add(String s) {
        if (s == null) return;// throw new NullPointerException();
        //Check for Array is Full
        if (size == strArray.length)
            resize(); // Array is full
        // Add at the end of the list.
        //strArray[size] = s;
        //size++; // Increment index to insert the new elements
        strArray[size++] = s;
    }

    public String get(int i) {
        if (i < 0 || i > size - 1) {
            // throw new IndexOutOfBoundsException("Invalid index i" + i);
            return null;
        }
        return strArray[i];
    }

    public boolean find(String s) {
        if (s == null)
            return false;
        for (int i = 0; i < size; i++)// for (String test: strArray)
        {
            if (s.equals(strArray[i]))
                return true;

        }
        return false; // The element is not in the list
    }

    /* 1. Using System.arrayopy()
      public void insert(String s, int pos){
         if(pos > size-1 || pos<0 )
             return;//allowed to add 0 to size-1
      if(s==null) return;
      if(pos == strArray.length) {
          resize();
       }
      String[] temp = new String[strArray.length];
       System.arraycopy(strArray,0,temp,0,pos); // src, spos,des,dspos,number of elements temp[pos] = s;
        temp[pos] = s;
      System.arraycopy(strArray,pos,temp,pos+1, strArray.length - pos);// count =size - pos

      strArray = temp;
      ++size;
       }
     */
	/* 2. Without Temp array
	// Shift elements to the right to make space for the new element
        for (int i = size; i > pos; i--) {
            array[i] = array[i - 1];
        }
        // Insert the new element
        array[pos] = s;
        size++;
    }

	 */
    // can insert the elements 0 to size position
    public void insert(String s, int pos) {
        if (pos < 0 || pos > size)
            return;
        // If the array gets full
        if (size == strArray.length) {
            resize();
        }
        //BEGIN - Khanh - Fixed the last item bug and optimized - 20250915
        if (s == null) return;
        /*  String[] temp = new String[strArray.length];

        for (int i = 0; i < pos; i++)
            temp[i] = strArray[i];
        temp[pos] = s;
        for (int i = pos + 1; i < size; i++)
            temp[i] = strArray[i - 1];
        * */
        //strArray = temp;
        //++size;
        for (int i = size; i > pos; i--) {
            strArray[i] = strArray[i - 1]; // shift right
        }
        strArray[pos] = s;
        size++;
        //END - Khanh - Fixed the last item bug and optimized - 20250915

    }

    public boolean remove(String s) {
        /*if (size == 0)
            return false; // the list is empty
        if (s == null)
            return false;
        int index = -1;
        for (int i = 0; i < size; ++i) {
            //BEGIN - Fix Null pointer - Khanh - 20250915
            //if (strArray[i].equals(s)) {
            if (strArray[i] != null && strArray[i].equals(s)) {
                //END - Fix Null pointer - Khanh - 20250915
                index = i;
                break;
            }
        }
        if (index == -1)
            return false; // s is not found in the list
        String[] temp = new String[strArray.length];
        System.arraycopy(strArray, 0, temp, 0, index);
        System.arraycopy(strArray, index + 1, temp, index,
                strArray.length - (index + 1));
        strArray = temp;
        --size;
        return true;*/
        if (size == 0 || s == null) return false;

        for (int i = 0; i < size; i++) {
            if (s.equals(strArray[i])) {
                // Shift left
                for (int j = i; j < size - 1; j++) {
                    strArray[j] = strArray[j + 1];
                }
                strArray[--size] = null; // clear last slot
                return true;
            }
        }
        return false;
    }

    private void resize() {
        System.out.println("resizing");
        int len = strArray.length;// Original array length
        int newlen = 2 * len; // Twice the original length
        // String[] temp = new String[newlen];
        // System.arraycopy(strArray,0,temp,0,len);
        // strArray = temp;
        strArray = Arrays.copyOf(strArray, newlen);

    }

    //Khanh - updated toString - 20250915
    public String toString() {
        if (size == 0) return "[]";
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(strArray[i]);
            if (i < size - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        /*
         * if(size==0) return false; else return true;
         */
        return (size == 0);
    }

    /// BEGIN - LAB 6- Nguyen Khanh Tran - 20250915
    /**
     * Method 1: indexOf(String s)
     * - Return the position (index) of the first occurrence of s in the list.
     * - If s is not found, return -1.
     */
    public int indexOf(String s) {
        if (s == null) return -1;
        for (int i = 0; i < size; i++) {
            if (s.equals(strArray[i])) {
                return i;
            }
        }
        return -1; // not found
    }

    /**
     * Method 2: public String removeAt(int index);
     * <p>
     * removeAt(int index)
     * - Remove the element at the given position.
     * - Shift all elements on the right to fill the gap.
     * - Return the removed element.
     * - If index is invalid, return null.
     */
    public String removeAt(int index) {
        if (index < 0 || index >= size) {
            return null; // invalid index
        }
        // Save the element to return
        String removed = strArray[index];
        // Shift everything left to fill the gap
        for (int i = index; i < size - 1; i++) {
            strArray[i] = strArray[i + 1];
        }
        strArray[--size] = null;
        return removed;
    }

    /**
     * Method 3: public void clear()
     * <p>
     * clear()
     * - Remove all elements from the list so that it becomes empty.
     * - Set each element in the underlying array to null.
     * - reset the size of the list to 0.
     * - After calling clear():
     * - size() must return 0.
     * - toString() should print an empty list like [].
     */
    public void clear() {
        size = 0;
        strArray = new String[INITIAL_LENGTH];
    }

    /**
     * Method 4: public void set(int index, String s);
     * <p>
     * set(int index, String s)
     * - Replace the element at position index with s.
     * - Return the old element that was replaced.
     * - If index is invalid, return null.
     *
     * @param args
     */
    public String set(int index, String s) {
        if (index < 0 || index >= size) {
            return null;
        }
        String old = strArray[index];
        strArray[index] = s;
        return old;
    }

    /**
     * Method 5: public boolean containsAll(MyStringList other);
     * <p>
     * containsAll(MyStringList other)
     * - Return true if the current list contains every element of other.
     * - Order doesn’t matter.
     * - Return false if even one element is missing.
     */
    public boolean containsAll(MyStringList other) {
        if (other == null || other.size() == 0) return true;

        for (int i = 0; i < other.size(); i++) {
            String element = other.get(i);
            if (!this.find(element)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Method 6: public MyStringList subList(int start, int end);
     * <p>
     * subList(int start, int end)
     * - Return a new MyStringList containing elements from index start to end - 1.
     * - If indices are invalid, return an empty list.
     */
    public MyStringList subList(int start, int end) {
        MyStringList sub = new MyStringList();
        if (start < 0 || end > size || start >= end) {
            return sub;
        }
        for (int i = start; i < end; i++) {
            sub.add(strArray[i]);
        }
        return sub;
    }


    //END - LAB 6- Nguyen Khanh Tran - 20250915
    public static void main(String[] args) {
        MyStringList l = new MyStringList();
        System.out.println("Initial: " + l);
        l.add("Bob");
        System.out.println("Adding: " + l);
        l.add("Steve");
        System.out.println("Adding: " + l);
        l.add("Susan");
        l.add("Mark");
        System.out.println("Original String: " + l);
        System.out.println("Insert Renuka at 4");
        l.insert("Renuka", 4); // Position reached the length
        System.out.println("Insert Mohanraij at 5");
        l.insert("Mohanraj", 5); // Position reached the length
        System.out.println(l);
        System.out.println("Add Dave");
        l.add("Dave");
        System.out.println("The list of size " + l.size() + " is " + l);
        System.out.println("Remove Mark");
        l.remove("Mark");
        System.out.println("Remove Bob");
        l.remove("Bob");
        System.out.println("The list of size " + l.size() + " is " + l);
        System.out.println("Insert Richard at 3");
        l.insert("Richard", 3);
        System.out.println("The list of size " + l.size() + " after inserting Richard into pos 3 is " + l);
        System.out.println("Insert Tonya at 0");
        l.insert("Tonya", 0);
        System.out.println("The list of size " + l.size() + " after inserting Tonya into pos 0 is " + l);
        System.out.print("Find Susan:");
        System.out.println(l.find("Susan"));
        // String[] x = (String[]) l.clone();
        // System.out.println(Arrays.toString(x));

        //BEGIN - LAB6 - Testing - Nguyen Khanh Tran - 20250915
        System.out.println("==============BEGIN================");
        System.out.println("===================================");
        System.out.println("Problem 1: indexOf(\"Susan\")");
        System.out.println("Original String: " + l);
        System.out.println("Susan at index: " + l.indexOf("Susan"));

        System.out.println("===================================");
        System.out.println("Problem 2: Remove at 2");
        System.out.println("Before removing \"Susan\" at 2: " + l.toString());
        l.removeAt(2);
        System.out.println("After removed \"Susan\" at 2:   " + l.toString());
        System.out.println("===================================");
        System.out.println("Problem 4: Replace at 0");
        System.out.println("Original String: " + l);
        String old = l.set(0, "Khanh");
        System.out.println("Updated 0 by \"Khanh\": " + l.toString());
        System.out.println("Replaced item is :" + old);
        System.out.println("===================================");
        System.out.println("Problem 5: Contains all");
        System.out.println("Original String: " + l);
        MyStringList l2 = new MyStringList();
        l2.add("Khanh");
        l2.add("Dave");
        System.out.println("New array to find: " + l2.toString());
        System.out.println("Is contain? : " + l.containsAll(l2));
        MyStringList l3 = new MyStringList();
        l3.add("Khan2h");
        l3.add("Dave");
        System.out.println("New array to find: " + l3.toString());
        System.out.println("Is contain? : " + l.containsAll(l3));
        System.out.println("===================================");
        System.out.println("Problem 6: Sublist from 1 to 3");
        System.out.println("Original String: " + l);
        System.out.println("Sublist " + l.subList(1, 3));
        System.out.println("===================================");
        System.out.println("Problem 3: Clear all");
        l.clear();
        System.out.println("After clear() invoked. The list of size " + l.size() + " is " + l);
        //END -  LAB6 - Testing - Nguyen Khanh Tran - 20250915


    }
}
