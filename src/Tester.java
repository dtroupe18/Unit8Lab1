/*
 * Created by Dave on 3/7/17.
 */

public class Tester {
    public static void main(String[] args) {
        WaitingList myWaitingList = new WaitingList("A");
        myWaitingList.add("B");
        myWaitingList.add("C");

        WaitingList otherWaitingList = new WaitingList("Z");
        otherWaitingList.add("D");
        otherWaitingList.add("E");
        otherWaitingList.add("F");
        otherWaitingList.add("G");



        System.out.println(myWaitingList.toString());
        //System.out.println("The size of the list is: " + myWaitingList.size());
        System.out.println(otherWaitingList.toString());
        //System.out.println("The size of the other list is: " + otherWaitingList.size());
        myWaitingList.transferNodesFromEnd(otherWaitingList, 4);
        System.out.println(myWaitingList.toString());
        //System.out.println("The size of the list is: " + myWaitingList.size());

        myWaitingList.insert(1, 2);
        System.out.println(myWaitingList.toString());

        myWaitingList.insert(0, 0);
        System.out.println(myWaitingList.toString());





    }

}
