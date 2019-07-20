package org.demo.proxy;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

import java.lang.reflect.Method;

public class ProxyDemo {

    public static void main(String[] args) {

        Foo foo = new FooImpl();

        ProxyFactory proxyFactory = new ProxyFactory(new FooImpl());
        proxyFactory.addInterface(Foo.class);
        proxyFactory.addAdvice(new MethodBeforeAdvice() {

            @Override
            public void before(Method method, Object[] args, Object target) throws Throwable {
                System.out.println("before method");
                method.invoke(target, args);
                method.invoke(target, args);
                method.invoke(target, args);
                method.invoke(target, args);
                System.out.println("I can control the execution loops");
            }
        });

        Foo proxyFoo = (Foo)proxyFactory.getProxy();
        proxyFoo.foo();

    }
}
