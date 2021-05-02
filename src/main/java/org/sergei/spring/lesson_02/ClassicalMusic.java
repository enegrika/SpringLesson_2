package org.sergei.spring.lesson_02;

public class ClassicalMusic implements Music {

    private ClassicalMusic(){}

    /// ЕСЛИ scope singleton, то factory-method будет
    // возвращать один и тот же объект независимо от того,
    // что в методе мы создаем каждый раз новый объект через оператор new

    public static ClassicalMusic getInstance(){
        return new ClassicalMusic();
    }


    @Override
    public String getSong() {
        return "Bach - Air on G";
    }
}
