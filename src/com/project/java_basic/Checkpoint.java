package com.project.java_basic;

import java.util.Scanner;

public class Checkpoint {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in) ;
        System.out.println("กรอกคะแนนรวม(0-100):") ;

        if (scanner.hasNext()){
        int score = scanner.nextByte();
        if (score < 0 ||score > 100) {
            System .out.println("คะแนนต้องอยู่ระหว่าง 0 - 100 เท่านั้น");
        } else {
            String grade ;
            if (score > 76) {
                grade = "H" ;
            }else  if ( score > 60 && score   <= 75) {
                grade ="S";
            }else{
                grade ="U";
            }
            System.out.println("เกรดคุณคือ: "+ grade );
        }
        }
        }
}
