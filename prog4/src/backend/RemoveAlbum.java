package backend;

public class RemoveAlbum {

    public void excecute(Album anAlbum, boolean isRoot){
        if (isRoot == false){
            anAlbum.removeItem();
        }
    }
}
