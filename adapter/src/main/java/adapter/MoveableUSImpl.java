package adapter;

public class MoveableUSImpl implements MoveableUS {

    private Moveable moveobj;

    public MoveableUSImpl(Moveable moveobj){

        this.moveobj = moveobj;

    }

    public float getVelocity(){

        return KMHtoMPH(moveobj.getVelocity());

    }

    private float KMHtoMPH(float KMH){

        return KMH*0.6213712f;

    }

}
