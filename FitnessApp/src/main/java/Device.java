// Device Class
class Device {
    private String deviceId;
    private String type;
    private String brand;

    public Device(String deviceId, String type, String brand) {
        this.deviceId = deviceId;
        this.type = type;
        this.brand = brand;
    }

    public String getDeviceInfo() {
        return "Device[ID=" + deviceId + ", Type=" + type + ", Brand=" + brand + "]";
    }
}
