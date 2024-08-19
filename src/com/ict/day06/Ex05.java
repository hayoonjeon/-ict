package com.ict.day06;

import java.util.Arrays;

public class Ex05 {
	public static void main(String[] args) {
		// String 클래스 : 문자열을 처리하기 위한 클래스
		String str = "신수동 한국 ICT 인재 개발원 5강의실";
		
		// 멤버 메서드() : 자바에서 클래스안에 존재하며 기능을 담당
		// 메서드이름([인자=매개변수...] : 반환형
		// 반환형이란 메서드가 기능을 실행하고 자기를 호출한 곳으로 되돌아 갈때 가지고 가는 데이터의 자료형을 말한다.
		// void는 되돌아 갈때 데이터을 가지고 가지 않아 자료형이 없다는 뜻이다.
		// main메서드은 void이다. 이 말은 main메서드를 호출하는 JVM에게 되돌아 갈때 아무것도 가지고 가지 않는다는 뜻이다.
		// 인자 또는 매개 변수 는 해당 메서드가 외부에서 데이터를 받을 수 있도록 사용되는 변수(변수, 배열, 클래스(객체))
		
		// 1. charAt(int index) : char
		//    위치값(index = 0부터시작)을 받아서 해당 문자열(String)의 위치에 있는 문자(char)를 반환한다.
		char c1 = str.charAt(12);
		System.out.println(c1);
		System.out.println();
		
		
		str = "한국 I Love You 1004";
		// 2.  length(): int 
		//     해당 문자열의 길이를 구한다.
		
		// charAt()이용해서 str 문자열에 한글자씩 접근해서 소문자를 대문자로 변환 시키자 (소문자 - 32 = 대문자)
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch>='a' && ch<='z') {
				ch = (char)(ch-32) ;
			}
			System.out.print(ch);
		}
		System.out.println();
		
		str = "010-9797-7979";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(i>=4 && i <= 7) {
				System.out.print("*");
			}else {
				System.out.print(ch);
			}
		}
		System.out.println();
		
		// 3. concat(String str) : String
		// 현재 문자열과 입력된 문자열을 합치는 메서드 ("문자열" + "문자열" 와 같은 역할)
		String s1 = "대한민국";
		String s2 = s1 + " 파이팅";
		System.out.println(s2);
		
		String s3 = s1.concat(" KOREA");
		System.out.println(s3);
		
		// 4. contains(CharSequence s) : boolean
		// CharSequence는 지금 String 이라고 생각하자 
		// CharSequence 문자 시퀀스를 나타내는 인터페이스 (String, StringBufffer, StringBuilder를 자유롭게 사용할 수 있다.)
		// 해당 문자열에 입력된 String이 있으면 true, 없으면 false ;
		
		String s4 = "nojm73@naver.com";
		boolean result = s4.contains("@");
		System.out.print("결과 : " + result);
		
		// 5. equals(Object anObject) : boolean
		//    현재 문자열과 입력된 객체의 내용이 같으면 true, 아니면 false(대,소문자 구별함)
		//    객체(String)에서 == 는 내용이 같냐가 아니라 주소가 같냐 의 의미미다.
		//    그러나 기본자료형에서 == 는 데이터(값)가 같냐 라는 의미
		
		// 6. equalsIgnoreCase(String anotherString)
		//    현재 문자열과 입력된 문자열의 내용이 같으면 true, 아니면 false(대,소문자 구별 하지 않음)
		System.out.println();
		String s5 = "Korea";
		String s6 = "KOREA";
		
		System.out.println();
		if(s5.equals(s6)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다.");
		}
		
		System.out.println();
		if(s5.equalsIgnoreCase(s6)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다.");
		}
		System.out.println();
		
		// 7. getBytes[] : byte[]
		// 해당 문자열을 byte[]로 반환한다. => 입출력스트림에 사용 
		// byte 는 대소문자, 숫자, 일부 특수문자를 숫자로 표현할 수 있다.
		// 영어를 제외한 나머지 글자들은 제대로 안나옴 => toCharArray()가 해결한다.
		String s7 = "abc 뉴스 channel 24 들어와";
		byte[] b1 = s7.getBytes();
		for (int i = 0; i < b1.length; i++) {
			System.out.println(b1[i] + " : " + (char)(b1[i]));
		}
		
		// 8. toCharArray() : char[]
		// 해당 문자열을 char[]로 변환한다.
		char[] ch2 = s7.toCharArray();
		for (int i = 0; i < ch2.length; i++) {
			System.out.println( ch2[i] + ":" + (int)(ch2[i]) );
		}
		
		// 9. indexOf(int ch), indexOf(String str) : int(위치값=index)
		//    입력된 문자 또는 문자열의 첫번째 위치값을 알려준다.
		//    문자 나 문자열이 없으면  -1 반환한다.
		String s8 = "BufferedReader";
		int n1 = s8.indexOf('e');
		System.out.println("첫번째 e의 위치값 : " + n1);
		
		int n2 = s8.indexOf("er");
		System.out.println("첫번째 er의 위치값 : " + n2);
		
		// 10. indexOf(int ch, int fromIndex), 
		//indexOf(String str, int fromIndex) : int(위치값=index)
		//    fromIndex => 시작위치
		//    fromIndex를 이용하면 2번째, 3번째 도 찾을 수 있음
		
		// 2번째 e를 찾자 (첫번째 e의 위치를 지나 찾아야 한다.) 
		int n3 = s8.indexOf('e', s8.indexOf('e')+1);
		System.out.println("두번째 e의 위치값 : " + n3);
		
		// 3번째 e를 찾자 (두번째 e의 위치를 지나 찾아야 한다.) 
		int n4 = s8.indexOf('e', s8.indexOf('e', s8.indexOf('e')+1)+1);
		System.out.println("세번째 e의 위치값 : " + n4);
		
		// 11. lastIndexOf(int ch), lastIndexOf(String str) : int
		// 마지막 문자나 문자열의 위치를 찾아 준다.
		int n5 = s8.lastIndexOf("e");
		System.out.println("마지막 e의 위치값 : " + n5);
		
		// 12. length() : int
		// 해당 문자열의 길이를 구한다.(1부터 시작)
		String s9 = "  Hello  ";
		System.out.println("길이 : " + s9.length());
		
		// 12. replace(char oldChar, char newChar) : String
		//     replace(CharSequence target, CharSequence replacement) : String
		//     의미상으로는  replace(String oldString, String newString) : String
		//     새로운 문자나 문자열을 받아서 모두 치환(바꾸기)한다.
		String s10 = "대한민국";
		String s11 = s10.replace("민", " ♥ 민");
		System.out.println(s11);
		
		String s12 = "010-7979-9797";
		String s13 = s12.replace("-", "");
		System.out.println(s13);
		
		// 13. split(String regex) : String[]
		//     split(String regex, int limit) : String[] 
		// regex 는 정규 표현식을 의미한다.  limit : 배열의 수를 지정
		// 특정 패턴을 나타내는 문자열로 검색, 매칭, 분리, 대체등의 작업을 할때 사용
		// 여기서는 구분자로 사용하자 
		// 입력된 문자열을 기준으로 문자열을 분리한다.
		String[] s14 = s12.split("-");
		System.out.println("s14[0] : " + s14[0]) ;
		System.out.println("s14[1] : " + s14[1]) ;
		System.out.println("s14[2] : " + s14[2]) ;
		System.out.println();
		
		String[] s15 = s12.split("-",2);
		System.out.println("s15[0] : " + s15[0]) ;
		System.out.println("s15[1] : " + s15[1]) ;
		System.out.println();
		
		// 배열의 크기를 6으로 설정 했지만 3이 나옴 , 최대 배열의 크기가 3이므로 더 이상 나눌수 없다.
		String[] s16 = s12.split("-", 6);
		System.out.println( "s16의 길이 : " + s16.length) ;
		
		// 14. substring(int beginIndex) : String
		//     시작위치 부터 끝까지 문자열 추출
		
		//     substring(int beginIndex, ine endIndex) : String
		//     시작위치부터 끝위치(포함하지 않음)까지 문자열 추출
		//     끝위치 - 시직위치 = 추출할 문자열의 수
		
		String s17 = "010-7979-9797";
		String s18 = s17.substring(4);
		System.out.println(s18);
		System.out.println();
		
		String s19 = s17.substring(4,8);
		System.out.println(s19);
		System.out.println();
		
		String s20 = "****";
		System.out.println(s17.replace(s17.substring(9), s20));
		System.out.println(s17.replace(s17.substring(s17.lastIndexOf("-")+1), s20));
		System.out.println(s17.replace(s17.substring(4,8), s20));
		
		// 실제는 성과 이름을 별도로 받는 것이 좋다  
		String s21 = "손흥민";  // 손*민
		String s22 = s21.substring(0, 1) + "*" + s21.substring(s21.length()-1);
		System.out.println(s22);
		System.out.println();
		
		// 15. toLowerCase() : String
		//    대문자를 소문자로 변경
		// 16. toUpperCase() : String 
		//    소문자를 대문자로 변경 
		String s23 = "한국 I Love You 1004";
		String s24 = s23.toLowerCase();
		String s25 = s23.toUpperCase();
		System.out.println(s24);
		System.out.println(s25);
		
		// 17. toString : String
		// 모든 클래스는 toString 존재
		// 클래스가 가지고 있는 정보나 데이터들을 문자열로 만들어서 반환하는 메서드 
		// String 클래스의 toString()메서드는 해당 문자열 자체가 된다.
		
		String s26 = "Java 17, 자바 17" ;
		String s27 = s26.toString();
		// String은 객체 지만 주소를 제공하지 않고 해당 문자열을 제공 
		System.out.println(s26);
		System.out.println(s27);
		System.out.println();
		
		int[] s28 = {1,2,3,4,5,6,7};
		String s29 = Arrays.toString(s28);
		// 객체들을 호출화면 주소가 나온다.
		System.out.println(s28);
		System.out.println(s29);
		
		// 18. trim() : String
		//  해당 문자열의 앞,뒤 공백 제거 
		String s30 = " java 자바 ";
		String s31 = s30.trim();
		System.out.println("길이 : " + s30.length());
		System.out.println("길이 : " + s31.length());
		System.out.println();
		
		// 19. startsWith(String prefix) : boolean
		//     입력된 문자열로 시작하면 true
		// 20. endsWith(String suffix) : boolean
		//     입력된 문자열로 끝나면 true
		
		boolean bo1 = s30.startsWith(" ");
		System.out.println("결과 : " + bo1);
		
		boolean bo2 = s31.startsWith("j");
		System.out.println("결과 : " + bo2);
		
		// 21. valueOf(각종 기본자료형) : String
		//     기본자료형을 받아서 String으로 변경 시킴 ( 기본자료형 + "")
		boolean boo = true;
		char cha = 'c';
		int num1 = 34 ;
		long num2 = 214L;
		float num3 = 124.87F ;
		double num4 = 21.412 ;
		
		// System.out.println(boo+1);
		System.out.println(cha+1);
		System.out.println(num1+1);
		System.out.println(num2+1);
		System.out.println(num3+1);
		System.out.println(num4+1);
		System.out.println();
		
		// + 1 를 한 이유는 String으로 변경되면 실제 덧셈이 아니라 그냥 문자끼리 연결된다.
		System.out.println(String.valueOf(boo)+1);
		System.out.println(String.valueOf(cha)+1);
		System.out.println(String.valueOf(num1)+1);
		System.out.println(String.valueOf(num2)+1);
		System.out.println(String.valueOf(num3)+1);
		System.out.println(String.valueOf(num4)+1);
		System.out.println();
		
		System.out.println(cha+"1");
		System.out.println(num1+"1");
		System.out.println(num2+"1");
		System.out.println(num3+"1");
		System.out.println(num4+"1");
		System.out.println();
		
		// 22. Wrapper 클래스
		//     기본자료형을 객체로 만들 때 사용하는 클래스
		//     **기본자료형의 형태를 가진 문자열을 기본자료형으로 변경시킬 수 있다.
		
		// 22-1. Boolean 클래스 : "true" 나 "false"를  true, false로 만들어줌
		//       Boolean.parseBoolean(문자열) => true, false 만들어줌
		//       단)  "true"가 아닌 다른 문자열을 인자로 사용하면 결과는 false로 만든다.
		String str1 = "가나다";
		boolean res1 =  Boolean.parseBoolean(str1);
		System.out.println("str1 이 " + res1 +" 입니다.");
		
		// 22-2. Integer 클래스 : 정수형태의 문자열을 기본자료형인 int 형으로 변형 시키는 클래스
		String str2 = "20";
		int res2 = Integer.parseInt(str2);
		System.out.println(str2 + 10);    // "2010"
		System.out.println(res2 + 10);    // 30
		
		// 22-3. Long 클래스 : 정수형태의 문자열(L을 넣으면 안됨)을 기본자료형인 long 형으로 변형 시키는 클래스
		long lo = 150L ;
		String str3 = String.valueOf(lo);  // 150(L이 없어진다.)
		long res3 = Long.parseLong(str3);
		System.out.println(str3 + 10);    // "15010"
		System.out.println(res3 + 10);    // 160
		
		// 22-4. Float 클래스 : 실수형태의 문자열(F를 넣으며 안됨)을 기본자료형인 float 형으로 변경 시키는 클래스
		float ft = 123.45f ;
		String str4 = String.valueOf(ft);     // 123.45(F는 없어진다.)
		float res4 = Float.parseFloat(str4);  // 123.45
		
		System.out.println(str4 + 10);    // "123.4510"
		System.out.println(res4 + 10);    // 133.45
		
		// 22-5. Double 클래스 : 실수형태의 문자열을 기본자료형인 double 형으로 변경 시키는 클래스
		double num = 147.123 ;
		String str5 = String.valueOf(num);       // "147.123"
		double res5 = Double.parseDouble(str5);  // 147.123
		
		System.out.println(str5 + 10);    // "147.12310"
		System.out.println(res5 + 10);    // 157.123
		
		// 22-6. Character 클래스 : Character.parseCharacter() 메서드가 존재하지 않음 
		//                         대신에 String 클래스의 charAt(0)를 사용하면 char 형으로 만들수 있다.
		char cha2 = 'g';
		String str6 = String.valueOf(cha2);  // "g"
		char res6 =   str6.charAt(0);        // 'g'
		
		System.out.println(str6 + 1);          // "g1"
		System.out.println((char)(res6 + 1));   // h
		
	}
}










