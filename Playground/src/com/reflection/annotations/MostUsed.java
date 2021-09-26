package com.reflection.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Inherited // if i use the MostUsed annotation on a class, then that's class children will inherit the annotation
@Target({ElementType.TYPE, ElementType.METHOD}) //determines if thhe annotation will be used to a method, constructor, type, field variable etc.
@Retention(RetentionPolicy.RUNTIME) // 
public @interface MostUsed {
	
	String value() default "Java";

}
