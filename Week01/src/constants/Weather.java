package constants;

public enum Weather {
    SUNNY("🌞 Sunny", -0),
    CLOUD("☁️ Cloud", 0),
    RAIN("🌧 Rain", -5),
    SNOW("❄️ Snow", -10);

    private final String label;  // ← 이게 label 필드
    private final int minusSpeed;  // ← 이게 label 필드

    Weather(String label, int minusSpeed) {      // ← 생성자에서 받아서
        this.label = label;      // 필드에 저장
        this.minusSpeed = minusSpeed;      // 필드에 저장
    }

    public String getLabel() {   // ← 꺼내쓸 수 있는 메서드
        return label;
    }
    public int getMinusSpeed() {   // ← 꺼내쓸 수 있는 메서드
        return minusSpeed;
    }
}

