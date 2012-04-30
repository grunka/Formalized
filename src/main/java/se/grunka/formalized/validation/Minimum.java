package se.grunka.formalized.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Minimum {
    Integer i() default null; //Fix, use a default value that can be detected as "no value"
    Double d() default null;
    Float f() default null;
    Long l() default null;
}
