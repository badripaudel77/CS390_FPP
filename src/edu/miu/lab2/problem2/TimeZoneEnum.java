package edu.miu.lab2.problem2;

public enum TimeZoneEnum {
    AMERICA_PANAMA("America/Panama"),
    AMERICA_CHICAGO("America/Chicago"),
    AMERICA_INDIANA_INDIANAPOLIS("America/Indiana/Indianapolis"),
    AMERICA_SANTIAGO("America/Santiago"),
    AMERICA_PHOENIX("America/Phoenix"),
    VIETNAM_HOCHIMINH("Asia/Ho_Chi_Minh");

    private final String zone;

    TimeZoneEnum(String zone) {
        this.zone = zone;
    }

    @Override
    public String toString() {
        return zone; // gọi .toString() sẽ ra luôn "America/Chicago"
    }
}
