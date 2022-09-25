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
    - factory를 구현하는 방법(inheritance)에 초점을 둠
    - 구체적인 객체 생성 과정을 하위 또는 구체적인 class로 옮기는 것이 목적

3. Abstract Factory Pattern
    - 서로 관련있는 여러 객체를 만들어주는 interface
    - 구처젝으로 어떤 class의 instance를(concrete product) 사용하는지 감출 수 있다.
    - factory를 사용하는 방법(composition)에 초점을 둠
    - 관련 있는 여러 객체를 구체적인 class에 의존하지 않고 만들 수 있게 해주는 것이 목적

4. Builder Pattern
    - 동일한 프로세스를 거쳐 다양한 구성의 instance를 만드는 방법
    - (복잡한) 객체를 만드는 process를 독립적으로 분리할 수 있다.

5. Prototype Pattern
    - 기존 instance를 복제하여 새로운 instance를 만드는 방법
    - 복제 기능을 갖추고 있는 기존 instance를 prototype으로 사용해 새 instance를 만들 수 있다.
    - 복잡한 객체를 만드는 과정을 숨길 수 있다.
    - 기존 객체를 복제하는 과정이 새 인스턴스를 만드는 것보다 비용(시간 또는 메모리)적인 면에서 효율적일 수 있다.
    - 추상적인 타입을 return 할 수 있다.
    - 복잡한 객체를 만드는 과정 자체가 복잡할 수 있다. (특히, 순환 참조가 있는 경우)

## 구조 관련 Design Pattern

1. Adapter Pattern
    - 기존 코드를 클라이언트가 사용하는 interface의 구현체로 바뀌주는 pattern
    - 기존 코드를 변경하지 않고 원하는 interface 구현체를 만들어 재사용할 수 있다. (OCP 원칙)
    - 기존 코드가 하던 일과 특정 interface 구현체로 변환하는 작업을 각기 다른 class로 분리하여 관리할 수 있다. (SRP 원칙)
    - 새 class가 생겨 복잡도가 증가할 수 있다. 경우에 따라서는 기존 코드가 해당 interface를 구현하도록 수정하는 것이 좋은 선택이 될 수도 있다.

## 행동 관련 Design Pattern

1. Strategy Pattern
    - 알고리즘군을 정의하고 각각을 캡슐화하여 교환에서 사용할 수 있도록 만든다.
    - 이 패턴을 활용하면 알고리즘을 사용하는 클라이언트와는 독립적으로 알고리즘을 변경할 수 있다.

2. Observer Pattern
    - 한 객체의 상태가 바뀌면 그 객체에 의존하는 다른 객체들에게 연락이 가고 자동으로 내용이 갱신되는 방식이다.
    - 일대다(one-to-many, subject or publisher(1) : observer(N)) 의존성을 정의한다.
