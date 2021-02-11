import java.util.HashMap;
import java.util.ArrayList;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> registry;

    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (registry.containsKey(licensePlate)) {
            return false;
        }
        registry.put(licensePlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate) {
        if (registry.containsKey(licensePlate)) {
            return registry.get(licensePlate);
        }
        return null;
    }

    public boolean remove(LicensePlate licensePlate) {
        if (registry.containsKey(licensePlate)) {
            registry.remove(licensePlate);
            return true;
        }

        return false;
    }

    public void printLicensePlates() {
        for(LicensePlate plate: registry.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();

        for(String owner: registry.values()) {
            if (!owners.contains(owner)) {
                owners.add(owner);
            }
        }
        for(String owner: owners) {
            System.out.println(owner);
        }
    }
}
