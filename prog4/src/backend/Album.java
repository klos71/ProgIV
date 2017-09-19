package backend;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {

    protected List <SoundClip> clips = new LinkedList<>();
    protected List <Album> Children = new LinkedList<>();
    protected Album Parent;
    protected String Name;

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

    public List<Album> getChildren() {
        return Children;
    }

    public void setChildren(List<Album> children) {
        Children = children;
    }

    public Album getParent() {
        return Parent;
    }

    public void setParent(Album parent) {
        Parent = parent;
    }

    //Skapar ett album//
    public Album(String name, Album parent){
        setName(name);
        setParent(parent);
    }
    //för att skapa root album//
    public Album(String name){
        setName(name);
    }

}
