package backend;

import java.util.List;

public class AddAlbum {

    public void ceateRootAlbum(String name){
         Album rootAlbum = new Album(name);
    }

    public void excecute(String name, Album parent){
        Album anAlbum = new Album(name, parent);
        anAlbum.setParent(parent);
        List<Album> Children = parent.getChildren();
        Children.add(anAlbum);
        parent.setChildren(Children);
    }
}
