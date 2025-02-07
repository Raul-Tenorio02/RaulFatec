package Exercicios.Ex32;

import javax.swing.*;
import java.awt.event.*;

public class Calculadora extends JFrame{

    private JButton num1, num2, num3, num4, num5, num6, num7, num8, num9, num0;
    private JButton soma, subtrair, multiplicar, dividir, igual, corrigir;
    private JTextField display;
    private int input, numAnterior;
    private char operador;
    private boolean novoCalculo, erroDivisao;

    public Calculadora() {
        this.setTitle("Calculadora:");
        this.setBounds(75, 75, 294, 350);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setLayout(null);

        input = 0;
        numAnterior = 0;
        novoCalculo = false;
        erroDivisao = false;

        soma = new JButton("+");
        soma.setBounds(205, 70, 45, 45);
        this.add(soma);

        subtrair = new JButton("-");
        subtrair.setBounds(205, 120, 45, 45);
        this.add(subtrair);

        multiplicar = new JButton("*");
        multiplicar.setBounds(205, 170, 45, 45);
        this.add(multiplicar);

        dividir = new JButton("/");
        dividir.setBounds(205, 220, 45, 45);
        this.add(dividir);

        igual = new JButton();
        igual.setText("=");
        igual.setBounds(145, 220, 45, 45);
        this.add(igual);

        num0 = new JButton();
        num0.setText("0");
        num0.setBounds(85, 220, 45, 45);
        this.add(num0);

        corrigir = new JButton();
        corrigir.setText("C");
        corrigir.setBounds(25, 220, 45, 45);
        this.add(corrigir);

        num1 = new JButton();
        num1.setText("1");
        num1.setBounds(25, 70, 45, 45);
        this.add(num1);

        num2 = new JButton();
        num2.setText("2");
        num2.setBounds(85, 70, 45, 45);
        this.add(num2);

        num3 = new JButton();
        num3.setText("3");
        num3.setBounds(145, 70, 45, 45);
        this.add(num3);

        num4 = new JButton();
        num4.setText("4");
        num4.setBounds(25, 120, 45, 45);
        this.add(num4);

        num5 = new JButton();
        num5.setText("5");
        num5.setBounds(85, 120, 45, 45);
        this.add(num5);

        num6 = new JButton();
        num6.setText("6");
        num6.setBounds(145, 120, 45, 45);
        this.add(num6);

        num7 = new JButton();
        num7.setText("7");
        num7.setBounds(25, 170, 45, 45);
        this.add(num7);

        num8 = new JButton();
        num8.setText("8");
        num8.setBounds(85, 170, 45, 45);
        this.add(num8);

        num9 = new JButton();
        num9.setText("9");
        num9.setBounds(145, 170, 45, 45);
        this.add(num9);

        display = new JTextField();
        display.setBounds(25, 25, 226, 35);
        this.add(display);

        num1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if (novoCalculo || erroDivisao) {
                    display.setText("");
                    novoCalculo = false;
                    erroDivisao = false;
                }
                input *= 10;
                input += 1;
                display.setText(display.getText() + "1");
            }
        });

        num2.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent evt) {
               if (novoCalculo || erroDivisao) {
                   display.setText("");
                   novoCalculo = false;
                   erroDivisao = false;
               }

               input *= 10;
               input += 2;
               display.setText(display.getText() + "2");
           }
        });

        num3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if (novoCalculo || erroDivisao) {
                    display.setText("");
                    novoCalculo = false;
                    erroDivisao = false;
                }

                input *= 10;
                input += 3;
                display.setText(display.getText() + "3");
            }
        });

        num4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if (novoCalculo || erroDivisao) {
                    display.setText("");
                    novoCalculo = false;
                    erroDivisao = false;
                }

                input *= 10;
                input += 4;
                display.setText(display.getText() + "4");
            }
        });

        num5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if (novoCalculo || erroDivisao) {
                    display.setText("");
                    novoCalculo = false;
                    erroDivisao = false;
                }

                input *= 10;
                input += 5;
                display.setText(display.getText() + "5");
            }
        });

        num6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if (novoCalculo || erroDivisao) {
                    display.setText("");
                    novoCalculo = false;
                    erroDivisao = false;
                }

                input *= 10;
                input += 6;
                display.setText(display.getText() + "6");
            }
        });

        num7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if (novoCalculo || erroDivisao) {
                    display.setText("");
                    novoCalculo = false;
                    erroDivisao = false;
                }

                input *= 10;
                input += 7;
                display.setText(display.getText() + "7");
            }
        });

        num8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if (novoCalculo || erroDivisao) {
                    display.setText("");
                    novoCalculo = false;
                    erroDivisao = false;
                }

                input *= 10;
                input += 8;
                display.setText(display.getText() + "8");
            }
        });

        num9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if (novoCalculo || erroDivisao) {
                    display.setText("");
                    novoCalculo = false;
                    erroDivisao = false;
                }

                input *= 10;
                input += 9;
                display.setText(display.getText() + "9");
            }
        });

        num0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if (novoCalculo) {
                    display.setText("");
                    novoCalculo = false;
                }
                display.setText(display.getText() + "0");
            }
        });

        soma.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt) {
                operador = '+';
                if(numAnterior == 0) {
                    numAnterior = input;
                } else {
                    numAnterior += input;
                }
                input = 0;
                display.setText("");
            }
        });

        subtrair.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                operador = '-';
                if (numAnterior == 0){
                    numAnterior = input;
                } else {
                    numAnterior -= input;
                }
                input = 0;
                display.setText("");
            }
        });

        multiplicar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                operador = '*';
                if (numAnterior == 0) {
                    numAnterior = input;
                } else {
                    numAnterior *= input;
                }
                input = 0;
                display.setText("");
            }
        });

        dividir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                operador = '/';
                if (input == 0) {
                    display.setText("Erro: divisão por zero!");
                    numAnterior = 0;
                    input = 0;
                    erroDivisao = true;
                    novoCalculo = true;
                } else {
                    if (numAnterior == 0) {
                        numAnterior = input;
                    } else {
                            numAnterior /= input;
                        }
                    input = 0;
                    display.setText("");
                }
            }
        });

        igual.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt) {
                if (erroDivisao) {
                    display.setText("Erro: divisão por zero!");
                    return;
                }

                switch (operador) {
                    case '+':
                        numAnterior += input;
                        break;
                    case '-':
                        numAnterior -= input;
                        break;
                    case '*':
                        numAnterior *= input;
                        break;
                    case '/':
                        if (input != 0) {
                            numAnterior /= input;
                        } else {
                            display.setText("Erro: divisão por zero!");
                            input = 0;
                            numAnterior = 0;
                            erroDivisao = true;
                            novoCalculo = true;
                            return;
                        }
                        break;
                }
                display.setText("" + numAnterior);
                novoCalculo = true;
                input = 0;
                numAnterior = 0;
                operador = ' ';
            }
        });

        corrigir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                String textoAtual = display.getText();

                if (!textoAtual.isEmpty()) {
                    textoAtual = textoAtual.substring(0, textoAtual.length() - 1);
                    display.setText(textoAtual);

                    if (!textoAtual.isEmpty()) {
                        input = Integer.parseInt(textoAtual);
                    } else {
                        input = 0;
                    }
                } else {
                    numAnterior = 0;
                    input = 0;
                    operador = ' ';
                    novoCalculo = true;
                    erroDivisao = false;
                    display.setText("");
                }
            }
        });
    }
}
