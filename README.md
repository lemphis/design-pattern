# Design Patterns

- 디자인 원칙
    - application에서 달라지는 부분을 찾아내고, 달라지지 않는 부분으로부터 분리시킨다.

## 객체 생성 관련 Design Pattern

1. [Singleton Pattern](singleton)
    - instance를 오직 한 개만 제공하는 class
    - system runtime, environment setting에 대한 정보 등 instance가 여러 개일 때 문제가 생길 수 있는 경우가 있다.
    - instance를 오직 한 개만 만들어 제공하는 class가 필요하다.

2. [Factory Method Pattern](factorymethod)
    - 구체적으로 어떤 instance를 만들지는 sub class가 정한다.
    - 다양한 구현체(product)가 있고, 그 중에서 특정한 구현체를 만들 수 있는 다양한 factory(creator)를 제공할 수 있다.
    - factory를 구현하는 방법(inheritance)에 초점을 둠
    - 구체적인 객체 생성 과정을 하위 또는 구체적인 class로 옮기는 것이 목적

3. [Abstract Factory Pattern](abstractfactory)
    - 서로 관련있는 여러 객체를 만들어주는 interface
    - 구처젝으로 어떤 class의 instance를(concrete product) 사용하는지 감출 수 있다.
    - factory를 사용하는 방법(composition)에 초점을 둠
    - 관련 있는 여러 객체를 구체적인 class에 의존하지 않고 만들 수 있게 해주는 것이 목적

4. [Builder Pattern](builder)
    - 동일한 프로세스를 거쳐 다양한 구성의 instance를 만드는 방법
    - (복잡한) 객체를 만드는 process를 독립적으로 분리할 수 있다.

5. [Prototype Pattern](prototype)
    - 기존 instance를 복제하여 새로운 instance를 만드는 방법
    - 복제 기능을 갖추고 있는 기존 instance를 prototype으로 사용해 새 instance를 만들 수 있다.
    - 복잡한 객체를 만드는 과정을 숨길 수 있다.
    - 기존 객체를 복제하는 과정이 새 인스턴스를 만드는 것보다 비용(시간 또는 메모리)적인 면에서 효율적일 수 있다.
    - 추상적인 타입을 return 할 수 있다.
    - 복잡한 객체를 만드는 과정 자체가 복잡할 수 있다. (특히, 순환 참조가 있는 경우)

## 구조 관련 Design Pattern

1. [Adapter Pattern](adapter)
    - 기존 코드를 클라이언트가 사용하는 interface의 구현체로 바뀌주는 pattern
    - 기존 코드를 변경하지 않고 원하는 interface 구현체를 만들어 재사용할 수 있다. (OCP 원칙)
    - 기존 코드가 하던 일과 특정 interface 구현체로 변환하는 작업을 각기 다른 class로 분리하여 관리할 수 있다. (SRP 원칙)
    - 새 class가 생겨 복잡도가 증가할 수 있다. 경우에 따라서는 기존 코드가 해당 interface를 구현하도록 수정하는 것이 좋은 선택이 될 수도 있다.

2. [Bridge Pattern](bridge)
    - 추상적인 것과 구체적인 것을 분리하여 연결하는 pattern
    - 하나의 계층 구조일 때 보다 각기 나누었을 때 독립적인 계층 구조로 발전시킬 수 있다.
    - 추상적인 코드를 구체적인 코드 변경 없이도 독립적으로 확장할 수 있다. (OCP 원칙)
    - 추상적인 코드와 구체적인 코드를 분리할 수 있다.
    - 계층 구조가 늘어나 복잡도가 증가할 수 있다.

3. [Composite Pattern](composite)
    - 그룹 전체와 개별 객체를 동일하게 처리할 수 있는 pattern
    - client 입장에서는 전체나 부분이나 모두 동일한 component로 인식할 수 있는 계층 구조를 만든다. (Part-Whole Hierarchy)
    - 복잡한 트리 구조를 편리하게 사용할 수 있다.
    - 다형성과 재귀를 활용할 수 있다.
    - client 코드를 변경하지 않고 새로운 element type을 추가할 수 있다. (OCP 원칙)
    - 트리를 만들어야 하기 때문에 (공통된 interface를 정의해야 하기 때문에) 지나치게 일반화해야 하는 경우도 생길 수 있다.

4. [Decorator Pattern](decorator)
    - 기존 코드를 수정하지 않 부가 기능을 추가하는 pattern
    - 상속이 아닌 위임을 사용하여 보다 유연하게(runtime) 부가 기능을 추가하는 것도 가능하다.
    - 새로운 class를 만들지 않고 기존 기능을 조합할 수 있다.
    - compile time이 아닌 runtime에 dynamic하게 기능을 변경할 수 있다.
    - decorator를 조합하는 코드가 복잡할 수 있다.

5. [Facade Pattern](facade)
    - 복잡한 sub system 의존성을 최소화하는 pattern
    - sub system에 대한 의존성을 한 곳으로 모을 수 있다.
    - facade class가 sub system에 대한 모든 의존성을 가지게 된다.

6. [Flyweight Pattern](flyweight)
    - 객체를 가볍게 만들어 메모리 사용을 줄이는 pattern
    - 자주 변하는 속성(또는 외적인 속성, extrinsic)과 변하지 않는 속성(또는 내적인 속성, intrinsic)을 분리하고 재사용하여 메모리 사용을 줄일 수 있다.
    - 코드의 복잡도가 증가한다.

7. [Proxy Pattern](proxy)
    - 특정 객체에 대한 접근을 제어하거나 기능을 추가할 수 있는 pattern
    - 초기화 지연, 접근 제어, 로깅, 캐싱 등 다양하게 응용하여 사용할 수 있다.
    - 기존 코드를 변경하지 않고 새로운 기능을 추가할 수 있다. (OCP 원칙, SRP 원칙)
    - 기존 코드가 해야 하는 일만 유지할 수 있다.
    - 코드의 복잡도가 증가한다.

## 행동 관련 Design Pattern

1. [Chain-of-Responsibility Pattern](chainofresponsibility)
    - 요청을 보내는 쪽(request)과 요청을 처리하는 쪽(receiver)을 분리하는 pattern
    - handler chain을 사용하여 요청을 처리한다.
    - client 코드를 변경하지 않고 chain에 handler를 추가할 수 있다. (OCP 원칙)
    - handler마다 본인이 해야할 일만 가지고 있다. (SRP 원칙)
    - 코드의 흐름이 많아져 디버깅이 어려울 수 있다.

2. [Command Pattern](command)
    - 요청을 캡슐화하여 호출자(invoker)와 수신자(receiver)를 분리하는 pattern
    - 기존 코드를 변경하지 않고 새로운 command를 만들 수 있다. (OCP 원칙)
    - 요청을 처리하는 코드가 변경되어도 호출자의 코드는 변경되지 않는다.
    - command 객체를 로깅, 영속화, 네트워크 전송 등 다양한 방법으로 활용할 수 있다.
    - 코드가 복잡하고 클래스가 많아진다.

3. [Interpreter pattern](interpreter)
    - 자주 등장하는 문제를 간단한 언어로 정의하고 재사용하는 pattern
    - 반복되는 문제 패턴을 언어 또는 문법으로 정의하고 확장할 수 있다.
    - 기존 코드를 변경하지 않고 새로운 expression을 추가할 수 있다. (OCP 원칙)
    - 복잡한 문법을 표현하려면 expression과 parser가 복잡해진다.

4. [Iterator Pattern](iterator)
    - 집합 객체 내부 구조를 노출시키지 않고 순회하는 방법을 제공하는 pattern
    - 집합 객체를 순회하는 client 코드를 변경하지 않고 다양한 순회 방법을 제공할 수 있다.
    - 집합 객체가 가지고 있는 객체들에 손쉽게 접근할 수 있다.
    - 일관된 interface를 사용해 여러 형태의 집합 구조를 순회할 수 있다.
    - class가 늘어나고 복잡도가 증가한다.

5. [Mediator Pattern](mediator)
    - 여러 객체들이 소통하는 방법을 캡슐화하는 pattern
    - 여러 component 간의 결합도를 mediator를 통해 낮출 수 있다.
    - component 코드를 변경하지 않고 새로운 mediator를 만들어 사용할 수 있다.
    - 각각의 component 코드를 보다 간결하게 유지할 수 있다.
    - mediator 역할을 하는 class의 복잡도와 결합도가 증가한다.

6. [Memento Pattern](memento)
    - 캡슐화를 유지하면서 객체 내부 상태를 외부에 저장하는 pattern
    - 객체 상태를 외부에 저장했다가 해당 상태로 다시 복구할 수 있다.
    - originator가 변경되어도 client 코드는 변경되지 않는다.
    - memento 객체가 많은 정보를 저장해야 하거나 자주 생성해야 한다면 메모리 사용량애 영향을 줄 수 있다.

7. [Observer Pattern](observer)
    - 다수의 객체가 특정 객체 상태 변화를 감지하고 알림을 받는 pattern
    - 한 객체의 상태가 바뀌면 그 객체에 의존하는 다른 객체들에게 연락이 가고 자동으로 내용이 갱신되는 방식이다.
    - 일대다(one-to-many, subject or publisher(1) : observer(N)) 의존성을 정의한다.
    - 상태를 변경하는 객체(publisher)와 변경을 감지하는 객체(subscriber)의 관계를 느슨하게 유지할 수 있다.
    - subject의 상태 변경을 주기적으로 조회하지 않고 자동으로 감지할 수 있다.
    - runtime에 observer를 추가하거나 제거할 수 있다.
    - 복잡도가 증가한다.
    - 다수의 observer 객체를 등록 후 해제하지 않는다면 memory leak이 발생할 수 있다.

8. [State Pattern](state)
    - 객체 내부 상태 변경에 따라 객체의 행동이 달라지는 pattern
    - 상태에 특화된 행동들을 분리해 낼 수 있으며, 새로운 행동을 추가하더라도 다른 행동에 영향을 주지 않는다.
    - 코드 복잡도를 줄일 수 있다.

9. [Strategy Pattern](strategy)
    - 여러 알고리듬을 캡슐화하고 상호 교환 가능하게 만드는 pattern
    - 알고리듬을 정의하고 각각을 캡슐화하여 교환에서 사용할 수 있도록 만든다.
    - 이 패턴을 활용하면 알고리즘을 사용하는 클라이언트와는 독립적으로 알고리즘을 변경할 수 있다.
    - context에서 사용할 알고리듬을 client에서 선택한다.
    - 새로운 strategy를 추가하더라도 기존 코드는 변경되지 않는다. (OCP 원칙)
    - 상속 대신 위임을 사용할 수 있다.
    - runtime에 strategy를 변경할 수 있다.
    - client가 구체적인 strategy를 알아야 한다.

10. [Template Method Pattern](templatemethod/templatemethod)
    - 알고리듬 구조를 sub class가 확장할 수 있도록 template으로 제공하는 pattern
    - abstract class는 template를 제공하고 sub class는 구체적인 알고리듬을 제공한다.
    - template code를 재사용하고 중복 코드를 줄일 수 있다.
    - template code를 변경하지 않고 상속을 받아서 구체적인 알고리듬만 변경할 수 있다.
    - 리스코프 치환 원칙(LSP)을 위반할 수도 있다. (template method를 제외한 method는 final keyword를 사용하여 막을 수 있음)
    > [Template Callback Pattern](templatemethod/templatecallback) (GoF가 정의한 pattern은 아님)
    >
    >  - callback으로 상속 대신 위임을 사용하는 template pattern
    >  - 상속 대신 익명 내부 클래스 또는 람다 표현식을 활용할 수 있다.

11. [Visitor Pattern](visitor)
    - 기존 코드를 변경하지 않고 새로운 기능을 추가하는 pattern
    - double dispatch를 활용할 수 있다.
    - element에 변경 사항이 생기면 element interface와 구현체들을 전부 수정해야 한다.