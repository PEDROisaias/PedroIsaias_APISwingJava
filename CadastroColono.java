import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CadastroColono {

    // private static final Pattern EMAIL_PATTERN = 
    //     Pattern.compile("/w+[@](gmail|hotmail|outlook|yahoo|live)[.](com|gov)([.][/w])+?", Pattern.CASE_INSENSITIVE);
    public static void main(String[] args) {
        // Configuração da Janela
        JFrame frame = new JFrame("SISTEMA DE CADASTRO DE COLONOS!");
        frame.setSize(1200, 900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Labels
        JLabel labelName = new JLabel("Nome: ");
        JLabel labelEmail = new JLabel("E-mail: ");
        JLabel labelIdade = new JLabel("Idade: ");

        // Fields of Text
        JTextField campoNome = new JTextField(24);
        JTextField campoEmail = new JTextField(24);
        JTextField campoIdade = new JTextField(3);
        JTextField campoGenero = new JTextField(12);
        campoGenero.setEnabled(false);

        // Buttons
        JButton btnCadastrar = new JButton("Cadastrar Colono");
        JButton btnLimpar = new JButton("Limpar");

        // JradioButtons para a escolha de genero
        JRadioButton masculinoRadioButton = new JRadioButton("Masculino", false);
        JRadioButton femininoRadioButton = new JRadioButton("Feminino", false);
        JRadioButton outroGeneroRadioButton = new JRadioButton("Outro", false);
        
        ButtonGroup escolhaGenero = new ButtonGroup();
        escolhaGenero.add(masculinoRadioButton);
        escolhaGenero.add(femininoRadioButton);
        escolhaGenero.add(outroGeneroRadioButton);

        outroGeneroRadioButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                campoGenero.setEnabled(outroGeneroRadioButton.isSelected());
            }
        });


        // Action Button do Cadastro
        btnCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nomeColono = campoNome.getText().toUpperCase();
                String emailColono = campoEmail.getText().toLowerCase();
                String idadeColono = campoIdade.getText();
                
                // Escolha do Genero baseado nos RadiosButton
                String generoColono = "";
                if (masculinoRadioButton.isSelected()) {
                    generoColono = "MASCULINO";
                } else if (femininoRadioButton.isSelected()) {
                    generoColono = "FEMININO";
                } else if (outroGeneroRadioButton.isSelected()) {
                    generoColono = campoGenero.getText().toUpperCase();
                }

                // Validação e traramento dos dados
                if (nomeColono.isEmpty() || emailColono.isEmpty() || idadeColono.isEmpty() ) {
                    JOptionPane.showMessageDialog(frame, "ATENÇÃO!! \nPreencha todos os campos para concluir o cadastro.");
                } else {
                    JOptionPane.showMessageDialog(frame, "COLONO CADASTRADO: \n " + "Nome:  " + nomeColono + "\n E-mail:  " + emailColono + "\n  Idade:  " + idadeColono + "\n  Gênero:  " + generoColono);
                }
                

            }
        });

        // Action Button do Limpar
        btnLimpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                campoNome.setText(null);
                campoEmail.setText(null);
                campoIdade.setText(null);
                campoGenero.setText(null);
                escolhaGenero.clearSelection();
            }
        });

        // Colocando os compoonentes no frame
        frame.add(labelName);
        frame.add(campoNome);
        frame.add(labelEmail);
        frame.add(campoEmail);
        frame.add(labelIdade);
        frame.add(campoIdade);
        frame.add(masculinoRadioButton);
        frame.add(femininoRadioButton);
        frame.add(outroGeneroRadioButton);
        frame.add(campoGenero);
        frame.add(btnCadastrar);
        frame.add(btnLimpar);

        // Tornando a janela visivel
        frame.setVisible(true);
    }
}
