package Transport;

import Service.Service;
import Service.ServiceStation;

public abstract class Transport implements Service {
    public String modelName;
    public int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void check() {
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();
        }
    }
}
