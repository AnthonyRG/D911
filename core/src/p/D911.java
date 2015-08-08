package p;

import java.util.ArrayList;
import java.util.List;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class D911 extends ApplicationAdapter {
	enum x {medicine,fire,police}
	List<Alarm> alarms = new ArrayList<Alarm>();
	List<Ambulance> AMB = new ArrayList<Ambulance>();
	List<Vehicle> ENG = new ArrayList<Vehicle>();
	List<Vehicle> CRU = new ArrayList<Vehicle>();
	
	
	//AMB ----- ambulance
	//ENG ----- Fire engine/Fire truck
	//CRU ----- police cruiser
	int maxAMB = 3;
	int maxENG = 3;
	int maxCRU = 3;
	int AMBonCALL = 0;
	int ENGonCALL = 0;
	int CRUonCALL = 0;
			
	SpriteBatch batch;
	Texture img;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
	}
	
	
}
