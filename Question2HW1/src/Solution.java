import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    static long aVeryBigSum(int n, long[] ar){
        int len=ar.length;
        long sum=0;
        for(int i=0;i<len;i++){
            sum+=ar[i];
        }
        return sum;
    }
}
