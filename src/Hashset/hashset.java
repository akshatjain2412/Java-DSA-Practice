package Hashset;

import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        HashSet <Integer> practice=new HashSet<>();
        HashSet <Integer> k=new HashSet<>();
        practice.add(44);
        practice.add(34);
        practice.add(44);//add value in hashset if not exist already
        System.out.println(practice.size());//gives size in integer
        System.out.println(practice.isEmpty());//boolean value
        System.out.println(practice.remove(44));//remove the value
        System.out.println(practice.equals(k));//check equal to value or not
        System.out.println(practice.contains(65));//boolean contain  element in practice
        System.out.println(practice.containsAll(k));//boolean contain all element of k in practice
        System.out.println(practice.parallelStream());
        System.out.println(practice.hashCode());//it gives hashcode value of the hashset
        System.out.println(practice.removeAll(k));// remove all elements of k
    }
}
