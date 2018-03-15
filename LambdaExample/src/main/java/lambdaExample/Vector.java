package lambdaExample;

public class Vector{

    private int x;
    private int y;



    public Vector(){

        this.x = 0;

        this.y = 0;

    }



    public Vector(int x, int y){

        this.x = x;

        this.y = y;

    }



    public int getX(){

        return this.x;

    }



    public int getY(){

        return this.y;

    }


    public void setX(int x){

        this.x = x;

    }


    public void setY(int y){

        this.y = y;

    }

}
