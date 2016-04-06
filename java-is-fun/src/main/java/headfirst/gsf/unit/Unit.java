package headfirst.gsf.unit;

import java.util.Map;

/**
 * Created by bioyang on 2016/3/11.
 */
public class Unit {
    private String type;
    private Map<String, Object> properties;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Map<String, Object> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }
}
