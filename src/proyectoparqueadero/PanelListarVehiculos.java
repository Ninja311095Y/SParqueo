
package proyectoparqueadero;

import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import Base_de_Datos.conexion;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class PanelListarVehiculos extends javax.swing.JPanel {

    /**
     * Creates new form PanelListarVehiculos
     */
    
    //INSTANCIAS Y VARIABLES
    conexion objcon = new conexion();
    String sql;
    String tipoVehiculo = "", estado = "", fecha = "";
    DefaultTableModel modelo;
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    Date date = new Date();
    
    public PanelListarVehiculos() {
        initComponents();
        
        objcon.crearConexion();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        JTF_Placa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVehiculos = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        rbEnParq = new javax.swing.JRadioButton();
        rbFueraParq = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        JButton_Buscar = new javax.swing.JButton();
        jButton_Cierre = new javax.swing.JButton();
        cbAuto = new javax.swing.JCheckBox();
        cbMoto = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setText("Buscar Vehiculos");

        jLabel2.setText("Placa");

        tblVehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Placa", "Propietario", "Tipo de Vehiculo", "Hora Entrada", "Hora Salida", "Pago"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblVehiculos);

        jLabel5.setText("Tipo Vehiculo");

        buttonGroup3.add(rbEnParq);
        rbEnParq.setText("En parqueadero");

        buttonGroup3.add(rbFueraParq);
        rbFueraParq.setText("Fuera de parqueadero");
        rbFueraParq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFueraParqActionPerformed(evt);
            }
        });

        jLabel6.setText("Ubicacion del vehiculo");

        JButton_Buscar.setText("Buscar");
        JButton_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_BuscarActionPerformed(evt);
            }
        });

        jButton_Cierre.setText("Cierre");
        jButton_Cierre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CierreActionPerformed(evt);
            }
        });

        cbAuto.setText("Automovil");

        cbMoto.setText("Motocicleta");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/shop-around-for-your-perfect-used-car.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(cbAuto)
                        .addGap(21, 21, 21)
                        .addComponent(cbMoto)
                        .addGap(40, 40, 40)
                        .addComponent(rbFueraParq)
                        .addGap(44, 44, 44)
                        .addComponent(rbEnParq))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.CENTER, layout.createSequentialGroup()
                                    .addGap(66, 66, 66)
                                    .addComponent(jLabel5)
                                    .addGap(199, 199, 199)
                                    .addComponent(jLabel6))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(195, 195, 195)
                                    .addComponent(JButton_Buscar)
                                    .addGap(98, 98, 98)
                                    .addComponent(jButton_Cierre)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(240, 240, 240)
                                .addComponent(jLabel2)))
                        .addGap(84, 84, 84)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JTF_Placa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(cbAuto)
                            .addComponent(cbMoto)
                            .addComponent(rbEnParq)
                            .addComponent(rbFueraParq))
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(104, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTF_Placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JButton_Buscar)
                            .addComponent(jButton_Cierre))
                        .addGap(52, 52, 52))))
        );
    }// </editor-fold>//GEN-END:initComponents
   
    //METODO PARA CREAR LA TABLA
    public void crearTabla(){
        
        TableColumnModel columnModel = tblVehiculos.getColumnModel();

        columnModel.getColumn(0).setPreferredWidth(40);
        columnModel.getColumn(1).setPreferredWidth(70);
        columnModel.getColumn(2).setPreferredWidth(150);
        columnModel.getColumn(3).setPreferredWidth(100);
        columnModel.getColumn(4).setPreferredWidth(70);
        columnModel.getColumn(5).setPreferredWidth(70);
        columnModel.getColumn(5).setPreferredWidth(100);
        
        modelo = (DefaultTableModel) tblVehiculos.getModel();
        modelo.setRowCount(0);
        
    } //Fin Crear Tabla
    
    //METODO PARA RELLENAR LA TABLA
    public void rellenarTabla(){
        try{
            
            modelo = (DefaultTableModel) tblVehiculos.getModel();
            modelo.setRowCount(0);
            
            sql = "SELECT * FROM vehiculos";
            objcon.ejecutarSQLSelect(sql);

            objcon.resultado.first();

            do {
                String horasalida = objcon.resultado.getString(6);
                String pago = objcon.resultado.getString(7);
                
                if (horasalida == null) {
                    
                    horasalida = "No ha salido";
                    pago = "0";
                    
                } else {
                    
                    horasalida = objcon.resultado.getString(6).substring(10).substring(0,6);
                    pago = objcon.resultado.getString(7);
                    
                }
                
                String[] fila = {objcon.resultado.getString(2),
                                 objcon.resultado.getString(3), objcon.resultado.getString(4), 
                                 objcon.resultado.getString(5).substring(10).substring(0, 6), horasalida, "$" + pago};
                modelo.addRow(fila);
                
            } while (objcon.resultado.next());
            
        } catch (SQLException ex) {
             Logger.getLogger(PanelListarVehiculos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//Fin rellenar Tabla
    
    //METODO PARA BUSCAR VEHICULO
    public void buscarVehiculo(){
        
        try {
            
            sql = "SELECT * FROM vehiculos WHERE estado='" + estado + "' AND tipovehiculo LIKE'%" + tipoVehiculo + "%' AND placa LIKE '%" + JTF_Placa.getText() + "%'";
            objcon.ejecutarSQLSelect(sql);

            objcon.resultado.first();

            do {
                String horasalida = objcon.resultado.getString(6);
                String pago;
                pago = objcon.resultado.getString(7);
                
                if (horasalida == null) {
                    
                    horasalida = "No ha salido";
                    pago = "0";
                    
                } else {
                    
                    horasalida = objcon.resultado.getString(6).substring(10).substring(0,6);
                    pago = objcon.resultado.getString(7);
                    
                }
                
                String[] fila = {objcon.resultado.getString(2),objcon.resultado.getString(3),
                    objcon.resultado.getString(4),objcon.resultado.getString(5).substring(10).substring(0, 6),
                    horasalida, "$" + pago};
                
                modelo.addRow(fila);
                
            } while (objcon.resultado.next());
            
        } catch (SQLException ex) {
            Logger.getLogger(PanelListarVehiculos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//Fin Buscar Vehiculo
    
    private void JButton_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_BuscarActionPerformed
      
         // TODO add your handling code here:
            
            if(cbAuto.isSelected()){
                
                tipoVehiculo = "Automovil";
                cbMoto.setSelected(false);
                
            } else if (cbMoto.isSelected()) {
                
                tipoVehiculo = "Motocicleta";
                cbAuto.setSelected(false);
            }
            
            if (rbFueraParq.isSelected()) {
                estado = "No Disponible";
            }
            if (rbEnParq.isSelected()) {
                estado = "Disponible";
            }
            
            crearTabla();
            
            buscarVehiculo();

    }//GEN-LAST:event_JButton_BuscarActionPerformed

    private void rbFueraParqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFueraParqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbFueraParqActionPerformed

    private void jButton_CierreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CierreActionPerformed
        
        try {
            // TODO add your handling code here:

            fecha = dateFormat.format(date);
            
            sql = "SELECT SUM(valorpagado)FROM vehiculos WHERE estado= 'No Disponible' AND horasalida LIKE '" + fecha + "%'";
            
            objcon.ejecutarSQLSelect(sql);
            
            objcon.resultado.first();
            
            
            DecimalFormat df = new DecimalFormat("#.00");
            Double IngresosTotales = Double.parseDouble(objcon.resultado.getString(1));
            	
            JOptionPane.showMessageDialog(null, "El ingreso total del dia seleccionado ets de : $ " 
                                                 + df.format(IngresosTotales) + " Pesos");
          
        }catch (SQLException ex){
           
           JOptionPane.showMessageDialog(null,"No se realizaron salidas el dia de hoy." );
                
           Logger.getLogger(PanelListarVehiculos.class.getName()).log(Level.SEVERE, null, ex);
            
        }


    }//GEN-LAST:event_jButton_CierreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButton_Buscar;
    private javax.swing.JTextField JTF_Placa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JCheckBox cbAuto;
    private javax.swing.JCheckBox cbMoto;
    private javax.swing.JButton jButton_Cierre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbEnParq;
    private javax.swing.JRadioButton rbFueraParq;
    private javax.swing.JTable tblVehiculos;
    // End of variables declaration//GEN-END:variables
}