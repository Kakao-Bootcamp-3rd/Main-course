# 🚗 Racing Car Simulator

![status](https://img.shields.io/badge/Status-Completed-4caf50?style=flat-square)
![lang](https://img.shields.io/badge/Language-Java-orange?style=flat-square)

CLI 기반 **레이싱카 시승 시뮬레이터** 프로젝트입니다.  

---

## 📌 프로젝트 개요
👉 [노션 참고](https://www.notion.so/shopping-mall/26e25e3f71a480ac80a0c44fe5adc491)

---

## 📂 프로젝트 구조

```bash
Week01/
├─ src/
│  ├─ app/
│  │  └─ MainApp.java                # 프로그램 진입점
│  ├─ constants/
│  │  ├─ CarSpecs.java               # 자동차 스펙 상수 정의
│  │  └─ Weather.java                # 날씨 Enum 클래스
│  ├─ controller/
│  │  ├─ Thread/                     
│  │  │  └─ WeatherController        # 날씨 스레드 제어
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

