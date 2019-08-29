컨테이너 CI/CD를 하나의 Jenkins pipline으로 관리하기
=================================================
1. Jenkins pipline 도입기

    1. Devops에서 일하는 법
        * 대부분 프로젝트의 CI/CD 환경 조성

    2. Bye GoCD
        * 장점
            * 깔끔한 UI
        * 단점
            * 하나의 stage에 하나의 job 구성
            * 너무 느려짐
            * UI 제공시 Human 에러 잦음

    3. Hi Jenkins Pipline
        * Pipline as code
        * Not XML, JSON, YAML
        * GSML Grammer
        * 장점
            * UI 필요 없음
            * 이력 관리 쉽게 됨
            * Github, GitLab과 동기화
        * 단점
            * Jenkins에 종속적
            * 러닝 커브
            * Tool이 아니라 language
        * Travis 같은 Tool은 비용이 많이듬
        * 개발자가 Jenkinsfile을 만드는 것은 부담
        * Global Library
        * 개발자는 Jenkins.yml 준비 해야함
        * 이슈: Helm 차트를 수동으로 관리

2. Jenkins pipline 개선기
    * Plumer: +Spinnaker, Sail
        1. Spinnaker: 더 많은 기능을 상대적으로 적은 RIsk 구현
        2. Sail: pipline 차트 관리
    
    1. Jenkins pipline의 UI
        * Spinnaker를 Deployment 역할 부여
        * 어떻게 Spinnaker 관리?
        * Spinnaker pipline 생성하는 로직
        * CI/CD를 나누어서 서비스
        * Jenkins는 Docker Publish까지
    
    2. Istio
        * 소스로 이루어진 pipline에서 다양한 기능을 분배
        * K8S의 CRD로 이루어져 Desired State 정의 가능, Helm 차트와 함꼐 정의
        * 안정성
            1. 운영 예시 적음
            2. 버그가 많음
            3. 사이드카 패턴
            4. nignx ingress controller 대체 적합성
        * 속도, 일반적인 상황에서 Envoy가 성능 좋음
        * 과부화 상황이 Nginx에 비해 2배 정도 빠름
        * 결국 nginx + envoy
    
    3. Sail
        * 점차 많은 부분에서 template을 요구, 수동으로 관리하기에는 너무 큰 부담
        * Project와 Chart와 1:1 매핑 => 2개의 부모 차트