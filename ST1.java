package zuoye;
import java.util.Scanner;
public class ST1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input=new Scanner(System.in);
	System.out.print("请输入用户名：");
	String name=input.next();
	if(!name.equals("青")){
		System.out.println("对不起，你不是青");
	}else{
		System.out.println("欢迎你，青！");
	}
	}

}
