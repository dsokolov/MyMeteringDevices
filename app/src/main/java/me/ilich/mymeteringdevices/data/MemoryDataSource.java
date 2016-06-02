package me.ilich.mymeteringdevices.data;

import android.database.Cursor;
import android.database.MatrixCursor;

import java.util.ArrayList;
import java.util.List;

public class MemoryDataSource implements DataSource {

    private List<MeteringDevice> meteringDeviceList = new ArrayList<>();

    @Override
    public Cursor getMeteringDevices() {
        MatrixCursor cursor = new MatrixCursor(MeteringDevice.COLUMN_NAMES);
        for (MeteringDevice meteringDevice : meteringDeviceList) {
            meteringDevice.addToCursor(cursor);
        }
        return cursor;
    }

    @Override
    public void addMeteringDevice(MeteringDevice meteringDevice) {
        meteringDeviceList.add(meteringDevice);
    }

    @Override
    public void deleteMeteringDevice(int id) {
        MeteringDevice device = null;
        for (MeteringDevice meteringDevice : meteringDeviceList) {
            if (meteringDevice.getId() == id) {
                device = meteringDevice;
            }
        }
        meteringDeviceList.remove(device);
    }

    @Override
    public void deleteAllMeteringDevices() {
        meteringDeviceList.clear();
    }

}
