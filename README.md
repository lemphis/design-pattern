# Design Patterns

- 디자인 원칙
    - application에서 달라지는 부분을 찾아내고, 달라지지 않는 부분으로부터 분리시킨다.

## 객체 생성 관련 Design Pattern

1. Singleton Pattern
   - instance를 오직 한 개만 제공하는 class
   - system runtime, environment setting에 대한 정보 등 instance가 여러 개일 때 문제가 생길 수 있는 경우가 있다.
   - instance를 오직 한 개만 만들어 제공하는 class가 필요하다.
2. Factory Method Pattern
    - 구체적으로 어떤 instance를 만들지는 sub class가 정한다.
    - 다양한 구현체(product)가 있고, 그 중에서 특정한 구현체를 만들 수 있는 다양한 factory(creator)를 제공할 수 있다.

## 구조 관련 Design Pattern

## 행동 관련 Design Pattern

1. Strategy Pattern
    - 알고리즘군을 정의하고 각각을 캡슐화하여 교환에서 사용할 수 있도록 만든다.
    - 이 패턴을 활용하면 알고리즘을 사용하는 클라이언트와는 독립적으로 알고리즘을 변경할 수 있다.

2. Observer Pattern
    - 한 객체의 상태가 바뀌면 그 객체에 의존하는 다른 객체들에게 연락이 가고 자동으로 내용이 갱신되는 방식이다.
    - 일대다(one-to-many, subject or publisher(1) : observer(N)) 의존성을 정의한다.
