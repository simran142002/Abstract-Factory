// Abstract product A
interface Chair {
    void sitOn();
}

// Concrete product A1
class VictorianChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a Victorian chair");
    }
}

// Concrete product A2
class ModernChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a Modern chair");
    }
}

// Abstract product B
interface Sofa {
    void lieOn();
}

// Concrete product B1
class VictorianSofa implements Sofa {
    @Override
    public void lieOn() {
        System.out.println("Lying on a Victorian sofa");
    }
}

// Concrete product B2
class ModernSofa implements Sofa {
    @Override
    public void lieOn() {
        System.out.println("Lying on a Modern sofa");
    }
}

// Abstract factory
interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
}

// Concrete factory 1
class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}

// Concrete factory 2
class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}

// Client code
public class Main {
    public static void main(String[] args) {
        // Create a Victorian furniture set
        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        Chair victorianChair = victorianFactory.createChair();
        Sofa victorianSofa = victorianFactory.createSofa();

        // Create a Modern furniture set
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        Chair modernChair = modernFactory.createChair();
        Sofa modernSofa = modernFactory.createSofa();

        // Test the furniture
        testFurniture(victorianChair, victorianSofa);
        testFurniture(modernChair, modernSofa);
    }

    private static void testFurniture(Chair chair, Sofa sofa) {
        chair.sitOn();
        sofa.lieOn();
    }
}
