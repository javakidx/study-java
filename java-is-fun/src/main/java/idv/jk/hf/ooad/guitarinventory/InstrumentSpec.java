package idv.jk.hf.ooad.guitarinventory;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/**
 * Created by bioyang on 2016/1/5.
 */
public class InstrumentSpec {
    private Map<String, Object> properties;

    public InstrumentSpec(Map<String, Object> properties) {
        if (properties == null) {
            this.properties = new HashMap<>();
        } else {
            this.properties = new HashMap<>(properties);
        }
    }

    public Object getProperty(String name) {
        return properties.get(name);
    }

    public Map<String, Object> getProperties() {
        return this.properties;
    }

    public boolean matches(InstrumentSpec otherSpec) {
        for (Iterator<String> i = otherSpec.getProperties().keySet().iterator(); i.hasNext();) {
            String name = i.next();

            if (!properties.get(name).equals(otherSpec.getProperty(name))) {
                return false;
            }
        }
        return true;
    }
//    protected String model;
//    protected Builder builder;
//    protected Type type;
//    protected Wood topWood;
//    protected Wood backWood;
//
//    public InstrumentSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood) {
//        this.builder = builder;
//        this.model = model;
//        this.type = type;
//        this.backWood = backWood;
//        this.topWood = topWood;
//    }

//    public boolean matches(InstrumentSpec otherSpec) {
//        if (builder != otherSpec.builder) {
//            return false;
//        }
//
//        if (model != null && !"".equals(model) && !model.equals(otherSpec.model)) {
//            return false;
//        }
//
//        if (type != otherSpec.type) {
//            return false;
//        }
//
//        if (backWood != otherSpec.backWood) {
//            return false;
//        }
//
//        if (topWood != otherSpec.topWood) {
//            return false;
//        }
//        return true;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//    public Builder getBuilder() {
//        return builder;
//    }
//
//    public Type getType() {
//        return type;
//    }
//
//    public Wood getTopWood() {
//        return topWood;
//    }
//
//    public Wood getBackWood() {
//        return backWood;
//    }
}
