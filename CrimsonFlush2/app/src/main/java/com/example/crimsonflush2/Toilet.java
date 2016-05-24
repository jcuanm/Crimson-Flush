package com.example.crimsonflush2;

import com.google.android.gms.maps.model.Marker;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Javi Cuan on 12/4/2014.
 */


// Create Hashmap toilet with 5 fields
public class Toilet {
    public static final Map<String, Toilet> TOILETS = new HashMap<String, Toilet>();

    public final String title;
    public final String snippet;
    public final double lat;
    public final double lng;
    public final boolean needId;

    public Toilet(String title, String snippet, double lat, double lng, boolean needId) {
        this.title = title;
        this.snippet = snippet;
        this.lat = lat;
        this.lng = lng;
        this.needId = needId;
    }

    static {
        int i = 0;

        // Insert each toilet info into hashmap.
        TOILETS.put("Science Center", new Toilet("Science Center", "Bottom Floor", 42.376545, -71.116844, false));
        TOILETS.put("Annenberg", new Toilet("Annenberg", "Basement", 42.375961, -71.115325, true));
        TOILETS.put("Widener Library", new Toilet("Widener Library", "First Floor; Basement", 42.373482, -71.116528, true));
        TOILETS.put("Lamont Library", new Toilet("Lamont Library", "Second Floor; Bottom Floor", 42.372793, -71.115486, true));
        TOILETS.put("Boylston Hall", new Toilet("Boylston Hall", "Bottom Floor", 42.373315, -71.117346 , false));
        TOILETS.put("Emerson Hall", new Toilet("Emerson Hall", "First Floor; Basement", 42.373887, -71.115266, false));
        TOILETS.put("Sever Hall", new Toilet("Sever Hall", "Second Floor", 42.374346, -71.115519, false));
        TOILETS.put("Grays Hall", new Toilet("Grays Hall", "Basement", 42.373669, -71.117846, true));
        TOILETS.put("Pusey Library", new Toilet("Pusey Library", "First Floor", 42.373468, -71.115774, true));
        TOILETS.put("Cabot Library", new Toilet("Cabot Library", "Top Floor; First Floor", 42.376281, -71.116049, true));
        TOILETS.put("Robinson Hall", new Toilet("Robinson Hall", "First Floor", 42.374729, -71.114996, false));
        TOILETS.put("Canaday Hall", new Toilet("Canaday Hall", "Basement; All Entryways:First Floor", 42.375453, -71.115950, true));
        TOILETS.put("Loeb House", new Toilet("Loeb House", "First Floor", 42.373633, -71.115301, false));
        TOILETS.put("Matthews Hall", new Toilet("Matthews Hall", "Basement", 42.374123, -71.118166, true));
        TOILETS.put("John Harvard Statue", new Toilet("John Harvard Statue", "The shiny foot?", 42.374520, -71.117212, false));
    }
}
