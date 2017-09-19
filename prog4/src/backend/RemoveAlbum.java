package backend;

public class RemoveAlbum {

    public void excecute(Album anAlbum){
        if (!anAlbum.getParent().equals(null)){
            anAlbum.getParent().getChildren().remove(anAlbum);
        }
    }
}
