package com.javarush.task.task17.task1710;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }
    public static void main(String[] args) throws ParseException {
        //start here - начни тут
        if (args[0].equals("-c")) {
            if (args[2].equals("м")) {
                allPeople.add(Person.createMale(args[1], new SimpleDateFormat("dd/MM/yyyy").parse(args[3])));
            }
            else {
                allPeople.add(Person.createFemale(args[1], new SimpleDateFormat("dd/MM/yyyy").parse(args[3])));
            }
            System.out.println(allPeople.size() - 1);
        }
        else if (args[0].equals("-u")) {
            allPeople.get(Integer.parseInt(args[1])).setName(args[2]);
            allPeople.get(Integer.parseInt(args[1])).setSex(args[3].equals("м") ? Sex.MALE : Sex.FEMALE);
            allPeople.get(Integer.parseInt(args[1])).setBirthDay(new SimpleDateFormat("dd/MM/yyyy").parse(args[4]));
        }
        else if (args[0].equals("-i")) {
            Person person = allPeople.get(Integer.parseInt(args[1]));
            System.out.println(person.getName() + (person.getSex() == Sex.MALE ? " м " : " ж ") +
                    new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH).format(allPeople.get(Integer.parseInt(args[1])).getBirthDay()));
        }
        else {
            allPeople.get(Integer.parseInt(args[1])).setName(null);
            allPeople.get(Integer.parseInt(args[1])).setSex(null);
            allPeople.get(Integer.parseInt(args[1])).setBirthDay(null);
        }
    }
}


//    static {
//        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
//        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
//    }
//
//    public static void main(String[] args) throws ParseException, IOException {
//        String param = args[0];
//        switch(param){
//            case "-c":
//                add(args[1],args[2], args[3]);
//                break;
//            case "-u":
//                update(Integer.parseInt(args[1]), args[2], args[3], args[4]);
//                break;
//            case "-d":
//                delete(Integer.parseInt(args[1]));
//                break;
//            case "-i":
//                show(Integer.parseInt(args[1]));
//                break;
//            default:;
//        }
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//            String s = reader.readLine();
//            String argsNew[] = s.split(" ");
//            main(argsNew);
//    }
//    public static void add(String name, String sex, String bg) throws ParseException {
//        if(sex.toLowerCase().equals("м"))
//            allPeople.add(Person.createMale(name, dateFormatter(bg)));
//
//        else if(sex.toLowerCase().equals("ж"))
//            allPeople.add(Person.createFemale(name, dateFormatter(bg)));
//
//        for(Person p : allPeople){
//            if(p.getName().equals(name)){
//                System.out.println(allPeople.indexOf(p));
//            }
//        }
//    }
//
//    public static void update(int ID, String name, String sex, String bd) throws ParseException {
//        Person person = allPeople.get(ID);
//        person.setName(name);
//
//        if(sex.toLowerCase().equals("м"))
//            person.setSex(Sex.MALE);
//        else if(sex.toLowerCase().equals("ж"))
//            person.setSex(Sex.FEMALE);
//
//        person.setBirthDay(dateFormatter(bd));
//    }
//
//    public static void delete(int ID){
//        allPeople.remove(ID);
//    }
//
//    public static void show(int ID){
//        if(ID > allPeople.size()-1){
//            System.out.println("Запись с идентификатором " + ID + " отсутствует");
//
//        }
//        else {
//            Person person = allPeople.get(ID);
//            Date date = person.getBirthDay();
//            DateFormat newFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
//            String bd = newFormat.format(date);
//
//            System.out.println(person.getName() + " " + person.getSex() + " " + bd);
//        }
//    }
//
//    public static Date dateFormatter(String str) throws ParseException {
//        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
//        Date date = dateFormat.parse(str);
//        return date;
//    }
//
//}
