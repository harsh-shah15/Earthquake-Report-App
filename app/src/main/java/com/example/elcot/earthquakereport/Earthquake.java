package com.example.elcot.earthquakereport;

public class Earthquake {
    /*
       Magnitude of the earthquake
     */
    private double mMagnitude;
    /*
       Location of the earthquake
     */
    private String mLocation;
    /*
       Date of the earthquake
     */
    private long mTimeInMilliseconds;
    /*
       Website URL of the earthquake
     */
    private String mUrl;

    /*
      Magnitude is the size of the earthquake occurred.
      location is the city location of the earthquake.
      date is date when the earthquake happened.
     */
    public Earthquake(double magnitude,String location,long timeInMilliseconds,String url){
        mMagnitude = magnitude;
        mLocation = location;
       mTimeInMilliseconds = timeInMilliseconds;
       mUrl = url;
    }
    /*
      Return the magnitude of the earthquake.
     */

    public double getmMagnitude() {
        return mMagnitude;
    }
    /*
      Return the location of the earthquake.
     */

    public String getmLocation() {
        return mLocation;
    }
    /*
       Return the date when earthquke occurred.
     */

    public long getmTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
    /*
       Returns the website URL to find more information about the earthquake.
     */

    public String getUrl() {
        return mUrl;
    }
}
