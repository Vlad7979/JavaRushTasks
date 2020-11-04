package com.javarush.task.task20.task2002;

import java.io.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;


/*
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File yourFile = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            User user = new User();
            User user1 = new User();

            user.setCountry(User.Country.RUSSIA);
            user.setFirstName("Kolya");
            user.setLastName("Kolya2");
            user.setMale(true);
            user.setBirthDate(new Date(1508944516163L));
            javaRush.users.add(user );

            user1.setCountry(User.Country.RUSSIA);
            user1.setFirstName("I");
            user1.setLastName("I2");
            user1.setMale(false);
            user1.setBirthDate(new Date(1508944516163L));
            javaRush.users.add(user1 );


            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //here check that the codeGym object is equal to the loadedObject object - проверьте тут, что javaRush и loadedObject равны
            if (javaRush.equals(loadedObject) )
                System.out.println("Ура");
            else
                System.out.println("нет");

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

            //implement this method - реализуйте этот метод
            PrintWriter writer = new PrintWriter(outputStream);
            if(users.size() == 0){   //если нет user

            } else
            {

                for(int i = 0; i < users.size(); i++)
                {
                    StringBuilder sb = new StringBuilder();
                    User us= users.get(i);
                    if ( us.getCountry()!=null)
                        sb.append(us.getFirstName() + ";" + us.getLastName() + ";"+ us.getBirthDate().getTime() +";" + us.getCountry().getDisplayName()+";" + us.isMale() );
                    else
                        sb.append(us.getFirstName() + ";" + us.getLastName() + ";"+ us.getBirthDate().getTime() +";" + "null"+";" + us.isMale() );

                    writer.println(sb.toString());
                    writer.flush();
                }

            }

        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            while (br.ready())
            {
                String[] as = br.readLine().split("\\;");
                User us = new User();

                //String[] as = asset.split(" ");
                if (!as[0].equals("null") )
                    us.setFirstName(as[0]);

                if (!as[1].equals("null") )
                    us.setLastName(as[1]);

                Date date = new Date(Long.parseLong(as[2]));

                //if (!as[2].equals("null") )
                us.setBirthDate(  date );

                if (as[3].equals("null"))
                {;}
                else if (as[3].equals("Russia"))
                    us.setCountry( User.Country.RUSSIA);
                else if (as[3].equals("Ukraine"))
                    us.setCountry( User.Country.UKRAINE);
                else if (as[3].equals("Other"))
                    us.setCountry( User.Country.OTHER);

                if (!as[4].equals("null") )
                    us.setMale( Boolean.valueOf(as[4]) );
                this.users.add(us);

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