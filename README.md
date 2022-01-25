# spring-order-system
주문 시스템 프로그램이다.

### 버전
java 1.0.11
<br>

### 비즈니스 요구 사항
- 회원
  - [X] 회원을 가입하고 조회할 수 있다.
  - [X] 회원은 일반과 VIP 두 가지 등급이 있다.
  - [ ] 회원 데이터는 자체 DB를 구축할 수 있고, 외부 시스템과 연동할 수 있다. (미확정)
    - [X] 우선 메모리 저장소로 저장한다.
- 주문과 할인 정책
  - [X] 회원은 상품을 주문할 수 있다.
  - [X] 회원 등급에 따라 할인 정책을 적용할 수 있다.
  - [X] 할인 정책은 모든 VIP는 1000원을 할인해주는 고정 금액 할인을 적용한다. (추후 변경 가능)
  - 할인 정책은 변경 가능성이 높다.
    - [X] 10% 할인해주는 정률할인정책으로 변경한다.
