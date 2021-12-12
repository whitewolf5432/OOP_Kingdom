/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Player {
    private long money = 5;
    private int progress;
    private int castleLv;
    private int farmLv;
    private int marketLv;
    private int militaryLv;
    private int townLv;
    public void collectMoney(int m){
        this.money += m;
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
