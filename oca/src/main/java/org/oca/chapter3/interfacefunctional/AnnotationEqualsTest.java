package org.oca.chapter3.interfacefunctional;

@FunctionalInterface
public abstract interface AnnotationEqualsTest {
	abstract int foo();
	boolean equals (Object obj);
}
