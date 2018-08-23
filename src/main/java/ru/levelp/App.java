package ru.levelp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        int i = 0;
        String error = "incorrect query";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in1 = br.readLine();                                                 /*Вводим 1й IP*/
        String in2 = br.readLine();                                                 /*Вводим 2й IP*/
        if (in1.length() < 10 && in2.length() < 10)
        {
            System.out.println(error);                                  /*Если IP некорректный(меньше 10 знаков) - сообщение об ошибке*/
        } else
            {
                String in1body = in1.substring(0, 10);                              /* Выделяем тело основную часть IP*/
                String in2body = in2.substring(0, 10);

                String s1 = in1.substring(10);                                      /* Последнее число IP*/
                String s2 = in2.substring(10);

                int lastNum1 = Integer.parseInt(s1);                                /*Переводим текст в цифры*/
                int lastNum2 = Integer.parseInt(s2);


                if (in1body.equals(in2body)) {                                      /*Выводим нужные номера IP*/
                    if (lastNum1 < lastNum2) {
                        for (i = lastNum1 + 1; i < lastNum2; i++) {
                            System.out.println(in1body + i);
                        }
                    } else
                        for (i = lastNum2 + 1; i < lastNum1; i++) {
                            System.out.println(in2body + i);
                        }
                } else System.out.println(error);                                   /*Если номера введены разные - сообщение об ошибке*/
            }
    }
}

