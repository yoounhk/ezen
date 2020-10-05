# 2020/09/28 오후 자바

## final 클래스와 final 메소드

### 상속할 수 없는 final 클래스

### 오버라이딩할 수 없는 final method

## protected 접근 제한자

다른 패키지에서는 자식 클래스만 접근을 허용한다.

같은 패키지에서는 default와 동일하다.

pulbic > protected > (default) > private

## 다형성

### 자동 형변환(promotion)

부모클래스 변수 = 자식클래스타입; 일때 일어난다.

```java
Cat = cat = new Cat();
Animal animal = new Animal();
```

부모 타입으로 자동 타입 변환된 이후에는 부모 클래스에 선언된 필드와 메소드만 접근이 가능하다. 비록 변수는 자식 객체를 참조하지만 변수로 접근 가능한 멤버는 부모 클래스 멤버로만 한정된다. 그러나 **예외가 있는데** 메소드가 자식 클래스에서 오버라이딩 되었다면 자식 클래스의 메소드가 대신 호출된다. 이것은 **다형성**과 관련이 있기 때문에 매우 중요한 성질이므로 잘 알아두어야 한다. 

### 다형성: 오버라이딩

### 다형성: 필드



# .gitignore 올리고 메세지는 "gitignore 수정"
