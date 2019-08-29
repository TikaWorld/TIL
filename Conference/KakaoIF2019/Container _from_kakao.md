카카오에서 컨테이너를 사용하는 방법
=========
1. 카카오 컨테이너 플랫폼 현황
    * 서비스의 대부분을 컨테이너 플랫폼을 이용
    * Not Only 컨테이너 오케스트레이터(K8S)
    * 클러스터를 구성하기 위한 서버
        1. Virtual Machine
        2. Physical Machine => 간섭 현상 심한 서비스
    * 모니터링: Metric, Log
    * 외부에서 들어오는 트래픽 처리 => Physical 로드 밸런서 뒤에 Kubernetes Ingress
    * 보안
        1. 이미지 보안
        2. 보안진단
        3. 주기적인 취약점 점검
        4. 클러스터 외부로의 접근 제한 관리
    * DKOS, K2HUB, Cloud App Launcher 같은 컴포넌트 필요
    * D2HUB - Container Registry
    * DKOS - Container Ochestrater
    * K2HUB - Helm Package Manager

2. D2Hub
    * 이미지? 다른 서버에서 이미지 사용?
    * 기능
        1. 보안 검수 (이미지 스캐닝)
        2. Base 이미지 자체 배포
        3. 자동 빌드, 자동 배포
    * 스토리지: Kage => 용량, 안정성 걱정 X
    * 곧 오픈소스로 제공할 예정

3. DKOS
    * Runway의 한계
    * 사용자에게 개별 클러스터 제공
    * V3는 운영 클러스터 없이 모든 클러스터를 독립적으로 구성 => 장애 전이 차단
    * V3 기술의 이슈
        1. 어떤 CNO? Calico => Direct Server Return 이 안됨
        2. 대안: Kubespray의 Flannel, weave, cilium
    * Severless 데이터 저장
        1. Virtual Machine: Openstack Provider
        2. Physical Machine: Tenth NFS

4. K2HUB
    * Helm K8S 패키지 매니저 사용
    * DKOS에 맞게 패키지 메니징이 필요
    * 패키지를 차트로 관리
    * Managing
        1. community: 모두가 이용 가능
        2. stable: 차트 담당 부서에서 관리
        3. 차트 관리에 필요한 정보 제공

5. Cloud App Launcher
    * 소스만 등록하면 빌드하고 배포해주는 ServerLess를 제공해주는 Service
    * DKOS는 너무 많은 자원 사용 (개별 클러스터, 배포의 어려움)
    * Runway를 대체해주는 서비스
    * Knative
    * Build: buildpack.io
