package Kor;

import java.util.Random;

public class Kor {
    private int x;
    private int y;
    private int sugar;

    Random rnd=new Random();

    public  Kor(int x, int y, int sugar){
        this.x=x;
        this.y=y;
        this.sugar=sugar;
    }

    public Kor(int sugar){
        this.x=0;
        this.y=0;
        this.sugar=sugar;
    }

    public Kor(){
        this.x= rnd.nextInt(60+10)-30;
        this.y= rnd.nextInt(60+10)-30;
        this.sugar=rnd.nextInt(51);
    }

    public int getX(int x){
        return x;
    }
    public void setX(){
        this.x=x;
    }

    public int getY(int Y){
        return Y;
    }
    public void setY(){
        this.y=y;
    }

    public int getSugar(int sugar){
        return sugar;
    }
    public void setSugar(){
        this.sugar=sugar;
    }

    public double KorKerulete(){
        return (2*this.sugar)*Math.PI;
    }

    public  double KorTerulete(){
        return Math.pow(this.sugar,2)*Math.PI;
    }

    public int NagyitvKicsinyit(int valasz){
        return  this.sugar+valasz;
    }

    @Override
    public String toString(){return String.format("(%d,%d) koordinátájú, %d cm sugarú kör ",this.x,this.y, this.sugar);}
}
