package minhaihuang.Annotation.Test01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * 自定义一个注解
 * @author 黄帅哥
 *
 */
	//指定该注解的生命周期,此处指定为运行时
	@Retention(value=(RetentionPolicy.RUNTIME))
	//指定该注解可使用的位置,此处自定为类
	@Target(value=ElementType.TYPE)
public @interface MyAnnotation {
	
	//声明注解里面的内容
	String Info() default "这是我自定义的注解";
}

