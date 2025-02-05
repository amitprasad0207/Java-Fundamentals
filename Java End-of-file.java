import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lnno = 1;
        while(sc.hasNextLine())
        {
            System.out.printf("%d %s\n", lnno, sc.nextLine());
            lnno++;
        }
        sc.close();
    }
}
