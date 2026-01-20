public class Car {
    private int speed;

    public void run(){
        speed =speed+50;
        System.out.println("走りました。スピードが"+speed+"km/hになりました。");
        if(speed >=120){
            System.out.println("スピードの出し過ぎです。");
        }
    }









    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    

}
