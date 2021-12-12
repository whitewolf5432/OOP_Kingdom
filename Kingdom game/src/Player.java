public class Player {
    private long money = 5;
    private int progress;
    public void collectMoney(int m, boolean state){
        if(state) {
            this.money += m;
        }
    }
    public boolean payMoney(long money){
        if(this.money >= money){
            this.money -= money;
            return true;
        }
        return false;
    }

    public long getMoney() {
        return money;
    }

    public int getProgress() {
        return progress;
    }
   
    
    
    
}
