package com.javarush.task.task20.task2002;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File yourFile = File.createTempFile("2.txt", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            User user = new User();
            user.setFirstName("Fn");
            user.setLastName("Ln");
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            user.setBirthDate(df.parse("12/01/2012"));
            user.setMale(Boolean.parseBoolean("true"));
            user.setCountry(User.Country.valueOf("RUSSIA"));
            javaRush.users.add(user);

            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //here check that the codeGym object is equal to the loadedObject object - проверьте тут, что javaRush и loadedObject равны
            if(javaRush.equals(loadedObject))
                System.out.println("Goood!");
            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот мето
            BufferedWriter fw = new BufferedWriter(new OutputStreamWriter(outputStream));
            if (!users.isEmpty()){
                for (User u: users) {
                    fw.write(u.getFirstName());
                    fw.newLine();
                    fw.write(u.getLastName());
                    fw.newLine();
                    fw.write(Long.toString(u.getBirthDate().getTime()));
                    fw.newLine();
                    fw.write(Boolean.toString(u.isMale()));
                    fw.newLine();
                    fw.write(u.getCountry().getDisplayName());
                    fw.newLine();
                }
            }
            fw.close();
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            BufferedReader buf = new BufferedReader(new InputStreamReader(inputStream));
            while (buf.ready()){
                User user = new User();
                user.setFirstName(buf.readLine());
                user.setLastName(buf.readLine());
               // SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                Date date = new Date();
                String s = buf.readLine();
                date.setTime(Long.valueOf(s));

                user.setBirthDate(date);
                user.setMale(Boolean.parseBoolean(buf.readLine()));
                //s = buf.readLine();
                user.setCountry(User.Country.valueOf(buf.readLine().toUpperCase()));
                users.add(user);
            }

        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
