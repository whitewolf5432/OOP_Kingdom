import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Play extends JPanel implements Runnable{
    private JFrame frame;
    private Player player;
    private Farm farm;
    private Thread thread;
    public static boolean state = true;
    FarmShop farmShop;
    TownShop townShop;
    Town town;
    Castle castle;
    CastleShop castleShop;
    Market market;
    MarketShop marketShop;
    Military military;
    MilitaryShop militaryShop;
    
    public Play() {
        frame = new JFrame();
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
        this.setLayout(new BorderLayout());
        this.setSize(1300, 760);
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
        this.add(new JLabel());
        frame.add(this);
        frame.setSize(1300, 760);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        System.out.println(farm.getLevel());
        thread = new Thread(this);
        thread.start();
    }
    
    public static void main(String[] args) {
        new Play();
    }
    public synchronized void run(){
        while(true){ 
            player.collectMoney(farm.getValue()+town.getValue()+castle.getValue()+market.getValue()+military.getValue(), state);
            System.out.println(player.getMoney());
            try{
                thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
