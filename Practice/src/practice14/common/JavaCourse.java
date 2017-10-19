package practice14.common;

public class JavaCourse implements Course{

	@Override
	public String getCourseName(){
		return PREFIX +"Java";
	}

	@Override
	public String[] getCourseUnit() {
		return  new String[] {"式と演算","制御構文","メソッド","配列"};
	}
 

@Override
public String assu() {
	System.out.print("できた");
	// TODO 自動生成されたメソッド・スタブ
	return "と思う";

	}
}
