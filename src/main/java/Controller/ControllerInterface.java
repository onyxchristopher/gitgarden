package Controller;

import java.util.ArrayList;

public interface ControllerInterface {

    String createProfileCheck(String name, String address, boolean flag);

    void modifyUserCheck(String Userid, String newName, String address);

    void modifyFarmerCheck(String FarmerId, double slider1, double slider2, double slider3, double slider4);

    void modifyDistributorCheck(String distId, double slider2, double slider3, double slider4);

    void createRequestCheck(String userId, String product, String quantity, String price);

    void createCounterOfferCheck(String userId, String requestId, String quantity, String price);

    void acceptRequestCheck(String requestId, String userId);

    void declineRequestCheck(String requestId, String userId);

    void trashRequestCheck(String requestId);

    ArrayList<String> rank(String requestId, String farmer);

}