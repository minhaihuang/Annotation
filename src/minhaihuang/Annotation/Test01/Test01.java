package minhaihuang.Annotation.Test01;
/**
 * 测试自定义的注解
 * @author 黄帅哥
 *
 */
@MyAnnotation(Info="hahaha")//若此处不指定内容，将会获取注解里面的默认内容
public class Test01 {

	public static void main(String[] args) {
		
	//利用反射获取自定义注解的内容
	MyAnnotation myNo=Test01.class.getAnnotation(MyAnnotation.class);
	String s=myNo.Info();
	System.out.println(s);
	
	}
	
	//@MyAnnotation 若用在此处将会报错，提示不能用在此处，只能用在类上
	public void show(){
		
	}
}
