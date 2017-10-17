package practice10;
/*
 * PTra10_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_04 {

	/*
	 * PTra10_01で作成したUserクラスを使用します
	 */

	public static void main(String[] args) {

		// ★ User型の変数が3つ入る配列usersを宣言・確保してください
		User[] users;
		users=new User[3];

		for(int i=0; i<3; i++)
		 users[i]=new User();
		
		// ★ java.util.Scannerクラスをインスタンス化し、変数scannerに代入してください
		java.util.Scanner scanner=new java.util.Scanner(System.in);
 int count=0;
 
		// ★ usersのサイズ分繰り返す制御構文を記述してください
		//----------- ループ start
		for(int k=0; k<3; k++){
			System.out.println(1+k +"人目の情報を入力します");		/* ##には、カウントを入れてください */
			System.out.println("ユーザID（数字）、 ユーザ名、メールアドレス、パスワードをカンマ区切りで入力してください");
			// ★ コマンドプロンプトに入力された値を、String型の変数lineに格納してください
			String line = scanner.nextLine();

			// ★ 変数lineに格納されている値を','で区切り、配列にしてください（Stringクラスのメソッドを使用します）
			String[] info=line.split(",",0);

			// ★ 配列にした値を、users[カウント]の各フィールドに代入してください
			// ★ ユーザIDに該当する値が数値でなかった場合は、エラーでプログラムが止まっても良いです
		    users[k].userId  =Integer.parseInt(info[0]);
			users[k].userNm  =info[1];
			users[k].mail    =info[2];
			users[k].password=info[3];
		
		 }  
		//----------- ループ end

		// ★ usersに格納されている全てのインスタンスの、フィールドuserId, userNm, mail, passwordを出力してください
		for(int j=0; j<3; j++) {
			System.out.println(1+j +"人目の情報");
			
			System.out.println(users[j].userId);
		System.out.println(users[j].userNm);
		System.out.println(users[j].mail);
		System.out.println(users[j].password);
		System.out.println();
		}
	}
}
