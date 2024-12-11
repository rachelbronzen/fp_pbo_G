import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MainGUI {
    private Chatbot chatbot;

    public MainGUI() {
        chatbot = new Chatbot();
        for(Resep resep : DatabaseResep.getDaftarResep()){
            chatbot.tambahResep(resep);
        }

        JFrame frame = new JFrame("Chatty the Chef");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel chatPanel = new JPanel();
        chatPanel.setLayout(new BoxLayout(chatPanel, BoxLayout.Y_AXIS));
        chatPanel.setBackground(Color.WHITE);

        JScrollPane scrollPane = new JScrollPane(chatPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        frame.add(scrollPane, BorderLayout.CENTER);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BorderLayout());

        JTextField inputField = new JTextField();
        JButton sendButton = new JButton("Kirim");

        inputPanel.add(inputField, BorderLayout.CENTER);
        inputPanel.add(sendButton, BorderLayout.EAST);
        frame.add(inputPanel, BorderLayout.SOUTH);

        sendButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String input = inputField.getText();
                inputField.setText(""); 

                addChatBubble(chatPanel, input, true);

                if(input.equalsIgnoreCase("exit")){
                    addChatBubble(chatPanel, "Terima kasih sudah menggunakan Chatty the Chef!", false);
                    JOptionPane.showMessageDialog(frame, "Terima kasih sudah menggunakan Chatty the Chef!", "Keluar", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                } else if(chatbot.periksaKataHello(input)){
                    addChatBubble(chatPanel, "Selamat Datang di Chatty the Chef! Ada yang bisa saya bantu?", false);
                }else if(chatbot.periksaKataBingung(input)){
                    addChatBubble(chatPanel, "Jika Anda bingung ingin mencoba memasak apa, ketik 'Food List'.", false);
                } else if(input.equalsIgnoreCase("Food List")){
                    addChatBubble(chatPanel, "Kategori makanan:\n" + chatbot.tampilkanKategori(), false);
                } else {
                    String namaMakanan = chatbot.ekstrakNamaMakanan(input);
                    if(namaMakanan != null){
                        Resep hasil = chatbot.cariResep(namaMakanan);
                        addChatBubble(chatPanel, chatbot.tampilkanResep(hasil), false);
                    } else {
                        addChatBubble(chatPanel, "Maaf, saya belum mengenali makanan tersebut.", false);
                    }
                }

                chatPanel.revalidate();
                JScrollBar verticalScrollBar = scrollPane.getVerticalScrollBar();
                verticalScrollBar.setValue(verticalScrollBar.getMaximum());
            }
        });

        frame.setVisible(true);
    }

    private void addChatBubble(JPanel chatPanel, String message, boolean isUser){
        JPanel bubblePanel = new JPanel();
        bubblePanel.setLayout(new BoxLayout(bubblePanel, BoxLayout.Y_AXIS));
    
        JLabel messageLabel = new JLabel("<html><p>" + message + "</p></html>");
        messageLabel.setOpaque(true);
        messageLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); 
        messageLabel.setBackground(isUser ? new Color(173, 216, 230) : new Color(240, 240, 240));
    
        bubblePanel.setAlignmentX(isUser ? Component.LEFT_ALIGNMENT : Component.RIGHT_ALIGNMENT);
        bubblePanel.add(messageLabel);

        chatPanel.add(bubblePanel);
        chatPanel.add(Box.createVerticalStrut(10));
        chatPanel.revalidate();
        chatPanel.repaint();
    }
    

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainGUI());
    }
}
