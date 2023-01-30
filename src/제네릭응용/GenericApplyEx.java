package 제네릭응용;

public class GenericApplyEx {
    public static void main(String[] args) {
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        powderPrinter.setMaterial(new Powder());
        Powder powder = powderPrinter.getMaterial();
        System.out.println(powderPrinter);
        System.out.println(powder);

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
        plasticPrinter.setMaterial(new Plastic());
        Plastic plastic = plasticPrinter.getMaterial();
        System.out.println(plasticPrinter);
        System.out.println(plastic);

        GenericPrinter<Water> waterPrinter = new GenericPrinter<>();
        waterPrinter.setMaterial(new Water());
        Water water = waterPrinter.getMaterial();
        System.out.println(waterPrinter);
        System.out.println(water);
    }
}
