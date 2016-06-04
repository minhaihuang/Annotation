package minhaihuang.Annotation.Test01;
/**
 * 理解注解的工作原理，测试几个常用的注解
 * @author 黄帅哥
 *
 */
public class Demo01 {

	public static void main(String[] args) {
		
		@SuppressWarnings(value="unused")//表明为压制值不被引用的警告
		String s="asrf";
		
		Child ch=new Child();
		ch.show2();
	}
}

class Parent{
	public void show(){};
}

@Deprecated //表明不被推荐使用的类
class Child extends Parent{
	
	@Override	//@override表明覆盖了父类的方法，若私用该注解的方法没有重写父类的方法，将会报错
	@Deprecated //不被推荐使用的方法
	public void show(){
		System.out.println("哈哈哈");
	}
	
	@Deprecated //使用该注解表明不推荐使用的方法，若用在类的前面，则表明不被推荐使用的类
	public void show2(){
		System.out.println("hhhhh");
	}
}