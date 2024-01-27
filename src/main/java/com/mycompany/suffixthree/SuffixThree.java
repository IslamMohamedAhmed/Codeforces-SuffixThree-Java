/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.suffixthree;

/**
 *
 * @author Islam Mohamed
 */
import java.util.*;

public class SuffixThree {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t;
        String[] str = new String[35];
        String[] str2 = new String[35];
        int[] str3 = new int[35];
        t = scan.nextInt();
        for (int i = 0; i <= t; i++) {
            str[i] = scan.nextLine();
            str3[i] = str[i].length() - 1;
        }
        for (int i = 1; i <= t; i++) {
            char helper2 = str[i].toCharArray()[str3[i]];
            switch (helper2) {
                case 'o':
                    str2[i] = "FILIPINO";
                    break;
                case 'u':
                    str2[i] = "JAPANESE";
                    break;
                case 'a':
                    str2[i] = "KOREAN";
                    break;

            }
        }
        for(int i=1;i<=t;i++){
            System.out.println(str2[i]);
        }

    }
}
