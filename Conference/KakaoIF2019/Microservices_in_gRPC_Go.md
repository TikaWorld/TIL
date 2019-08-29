Practical Microservices in gRPC Go feat. GraphQL, Kafka
=======================================================
1. Programming Language
    * Java
        * 장점
            * 익숙하다
            * Spring Framework Almighty
            * OS 독림: WORE
        * 단점
            * Spring Framework 종속적
            * OS 독립적이 장점인가?
    * Go
        * Why?
            * net/http 성능 Java Jersy 대비 2배
            * 문법 키워드가 적다 => 러닝커브가 작다
            * 온전한 Complile 언어
            * No magic. 디버깅시 직관적
            * 직관적인 오류 조작
            * 컴파일시 하나의 결과물 => 컨테이너
        * 의존성 주입, FX

2. Architecture
    * Microservice Architecture
        * Why?
            * 고립된 기능, 고립된 데이터 => 복잡도 해소
            * 잦은 작은 배포
            * 개발자가 서비스를 소유 => 책임감 증가
        * 단점
            * API 호출이 증대 => API Gateway
            * 네트워크 통신 비용 => 대부분 DC, 병렬처리로 해소
            * 서비스 발견 복잡함 => etcd, consil 등으로 개선 필요
            * Test 환경 복잡함

3. Protocol
    * gRPC
        * 구글의 Stubby의 오픈 소스 구현체
        * 경량의 이진 프로토콜(protobuf)
        * gRPC UI
            * gRPC 테스트 가능
        * gRPC Gateway => gRPC를 REST API로 제공
        * IDL Registry

4. Testing
    * ghz로 gRPC Load Test
    * nGrinder로 HTTP Load Test
    * 의존성 있는 서비스를 docker-compose로 엮어서 Postman으로 작성된 테스트 코드 Run

5. if kafka
    * 데이터를 갱신하는 Flow를 한번에 개선해줌
    * 각 서비스가 offset을 옮기면서 메시지를 처리
    * 만일 오류 날시 offset을 묶어놓아서 나중에 다시 처리가 가능함
    * 장점
        * 서비스간 메시지 흐름 단순화
        * 메시지의 영속성 보장, 유실 방지
        * 패킷 오버헤드 감소
        * 하나의 이벤트 메시지를 여러 서비스에서 사용 가능
        * 메시지 버저닝(스키마 레지스트리)

6. API Gateway
    * 작은 서비스를 하나 하나 호출 하면 엔드 포인트가 너무 많아짐 => 클라이언트와 서버 간에 의존성이 강해짐
    * GraphQL
        * Only One EndPoint
        * Query What I Want
        * No Versioning
        * No Document
    * NodeJS에서 많은 라이브러리 지원

7. Service Monitoring
    * API Timeout이 발생하는 동안 Database Connection이 묶이면서 문제 발생
    * 모니터링 시스템의 빠른 적용 => Prometheus, Grafana
    * Prometheus
        * 이벤트를 Pull 방식으로 메트릭 수집
    * Grafana
        * Prometheus 개발진이 권장하는 시각화 도구
    * 트랜잭션이 분산된 여러 서비스를  거쳐 조합되어 처리되기 떄문에 분산 로그 추적 시스템이 필요
    * Zipkin

8. Legacies
    * 레거시 서비스를 카나리아 배포로 천천히 운영 환경에 변경을 최소화 하며 배포
    * circuit breaker pattern을 활용한 traffic 동적 잠금
    * 레거시 시스템
        * 로컬 환경 구축 필요
        * docker, K8S 활용

