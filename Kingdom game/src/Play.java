import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Play extends JPanel implements Runnable{
    private JFrame frame;
    private Player player;
    private Farm farm;
    private Thread thread;
    public static boolean state = true;
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
        menubar = new Menubar(player);
        this.setLayout(null);
        this.setSize(1295, 750);
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
        this.add(menubar);
        frame.add(this);
        frame.setSize(1295, 750);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        System.out.println(farm.getLevel());
        thread = new Thread(this);
        thread.start();
        frame.setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        new Play();
    }
    public synchronized void run(){
        while(true){ 
            menubar.repaint();
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
