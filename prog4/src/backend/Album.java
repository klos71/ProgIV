package backend;

import java.util.ArrayList;
import java.util.List;

public class Album {

    protected List<SoundClip> clips = new ArrayList<>();
    List <Album> Children = new ArrayList<>();
    Album Parent;


    public Album(String name, Album parent){

    }

    public void removeItem(){

    }

    public void getParent(){

    }

}
