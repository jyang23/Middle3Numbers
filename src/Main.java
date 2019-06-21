import java.util.ArrayList;
import java.util.Collection;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {

        System.out.println("Middle Three Numbers:");

        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<String> arrStr = new ArrayList<String>();
        ArrayList<String> valid = new ArrayList<String>();
        ArrayList<String> invalid = new ArrayList<String>();
        arr.add(123);
        arr.add(12345);
        arr.add(1234567);
        arr.add(10001);
        arr.add(-10001);
        arr.add(-123);
        arr.add(-100);
        arr.add(100);
        arr.add(-12345);
        arr.add(1);
        arr.add(2);
        arr.add(-1);
        arr.add(-10);
        arr.add(-2002);
        arr.add(0);
        System.out.println(arr);

        boolean flag = true;

        for (int i = 0; i < 15; i++) {
            int temp = arr.get(i);
            temp = Math.abs(temp);
            arrStr.add(Integer.toString(temp));
        }
        for (int i = 0; i < 15; i++) {
            String temp2 = arrStr.get(i);
            int temp_num = temp2.length();
            if(temp_num%2 == 0)
            {
                invalid.add("error");
            }
            else if(temp_num == 3)
            {
                valid.add(temp2);
            }
            else if(temp_num > 3)
            {
                valid.add(temp2.substring((temp2.length()/2)-1,(temp2.length()/2)+2));
            }
        }
        System.out.println(valid);
        System.out.println(invalid);

    }
}
