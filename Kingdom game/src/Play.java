
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Play extends JPanel implements Runnable{
    private JFrame frame;
    private Player py;
    private Farm farm;
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
        py = new Player();
        farm = new Farm();
        farmShop = new FarmShop(farm, py);
        town = new Town();
        townShop = new TownShop(town, py);
        castle = new Castle();
        castleShop = new CastleShop(castle, py);
        market = new Market();
        marketShop = new MarketShop(market, py);
        military = new Military();
        militaryShop = new MilitaryShop(military, py);
        this.setLayout(new BorderLayout());
        this.setSize(1280, 720);
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
        frame.setSize(1280, 720);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        System.out.println(farm.getLevel());
        Thread thread = new Thread(this);
        thread.start();
    }
    
    public static void main(String[] args) {
        new Test();
    }
    public void run(){
        while(true){ 
            py.collectMoney(farm.getValue()+town.getValue()+castle.getValue()+market.getValue()+military.getValue());
            System.out.println(py.getMoney());
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
            
        }
    }
}
