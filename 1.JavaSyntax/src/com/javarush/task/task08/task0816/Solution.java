package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {

        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH); // английский формат даты
        HashMap<String, Date> map = new HashMap<>();

        // циклом добавляются фамилии и годы рождения
        for (int i = 1; i <= 10; i++) {
            map.put("Stallone" + i, df.parse("JUNE " + i + " 1980"));
        }

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Collection<Integer> removeCandidates = new LinkedList<>();

        Calendar myCal = new GregorianCalendar();

        for (Iterator<HashMap.Entry<String, Date>> it = map.entrySet().iterator(); it.hasNext(); ) {
            HashMap.Entry<String, Date> entry = it.next();
            myCal.setTime(entry.getValue());
            int a = myCal.get(Calendar.MONTH) + 1;
            if (a >= 6 && a <= 8) {
                it.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}

/*


        //напишите тут ваш код
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код

    }

    public static void main(String[] args) {

    }
}
* */