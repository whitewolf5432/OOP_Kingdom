import javax.swing.*;

public class Play extends JPanel implements Runnable{
    private Player player;
    private Thread thread;
    public static boolean state = true;
    private boolean pause;
    private TownShop townShop;
    private FarmShop farmShop;
    private CastleShop castleShop;;
    private MarketShop marketShop;
    private MilitaryShop militaryShop;
    private Menubar menubar;
    
    public Play() {
        player = new Player();
        townShop = new TownShop(player);
        farmShop = new FarmShop(player);
        castleShop = new CastleShop(player);
        marketShop = new MarketShop(player);
        militaryShop = new MilitaryShop(player);
        menubar = new Menubar(player);
        this.setLayout(null);
        this.setSize(1295, 750);
        this.add(menubar);
        this.add(player.getFarm());
        this.add(farmShop);
        this.add(player.getMarket());
        this.add(marketShop);
        this.add(player.getMilitary());
        this.add(militaryShop);
        this.add(player.getTown());
        this.add(townShop);
        this.add(player.getCastle());
        this.add(castleShop);
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
            player.collectMoney(player.getValue(), state);
            System.out.println(player.getMoney());
            try{
                thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
            if(player.checkEnd()) {
                try{
                thread.sleep(5000);
                }
                catch(InterruptedException e){
                    System.out.println(e);
                }
                Game.change("Ending");
                break;
            }
        }
    }
}
