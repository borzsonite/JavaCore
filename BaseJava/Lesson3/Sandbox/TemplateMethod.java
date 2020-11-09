package BaseJava.Lesson3.Sandbox;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class TemplateMethod {
    public static void main(String[] args) {
        C a = new A();
        C b  = new B();

        a.templateMethod();
        b.templateMethod();

    }
}

abstract class C {
     public void templateMethod() {
         System.out.print(1);
         differ(); // внутри абстрактного класса можно ссылатся не его же абстрактные методы
         System.out.print(3);
         differ2();
     }
     abstract void differ();// определяется в потомках
     abstract void differ2();
}

class A extends C {
    @Override
    void differ() {
        System.out.print(2);
    }

    @Override
    void differ2() {
        System.out.println(5);
    }
}

class B extends C{
    @Override
    void differ() {
        System.out.print(4);
    }

    @Override
    void differ2() {

    }
}
