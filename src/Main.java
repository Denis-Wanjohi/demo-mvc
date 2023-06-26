public class Main {

    public static void main(String[] args){
        DiceView view=new DiceView();
        DiceModel model=new DiceModel();
        DiceController controller=new DiceController(model,view);
    }
}
