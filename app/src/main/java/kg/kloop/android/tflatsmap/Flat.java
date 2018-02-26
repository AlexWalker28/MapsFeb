package kg.kloop.android.tflatsmap;

/**
 * Created by alexwalker on 26.02.2018.
 */

public class Flat {
    String id;
    String address;
    String price;
    double lat;
    double lng;

    public Flat() {
    }

    public Flat(String address, String price, double lat, double lng) {
        this.address = address;
        this.price = price;
        this.lat = lat;
        this.lng = lng;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }
}
