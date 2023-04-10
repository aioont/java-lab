import java.awt.;
import java.awt.event.;
import java.util.Vector;

public class ListBoxDemo extends Frame implements ActionListener {

private List listBox;
private TextField inputField;
private Button addButton;
private Button removeButton;

private Vector<String> items;

public ListBoxDemo() {
    super("List Box Demo");

    items = new Vector<String>();

    listBox = new List();
    for (String item : items) {
        listBox.add(item);
    }
    add(listBox, BorderLayout.CENTER);

    Panel panel = new Panel();

    inputField = new TextField(20);
    panel.add(inputField);

    addButton = new Button("Add");
    addButton.addActionListener(this);
    panel.add(addButton);

    removeButton = new Button("Remove");
    removeButton.addActionListener(this);
    panel.add(removeButton);

    add(panel, BorderLayout.SOUTH);
    pack();
    setSize(400, 300);
    setVisible(true);
}

public void actionPerformed(ActionEvent e) {
    if (e.getSource() == addButton) 
    {
        String newItem = inputField.getText();
        items.add(newItem);
        listBox.add(newItem);
        inputField.setText("");
    } 
    else if (e.getSource() == removeButton) {
        int selectedIndex = listBox.getSelectedIndex();
        if (selectedIndex != -1) {
            items.remove(selectedIndex);
            listBox.remove(selectedIndex);
        }
    }
}

public static void main(String args[]) {
    new ListBoxDemo();
}

}