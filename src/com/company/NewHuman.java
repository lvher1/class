package com.company;

import org.omg.CORBA.WStringSeqHelper;

public class NewHuman {
    private String name;
    private int age;
    private int height;
    private int weight;
    NewHuman(String n, int a, int h, int w){
        name = n;
        age = a;
        height = h;
        weight = w;
    }
    String getName(){return name;}
    int getAge(){return age;}
    int getHeight(){return height;}
    int getWeight(){return weight;}

    void addHeight(int h){height += h;}
    void addWeight(int w){weight += w;}
    void addAge(int a){age +=a;}
    void reduceWeight(int w){weight -=w;}
}

class Human{
    public static void main(String[] args){
        System.out.println();
        NewHuman human = new NewHuman("jang",36,187,88 );
        human.addAge(5);
        human.addHeight(1);
        human.reduceWeight(2);
        human.addWeight(8);
        System.out.println("name:"+human.getName());
        System.out.println("age:"+human.getAge());
        System.out.println("height:"+human.getHeight());
        System.out.println("weight"+human.getWeight());
    }
}
/*
    초기화와 관련된 위험성:
        인스턴스의 각 필드에 설정하는 것을 까먹은 경우 에러가 발생할 위험이 있으므로 초기화 해야할 필드는 초기화를 강제로 해야한다.
    데이터 보호와 관련된 위험성:
        기본적으로 public 혹은 private 혹은 protected 등을 설정하지 않은 객체는 기본 타입이 public 으로 설정되기 때문에 다른 클래스에서 해당 값을 변경할 수 있다.
        따라서 클래스 내부에서만 사용할 객체는 private 등을 설정해주면 좀 더 안전한 코드가 된다.
 */