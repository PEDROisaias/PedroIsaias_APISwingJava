import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CadastroColono {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Cadastro Colono!");
        frame.setSize(100,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3,2));

        //Labels
        JLabel labelName = new JLabel("Nome: ");
        JLabel labelEmail = new JLabel("E-mail: ");
        JLabel labelIdade = new JLabel("Idade: ");

        //Fields of Text
        JTextField campoNome = new JTextField(34);
        JTextField campoEmail = new JTextField(34);
        JTextField campoIdade = new JTextField(34);

        //Button
        JButton btnCadastrar = new JButton("Cadastrar Colono");


        // Action Button
        btnCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nomeColono = campoNome.getText();
                String emailColono = campoEmail.getText();
                String idadeColono = campoIdade.getText();

                JOptionPane.showMessageDialog(frame, "Usuário cadastrado:");
            }
        });
    }
}
