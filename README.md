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

2. Bridge Pattern
    - 추상적인 것과 구체적인 것을 분리하여 연결하는 pattern
    - 하나의 계층 구조일 때 보다 각기 나누었을 때 독립적인 계층 구조로 발전시킬 수 있다.
    - 추상적인 코드를 구체적인 코드 변경 없이도 독립적으로 확장할 수 있다. (OCP 원칙)
    - 추상적인 코드와 구체적인 코드를 분리할 수 있다.
    - 계층 구조가 늘어나 복잡도가 증가할 수 있다.

3. Composite Pattern
    - 그룹 전체와 개별 객체를 동일하게 처리할 수 있는 pattern
    - client 입장에서는 전체나 부분이나 모두 동일한 component로 인식할 수 있는 계층 구조를 만든다. (Part-Whole Hierarchy)
    - 복잡한 트리 구조를 편리하게 사용할 수 있다.
    - 다형성과 재귀를 활용할 수 있다.
    - client 코드를 변경하지 않고 새로운 element type을 추가할 수 있다. (OCP 원칙)
    - 트리를 만들어야 하기 때문에 (공통된 interface를 정의해야 하기 때문에) 지나치게 일반화해야 하는 경우도 생길 수 있다.

4. Decorator Pattern
    - 기존 코드를 수정하지 않 부가 기능을 추가하는 pattern
    - 상속이 아닌 위임을 사용하여 보다 유연하게(runtime) 부가 기능을 추가하는 것도 가능하다.
    - 새로운 class를 만들지 않고 기존 기능을 조합할 수 있다.
    - compile time이 아닌 runtime에 dynamic하게 기능을 변경할 수 있다.
    - decorator를 조합하는 코드가 복잡할 수 있다.

5. Facade Pattern
    - 복잡한 sub system 의존성을 최소화하는 pattern
    - sub system에 대한 의존성을 한 곳으로 모을 수 있다.
    - facade class가 sub system에 대한 모든 의존성을 가지게 된다.

6. Flyweight Pattern
    - 객체를 가볍게 만들어 메모리 사용을 줄이는 pattern
    - 자주 변하는 속성(또는 외적인 속성, extrinsic)과 변하지 않는 속성(또는 내적인 속성, intrinsic)을 분리하고 재사용하여 메모리 사용을 줄일 수 있다.
    - 코드의 복잡도가 증가한다.

7. Proxy Pattern
    - 특정 객체에 대한 접근을 제어하거나 기능을 추가할 수 있는 pattern
    - 초기화 지연, 접근 제어, 로깅, 캐싱 등 다양하게 응용하여 사용할 수 있다.
    - 기존 코드를 변경하지 않고 새로운 기능을 추가할 수 있다. (OCP 원칙, SRP 원칙)
    - 기존 코드가 해야 하는 일만 유지할 수 있다.
    - 코드의 복잡도가 증가한다.

## 행동 관련 Design Pattern

1. Chain-of-Responsibility Pattern
    - 요청을 보내는 쪽(request)과 요청을 처리하는 쪽(receiver)을 분리하는 pattern
    - handler chain을 사용하여 요청을 처리한다.
    - client 코드를 변경하지 않고 chain에 handler를 추가할 수 있다. (OCP 원칙)
    - handler마다 본인이 해야할 일만 가지고 있다. (SRP 원칙)
    - 코드의 흐름이 많아져 디버깅이 어려울 수 있다.

2. Command Pattern
    - 요청을 캡슐화하여 호출자(invoker)와 수신자(receiver)를 분리하는 pattern
    - 기존 코드를 변경하지 않고 새로운 command를 만들 수 있다. (OCP 원칙)
    - 요청을 처리하는 코드가 변경되어도 호출자의 코드는 변경되지 않는다.
    - command 객체를 로깅, 영속화, 네트워크 전송 등 다양한 방법으로 활용할 수 있다.
    - 코드가 복잡하고 클래스가 많아진다.

3. Interpreter pattern
    - 자주 등장하는 문제를 간단한 언어로 정의하고 재사용하는 pattern
    - 반복되는 문제 패턴을 언어 또는 문법으로 정의하고 확장할 수 있다.
    - 기존 코드를 변경하지 않고 새로운 expression을 추가할 수 있다. (OCP 원칙)
    - 복잡한 문법을 표현하려면 expression과 parser가 복잡해진다.

4. Strategy Pattern
    - 알고리즘군을 정의하고 각각을 캡슐화하여 교환에서 사용할 수 있도록 만든다.
    - 이 패턴을 활용하면 알고리즘을 사용하는 클라이언트와는 독립적으로 알고리즘을 변경할 수 있다.

5. Observer Pattern
    - 한 객체의 상태가 바뀌면 그 객체에 의존하는 다른 객체들에게 연락이 가고 자동으로 내용이 갱신되는 방식이다.
    - 일대다(one-to-many, subject or publisher(1) : observer(N)) 의존성을 정의한다.
