package window;

import clasesPrinciales.EvalVisitor;
import com.sun.deploy.panel.JSmartTextArea;
import org.antlr.v4.runtime.misc.Utils;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import generateClass.*;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.tree.Tree;

import static org.antlr.v4.runtime.tree.Trees.getNodeText;


public class IdePrincipal {
    //creacion de elementos de GUI
    public JPanel pabelPricipal;
    private JTabbedPane tabs1;
    private JTextArea taEditor;
    private JButton compilarButton;
    private JButton borrarTextoButton;
    private JTextField txtDirectorio;
    private JButton btnSeachGramatica;
    private JScrollPane scr_Editor;
    private JButton btn_cargar;
    public  JTextArea txtErrores;
    private JPanel pnlImagenTree;
    private JScrollPane scrllPaneImagenArbol;
    private JPanel panelImagen;
    private JPanel panelForJtree;
    private JPanel pnl_intermedio;
    private JScrollPane scroll_cod_intermedio;
    private JTextArea txt_area_intermedio;
    private JPanel pnl_cObjeto;
    private JScrollPane scroll_cod_objeto;
    private JTextArea txt_area_objeto;
    private String directorio;

    public IdePrincipal() {
        btnSeachGramatica.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFileChooser chooser = new JFileChooser();
                chooser.setCurrentDirectory(new java.io.File("./src"));
                chooser.setDialogTitle("Seleccione la ubiccaccion para guardar");
                chooser.setFileFilter(new FileNameExtensionFilter("Text File (.txt)", "txt"));

                // Demonstrate "Save" dialog:
                int rVal = chooser.showSaveDialog(null);
                if (rVal == JFileChooser.APPROVE_OPTION) {
                    FileWriter fichero = null;
                    PrintWriter pw;
                    try
                    {
                        fichero = new FileWriter(chooser.getSelectedFile().getName());
                        pw = new PrintWriter(fichero);
                        pw.println(taEditor.getText());
                    }
                    catch (Exception e1) {
                        e1.printStackTrace();
                    }
                    finally {
                        txtDirectorio.setText(chooser.getSelectedFile().getName());
                        try {
                            // asegurarnos que se cierra el fichero.
                            if (null != fichero)
                                fichero.close();
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                }
                if (rVal == JFileChooser.CANCEL_OPTION) {

                }

            }
        });
        borrarTextoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                taEditor.setText("");
                txtErrores.setText("");
            }
        });
        compilarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //aca se interactuara con antlr y el resto de los componentes
                String texto = taEditor.getText();
                CustomErrorListener.buf.setLength(0);
                CharStream stream =  CharStreams.fromString(texto);
                ProgramLexer lexer  = new ProgramLexer(stream);
                TokenStream tokenStream = new CommonTokenStream(lexer);
                ProgramParser parser = new ProgramParser(tokenStream);
                //para errores
                parser.removeErrorListeners(); // remove ConsoleErrorListener
                parser.addErrorListener(new CustomErrorListener()); // add ours
                ParseTree tree = parser.proram();

                //haciendo el parseo por medio del visitor
                EvalVisitor eval = new EvalVisitor();
                eval.visit(tree);
                eval.haveMain();
                //imprimiendo errores de parseo
                if (eval.getErrorsMsg().equals("")) {
                    txtErrores.setText("Compilado Exitoso!");
                } else {
                    txtErrores.setText(eval.getErrorsMsg());
                }


                //mostrar arboles en Jtree
                panelForJtree.removeAll();
                panelForJtree.updateUI();
                JTree arbolPro = createTree(tree, parser);
                panelForJtree.add(arbolPro);


                //mostrar arbol grafico
                panelImagen.removeAll();
                panelImagen.updateUI();
                TreeViewer viewr = new TreeViewer(Arrays.asList(
                        parser.getRuleNames()),tree);
                panelImagen.add(viewr);
                // show errors
                String textoDeErrores = CustomErrorListener.buf.toString();
                if(!textoDeErrores.equals("")) {
                    txtErrores.setText(textoDeErrores);
                }
            }
        });

        //permite cargar un archivo
        btn_cargar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                chooser.setCurrentDirectory(new java.io.File("./src"));
                chooser.setDialogTitle("Seleccione su archivo");
                chooser.setFileFilter(new FileNameExtensionFilter("text file (.txt)", "txt"));
                int returnVal = chooser.showOpenDialog(null);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    String filePath=chooser.getSelectedFile().toString();
                    try{
                        File userFile=new File(filePath);
                        Scanner scan=new Scanner(userFile);
                        taEditor.setText(""); // clear
                        while (scan.hasNextLine()){
                            String line = scan.nextLine();
                            taEditor.append(line);
                            taEditor.append("\n");
                        }
                        taEditor.setEnabled(true);
                        txtDirectorio.setText(chooser.getSelectedFile().getName());
                    }
                    catch (IOException e1){
                        e1.printStackTrace();
                    }
                }
            }
        });

    }
    //para crear el jtree
    private void createNodes(DefaultMutableTreeNode top) {
        DefaultMutableTreeNode category = null;
        DefaultMutableTreeNode book = null;

        category = new DefaultMutableTreeNode("Books for Java Programmers");
        top.add(category);

        category = new DefaultMutableTreeNode("Books for Java Implementers");
        top.add(category);

    }
    private DefaultMutableTreeNode traverseTree(Tree t, List<String> ruleNames) {
        String s = Utils.escapeWhitespace(getNodeText(t,  ruleNames), false);

        if (t.getChildCount() == 0) {
            return new DefaultMutableTreeNode(s);
        } else {
            DefaultMutableTreeNode tempParent = new DefaultMutableTreeNode(s);  //s solo es el nombre del nodo

            for(int i = 0; i < t.getChildCount(); ++i) {
                tempParent.add(traverseTree(t.getChild(i), ruleNames));
            }
            return tempParent;
        }
    }
    private JTree createTree(ParseTree tree, ProgramParser parser){
        DefaultMutableTreeNode root = traverseTree(tree, Arrays.asList(parser.getRuleNames()));
        return new JTree(root);
    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
        txtDirectorio = new JTextField();
        txtDirectorio.setEditable(true);
        // creando objetos para el editor de texto
        scr_Editor = new JScrollPane();
        taEditor = new JSmartTextArea();
        taEditor.setEditable(true);
        taEditor.setFocusable(true);
        scr_Editor.add(taEditor);
        txtErrores = new JTextArea();
        txtErrores.setEditable(false);
        panelImagen = new JPanel();
        panelForJtree = new JPanel();
        TextLineNumber ln = new TextLineNumber(taEditor);
        scr_Editor.setRowHeaderView(ln);
        //para panel de codigo intermedio
        scroll_cod_intermedio = new JScrollPane();
        txt_area_intermedio = new JSmartTextArea();
        txt_area_intermedio.setEditable(true);
        txt_area_intermedio.setFocusable(true);
        TextLineNumber ln2 = new TextLineNumber(txt_area_intermedio);
        scroll_cod_intermedio.setRowHeaderView(ln2);
        //para panel de codigo objeto
        scroll_cod_objeto = new JScrollPane();
        txt_area_objeto = new JSmartTextArea();
        txt_area_objeto.setEditable(true);
        txt_area_objeto.setFocusable(true);
        TextLineNumber ln3 = new TextLineNumber(txt_area_objeto);
        scroll_cod_objeto.setRowHeaderView(ln3);

    }

    // tomada del libro definitive guide for antlv4  capitulo 9
    public static class CustomErrorListener extends BaseErrorListener {
        public static StringBuilder buf = new StringBuilder();
        @Override
        public void syntaxError(Recognizer<?, ?> recognizer,
                                Object offendingSymbol,
                                int line, int charPositionInLine,
                                String msg,
                                RecognitionException e)
        {
            List<String> stack = ((Parser)recognizer).getRuleInvocationStack();
            Collections.reverse(stack);

            buf.append("En regla: "+stack+" ");
            buf.append("Linea "+line+":"+charPositionInLine+" en "+
                    offendingSymbol+": "+msg +"\n");

        }
    }

}
