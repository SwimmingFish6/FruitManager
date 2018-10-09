package cn.edu.zju.bean;

/**
 * Created by 51499 on 2017/7/15 0015.
 */
public class FruitReserveStoreBean {
    long storeId;
    String storeName;
    String address;
    int volume;
    float rank;

    public FruitReserveStoreBean() {
    }

    public long getStoreId() {
        return storeId;
    }

    public void setStoreId(long storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public float getRank() {
        return rank;
    }

    public void setRank(float rank) {
        this.rank = rank;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
