package cat.flx.sprite;

public class Volador extends Character {
    private static int[][] states = {
            { 70, 70, 70, 73, 73, 73 }
    };
    int[][] getStates() { return states; }

    int x1, x2, dir;
    boolean right;
    int min, max;
    int direccion = 0;

    Volador(Game game) {
        super(game);
        padLeft = 0;
        padTop = 0;
        colWidth = 40;
        colHeight = 40;
        dir = 0;
        padLeft = 0;
        padTop = 0;
    }

    void physics() {
            if(y<150 && direccion==0) {
                y++;
                if(y==149){
                    direccion = 1;
                }
            }else{
                y--;
                if(y==49){
                    direccion = 0;
                }
            }
    }
}
