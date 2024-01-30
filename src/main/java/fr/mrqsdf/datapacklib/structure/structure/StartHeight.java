package fr.mrqsdf.datapacklib.structure.structure;

import fr.mrqsdf.datapacklib.structure.structure.startheight.Distribution;

import java.util.List;
import java.util.Map;

public abstract class StartHeight {

    public Map<String, Integer> value;
    public String type;
    public Map<String, Integer> min_inclusive;
    public Map<String, Integer> max_inclusive;
    public int inner;
    public int plateau;
    public List<Distribution> distribution;

}
