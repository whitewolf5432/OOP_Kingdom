import javax.swing.*;

public class Play extends JPanel implements Runnable{
    private Player player;
    private Farm farm;
    private Thread thread;
    public static boolean state = true;
    private boolean pause;
    private FarmShop farmShop;
    private TownShop townShop;
    private Town town;
    private Castle castle;
    private CastleShop castleShop;
    private Market market;
    private MarketShop marketShop;
    private Military military;
    private MilitaryShop militaryShop;
    private Menubar menubar;
    
    public Play() {
        player = new Player();
        farm = new Farm();
        farmShop = new FarmShop(farm, player);
        town = new Town();
        townShop = new TownShop(town, player);
        castle = new Castle();
        castleShop = new CastleShop(castle, player);
        market = new Market();
        marketShop = new MarketShop(market, player);
        military = new Military();
        militaryShop = new MilitaryShop(military, player);
        menubar = new Menubar(player, town, farm, castle, market, military);
        this.setLayout(null);
        this.setSize(1295, 750);
        this.add(menubar);
        this.add(farm);
        this.add(farmShop);
        this.add(market);
        this.add(marketShop);
        this.add(military);
        this.add(militaryShop);
        this.add(town);
        this.add(townShop);
        this.add(castle);
        this.add(castleShop);
        System.out.println(farm.getLevel());
        thread = new Thread(this);
        
    }
    public void startPlay(){
        thread.start();
        pause = false;
    }
    public void pausePlay(){
        thread = new Thread(this);
        pause = true;
    }
    public synchronized void run(){
        while(!pause){ 
            menubar.repaint();
            player.collectMoney(farm.getValue()+town.getValue()+castle.getValue()+market.getValue()+military.getValue(), state);
            System.out.println(player.getMoney());
            try{
                thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
            if(farm.getLevel() == 10 && town.getLevel() == 10 && castle.getLevel() == 10 && market.getLevel() == 10 && military.getLevel() == 10) {
                Game.change("Ending");
                break;
            }
        }
    }
}
