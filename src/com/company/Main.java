package com.company;

// Порядок инициализации

class parrent{
    static {
        System.out.println(1);
    }
    parrent(){
        System.out.println(4);
    }
}

public class Main extends parrent {

    static {
        System.out.println(2);
    }
    {
        System.out.println(5);
    }
    Main(){
        super();
        System.out.println(7);
    }

    public static void main(String[] args) {
        new Main();
        System.out.println(8);
    }
    {
        System.out.println(6);
    }
    static {
        System.out.println(3);
    }
}
