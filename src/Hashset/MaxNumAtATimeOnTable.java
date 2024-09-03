package Hashset;
// all the number are present two time
//this is the code for some number are present in the bag we one by one carry a number and put on a table if
//the number is already present on the table then remove both of them from table and if not then rest on table
//we are tell max numbers present at a time on table

import java.util.HashSet;

//it is good approach to use same data type or class which is used in Data Structure
public class MaxNumAtATimeOnTable {
    public static int MaxAtTime(Integer[] numbers){
        int max=0;
        HashSet<Integer> Table =new HashSet<>();
        for (Integer number : numbers) {
            if (Table.contains(number)) {    //if already present then remove previous one and not insert new one
                Table.remove(number);
            } else {
                Table.add(number);  //Insert if already not present on table
            }
            max = Math.max(max, Table.size());//max numbers on table at a time
        }
        return max;
    }
    public static void main(String[] args) {
        Integer [] arr= {1,1};
        System.out.println(MaxAtTime(arr));
    }
}
