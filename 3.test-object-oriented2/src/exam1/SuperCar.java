package exam1;

public class SuperCar extends Car{
    protected String name;
    
    SuperCar(){}
    SuperCar(String name){
        this.name =name;
    }

    @Override
    public void run(){
        super.run();
        System.out.println("ブオーン!"+name+"が走ります。");
    }

}
