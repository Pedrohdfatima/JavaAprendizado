
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
    
public class Aula5 {
    public static void main(String[] args) {
// Definindo oq é A janela;
    JFrame janela = new JFrame();

// Colocando Conteudo; 
// Tudo que for conteudo deve ser colocado com J no inicio, J é o JavaFX;
// JButton, JTextArea, JLabell, etc...
    JButton botao = new JButton("Clique Aqui");

// Adicionar Botão na Janela
    janela.add(botao);
    botao.setBounds(150, 120, 200, 100);
    botao.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
           
        }
    });



    // Definindo LAYOUT NULL para janela para ter liberdade de edição dos componentes
    janela.setLayout(null);
// Definindo Visibilidade, tamannho, local de inicio, e parar aplicação quando encerrado;
    janela.setBounds(700, 200, 500, 500);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    janela.setVisible(true);
        


    }
}


// JavaFX
// 