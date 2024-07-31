public class BuilderPatternTest {
    public static void main(String[] args) {
        // Create different configurations of Computer using the Builder pattern
        Computer gamingPC = new Computer.Builder()
            .setCPU("Intel i9")
            .setRAM("32GB")
            .setStorage("1TB SSD")
            .setGPU("NVIDIA RTX 3080")
            .setPowerSupply("750W")
            .setMotherboard("ASUS ROG")
            .setCaseType("Mid Tower")
            .build();

        Computer officePC = new Computer.Builder()
            .setCPU("Intel i5")
            .setRAM("16GB")
            .setStorage("512GB SSD")
            .setGPU("Integrated")
            .setPowerSupply("500W")
            .setMotherboard("Gigabyte")
            .setCaseType("Mini Tower")
            .build();

        System.out.println("Gaming PC Configuration: " + gamingPC);
        System.out.println("Office PC Configuration: " + officePC);
    }
}

