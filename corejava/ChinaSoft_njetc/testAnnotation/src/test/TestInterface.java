package test;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target( { ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR,
		ElementType.ANNOTATION_TYPE })
@Retention(RetentionPolicy.SOURCE)
@Documented
@Inherited
public @interface TestInterface {
	int number() default 1;
	String value();
	String description() default "OK";
}
