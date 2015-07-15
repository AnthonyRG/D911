package p;

import com.badlogic.gdx.math.GridPoint2;

public class Car {

	GridPoint2 pos    = new GridPoint2();
	GridPoint2 target = new GridPoint2();
	
	public Car(){	pos = new GridPoint2();	}
	
	public Car(GridPoint2 gp){	pos = gp;	}
	
	public GridPoint2 getPos(){	
		return pos;
	}	

	public GridPoint2 getTarget(){
		return target;
	}

	public void setTarget(GridPoint2 gp){
		target = gp;
	}


}
