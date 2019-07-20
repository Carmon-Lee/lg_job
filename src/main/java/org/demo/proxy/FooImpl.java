package org.demo.proxy;

public class FooImpl implements Foo {
    @Override
    public void foo() {
        this.bar();
    }

    @Override
    public void bar() {

        System.out.println("biz logic");
    }
}
