package exam1;

public class Exam1 {
    public static void main(String[] args) {
        
        SuperCar supercar = new SuperCar();
        supercar.putOnGas();
        supercar.setName("フェラーリ");
        supercar.run();

        EcoCar ecocar = new EcoCar();
        ecocar.putOnGas();
        ecocar.setName("プリウス");
        ecocar.run();




    }

}
