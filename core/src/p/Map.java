package p;

import java.util.ArrayList;
import java.util.List;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Path;

public class Map {

	Texture MapImg;
	List<Path> paths = new ArrayList<Path>();
	
	
	Map(Texture texMap){	MapImg = texMap;					}
	Map(String MapSTR){		MapImg = new Texture(MapSTR);		}
	
	
}
