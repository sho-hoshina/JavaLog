package jp.techacademy.shou.hoshina.javalog;

/**
 * Created by kuro on 2017/07/23.
 */

import android.util.Log;

public class Dog extends Animal implements Movable{
    //クラス変数
    static String to_jp = "犬";

    //コンストラクタ
    public Dog()
    {
        this.name = "";
        this.age = 0;
    }

    //引数付きコンストラクタ
    public Dog(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    //クラス関数
    public static void introduce()
    {
        Log.d("javatest", "これは犬クラスです。");
    }

    //メソッド
    public void say()
    {
        Log.d("javatest", this.name + "(" + this.age + "歳)" + "「ワンワン」");
    }

    @Override
    public void move()
    {
        Log.d("javatest", this.name + "(" + this.age + "歳)" + "は全力で走った");
    }
}
