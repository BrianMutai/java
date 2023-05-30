import java.awt.*;
public class Label {
    public Label(String textFontLabel) {
        
    }

    class FontTextLabel extends Frame {
        Label lbl1, lbl2;

        public FontTextLabel() {
            setLayout(new FlowLayout());
            lbl1 = new Label("Text Font Label");
            lbl2 = new Label("Normal Font Label");
            add(lbl1);
            add(lbl2);
        }

        private void add(Label lbl1) {
        }

    }
}
