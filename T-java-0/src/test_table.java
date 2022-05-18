public class test_table {
	public static void main(String[] args) {
		//1〜10までの数字のうち偶数のみを昇順で表示させる
		System.out.println("");
		System.out.println("問題１");
		for(int a  = 1; a <= 10; a++) {
			if(a % 2 == 0) {
				System.out.println("1～10、偶数は = " + a);
			}
		}
		
		System.out.println("");
		System.out.println("問題２");
		
		//1〜10までに偶数が何個あるか、また偶数の合計は幾つになるか表示させる
		int i = 0;
		int ii = 0;
		for(int b = 1; b <= 10; b++) {
			if(b % 2 == 0) {
				i++;
				ii = b + ii;
			}
		}
		System.out.println("偶数の個数は =" + i);
		System.out.println("偶数の合計は =" + ii);
		
		//1〜10までの整数をカンマ区切りで横並びで表示させる
		System.out.println("");
		System.out.println("問題２");
		
		System.out.print("1～10カンマ区切り(10以外) =");
		for(int c = 1; c <= 10; c++) {
			System.out.print(c);
			if(c <= 9) {
				System.out.print(",");
			}
		}
		System.out.println("");
		System.out.println("");
		System.out.println("問題４");
		//要素数20の配列を宣言し、要素に0から5ずつ加算して代入させる。[0]~[10]の値の
		//奇数のみカンマ区切りで、[11]~[19]の値は偶数をカンマ区切りで表示させる
//		
		int[] d = new int[20];
		int ddd = 0;
		for(int dd = 0; dd <= d.length; dd++) {
			ddd += 5;
			d[dd] = d[dd] + ddd;
			if(dd < 10) {
				System.out.println("配列番号:" + dd +"");
				if(d[dd] % 3 == 0 || d[dd] == 5) {
					System.out.println("値:" + d[dd] + ",");
				}else {
					System.out.println("値:" + d[dd]);
				}
			}else if(dd < 20){
				System.out.println("配列番号:" + dd +"");
				if(d[dd] % 2 == 0) {
					System.out.println("値:" + d[dd] + ",");
				}else {
					System.out.println("値:" + d[dd]);
				}
			}
			if(dd < 19) {
				System.out.println("↓");				
			}else{
				System.out.println("");
			}
		}
		
	}

}
