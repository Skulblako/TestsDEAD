package com.company.archive;

public class Class10x10 { // Выводит таблицу умножения 10х10
    public static void main(String[] args) {
        int a = 1, b = 1;    // вынес переменные

        while (a <= 10) {         //Цикл 1
            int c = 1;        //обнуление с.. если убрать в другое место - при 2м заходе будет считать с 11, а не снова 1го
            for (int i = 1; i <=10; i++) { //Цикл 2 для каждой строки. умножается 1 (b) на 1 (c)
                System.out.print(b*c + " "); // пишет результат
                c++;              // увеличивает с на 1 и заново
            }                     // Цикл 2, конец. Он пишет в строке только 10 цифер через пробел
            System.out.println(); // переход на новую строку, что бы начиналась 2я строка
            a++;                  // увеличием а, что бы Цикл 1 вывел только 10 строк и дальше не продолжал
            b++;                  // увеличиваем и на 1, теперь будет 2*c.. на 3й раз = 3*c, 4*c и так далее
        }
    }
}
/**
 * int cycle = mnojit;
 *
 *         while (cycle <= 10){
 *
 *             mnojit = 1;
 *                 while (mnojit <= 10){
 *                     System.out.print(mnojit*cycle + " ");
 *                     mnojit++;
 *                 }
 *
 *             System.out.println();
 *             cycle++;
 *         }
 */