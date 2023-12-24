package Lima;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

public class Chat3 extends JFrame {
    private JPanel cards;
    private CardLayout cardLayout;
    private JPanel mainMenu;
    private JPanel selectContactMenu;
    private HashMap<String, ChatPanel> chatPanels;  // Menyimpan panel chat untuk setiap kontak
    private ArrayList<String> contactList; // Menyimpan daftar kontak

    public Chat3() {
        setTitle("Chat Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        cardLayout = new CardLayout();
        cards = new JPanel(cardLayout);

        mainMenu = new JPanel();
        JButton selectContactButton = new JButton("Pilih Kontak");
        selectContactButton.addActionListener(e -> cardLayout.show(cards, "selectContact"));
        mainMenu.add(selectContactButton);

        selectContactMenu = new JPanel();
        chatPanels = new HashMap<>();
        contactList = new ArrayList<>();

        // Tambahkan contoh kontak

        JButton addContactButton = new JButton("Tambah Kontak");
        addContactButton.addActionListener(e -> addContact());
        selectContactMenu.add(addContactButton);

        cards.add(mainMenu, "main");
        cards.add(selectContactMenu, "selectContact");

        add(cards);
    }

    private void addContact() {
        String newContact = JOptionPane.showInputDialog(this, "Masukkan nama kontak baru:");
        if (newContact != null && !newContact.trim().isEmpty()) {
            addContact(newContact);
        }
    }

    private void addContact(String contact) {
    	if (!contactList.contains(contact)) {
            JButton contactButton = new JButton(contact);
            contactButton.addActionListener(e -> showChatPanel(contact));
            selectContactMenu.add(contactButton);

            contactList.add(contact);
            cards.revalidate();
            cards.repaint();
        }
    }

    private void showChatPanel(String contact) {
        if (!chatPanels.containsKey(contact)) {
            ChatPanel chatPanel = new ChatPanel(contact);
            chatPanels.put(contact, chatPanel);
            cards.add(chatPanel, contact);
        }
        cardLayout.show(cards, contact);
    }

    private class ChatPanel extends JPanel {
        private JTextArea chatArea;
        private JTextField inputField;
        private ArrayList<String> messages;

        public ChatPanel(String contact) {
            setLayout(new BorderLayout());

            chatArea = new JTextArea();
            chatArea.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(chatArea);
            add(scrollPane, BorderLayout.CENTER);

            inputField = new JTextField();
            inputField.addActionListener(e -> sendMessage(contact));
            JButton backButton = new JButton("Back");
            backButton.addActionListener(e -> cardLayout.show(cards, "selectContact"));
            JPanel inputPanel = new JPanel(new BorderLayout());
            inputPanel.add(inputField, BorderLayout.CENTER);
            inputPanel.add(backButton, BorderLayout.EAST);
            add(inputPanel, BorderLayout.SOUTH);

            messages = new ArrayList<>();
        }

        private void sendMessage(String contact) {
            String message = inputField.getText();
            if (!message.isEmpty()) {
                chatArea.append("You: " + message + "\n");
                inputField.setText("");
                messages.add("You: " + message);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Chat3();
            }
        });
    }
}