package proyectoii
import java.awt.Color

application(title: 'ProyectoII, (Conversor de unidades computacionales)',
  preferredSize: [700, 400],
  pack: true,
  locationByPlatform:true,
  iconImage: imageIcon('/griffon-icon-48x48.png').image,
  iconImages: [imageIcon('/griffon-icon-48x48.png').image,
               imageIcon('/griffon-icon-32x32.png').image,
               imageIcon('/griffon-icon-16x16.png').image] )
        {
   borderLayout()
    panel(constraints: CENTER, border: emptyBorder(15), background:Color.getHSBColor(125,100,56)) {
        gridLayout(rows:1, columns:2)
        panel (background:Color.getHSBColor(125,100,56)){
            gridLayout(rows:1, columns:2)
        panel (background:Color.getHSBColor(125,100,56))
                {

                    gridLayout(rows:4, columns:3)
                    button("1",id:"b1" ,actionPerformed:{
                        if(txtdec.visible == true)
                            txtdec.text = txtdec.text +1
                        else if(txtbin.visible == true)
                            txtbin.text = txtbin.text + 1
                        else if(txtoct.visible == true)
                            txtoct.text = txtoct.text + 1

                    },
                            background:Color.getHSBColor(111,75,98))
                    button("2",id:"b2" ,actionPerformed:{
                        if(txtdec.visible == true)
                            txtdec.text = txtdec.text +2
                        else if(txtbin.visible == true)
                            txtbin.text = txtbin.text + 2
                        else if(txtoct.visible == true)
                            txtoct.text = txtoct.text + 2

                    },background:Color.getHSBColor(26,101,288))
                    button("3",id:"b3" ,actionPerformed:{
                        if(txtdec.visible == true)
                            txtdec.text = txtdec.text +3
                        else if(txtbin.visible == true)
                            txtbin.text = txtbin.text + 3
                        else if(txtoct.visible == true)
                            txtoct.text = txtoct.text + 3

                    },background:Color.getHSBColor(111,75,98))
                    button("4",id:"b4" ,actionPerformed:{
                        if(txtdec.visible == true)
                            txtdec.text = txtdec.text +4
                        else if(txtbin.visible == true)
                            txtbin.text = txtbin.text + 4
                        else if(txtoct.visible == true)
                            txtoct.text = txtoct.text + 4
                    },background:Color.getHSBColor(26,101,288))
                    button("5",id:"b5" ,actionPerformed:{
                        if(txtdec.visible == true)
                            txtdec.text = txtdec.text +5
                        else if(txtbin.visible == true)
                            txtbin.text = txtbin.text + 5
                        else if(txtoct.visible == true)
                            txtoct.text = txtoct.text + 5
                    },background:Color.getHSBColor(26,101,288))
                    button("6",id:"b6" ,actionPerformed:{
                        if(txtdec.visible == true)
                            txtdec.text = txtdec.text +6
                        else if(txtbin.visible == true)
                            txtbin.text = txtbin.text + 6
                        else if(txtoct.visible == true)
                            txtoct.text = txtoct.text + 6
                    },background:Color.getHSBColor(26,101,288))
                    button("7",id:"b7" ,actionPerformed:{
                        if(txtdec.visible == true)
                            txtdec.text = txtdec.text +7
                        else if(txtbin.visible == true)
                            txtbin.text = txtbin.text + 7
                        else if(txtoct.visible == true)
                            txtoct.text = txtoct.text + 7
                    },background:Color.getHSBColor(111,75,98))
                    button("8",id:"b8" ,actionPerformed:{
                        if(txtdec.visible == true)
                            txtdec.text = txtdec.text +8
                        else if(txtbin.visible == true)
                            txtbin.text = txtbin.text + 8
                        else if(txtoct.visible == true)
                            txtoct.text = txtoct.text + 8
                    },background:Color.getHSBColor(26,101,288))
                    button("9",id:"b9" ,actionPerformed:{
                        if(txtdec.visible == true)
                            txtdec.text = txtdec.text +9
                        else if(txtbin.visible == true)
                            txtbin.text = txtbin.text + 9
                        else if(txtoct.visible == true)
                            txtoct.text = txtoct.text + 9
                    },background:Color.getHSBColor(111,75,98))
                    button("Limpiar",background:Color.white, actionPerformed:{
                        select.setSelectedIndex(0)
                        txtdec.text =""
                        txtbin.text = ""
                        txtoct.text =""

                        txtdec.setVisible(false)
                        txtbin.setVisible(false)
                        txtoct.setVisible(false)
                        lbdec.setVisible(false)
                        lbbin.setVisible(false)
                        lboct.setVisible(false)

                        b2.setEnabled(true)
                        b3.setEnabled(true)
                        b4.setEnabled(true)
                        b5.setEnabled(true)
                        b6.setEnabled(true)
                        b7.setEnabled(true)
                        b8.setEnabled(true)
                        b9.setEnabled(true)

                    })
                    button("0",id:"b0" ,actionPerformed:{
                        if(txtdec.visible == true)
                            txtdec.text = txtdec.text +0
                        else if(txtbin.visible == true)
                            txtbin.text = txtbin.text + 0
                        else if(txtoct.visible == true)
                            txtoct.text = txtoct.text + 0
                    }, background:Color.getHSBColor(111,11,111))
                    button("Convertir",background: Color.getHSBColor(200,236,82), actionPerformed:{

                        if(select.getSelectedIndex() == 1){
                            txtbin.setVisible(true)
                            txtoct.setVisible(true)
                            lbbin.setVisible(true)
                            lboct.setVisible(true)
                            txtbin.text = Integer.toBinaryString(Integer.parseInt(txtdec.getText()))
                            txtoct.text = Integer.toOctalString(Integer.parseInt(txtdec.getText()))

                        }
                        else if(select.getSelectedIndex() == 2){

                            txtdec.setVisible(true)
                            txtoct.setVisible(true)
                            lbdec.setVisible(true)
                            lboct.setVisible(true)
                            def String texto = Integer.parseInt(txtbin.getText(), 2)
                            txtoct.text = Integer.toOctalString(Integer.parseInt(texto))
                            txtdec.text = Integer.parseInt(texto)

                        }
                        else if(select.getSelectedIndex() == 3) {
                            txtdec.setVisible(true)
                            txtbin.setVisible(true)
                            lbdec.setVisible(true)
                            lbbin.setVisible(true)
                            def String Texto =  Integer.parseInt(txtoct.getText(), 8)
                            txtbin.text = Integer.toBinaryString(Integer.parseInt(Texto))
                            txtdec.text = Integer.parseInt(Texto)
                        }
                    })
                }
            panel(border: emptyBorder(15), background:Color.getHSBColor(125,100,56)){
                gridLayout(rows:5, columns:2)
                label "<html>Escoja el sistema del número que va a ingresar</html>"
                comboBox(id:'select', items:['Escoja','Decimal','Binario','Octal'],background: Color.getHSBColor(52,100,60), actionPerformed: {
                    if(select.getSelectedIndex() == 1)
                    {
                        b2.setEnabled(true)
                        b3.setEnabled(true)
                        b4.setEnabled(true)
                        b5.setEnabled(true)
                        b6.setEnabled(true)
                        b7.setEnabled(true)
                        b8.setEnabled(true)
                        b9.setEnabled(true)

                        txtdec.setVisible(true)
                        txtbin.setVisible(false)
                        txtoct.setVisible(false)
                        lbdec.setVisible(true)
                        lbbin.setVisible(false)
                        lboct.setVisible(false)
                    }
                    else if(select.getSelectedIndex() == 2)
                    {
                        b2.setEnabled(false)
                        b3.setEnabled(false)
                        b4.setEnabled(false)
                        b5.setEnabled(false)
                        b6.setEnabled(false)
                        b7.setEnabled(false)
                        b8.setEnabled(false)
                        b9.setEnabled(false)

                        txtdec.setVisible(false)
                        txtbin.setVisible(true)
                        txtoct.setVisible(false)
                        lbdec.setVisible(false)
                        lbbin.setVisible(true)
                        lboct.setVisible(false)
                    }
                    else if(select.getSelectedIndex() == 3) {
                        b2.setEnabled(true)
                        b3.setEnabled(true)
                        b4.setEnabled(true)
                        b5.setEnabled(true)
                        b6.setEnabled(true)
                        b7.setEnabled(true)
                        b8.setEnabled(false)
                        b9.setEnabled(false)
                        txtdec.setVisible(false)
                        txtbin.setVisible(false)
                        txtoct.setVisible(true)
                        lbdec.setVisible(false)
                        lbbin.setVisible(false)
                        lboct.setVisible(true)
                    }
                })
                label id: "lbdec","         Decimal",visible: false
                textField id: "txtdec", columns: 20 ,visible: false
                label visible:false, id: "lbbin","        Binario"
                textField visible:false, id: "txtbin", columns: 20
                label visible:false, id: "lboct","         Octal"
                textField visible:false, id: "txtoct", columns: 20

            }
        }
    }

}
