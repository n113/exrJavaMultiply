package com.company;

import java.util.ArrayList;
import java.util.Random;

/*
*
*  Для проверки остаточных знаний учеников после летних каникул,
*  учитель младших классов решил начинать каждый урок с того,
*  чтобы задавать каждому ученику пример из таблицы умножения,
*  но в классе 15 человек, а примеры среди них не должны повторяться.
*  В помощь учителю напишите программу, которая будет выводить на экран
*  15 случайных примеров из таблицы умножения (от 2*2 до 9*9, потому что з
*  адания по умножению на 1 и на 10 — слишком просты). При этом среди 15
*  примеров не должно быть повторяющихся (примеры 2*3 и 3*2
*  и им подобные пары считать повторяющимися).
*
* */

public class Main {

    public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();
    Random rand = new Random();
    ArrayList<String> checking = new ArrayList<>();

    int counter=1;
    while (counter<16){
        boolean isOld = false;
        String a=String.valueOf(rand.nextInt(9));
        String b=String.valueOf(rand.nextInt(9));
        String s=a+b;
        for(int i=0;i<checking.size();i++){
            if(s.equals(checking.get(i))){
                isOld=true;
            }
        }
        if (isOld){
            continue;
        }
        if((Integer.valueOf(a)==0||Integer.valueOf(b)==0)||(Integer.valueOf(a)==1||Integer.valueOf(b)==1)){
            continue;
        }
        System.out.println(counter+")"+a+"*"+b+"=?");
        counter++;
        checking.add(a+b);
        checking.add(b+a);
    }


    }//main
}

/*
* public class Zadachi{
    public static void main(String[] args){
        //Создадим массив зададий для учеников. Так как учеников 15, каждый из них получит свою строку (задание). Задание у нас состоит из 2 множителей и их произведения, т.е. в каждой строке будет 3 элемента
        int [][] Mas = new int[15][3];
        //Заполним массив заданий
        for(int i =0;i<Mas.length;i++){
            for(int h=0;h<Mas[i].length;h++){
                //Первым двум элементам строки (множителям) присвоим рандомные значения от 2 до 9
                Mas[i][h]=(int)(Math.random()*8)+2;
                //3 элемент - это результат умножения первых двух элементов строки
                if(h==Mas[i].length-1){
                    Mas[i][h]=Mas[i][h-2]*Mas[i][h-1];
                    //Проверим, нет ли среди уже свормированых заданий (строк), таких, которые по условиям задачи нельзя задавать другому ученику. Для этого переберем все результаты умножения (3 элементы) предыдущих строк.
                    for(int q=0;q<i;q++){
                        if(Mas[i][h]==Mas[q][h]&&i>0){
                            //Если мы нашли такую строку, надо убедиться, что множители в ней тоже совпадают. Для этого нам достаточно проверить совпадение одного множителя.
                            if(Mas[i][h-1]==Mas[q][h-1]||Mas[i][h-2]==Mas[q][h-2])
                            //Если мы находим такое совпадение - заполним элементы строки заново
                            --i;
                        }
                    }
                }
            }
        }
        //С помощью простого цикла выведем уже отобранные задания на экран
        for(int i=0;i<Mas.length;i++){
            System.out.print("Задание №"+(i+1+" Умножить "));
            for(int h=0;h<Mas[i].length;h++){
                if(h==0)
                    System.out.print(Mas[i][h]+" на ");
                if(h==1)
                    System.out.println(Mas[i][h]);
            }
        }
    }
}
* */