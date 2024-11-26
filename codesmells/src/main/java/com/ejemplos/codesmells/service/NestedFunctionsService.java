package com.ejemplos.codesmells.service;

import org.springframework.stereotype.Service;

@Service
public class NestedFunctionsService {

    public void function1() {
        System.out.println("Outer function 1.");

        class InnerFunction1 {
            public void innerMethod1() {
                System.out.println("Inner function 1.");
            }
        }

        InnerFunction1 inner = new InnerFunction1();
        inner.innerMethod1();
    }

    public void function2() {
        System.out.println("Outer function 2.");

        class InnerFunction2 {
            public void innerMethod2() {
                System.out.println("Inner function 2.");
            }
        }

        InnerFunction2 inner = new InnerFunction2();
        inner.innerMethod2();
    }

    public void function3() {
        System.out.println("Outer function 3.");

        class InnerFunction3 {
            public void innerMethod3() {
                System.out.println("Inner function 3.");
            }
        }

        InnerFunction3 inner = new InnerFunction3();
        inner.innerMethod3();
    }

    public void function4() {
        System.out.println("Outer function 4.");

        class InnerFunction4 {
            public void innerMethod4() {
                System.out.println("Inner function 4.");
            }
        }

        InnerFunction4 inner = new InnerFunction4();
        inner.innerMethod4();
    }

    public void function5() {
        System.out.println("Outer function 5.");

        class InnerFunction5 {
            public void innerMethod5() {
                System.out.println("Inner function 5.");
            }
        }

        InnerFunction5 inner = new InnerFunction5();
        inner.innerMethod5();
    }

}
