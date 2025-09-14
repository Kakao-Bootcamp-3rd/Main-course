# 🚗 Racing Car Simulator (Week01)

![status](https://img.shields.io/badge/Status-Completed-4caf50?style=flat-square)
![lang](https://img.shields.io/badge/Language-Java-orange?style=flat-square)

카카오 **클라우드 네이티브 부트캠프** 프리코스 과제 중,  
CLI 기반 **레이싱카 시뮬레이터** 프로젝트입니다.  

과제 분석 및 상세 문서는 노션 페이지에 정리되어 있습니다.  

---

## 📌 과제 설명
👉 [노션 참고](https://www.notion.so/shopping-mall/26e25e3f71a480ac80a0c44fe5adc491)

---

## 📂 프로젝트 구조

Week01/
├─ src/
│  ├─ app/
│  │  └─ MainApp.java                # 프로그램 진입점
│  ├─ constants/
│  │  ├─ CarSpecs.java               # 자동차 스펙 상수 정의
│  │  └─ Weather.java                # 날씨 Enum 클래스
│  ├─ controller/
│  │  ├─ Thread/                     # 날씨 스레드 제어
│  │  ├─ AppController.java
│  │  ├─ CarChoiceController.java
│  │  └─ SimulatorController.java
│  └─ model/
│     ├─ Car.java
│     ├─ BasicSpeedControl.java
│     ├─ Drivable.java
│     ├─ Moniter.java
│     ├─ RacingCar.java
│     ├─ F1.java
│     └─ F2.java
└─ README.md
