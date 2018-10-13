package com.javarush.task.task19.task1905;

import java.util.HashMap;
import java.util.Map;

/* 
Закрепляем адаптер
*/

public class Solution {
    public static Map<String,String> countries = new HashMap<String,String>();

    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }
    public static void main(String[] args) {
       // String s = "Ivanov, Ivan";
       // System.out.println(s.substring(s.lastIndexOf(",")+2));
    }

    public static class DataAdapter implements RowItem{
        private Customer customer;
        private Contact contact;
        public DataAdapter(Customer customer, Contact contact) {
            this.contact = contact;
            this.customer = customer;
        }

        @Override
        public String getCountryCode() {
            String code ="";
            for (Map.Entry<String, String> pair: countries.entrySet()
            ) {
                if (pair.getValue().equals(customer.getCountryName())) code = pair.getKey();
            }
            return code;
        }

        @Override
        public String getCompany() {
            return customer.getCompanyName();
        }

        @Override
        public String getContactFirstName() {
            String s = contact.getName();
            return s.substring(s.indexOf(",")+2);
        }

        @Override
        public String getContactLastName() {
            String s = contact.getName();
            return s.substring(0, s.indexOf(","));
        }

        @Override
        public String getDialString() {
            String phoneNumber = contact.getPhoneNumber();
            phoneNumber = phoneNumber.replaceAll("\\(", "").replaceAll("\\)", "").replaceAll("-", "");
            return "callto://" + phoneNumber;
        }
    }

    public static interface RowItem {
        String getCountryCode();        //example UA
        String getCompany();            //example JavaRush Ltd.
        String getContactFirstName();   //example Ivan
        String getContactLastName();    //example Ivanov
        String getDialString();         //example callto://+380501234567
    }

    public static interface Customer {
        String getCompanyName();        //example JavaRush Ltd.
        String getCountryName();        //example Ukraine
    }

    public static interface Contact {
        String getName();               //example Ivanov, Ivan
        String getPhoneNumber();        //example +38(050)123-45-67 or +3(805)0123-4567 or +380(50)123-4567 or ...
    }
}