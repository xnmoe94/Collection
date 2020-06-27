package AdventureGame;

import java.util.HashMap;
import java.util.Map;

public class Location {

    private final int  locationId;
    private final String LocationDesc;
    private final Map<String, Integer> exits;


    public Location(int locationId, String locationDesc, Map<String, Integer> exits) {
        this.locationId = locationId;
        LocationDesc = locationDesc;
       if(exits != null){
           this.exits = new HashMap<String, Integer>(exits);

       }else {
           this.exits = new HashMap<String, Integer>();
       }
        this.exits.put("Quit", 0);

    }


    public int getLocationId() {
        return locationId;
    }

    public String getLocationDesc() {
        return LocationDesc;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);

    }
}


