package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        String[] list = new String[6];
        list[0] = "строка 0";
        list[1] = "строка 1";
        list[2] = "строка 2";
        list[3] = "строка 3";
        list[4] = "строка 4";
        list[5] = "строка 5";

        List<String> newList = Arrays.asList(list);
        List<String> list2 = new ArrayList<>(newList);
        List<String> list3 = Arrays.asList(list);
        Collection<String> c = list3;
        list2.addAll(list2.size() / 2, list3);
        Collections.sort(list3);
        System.out.println(list3);
        Collections.reverse(list3);
        System.out.println(list3);
        System.out.println(list2);

        ListIterator<String> listIterator = list2.listIterator();
        int i = 0;
        while (listIterator.hasNext()) {
            i++;
            listIterator.next();
            if (i % 2 == 0) {
                listIterator.remove();
            }
        }

        System.out.println(list2);
        System.out.println();

        Set<String> set1 = new HashSet<String>();
        set1.add("линия 1");
        System.out.println(set1);
        set1.add("линия 2");
        System.out.println(set1);
        set1.addAll(list1);
        set1.addAll(list2);
        System.out.println(set1);
        System.out.println();
        Set<String> set2 = new LinkedHashSet<>();
        set2.addAll(list1);
        set2.addAll(list2);
        System.out.println(set2);
        System.out.println();

        Map<Integer, String> map1 = new LinkedHashMap<Integer, String>();
        map1.put(0, "January");
        map1.put(1, "February");
        map1.put(2, "March");
        map1.put(3, "April");
        map1.put(4, "May");
        map1.put(5, "June");
        map1.put(6, "July");
        map1.put(7, "August");
        map1.put(8, "September");
        map1.put(9, "October");
        map1.put(10, "November");
        map1.put(11, "December");
        System.out.println("The first month of the year is " + map1.get(0) + " and the last month of the year is " + map1.get(11));
        map1.put(6, "ОТПУСК");
        System.out.println(map1);
        HashMap<Integer, String> map2 = new HashMap<>();
        map2.putAll(map1);
        System.out.println(map2);
        map1.entrySet();
        map2.entrySet();
        System.out.println();


        HashSet<User> userSet = new HashSet<>();
        User user1 = new User("Kolia", 25, 55555555);
        User user2 = new User("Kolia", 25, 55555555);
        User user3 = new User("Kolia", 35, 55555555);
        userSet.add(user1);
        userSet.add(user2);
        userSet.add(user3);
        System.out.println(userSet);


    }



}
