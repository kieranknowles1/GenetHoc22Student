// This file has been formatted using NetBeans's format option
/* 
   Students this is the section to change. 
 */
package genethoc;

import java.util.*;

/**
 *
 * @author nickdaltonbk
 */
public class Part1Test {

    /* 
       Question 1; change this code so the code goes faster. 
     */
    /*
    Add an item to the middle of a LinkedList
    O(n) before changes
    Change LinkedList to ArrayList
    still O(n), but has smaller constants so is faster
    */

    //public List<String> q1 = new LinkedList<String>();  // you can change this if you like but not name 
    public List<String> q1 = new ArrayList<>();

    public void Test1(String itemToAdd) {
        q1.add(q1.size() / 2, itemToAdd);
    }
    /* 
        Question 2; change this code so the code goes faster.
     */
    /*
    Add an item to the front of an ArrayList
    O(n) before changes
    Change ArrayList to LinkedList
    O(1) after changes
    */
    //public List<String> q2 = new ArrayList<String>();   // you can change this if you like but not name 
    public List<String> q2 = new LinkedList<>();

    public void Test2(String itemToAdd) {
        q2.add(0, itemToAdd); // add to front 
    }
    /* 
          Q3 uses the variable q3 to build up a long String
     */
    /*
    String concatenation requires allocating a new String in Java
    O(n) before changes, where n is the length of q3
    Change String to StringBuilder and use StringBuilder.append
    O(n) after changes, where n is the length of addThis
    */
    //public Object q3 = new String("");
    public Object q3 = new StringBuilder();

    public void Question3(String addThis) {
        //q3 = q3 + addThis;
        // Changing the type of q3 threw a NoSuchFieldError at runtime.
        // TestPart1.java would need to be recompiled to fix this
        ((StringBuilder)q3).append(addThis);
    }

    //public Collection<String> q4 = new ArrayList<String>();   // you can change this if you like but not name 
    public Collection<String> q4 = new HashSet<>();

    public void Test4Setup(String addThis) {
        q4.add(addThis);
    }

    /**
     * Q4 slightly more complicated this looks in the arrayList for the value
     * findThis. This may or mayNot exist. return true if exists.
     *
     * @param findThis
     * @return true if is inside - false if not found.
     */
    /*
    Check if an ArrayList contains findThis via a foreach loop
    O(n) before changes
    Change ArrayList to HashSet and foreach loop to contains
    O(1) after changes
    */
    public boolean Test4FindThis(String findThis) {
        /*for (String it : q4) {
            if (it.equals(findThis)) {
                return true;
            }
        }

        return false;*/
        return q4.contains(findThis);
    }
    /*
      Q5 - add only unique elemnts to this collection of strings 
           order not important. 
     */
    /*
    Ensure that q5 only contains unique elements via ArrayList.contains
    O(n^2) before changes
    Change ArrayList to HashSet and remove now unnecessary contains
    O(n) after changes
    */

    //public Collection<String> q5 = new ArrayList<String>();  // you can change this if you like but not name 
    public Collection<String> q5 = new HashSet<>();

    public void Test5AddEveryOneOfTheseToQ5(Collection<String> that) {
        
        for (String it : that) {
            /*if (!q5.contains(it)) {
                q5.add(it);
                break;
            }*/
            // HashSet.add does nothing if the set already contains the value
            q5.add(it);
        }
    }

    Part1Test() {
        
    }

    public static void main(String[] args) {
        System.err.println("---TEST STUDENT--");
        Part1Test student = new Part1Test();
        TestPart1.runAssessment(student);
        System.err.println("---END TEST STUDENT--");
    }

}
