import java.awt.Dimension
import java.awt.FlowLayout
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import javax.swing.*


class SelectionPanel(
    private val pass: Password,
    private val displayPanel: DisplayPanel
) : JPanel(){

    // length selection components
    private val panelLengthSelection: JPanel = JPanel()
    private val buttonMinusLength: JButton = JButton("-")
    private val buttonPlusLength: JButton = JButton("+")
    private val textFieldLength: JTextField = JTextField()
    //private var optionIncludeNumber: Boolean = true,
    //private var optionIncludeUpperAndLower: Boolean = false,
    //private var optionIncludeSpecial: Boolean = false,
    //private var optionIncludeWord: Boolean = false,
    //private var optionNoDuplicates: Boolean = false

    init {
        border = BorderFactory.createTitledBorder("Options")
        layout = FlowLayout()



        //
        textFieldLength.text = "" + pass.getLength()
        textFieldLength.preferredSize = Dimension(30, 30)
        textFieldLength.isEditable = false
        textFieldLength.horizontalAlignment = JTextField.CENTER

        // action listeners
        buttonMinusLength.addActionListener(SelectionListener())
        buttonPlusLength.addActionListener(SelectionListener())

        panelLengthSelection.add(buttonMinusLength)
        panelLengthSelection.add(textFieldLength)
        panelLengthSelection.add(buttonPlusLength)

        // add components to panel
        add(panelLengthSelection)

    }

    inner class SelectionListener : ActionListener {
        override fun actionPerformed(e: ActionEvent) {
            if (e.source == buttonMinusLength){
                pass.setLength(pass.getLength() - 1)
                textFieldLength.text = "" + pass.getLength()
            }
            else if (e.source == buttonPlusLength){
                pass.setLength(pass.getLength() + 1)
                textFieldLength.text = "" + pass.getLength()
            }

            displayPanel.repaint()
        }
    }

}


