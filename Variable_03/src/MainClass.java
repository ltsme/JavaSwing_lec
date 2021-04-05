
public class MainClass {
	public static void main(String[] args) {
		int i, j, k;
		i=1;
		j=1;
		k=3;
		
//		i = i + 1;
//		i = += 1;
		i++;
		System.out.println(i);
		
//		j = j + 1;
//		j = += 1;
		j++;
		System.out.println(j);
		
		// 동등 비교 관계 연산자
		System.out.println("i == j :" + (i == j));
		System.out.println("i != j :" + (i != j));
		System.out.println("i > j :" + (i > j));
		System.out.println("i >= j :" + (i >= j));
		
		// 논리 연산자
		System.out.println((i > j) && (j > k));
		System.out.println((i > j) || (j > k));
		
		// 삼항 연산자
		System.out.println(k==5 ? "k==5" : "k!=5");
		
		
		// Exercise : i가 홀수 인지 짝수 인지 출력하시오
		System.out.println((i%2)==0 ? "i는 짝수 입니다." : "i는 홀수 입니다.");
	}
}
