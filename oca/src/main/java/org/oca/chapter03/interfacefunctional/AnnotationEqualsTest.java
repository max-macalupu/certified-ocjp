package org.oca.chapter03.interfacefunctional;

@FunctionalInterface
public abstract interface AnnotationEqualsTest {
	abstract int foo();
	boolean equals (Object obj);
}
