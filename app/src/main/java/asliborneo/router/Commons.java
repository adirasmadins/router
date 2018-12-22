package asliborneo.router;

import android.location.Location;

public class Commons {
public static Location mLastLocation;
    public static final String tokenTable ="Tokens";
    public static final String driver_location="Drivers";
    public static final String Registered_driver="DriverInformation";
    public static final String Registered_Riders="RidersInformation";
    public static final String pickUpRequest_tbl="PickUpRequest";
    public static final String rateDetail_table="Driver_Rating";
    private static double Base_Fare=2.50;
    private static double Time_Rate=0.25;
    private static double Distance_Rate=0.50;
    public  static  Boolean isDriverFound=false;
    public static String  driver_id="";
    public static final String googleAPIUrl ="https://maps.googleapis.com";
    public static String fcmURL = "https://fcm.googleapis.com/";
    public static final java.lang.String user_field="usr";
    public static final java.lang.String password_field="pwd";
    public static double getPrice(double km,int min){
        return (Base_Fare+(Time_Rate*min)+(Distance_Rate*km));
    }

    public static IFCMService getFCMService()
    {
        return FCMClient.getClient(fcmURL).create(IFCMService.class);
    }

    public static IGoogleMAPApi getGoogleService()
    {
        return GoogleMAPApi.getClient(googleAPIUrl).create(IGoogleMAPApi.class);
    }


}