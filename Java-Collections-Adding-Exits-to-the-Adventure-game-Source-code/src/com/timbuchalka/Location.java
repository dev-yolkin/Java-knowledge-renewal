package com.timbuchalka;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dev on 8/12/2015.
 */
public class Location {
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;
    private final Map<String, String> exitsDic;

    public Location(int locationID, String description) {
        this.locationID = locationID;
        this.description = description;
        this.exits = new HashMap<String, Integer>();
        this.exits.put("Q", 0);
        this.exitsDic = new HashMap<String, String>();
        this.exitsDic.put("QUIT", "Q");
        this.exitsDic.put("NORTH", "N");
        this.exitsDic.put("EAST", "E");
        this.exitsDic.put("WEST", "W");
        this.exitsDic.put("SOUTH", "S");
    }

    public void addExit(String direction, int location) {
        exits.put(direction, location);
    }
    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }

    public Map<String, String> getExitsDic() {
        return exitsDic;
    }
}
