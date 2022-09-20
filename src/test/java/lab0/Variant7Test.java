package lab0;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.internal.collections.Pair;

import static org.testng.Assert.assertEquals;

public class Variant7Test
{
    //Integer7. Дано двузначное число. Найти сумму и произведение его цифр.
    @Test(dataProvider = "integerProvider")
    public void inputIntegersToIntEx(int p1, int[] p3)
    {
        assertEquals(new Variant7().intTask(p1), p3);
    }
    @DataProvider
    public Object[][] integerProvider()
    {
        //new Pair<Integer,Integer>(1,2);
        return new Object[][] { { 56, new int[]{11, 30} }, {10, new int[]{1, 0}}, {22, new int[]{4, 4}} };
    }


    //Boolean7*. Даны три целых числа: A, B, C. Проверить истинность высказывания: «Число B находится между числами A и C».
    @Test(dataProvider = "booleanProvider")
    public void inputIntegersToBoolEx(int a, int b, int c, boolean res)
    {
        assertEquals(new Variant7().boolTask(a,b,c), res);
    }
    @DataProvider
    public Object[][] booleanProvider()
    {
        return new Object[][] { { 1, 2, 3, true}, {2, 1, 3, false}, {11,44,99, true} };
    }


    //If7. Даны два числа. Вывести порядковый номер меньшего из них.
    @Test(dataProvider = "ifProvider")
    public void inputIntegersToIfEx(int a, int b, int res)
    {
        assertEquals(new Variant7().ifTask(a,b), res);
    }
    @DataProvider
    public Object[][] ifProvider()
    {
        return new Object[][] {{1, 2, 2}, {2, 1, 1}, {22, 44, 2}};
    }


    //For7. Даны два целых числа A и B (A < B). Найти сумму всех целых чисел от A до B включительно.
    @Test(dataProvider = "forProvider")
    public void inputIntegersToForEx(int a, int b, int res)
    {
        assertEquals(new Variant7().forTask(a,b), res);
    }

    @DataProvider
    public Object[][] forProvider()
    {
        return new Object[][] {{1, 3, 2}, {1, 44, 43}, {-10, 10, 20}};
    }


    //While7*. Дано целое число N (> 0). Найти наименьшее целое положительное число K, квадрат которого превосходит N: K2 > N.
    //Функцию извлечения квадратного корня не использовать.
    @Test(dataProvider = "whileProvider")
    public void inputIntegersToWhileEx(int n, int k)
    {
        assertEquals(new Variant7().whileTask(n), k);
    }
    @DataProvider
    public Object[][] whileProvider()
    {
        return new Object[][] { {4, 3}, {16,5}, {100,11} };
    }


    //Array7*. Дан массив размера N. Вывести его элементы в обратном порядке.
    @Test(dataProvider = "arrayProvider")
    public void inputIntegersToArrEx(int[] arr, int[] res)
    {
        assertEquals(new Variant7().arrayTask(arr), res);
    }
    @DataProvider
    public Object[][] arrayProvider()
    {
        return new Object[][] {{new int[]{4,3,2,1}, new int[]{1,2,3,4}}, {new int[]{1,2,3}, new int[]{3,2,1}} };
    }


    // Case7. Единицы массы пронумерованы следующим образом: 1 — килограмм, 2 — миллиграмм, 3 — грамм, 4 — тонна, 5 — центнер.
    // Дан номер единицы массы (целое число в диапазоне 1–5) и масса тела в этих единицах (вещественное число).
    // Найти массу тела в килограммах.
    @Test(dataProvider = "caseProvider")
    public void inputIntegersToCaseEx(int choice, double count, double res)
    {
        assertEquals(new Variant7().caseTask(choice,count), res);
    }
    @DataProvider
    public Object[][] caseProvider()
    {
        return new Object[][] {{1,1,1}, {4,1,1000}, {5,1,100}};
    }

    //Matrix7*. Дана матрица размера M ґ N и целое число K (1 Ј K Ј M).
    // Вывести элементы K-й строки данной матрицы.
    @Test(dataProvider = "matrixProvider")
    public void inputIntegersToMatrixEx(int[][] matrix, int m, int n, int k, int[] arr)
    {
        assertEquals(new Variant7().matrixTask(matrix, m, n, k), arr);
    }
    @DataProvider
    public Object[][] matrixProvider()
    {
        return new Object[][] { {new int[][]{{1,1,1},{2,2,2},{3,3,3}},3,3,2,new int[]{3,3,3}} };
    }
}