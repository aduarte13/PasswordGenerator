import java.awt.Dimension
import java.awt.FlowLayout
import java.awt.Font
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import javax.swing.*


class SelectionPanel(
    private val pass: Password,
    private val displayPanel: DisplayPanel
) : JPanel(){
    private val lengthMin = 5
    private val lengthMax = 35

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

    private val generateButton: JButton = JButton("Generate")

    init {
        border = BorderFactory.createTitledBorder("Options")
        layout = FlowLayout()

        val listener = SelectionListener()

        //
        textFieldLength.text = "" + pass.getLength()
        textFieldLength.preferredSize = Dimension(45, 30)
        textFieldLength.isEditable = false
        textFieldLength.horizontalAlignment = JTextField.CENTER
        textFieldLength.font = Font("Arial", Font.BOLD , 25)

        // action listeners
        buttonMinusLength.addActionListener(listener)
        buttonPlusLength.addActionListener(listener)
        generateButton.addActionListener(listener)

        // add components to sub-panels if needed
        panelLengthSelection.add(buttonMinusLength)
        panelLengthSelection.add(textFieldLength)
        panelLengthSelection.add(buttonPlusLength)


        // add components to panel
        add(panelLengthSelection)
        add(generateButton)

    }

    inner class SelectionListener : ActionListener {
        override fun actionPerformed(e: ActionEvent) {
            if (e.source == buttonMinusLength && pass.getLength() > lengthMin){
                pass.setLength(pass.getLength() - 1)
                textFieldLength.text = "" + pass.getLength()
            }
            else if (e.source == buttonPlusLength && pass.getLength() < lengthMax){
                pass.setLength(pass.getLength() + 1)
                textFieldLength.text = "" + pass.getLength()
            }

            if (pass.getLength() == lengthMin || pass.getLength() == lengthMax){
                textFieldLength.font = Font("Arial", Font.BOLD , 25)
            }
            else{
                textFieldLength.font = Font("Arial", Font.PLAIN , 25)
            }

            if (e.source == generateButton){
                println("Password generated: ")
                print(pass.getPassword())
            }

            displayPanel.repaint()
        }
    }

}


