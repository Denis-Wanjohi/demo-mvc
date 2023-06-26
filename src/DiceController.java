import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DiceController {
   private DiceView view;
    private DiceModel model;

    DiceController(DiceModel model,DiceView view){
        this.view=view;
        this.model=model;
        view.rolledValue(new rollValue());

    }

    class rollValue implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                model.setRolledValue((int) Math.ceil(Math.random()*6));
                view.randomValue(model.getRolledValue());
            }catch (Exception v){
                v.printStackTrace();
            }

        }
    }

}
