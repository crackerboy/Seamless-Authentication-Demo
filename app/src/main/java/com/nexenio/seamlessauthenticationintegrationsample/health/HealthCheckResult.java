package com.nexenio.seamlessauthenticationintegrationsample.health;

public class HealthCheckResult {

    private int operationalBluetoothChips;

    private int activeDevices;

    public HealthCheckResult() {

    }

    public int getOperationalBluetoothChips() {
        return operationalBluetoothChips;
    }

    public void setOperationalBluetoothChips(int operationalBluetoothChips) {
        this.operationalBluetoothChips = operationalBluetoothChips;
    }

    public int getActiveDevices() {
        return activeDevices;
    }

    public void setActiveDevices(int activeDevices) {
        this.activeDevices = activeDevices;
    }

}
