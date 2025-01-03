package com.ict.day09;

public class Ex01 {
    /*
     	클래스
     	1. 정의 : 객체(Object, 오브젝트)를 만들어서 사용할 모든 정보와 기능에 대해 기술해 놓은 파일
     	         보통은 설계도, 거푸집, 틀, 이라고 한다.
     	         예) 붕어빵 틀 (클래스)   => 먹을 수 있는 붕어빵(객체, Object)
     	         데이터를 저장하는 측면에서 보면  모든 기본자료형과  참조자료형을 저장 할수 있다.
     	         변수 < 배열 < 클래스 < 컬렉션(자료구조)
     	         변수 < 배열 < 클래스 < 객체형 배열(참조자료형배열)
     	         
     	 2. 클래스가 가질 수 있는 3 가지 요소
     	  - 멤버필드 : 변수와 상수
     	  - 멤버메서드 : 동작, 기능, 하는 것 
     	  - 생성자 : 클래스를 객체로 생성할 때 한번 호출된다.
     	            멤버필드의 초기값 지정하는 것이 목적이다.
     	            물론, 메서드처럼 기능들을 추가할 수 도 있다.
     	            클래스이름 = 저장이름 = 생성자
     	            클래스이름과 같으면서 () 가 있으면 생성자 이다.
     	                
     	     예) Scanner  scan   =   new     Scanner(System.in)
     	        클래스    참조변수  =  객체생성   생성자  
     	        	 
     	  3. 클래스 구조 : 헤더, 멤버필드, 멤버메서드, 생성자
     	    1) 헤더 : [접근제한자][클래스종류] class 클래스이름
     	       가) 접근제한자 : 클래스, 멤버필드, 멤버메서드, 생성자에 모두 사용 가능(생략가능)
                             클래스를 객체로 만들었을 때 해당 객체를 외부에서 접근해서 사용할 수 있는 권한 
                 - public  : 누구나 다 접근 가능하다.
                             일반적으로 메서드는 public 을 사용한다. 
                 - private : 외부에서는 절대 접근 불가능, 내부(클래스안에 있는 멤버끼리는 접근 가능)     
                             객체 지향 언어의 특징 중 정보 은닉 개념에 해당 된다. 
                             VO, DTO에 사용되는 변수들은 private 을 사용한다.
                             private 된 변수는 public 된 메서드를 이용해서 접근하다. 
                 - 생략(default) : 같은 패키지에서만 접근 가능  
                 - protected : 같은 패키지에서만 접근 가능 , 
                               다른 패키지에서는 상속관계(부모/자식)에 있을 때 접근 가능
               나) 클래스종류 : 특정기능을 가진 클래스에게만 사용되는 예약어 작성
                           final, abstract  
                           일반클래스에서는 생략한다.
               다) class : 클래스임을 나타내는 예약어
               라) 클래스이름 : 클래스이름 = 저장파일이름 = 생성자이름   
                             첫글자 대문자 나머지 소문자로 만든다.
                             두 단어 이상일때 단어들의 첫글자는 대문자로 만든다. 
     		   마) 패키지 : 클래스들을 용도나 목적에 따라 그룹으로 만드는 것
     		              자바파일에 맨 위에 위치한다.   
     		      import : 자바에서 패키지가 java.lang 이외에 있는 클래스들을 
     		               현재 클래스에서 사용하기 위해서 사용할 클래스이 위치를 선언하는 것 
     		               (해당 클래스를 사용하기 위해서 참조할 수 있도록 하는 것 )    
           2) 멤버필드 : 데이터, 속성, 상태값, 특징
              가) 변수 : 언제든지 변할 수 있는 데이터(값), 메모리상태
              나) 상수 : 한번 지정하면 변경할 수 없는 데이터(값), 메모리상태
           3) 멤버메서드 : 동작, 기능, 하는 것
             - 자바에서의 메서드느 클래스안에서만 만들 수 있다.
             - ** 해당 메서드를 호출해야만 해당 메서드가 고유 기능을 실행 한다.
             - ** 고유기능을 실행 한 후에는 자신을 호출한 곳으로 되돌아간다.(return)
               예) JVM은 main()를 호출한다.
                   main()가 끝나면 JVM으로 되돌아 간다.(프로그램 종료)
             - 메서드는 다른 메서드를 호출할 수 있다.
             - 한 클래스안에서 같은이름 메서드를 여러개 만들 수 있다. -> 오버로딩(중복정의)
               (단, 인자의 수나 자료형이 달라야 한다.)
             가) 구성
               [접근제한자] [메서드종류] 반환형 메서드이름([인자 또는 매개변수]) { 실행 내용 }
               - 접근제한자 : 클래스의 접근제한자와 같다.
                           public, private, 생략(default), protected 
               - 메서드종류 : 일반 메서드는 메서드 종류 생략을 한다.
               - **반환형 : 메서드가 고유기능을 실행 한 뒤 자기를 호출한 곳으로 되돌아 갈때
                          데이터를 가지고 가는 경우와 데이터를 가지고 가지 않은 경우
                          데이터를 가지고 가는 경우의 데이터의 자료형을 말한다.
                          데이터를 가지고 가지 않은 경우에는 void 라는 예약어를 사용한다.
                예) main() 는 반환형이 void 이므로 고유기능이 끝난 후에 JVM 에게 되돌아 갈때 
                    데이터를 가지고 가지 않는다는 뜻이다.
                - 메서드이름 : 변수이름 만드는 방법과 같다.
                           첫글자 소문자 , 여러단어일경우 단어의 첫글자는 대문자를 사용                              
                - 오버로딩(중복정의) : 클래스 안에서 같은 이름의 메서드가 여러개 인것 
                                   (반드시 인자의 수, 자료형이 달라야 한다.)
                - 인자 또는 매개변수 : 외부에서 해당 메서드를 실행할 때 필요한 데이터를 받을 수 있는 통로
                                   메서드를 호출할때 이름과 인자의수나 자료형이 맞아야 메서드를 실행할 수 있음 
                                  매개변수 또는 인자는 지역변수와 같은 생명 주기를 가지고 있음
                                  (메서드가 실행 될때 생성되고 메서드가 끝나면 소멸된다.)
     	    4. 생성자 : 클래스를 객체 생성할 때 호출되는 특별한 메서드
     	              클래스이름 = 저장이름 = 생성자([인자...])
   	         	      [접근제한자] 생성자([인자]){ 내용 }
   	         	목적 : 멤버필드의 값들을 객체 생성할때 초기화 할 수 있다.
   	         	특징 : 일반 메서드와 다르점은 반환형 자체가 존재하지 않음이 없다.
   	         	      생성자는 초기화 뿐만 아니라 일반 메서드처럼 다른 기능을 설정할 수 있다.
   	         	      생성자가 메서드를 호출할 수 있다.
   	         	      생성자가 여러개 있을 수 있다.(생성자 오버로딩)
   	         	      생성자는 메서드를 호출할 수 있다.
   	         	      생성자가 없으면 자바컴파일러에서 자동으로 기본생성자를 이용해서 객체 생성을 한다.
   	         	      생성자가 있으면 있는 생성자를 이용해서 객체 생성을 할 수 있다.
   	         	      기본 생성자란 인자 또는 매개변수가 없는 생셩자를 말한다.
   	         	      기본 생성자 형식 : [접근제한자] 생성자(){ 내용 }   	
   	           
   	            클래스를 객체로 만든 방법
   	            클래스이름   참조변수   =  new  생성자([인자]);           	      
     	        Scanner    scan    =  new  Scanner(System.in);     
     	        
     	 5. static 과 instance : 멤버필드, 멤버메서드에 공통으로 해당 되는 사항
     	   1) instance(인스턴스) : 객체 생성
     	     - 인스턴스 필드(변수와 상수), 인스턴스 메서드 : 객체가 생성될때 같이 생성되는 멤버필드와 멤버메서드
     	     - 일반적인 멤버필드와 멤버메서드가 인스턴스 필드와 인스턴스 메서드에 속한다.
     	     - 사용법
     	        1. 객체 생성을 먼저하자. : 클래스이름 참조변수 = new 생성자([인자]);
     	                              Scanner scan = new Scanner(System.in);
     	                              scan.next();  
     	        2. 참조변수.변수이름 또는 참조변수.메서드이름([인자]);
     	     - 배열 처럼 heap 메모리에 생성된다.
     	    
     	   2) static(스테틱) : 객체 생성과 상관없이 미리 만들어짐
     	     - static 필드, static 메서드 : 객체 생성과 상관없이 미리 만들어진 필드와 메서드
     	     - static 필드, static 메서드 는  static 이라는 예약어를 사용해야 한다.
     	     - static 메모리에 생성된다.
     	     - 객체를 생성하지 않아도 언제든지 사용할 수 있음
     	     - 호출방법 : 클래스이름.변수이름,  클래스이름.메서드이름()
     	     - 예) System.out,  System.in,  Math.abs()
     	     - static 변수와 메서드는 보통은 공유으로 사용한다.
     	     
     	   6.메모리 영역 
     	     - stack : 지역변수, 매개변수(인자)가 할당되는 영역, 초기화가 진행되지 않음 
     	     - heap : 배열과 객체가 만들어지는 영역, 자동 초기화 진행 
     	              자기 할일 다면 살라진다.(동적할당=어느 순간에 없어진다.)
     	     - static : static 필드, static 메서드가 저장되는 영역 
     	               
     */
	
}








