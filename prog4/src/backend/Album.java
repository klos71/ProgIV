package backend;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {

    protected List <SoundClip> clips = new LinkedList<>();
    protected Album Parent;
    boolean root;
    String Name;

    //under finns getters och setters för variablerna//
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public List<SoundClip> getClips() {
        return clips;
    }

    public void setClips(List<SoundClip> clips) {
        this.clips = clips;
    }

    public void setParent(Album parent) {
        Parent = parent;
    }

    public boolean isRoot() {
        return root;
    }

    public void setRoot(boolean root) {
        this.root = root;
    }

    //Skapar ett album//
    public Album(String name, Album parent, boolean isRoot){
        setName(name);
        setParent(parent);
        setRoot(isRoot);
    }

    public void remove item

    public void getParent(){

    }

}
