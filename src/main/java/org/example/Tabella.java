package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;import java.io.StringWriter;

public class Tabella {

        private static void createAndShowGUI() {
            // Creare il frame
            JFrame frame = new JFrame("Scuola");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);

            // Creare il tabbed pane
            JTabbedPane tabbedPane = new JTabbedPane();

            // Creare una JTextArea per mostrare i risultati
            JTextArea textArea = new JTextArea();
            textArea.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(textArea);

            // Creare il primo pannello con 3 campi di inserimento
            JPanel panel1 = new JPanel();
            panel1.setLayout(new GridLayout(4, 2));  // Usare un GridLayout per una migliore disposizione

            panel1.add(new JLabel("Nome:"));
            JTextField nomeField1 = new JTextField();
            panel1.add(nomeField1);

            panel1.add(new JLabel("Cognome:"));
            JTextField cognomeField1 = new JTextField();
            panel1.add(cognomeField1);

            panel1.add(new JLabel("Materia:"));
            JTextField materiaField1 = new JTextField();
            panel1.add(materiaField1);

            // Creare il secondo pannello con 3 campi di inserimento
            JPanel panel2 = new JPanel();
            panel2.setLayout(new GridLayout(4, 2));  // Usare un GridLayout per una migliore disposizione

            panel2.add(new JLabel("Nome:"));
            JTextField nomeField2 = new JTextField();
            panel2.add(nomeField2);

            panel2.add(new JLabel("Cognome:"));
            JTextField cognomeField2 = new JTextField();
            panel2.add(cognomeField2);

            panel2.add(new JLabel("Materia:"));
            JTextField materiaField2 = new JTextField();
            panel2.add(materiaField2);

            // Aggiungere i pannelli al tabbed pane
            tabbedPane.addTab("Studente", panel1);
            tabbedPane.addTab("Professore", panel2);

            // Creare un pannello principale per contenere il tabbed pane e il pulsante OK
            JPanel mainPanel = new JPanel();
            mainPanel.setLayout(new BorderLayout());
            mainPanel.add(tabbedPane, BorderLayout.CENTER);

            // Creare il pulsante OK
            JButton okButton = new JButton("OK");
            okButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Raccogliere i dati dal primo tab
                    String nome1 = nomeField1.getText();
                    String cognome1 = cognomeField1.getText();
                    String materia1 = materiaField1.getText();

                    // Raccogliere i dati dal secondo tab
                    String nome2 = nomeField2.getText();
                    String cognome2 = cognomeField2.getText();
                    String materia2 = materiaField2.getText();

                    // Stampare i dati nella JTextArea
                    textArea.append("Studente - Nome: " + nome1 + ", Cognome: " + cognome1 + ", Materia: " + materia1 + "\n");
                    textArea.append("Professore - Nome: " + nome2 + ", Cognome: " + cognome2 + ", Materia: " + materia2 + "\n");

                    // Svuotare i campi di testo
                    nomeField1.setText("");
                    cognomeField1.setText("");
                    materiaField1.setText("");
                    nomeField2.setText("");
                    cognomeField2.setText("");
                    materiaField2.setText("");
                }
            });

            // Aggiungere il pulsante OK al pannello principale
            mainPanel.add(okButton, BorderLayout.SOUTH);

            // Aggiungere il pannello principale al frame
            frame.getContentPane().add(mainPanel, BorderLayout.CENTER);
            frame.getContentPane().add(scrollPane, BorderLayout.EAST);

            // Rendere visibile il frame
            frame.setVisible(true);
        }

        public static void main(String[] args) {
            // Eseguire l'interfaccia grafica nel thread dell'Event Dispatch Thread
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    createAndShowGUI();
                }
            });
        }
    }


