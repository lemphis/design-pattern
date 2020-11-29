# Design Patterns
- 디자인 원칙
  - Application에서 달라지는 부분을 찾아내고, 달라지지 않는 부분으로부터 분리시킨다.

## Strategy Pattern
- 알고리즘군을 정의하고 각각을 캡슐화하여 교환에서 사용할 수 있도록 만든다.
- 이 패턴을 활용하면 알고리즘을 사용하는 클라이언트와는 독립적으로 알고리즘을 변경할 수 있다.

## Observer Pattern
- 한 객체의 상태가 바뀌면 그 객체에 의존하는 다른 객체들에게 연락이 가고 자동으로 내용이 갱신되는 방식이다.
- 일대다(one-to-many, Subject or Publisher(1) : Observer(N)) 의존성을 정의한다.