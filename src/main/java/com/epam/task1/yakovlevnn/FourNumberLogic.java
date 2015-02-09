package com.epam.task1.yakovlevnn;

import static java.lang.Integer.parseInt;

public class FourNumberLogic {

    //second working option
    public boolean fourNumberLogic(Integer number){

        String s = number.toString();
        Integer ch0 = parseInt(String.valueOf(s.charAt(0)));
        if (ch0 == 0){
            System.out.println("First char couldn't be equals to zero!!");
        }
        Integer ch1 = parseInt(String.valueOf(s.charAt(1)));
        Integer ch2 = parseInt(String.valueOf(s.charAt(2)));
        Integer ch3 = parseInt(String.valueOf(s.charAt(3)));
        boolean eq = Math.addExact(ch0,ch1) == Math.addExact(ch2,ch3);
        System.out.println(eq);
        return eq;
    }

            //first working option
 //   int[] numbers = {4, 5, 4, 6};
//    public boolean fourNumberLogic(int [] numbers){
//    boolean sum = Math.addExact(numbers[0], numbers[1]) == Math.addExact(numbers[2], numbers[3]);
//    System.out.println(sum);
//    return sum;
//    }



    // first option
//        boolean sum = Math.addExact(numbers[0], numbers[1]) == Math.addExact(numbers[2], numbers[3]);
//        System.out.println(sum);

    // second option
//        int[] numbers = {4, 5, 4, 5};
//        if (Math.addExact(numbers[0], numbers[1]) == Math.addExact(numbers[2], numbers[3])) {
//            System.out.println("true");
//            } else {
//                System.out.println("false");
//            }

    //third option
//        Integer number = 2736;
//        String s = number.toString();
//        Integer ch0 = parseInt(String.valueOf(s.charAt(0)));
//        Integer ch1 = parseInt(String.valueOf(s.charAt(1)));
//        Integer ch2 = parseInt(String.valueOf(s.charAt(2)));
//        Integer ch3 = parseInt(String.valueOf(s.charAt(3)));
//        boolean eq = Math.addExact(ch0,ch1) == Math.addExact(ch2,ch3);
//        System.out.println(eq);

}
