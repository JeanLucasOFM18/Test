package com.ejemplos.codesmells.service;

import org.springframework.stereotype.Service;

@Service
public class NestedFunctionsService {

    public void function1() {
        System.out.println("Outer function 1.");

        class InnerFunction {
            public void innerMethod() {
                System.out.println("Inner function 1.");
            }
        }

        InnerFunction inner = new InnerFunction();
        inner.innerMethod();
    }

    public void function2() {
        System.out.println("Outer function 2.");

        class InnerFunction {
            public void innerMethod() {
                System.out.println("Inner function 2.");
            }
        }

        InnerFunction inner = new InnerFunction();
        inner.innerMethod();
    }

    public void function3() {
        System.out.println("Outer function 3.");

        class InnerFunction {
            public void innerMethod() {
                System.out.println("Inner function 3.");
            }
        }

        InnerFunction inner = new InnerFunction();
        inner.innerMethod();
    }

    public void function4() {
        System.out.println("Outer function 4.");

        class InnerFunction {
            public void innerMethod() {
                System.out.println("Inner function 4.");
            }
        }

        InnerFunction inner = new InnerFunction();
        inner.innerMethod();
    }

    public void function5() {
        System.out.println("Outer function 5.");

        class InnerFunction {
            public void innerMethod() {
                System.out.println("Inner function 5.");
            }
        }

        InnerFunction inner = new InnerFunction();
        inner.innerMethod();
    }

}
