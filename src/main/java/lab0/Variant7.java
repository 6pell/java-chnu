package lab0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Variant7 {

    public int[] intTask(int k) {
        assert k < 100 && k >= 10: "Argument should be less than 100 and bigger than 10";
        int[] arr = new int[2];
        int n1 = k / 10;
        int n2 = k % 10;
        arr[0] = n1 + n2;
        arr[1] = n1 * n2;
        return arr;
    }

    public boolean boolTask(int a, int b, int c)
    {
        return a < b && b < c;
    }

    public int ifTask(int a, int b)
    {
        assert a != b : "Numbers should be different";
        if(a > b)
        {
            return 1;
        }
        return 2;
    }

    public int forTask(int a,int b)
    {
        assert a < b : "A should be less than be";
        int res = 0;
        for(int i = a; i < b+1; i++)
        {
            res += i;
        }
        return res;
    }

    public int whileTask(int n)
    {
        assert n > 0 : "Number should be bigger than 0";
        int k;
        int i = 0;
        while(true)
        {
            i++;
            k = i*i;
            if(k > n)
            {
                k = k / i;
                break;
            }
        }
        return k;
    }

    public int[] arrayTask(int[] a)
    {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[a.length - i - 1] = a[i];
        }
        return b;
    }

    public double caseTask(int choice, double count)
    {
        double res = 0;
        switch (choice)
        {
            case 1 : res = count;
            break;
            case 2 : res = count / 1000000;
            break;
            case 3 : res = count / 1000;
            break;
            case 4 : res = count * 1000;
            break;
            case 5 : res = count * 100;
            break;
        }
        return res;
    }

    public int[] matrixTask(int[][] matrix, int m, int n, int k)
    {
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[i].length; j++)
            {
                if(i == k)
                {
                    res.add(matrix[i][j]);
                }
            }
        }

        int[] arr = new int[res.size()];
        for(int i = 0; i < res.size(); i++) {
            arr[i] = res.get(i);
        }
        return arr;
    }
}