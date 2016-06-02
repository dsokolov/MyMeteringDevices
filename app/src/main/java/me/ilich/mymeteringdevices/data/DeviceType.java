package me.ilich.mymeteringdevices.data;

public class DeviceType {

    private final int id;
    private final String title;

    public DeviceType(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DeviceType type = (DeviceType) o;

        if (id != type.id) return false;
        return title != null ? title.equals(type.title) : type.title == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        return result;
    }

}
