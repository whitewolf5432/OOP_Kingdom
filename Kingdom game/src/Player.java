public class Player {
    private Town town;
    private Farm farm;
    private Castle castle;
    private Market market;
    private Military military;
    private long money;

    public Player() {
        this.town = new Town();
        this.farm = new Farm();
        this.castle = new Castle();
        this.market = new Market();
        this.military = new Military();
        this.money = 5;
//        for(int i=0; i < 10; i++){
//            if(i < 9){
//                farm.upLevel();
//            }
//            market.upLevel();
//            castle.upLevel();
//            town.upLevel();
//            military.upLevel();
//        }
    }
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
    public int getValue() {
        return town.getValue() + farm.getValue() + castle.getValue() + market.getValue() + military.getValue();
    }
    public boolean checkEnd() {
        return town.getLevel() == 10 && farm.getLevel() == 10 && castle.getLevel() == 10 && market.getLevel() == 10 && military.getLevel() == 10;
    }
    public Town getTown() {
        return town;
    }
    public Farm getFarm() {
        return farm;
    }
    public Castle getCastle() {
        return castle;
    }
    public Market getMarket() {
        return market;
    }
    public Military getMilitary() {
        return military;
    }
}
