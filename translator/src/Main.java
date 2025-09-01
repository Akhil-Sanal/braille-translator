import javax.swing.*;

class Main {
    public static void main(String args[]) {
        JFrame page = new JFrame("Translator");
        JPanel pan = new JPanel();
        JTextArea w = new JTextArea(10, 40);
        JButton submit = new JButton("Submit");

        submit.addActionListener(e -> new Tran(w.getText()));

        pan.add(new JScrollPane(w));
        pan.add(submit);

        page.add(pan);
        page.setSize(600, 600);
        page.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        page.setVisible(true);
    }
}

class Tran {
    Tran(String w) {
        JFrame page = new JFrame("Translated");
        String s = "";

        for (int i = 0; i < w.length(); i++) {
            char ch = w.charAt(i);

            switch (ch) {
                case 'a': s += "⠁"; break;
                case 'b': s += "⠃"; break;
                case 'c': s += "⠉"; break;
                case 'd': s += "⠙"; break;
                case 'e': s += "⠑"; break;
                case 'f': s += "⠋"; break;
                case 'g': s += "⠛"; break;
                case 'h': s += "⠓"; break;
                case 'i': s += "⠊"; break;
                case 'j': s += "⠚"; break;
                case 'k': s += "⠅"; break;
                case 'l': s += "⠇"; break;
                case 'm': s += "⠍"; break;
                case 'n': s += "⠝"; break;
                case 'o': s += "⠕"; break;
                case 'p': s += "⠏"; break;
                case 'q': s += "⠟"; break;
                case 'r': s += "⠗"; break;
                case 's': s += "⠎"; break;
                case 't': s += "⠞"; break;
                case 'u': s += "⠥"; break;
                case 'v': s += "⠧"; break;
                case 'w': s += "⠺"; break;
                case 'x': s += "⠭"; break;
                case 'y': s += "⠽"; break;
                case 'z': s += "⠵"; break;
                case ' ': s += "  ";  break;
                default: s += "";    break;
            }
        }

        JTextArea text = new JTextArea(s,20,40);


        page.add(text);
        page.setSize(600, 600);
        page.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        page.setVisible(true);
    }
}
