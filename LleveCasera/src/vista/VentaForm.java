package vista;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.ClienteDAO;
import modelo.Producto;
import modelo.ProductoDAO;

public class VentaForm extends javax.swing.JInternalFrame {
    
    ClienteDAO clienteDAO = new ClienteDAO();
    Cliente cliente = new Cliente();

    ProductoDAO productoDAO = new ProductoDAO();
    Producto producto = new Producto();
    
    DefaultTableModel defaultTableModel = new DefaultTableModel();

    int id;
    
    public VentaForm() {
        initComponents();
        llenarComboProducto();
    }
    
    void llenarComboProducto(){
        ArrayList<String> lista = new ArrayList<String>();
        lista = productoDAO.listarProducto();
        for (int i = 0; i < lista.size(); i++) {
            jComboBoxNombreProducto.addItem(lista.get(i));
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPanelTitulo = new javax.swing.JPanel();
        jLabelLogo = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelCelular = new javax.swing.JLabel();
        jLabelN = new javax.swing.JLabel();
        jLabelSerie = new javax.swing.JLabel();
        jPanelMenu = new javax.swing.JPanel();
        jLabelDNI = new javax.swing.JLabel();
        jLabelBuscarProducto = new javax.swing.JLabel();
        jLabelPrecio = new javax.swing.JLabel();
        jLabelCantidad = new javax.swing.JLabel();
        jTextFieldDNI = new javax.swing.JTextField();
        jTextFieldPrecio = new javax.swing.JTextField();
        jSpinnerCantidad = new javax.swing.JSpinner();
        jButtonBuscarCliente = new javax.swing.JButton();
        jButtonBuscarProducto = new javax.swing.JButton();
        jButtonAgregar = new javax.swing.JButton();
        jButtonValidar = new javax.swing.JButton();
        jLabelCliente = new javax.swing.JLabel();
        jLabelProducto = new javax.swing.JLabel();
        jLabelStock = new javax.swing.JLabel();
        jLabelVendedor = new javax.swing.JLabel();
        jTextFieldCliente = new javax.swing.JTextField();
        jTextFieldProducto = new javax.swing.JTextField();
        jTextFieldStock = new javax.swing.JTextField();
        jTextFieldVendedor = new javax.swing.JTextField();
        jTextFieldBuscarProducto = new javax.swing.JTextField();
        jComboBoxNombreProducto = new javax.swing.JComboBox<>();
        jPanelTabla = new javax.swing.JPanel();
        jScrollPaneTabla = new javax.swing.JScrollPane();
        jTableVenta = new javax.swing.JTable();
        jPanelVenta = new javax.swing.JPanel();
        jButtonCancelar = new javax.swing.JButton();
        jButtonVenta = new javax.swing.JButton();
        jLabelTotal = new javax.swing.JLabel();
        jTextFieldTotal = new javax.swing.JTextField();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setTitle("Ventas");

        jPanelTitulo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/img/logo.png"))); // NOI18N

        jLabelTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelTitulo.setText("Sistema de ventas");

        jLabelCelular.setText("Celular: 997045329");

        jLabelN.setText("N°");

        jLabelSerie.setText("000000");

        javax.swing.GroupLayout jPanelTituloLayout = new javax.swing.GroupLayout(jPanelTitulo);
        jPanelTitulo.setLayout(jPanelTituloLayout);
        jPanelTituloLayout.setHorizontalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLogo)
                .addGap(256, 256, 256)
                .addGroup(jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTituloLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabelCelular))
                    .addGroup(jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanelTituloLayout.createSequentialGroup()
                            .addComponent(jLabelN)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabelSerie)
                            .addGap(48, 48, 48))
                        .addComponent(jLabelTitulo, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelTituloLayout.setVerticalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTituloLayout.createSequentialGroup()
                        .addComponent(jLabelTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelCelular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelSerie)
                            .addComponent(jLabelN)))
                    .addComponent(jLabelLogo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelMenu.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelDNI.setText("DNI");

        jLabelBuscarProducto.setText("Producto");

        jLabelPrecio.setText("Precio");

        jLabelCantidad.setText("Cantidad");

        jButtonBuscarCliente.setText("Buscar");
        jButtonBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarClienteActionPerformed(evt);
            }
        });

        jButtonBuscarProducto.setText("Buscar");
        jButtonBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarProductoActionPerformed(evt);
            }
        });

        jButtonAgregar.setText("Agregar");

        jButtonValidar.setText("Validar");

        jLabelCliente.setText("Cliente");

        jLabelProducto.setText("Producto");

        jLabelStock.setText("Stock");

        jLabelVendedor.setText("Vendedor");

        jComboBoxNombreProducto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxNombreProductoItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenu.setLayout(jPanelMenuLayout);
        jPanelMenuLayout.setHorizontalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDNI)
                    .addComponent(jLabelBuscarProducto)
                    .addComponent(jLabelPrecio)
                    .addComponent(jLabelCantidad))
                .addGap(16, 16, 16)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldDNI)
                    .addComponent(jTextFieldPrecio)
                    .addComponent(jSpinnerCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelMenuLayout.createSequentialGroup()
                        .addComponent(jTextFieldBuscarProducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButtonBuscarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                        .addComponent(jButtonBuscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                        .addComponent(jButtonValidar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButtonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addComponent(jLabelCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addComponent(jLabelVendedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(jTextFieldVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addComponent(jLabelProducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addComponent(jLabelStock)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldStock, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDNI)
                    .addComponent(jLabelCliente)
                    .addComponent(jTextFieldCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBoxNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelBuscarProducto)
                        .addComponent(jLabelProducto)
                        .addComponent(jTextFieldProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPrecio)
                    .addComponent(jLabelStock)
                    .addComponent(jTextFieldStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonValidar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jSpinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelCantidad)
                        .addComponent(jLabelVendedor)
                        .addComponent(jTextFieldVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanelTabla.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "ID", "Producto", "Cantidad", "Precio", "Total"
            }
        ));
        jTableVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableVentaMouseClicked(evt);
            }
        });
        jScrollPaneTabla.setViewportView(jTableVenta);

        javax.swing.GroupLayout jPanelTablaLayout = new javax.swing.GroupLayout(jPanelTabla);
        jPanelTabla.setLayout(jPanelTablaLayout);
        jPanelTablaLayout.setHorizontalGroup(
            jPanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 829, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelTablaLayout.setVerticalGroup(
            jPanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelVenta.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonCancelar.setText("Cancelar");

        jButtonVenta.setText("Generar venta");

        jLabelTotal.setText("Total");

        javax.swing.GroupLayout jPanelVentaLayout = new javax.swing.GroupLayout(jPanelVenta);
        jPanelVenta.setLayout(jPanelVentaLayout);
        jPanelVentaLayout.setHorizontalGroup(
            jPanelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabelTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelVentaLayout.setVerticalGroup(
            jPanelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVentaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTotal))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableVentaMouseClicked
        /*int fila = jTableVenta.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione una fila");
        } else {
            id = Integer.parseInt(jTableVenta.getValueAt(fila, 0).toString());
            String dni_cliente = jTableVenta.getValueAt(fila, 1).toString();
            String nombre_cliente = jTableVenta.getValueAt(fila, 2).toString();
            String celular_cliente = jTableVenta.getValueAt(fila, 3).toString();
            String estado_cliente = jTableVenta.getValueAt(fila, 4).toString();
            jTextFieldDNI.setText(dni_cliente);
            jTextFieldNombre.setText(nombre_cliente);
            jTextFieldCelular.setText(celular_cliente);
            jComboBoxEstado.setSelectedItem(estado_cliente);
        }*/
    }//GEN-LAST:event_jTableVentaMouseClicked

    private void jButtonBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarClienteActionPerformed
        buscarCliente();
    }//GEN-LAST:event_jButtonBuscarClienteActionPerformed

    private void jButtonBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarProductoActionPerformed
        buscarProducto();
    }//GEN-LAST:event_jButtonBuscarProductoActionPerformed

    private void jComboBoxNombreProductoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxNombreProductoItemStateChanged
        String nombreProducto = jComboBoxNombreProducto.getSelectedItem().toString();
        int respuesta;
        if (nombreProducto.equals("")) {
            JOptionPane.showMessageDialog(this, "Ingresar código");
        } else {
            producto = productoDAO.buscarProductoCombo(nombreProducto);
            if (producto.getId_producto() != 0) {
                jTextFieldProducto.setText(producto.getNombre_producto());
                jTextFieldPrecio.setText("" + producto.getPrecio_producto());
                jTextFieldStock.setText("" + producto.getStock_producto());
                jSpinnerCantidad.requestFocus();
            } else {
                respuesta = JOptionPane.showConfirmDialog(this, "No registrado. ¿Desea registrar?");
                if (respuesta == 0) {
                    ProductoForm productoForm = new ProductoForm();
                    CentrarVentana(productoForm);
                }
            }
        }
    }//GEN-LAST:event_jComboBoxNombreProductoItemStateChanged

    void buscarCliente() {
        String dni = jTextFieldDNI.getText();
        int respuesta;
        if (dni.equals("")) {
            JOptionPane.showMessageDialog(this, "Ingresar DNI");
        } else {
            cliente = clienteDAO.buscarCliente(dni);
            if (cliente.getDni_cliente() == null) {
                respuesta = JOptionPane.showConfirmDialog(this, "No registrado. ¿Desea registrar?");
                if (respuesta == 0) {
                    ClienteForm clienteForm = new ClienteForm();
                    CentrarVentana(clienteForm);                    
                }
            } else {
                jTextFieldCliente.setText(cliente.getNombre_cliente());
                jButtonBuscarProducto.requestFocus();
            }
        }
    }
       
    void buscarProducto(){
        String id = jTextFieldBuscarProducto.getText();
        int respuesta;
        if (jTextFieldBuscarProducto.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingresar código");
        } else {
            producto = productoDAO.buscarProductoText(Integer.parseInt(id));
            if (producto.getId_producto() != 0) {
                jTextFieldProducto.setText(producto.getNombre_producto());
                jTextFieldPrecio.setText("" + producto.getPrecio_producto());
                jTextFieldStock.setText("" + producto.getStock_producto());         
                jSpinnerCantidad.requestFocus();
            } else {
                respuesta = JOptionPane.showConfirmDialog(this, "No registrado. ¿Desea registrar?");
                if (respuesta == 0) {
                    ProductoForm productoForm = new ProductoForm();
                    CentrarVentana(productoForm);                    
                }
            }
        }
    }
    
    void CentrarVentana(JInternalFrame form){
        PrincipalForm.jDesktopPanePrincipal.add(form);
        Dimension dimensionPrincipal = PrincipalForm.jDesktopPanePrincipal.getSize();
        Dimension dimensionVentasForm = form.getSize();
        form.setLocation((dimensionPrincipal.width - dimensionVentasForm.width)/2, (dimensionPrincipal.height-dimensionVentasForm.height)/2);
        form.show();
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonBuscarCliente;
    private javax.swing.JButton jButtonBuscarProducto;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonValidar;
    private javax.swing.JButton jButtonVenta;
    private javax.swing.JComboBox<String> jComboBoxNombreProducto;
    private javax.swing.JLabel jLabelBuscarProducto;
    private javax.swing.JLabel jLabelCantidad;
    private javax.swing.JLabel jLabelCelular;
    private javax.swing.JLabel jLabelCliente;
    private javax.swing.JLabel jLabelDNI;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelN;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JLabel jLabelProducto;
    private javax.swing.JLabel jLabelSerie;
    private javax.swing.JLabel jLabelStock;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JLabel jLabelVendedor;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelTabla;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JPanel jPanelVenta;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPaneTabla;
    private javax.swing.JSpinner jSpinnerCantidad;
    private javax.swing.JTable jTableVenta;
    private javax.swing.JTextField jTextFieldBuscarProducto;
    private javax.swing.JTextField jTextFieldCliente;
    private javax.swing.JTextField jTextFieldDNI;
    private javax.swing.JTextField jTextFieldPrecio;
    private javax.swing.JTextField jTextFieldProducto;
    private javax.swing.JTextField jTextFieldStock;
    private javax.swing.JTextField jTextFieldTotal;
    private javax.swing.JTextField jTextFieldVendedor;
    // End of variables declaration//GEN-END:variables
}
