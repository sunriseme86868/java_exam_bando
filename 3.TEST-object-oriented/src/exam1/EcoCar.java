package exam1;

public class EcoCar extends Car{
    EcoCar(){}
    EcoCar(String name){
        super.getName();
    }

    public void run(){
        System.out.println("ブオーン!"+getName()+"が走ります。");
    }


}
