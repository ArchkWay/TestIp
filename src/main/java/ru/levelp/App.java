package ru.levelp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        int i = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in1 = br.readLine();
        String in2 = br.readLine();
        if (in1.length() < 10 && in2.length() < 10)
        {
            System.out.println("incorrect query");
        } else
            {
                String in1body = in1.substring(0, 10);
                String in2body = in2.substring(0, 10);

                String s1 = in1.substring(10);
                String s2 = in2.substring(10);

                int lastNum1 = Integer.parseInt(s1);
                int lastNum2 = Integer.parseInt(s2);


                if (in1.substring(8, 9).equals(in2.substring(8, 9))) {
                    if (lastNum1 < lastNum2) {
                        for (i = lastNum1 + 1; i < lastNum2; i++) {
                            System.out.println(in1body + i);
                        }
                    } else
                        for (i = lastNum2 + 1; i < lastNum1; i++) {
                            System.out.println(in2body + i);
                        }
                } else System.out.println("incorrect query");
            }
    }
}

