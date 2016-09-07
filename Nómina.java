//Javier Mercado Ruiz
// Programa #1
//Prof. William Muñiz


//Importar librerias
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.util.*;
import java.text.DecimalFormat;


//Declarar programa
public class Nómina extends Applet implements ActionListener
{

//Declarar variables
String Nombre, Numero;
float h, s, ss, c, r, pm, sb, td, sn, ss2, c2, r2; //horas, salario, seguro social, contribuciones, retiro, plan medico, salario bruto, total deducciones, salario neto


//Declarar objetos
Label lblTitulo = new Label(" Nómina ");
Label lblNombre = new Label("Nombre del empleado:");
TextField txtNombre = new TextField(16);
Label lblNumero = new Label("Número de empleado:");
TextField txtNumero = new TextField(10);
Label lblHoras = new Label("Horas trabajadas:");
TextField txtHoras = new TextField(4);
Label lblSalario = new Label("Salario por hora:");
TextField txtSalario = new TextField(6);
Label lblSeguroSocial = new Label("Deducción de Seguro Social:");
TextField txtSeguroSocial = new TextField(6);
Label lblContribuciones = new Label("Deducción de Contribuciones:");
TextField txtContribuciones = new TextField(6);
Label lblRetiro = new Label("Deducción de Retiro:");
TextField txtRetiro = new TextField(6);
Label lblPlanMedico = new Label("Plan Médico:");
TextField txtPlanMedico = new TextField(7);
Button btnCalcular = new Button("Calcular");

//Objetos de Mostrar Resultados
Label lblSalarioBruto = new Label("Salario Bruto:");
TextField txtSalarioBruto = new TextField(8);
Label lblDeducciones = new Label("Deducciones:");
Label lblSeguroSocial2 = new Label("Seguro Social:");
TextField txtSeguroSocial2 = new TextField(8);
Label lblContribuciones2 = new Label("Contribuciones:");
TextField txtContribuciones2 = new TextField(8);
Label lblRetiro2 = new Label("Retiro:");
TextField txtRetiro2 = new TextField(8);
Label lblPlanMedico2 = new Label("Plan Médico:");
TextField txtPlanMedico2 = new TextField(7);
Label lblTotalDeducciones = new Label("Total de deducciones:");
TextField txtTotalDeducciones = new TextField(7);
Label lblSalarioNeto = new Label("Salario Neto:");
TextField txtSalarioNeto = new TextField(8);

//Formato
DecimalFormat dolar = new DecimalFormat("$###,###,###.00");

//Imagen
Image logo;


//Inicializar programa
public void init()
{
//Color de fondo y letras
	setBackground(Color.lightGray);
	setForeground(Color.blue);


//A~adir objetos
 add(lblTitulo);
 add(lblNombre);
 add(lblNumero);
 add(lblHoras);
 add(lblSalario);
 add(lblSeguroSocial);
 add(lblSeguroSocial2);
 add(lblContribuciones);
 add(lblContribuciones2);
 add(lblRetiro);
 add(lblRetiro2);
 add(lblPlanMedico);
 add(lblPlanMedico2);
 add(lblSalarioBruto);
 add(lblTotalDeducciones);
 add(lblSalarioNeto);
 add(txtNombre);
 add(txtNumero);
 add(txtHoras);
 add(txtSalario);
 add(lblDeducciones);
 add(txtSeguroSocial);
 add(txtSeguroSocial2);
 add(txtContribuciones);
 add(txtContribuciones2);
 add(txtRetiro);
 add(txtRetiro2);
 add(txtPlanMedico);
 add(txtPlanMedico2);
 add(txtSalarioBruto);
 add(txtTotalDeducciones);
 add(txtSalarioNeto);
 add(btnCalcular);
btnCalcular.addActionListener(this);
logo = getImage(getDocumentBase(),"Payroll1.png");

//Textbox con los valores fijos
txtSeguroSocial.setText("0.06");
txtContribuciones.setText("0.08");
txtRetiro.setText("0.08");
txtPlanMedico.setText("$100.00");
}

public void actionPerformed(ActionEvent k)
{
//Programar boton

//Mover valores a los TextField
Nombre = txtNombre.getText();
Numero = txtNumero.getText();
 h = Float.parseFloat(txtHoras.getText());
 s = Float.parseFloat(txtSalario.getText());
 ss = Float.parseFloat(txtSeguroSocial.getText());
 c = Float.parseFloat(txtContribuciones.getText());
 r = Float.parseFloat(txtRetiro.getText());

 //pm = Float.parseFloat(txtPlanMedico.getText());
pm = 100;  //Para que el textbox de Plan Medico tenga formato y no cause problemas

 //Calculos
 sb = s*h;
 ss2 = sb * ss;
 c2 = sb *c;
 r2 = sb * r;
 td = ss2 + c2 + r2 + pm;
 sn = sb - td;

//Mostrar resultados
txtSalarioBruto.setText("" + dolar.format(sb));
txtSeguroSocial2.setText("" + dolar.format(ss2));
txtContribuciones2.setText("" + dolar.format(c2));
txtRetiro2.setText("" + dolar.format(r2));
txtPlanMedico2.setText("" + dolar.format(pm));
txtTotalDeducciones.setText("" + dolar.format(td));
txtSalarioNeto.setText("" + dolar.format(sn));
}


public void paint(Graphics g)
{
lblTitulo.setForeground(Color.black); //Color del titulo
lblTitulo.setLocation(170,10);
lblNombre.setLocation(10,50);
txtNombre.setLocation(150,50);
lblNumero.setLocation(10,80);
txtNumero.setLocation(150,80);
lblHoras.setLocation(10,110);
txtHoras.setLocation(150,110);
lblSalario.setLocation(10,140);
txtSalario.setLocation(130,140);
lblSeguroSocial.setLocation(10,170);
txtSeguroSocial.setLocation(200,170);
lblContribuciones.setLocation(10,200);
txtContribuciones.setLocation(200,200);
lblRetiro.setLocation(10,230);
txtRetiro.setLocation(150,230);
lblPlanMedico.setLocation(10,260);
txtPlanMedico.setLocation(100,260);
btnCalcular.setLocation(140,300);

btnCalcular.setBackground(Color.yellow); //Color del boton

//Resultados
lblSalarioBruto.setLocation(10,340);
txtSalarioBruto.setLocation(100,340);

lblDeducciones.setLocation(10,370);

lblSeguroSocial2.setLocation(50,400);
txtSeguroSocial2.setLocation(150,400);

lblContribuciones2.setLocation(50,430);
txtContribuciones2.setLocation(150,430);

lblRetiro2.setLocation(50,460);
txtRetiro2.setLocation(150,460);

lblPlanMedico2.setLocation(50,490);
txtPlanMedico2.setLocation(150,490);
lblTotalDeducciones.setForeground(Color.red); //Rojo significado de Negativo o que va restado.
txtTotalDeducciones.setForeground(Color.red); //Rojo significado de Negativo o que va restado.
lblTotalDeducciones.setLocation(10,520);
txtTotalDeducciones.setLocation(150,520);
lblSalarioNeto.setLocation(10,550);
txtSalarioNeto.setLocation(120,550);

g.drawImage(logo,200,215, this);


}
}
