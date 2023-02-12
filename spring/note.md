
## @AutoWired 인젝션 방법 3가지

1. 필드 위에 붙이기 
= 기본생성자를 호출한 후 인젝션 진행됨 == 꼭 기본생성자가 있어야 함 

2. 기본 생성자 위에 붙이기 

3. 오버로딩 생성자 위에 붙이기 




## @Component 객체 생성    


<context:component-scan base-package="xxx"/>   

xxx 패키지 내의 클래스들을 스캔해조 거기서 컴포넌트 찾아와조    
찾고 객체로 만들어조 ! 

만든 객체에 id 부여하기 = @Component("id")   



1. @Controller
2. @Service
3. @Repository(DAO)



## @Value   

기본 값 설정   



## @Configuration   

어플리케이션에 관한 설정 클래스   



